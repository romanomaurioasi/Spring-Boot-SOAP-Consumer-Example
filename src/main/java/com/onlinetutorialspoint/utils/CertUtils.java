/*
 * Copyright 1996-2020 itServe AG. All rights reserved.
 *
 * This software is the proprietary information of itServe AG
 * Bern Switzerland. Use is subject to license terms.
 */
package com.onlinetutorialspoint.utils;

import org.bouncycastle.operator.ContentSigner;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.jcajce.JcaContentSignerBuilder;
import org.bouncycastle.pkcs.PKCS10CertificationRequest;
import org.bouncycastle.pkcs.PKCS10CertificationRequestBuilder;
import org.bouncycastle.pkcs.jcajce.JcaPKCS10CertificationRequestBuilder;

import javax.security.auth.x500.X500Principal;
import java.io.IOException;
import java.security.*;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;

/**
 * <p>Util for the certificate handling, used for the SUA process.</p>
 *
 * @author $Author: stettler $
 * @version $Date: 2020-09-04 11:45:00 +0200 (Fr., 04 Sep 2020) $
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class CertUtils {

    static {
        // load the BouncyCastleProvider
        try {
            Class c = Utils.loadClass("org.bouncycastle.jce.provider.BouncyCastleProvider");
            if (null == Security.getProvider("BC")) {
                Security.addProvider((Provider) c.getConstructor().newInstance());
            }
        } catch (Exception e) {
            throw new RuntimeException("Adding BouncyCastle provider failed", e);
        }
    }

    /**
     * Generates a {@link KeyPair} with an RSA key with 2048 bit size, using the
     * {@link org.bouncycastle.jce.provider.BouncyCastleProvider}.
     *
     * @return a newly generated {@link KeyPair}
     * @throws NoSuchProviderException  if BouncyCastle failed to load
     * @throws NoSuchAlgorithmException if a wrong algorithm is used
     */
    public static KeyPair genKeyPair() throws NoSuchProviderException, NoSuchAlgorithmException {
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA", "BC");
        keyGen.initialize(2048);
        return keyGen.generateKeyPair();
    }

    /**
     * Generates a PKS10 certificate sign request for the given {@link X509CertInfo}.
     *
     * @param oaKeyPair    {@link KeyPair} to use
     * @param x509CertInfo {@link X509CertInfo} certificate info
     * @return the csr as {@link PKCS10CertificationRequest}
     * @throws OperatorCreationException if the creation fails
     */
    public static PKCS10CertificationRequest genCSR(KeyPair oaKeyPair, X509CertInfo x509CertInfo) throws OperatorCreationException {
        StringBuilder subjectDN = new StringBuilder();
        subjectDN.append("C=").append(x509CertInfo.getCountry()).append(", ");
        subjectDN.append("ST=").append(x509CertInfo.getState()).append(", ");
        subjectDN.append("L=").append(x509CertInfo.getLocal()).append(", ");
        subjectDN.append("O=").append(x509CertInfo.getOrganization()).append(", ");
        if(x509CertInfo.getOrganizationUnit() != null && !x509CertInfo.getOrganizationUnit().isEmpty()) {
            subjectDN.append("OU=").append(x509CertInfo.getOrganizationUnit()).append(", ");
        }
        subjectDN.append("CN=").append("NTRCH-").append(x509CertInfo.getUID()).append("@swissdec.ch").append(", ");
        subjectDN.append("2.5.4.97=").append("NTRCH-").append(x509CertInfo.getUID());

        PKCS10CertificationRequestBuilder p10Builder = new JcaPKCS10CertificationRequestBuilder(
                new X500Principal(subjectDN.toString()), oaKeyPair.getPublic());
        JcaContentSignerBuilder csBuilder = new JcaContentSignerBuilder("SHA256withRSA");
        ContentSigner signer = csBuilder.build(oaKeyPair.getPrivate());
        p10Builder.setLeaveOffEmptyAttributes(false);

        return p10Builder.build(signer);
    }

    /**
     * Builds a JavaKeyStore with KeyStorePassword "default"
     *
     * @param keyPair     {@link KeyPair}: key pair, from which the private key is stored with alias "1" and
     *                    password "default"
     * @param cert        {@link X509Certificate}: certificate, stored with alias "1"
     * @param keyStoreTyp either JKS or PKCS12
     * @return {@link KeyStore}
     * @throws KeyStoreException        if there is a problem with the {@link KeyStore}
     * @throws CertificateException     if there is a problem with the {@link X509Certificate}
     * @throws NoSuchAlgorithmException if a wrong algorithm is used
     * @throws IOException              if there is a I/O problem
     */
    public static KeyStore buildKeyStore(KeyPair keyPair, X509Certificate cert, String keyStoreTyp) throws KeyStoreException, CertificateException, NoSuchAlgorithmException, IOException, InvalidKeySpecException {
        KeyStore keystore = KeyStore.getInstance(keyStoreTyp);
        keystore.load(null, "default".toCharArray());

        PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(keyPair.getPrivate().getEncoded());
        KeyFactory rsaFact = KeyFactory.getInstance("RSA");
        RSAPrivateKey key = (RSAPrivateKey) rsaFact.generatePrivate(spec);
        keystore.setKeyEntry("1", key, "default".toCharArray(), new java.security.cert.Certificate[]{cert});
        return keystore;
    }

}
