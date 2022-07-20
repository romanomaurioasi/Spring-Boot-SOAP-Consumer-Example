/*
 * Copyright 1996-2020 itServe AG. All rights reserved.
 *
 * This software is the proprietary information of itServe AG
 * Bern Switzerland. Use is subject to license terms.
 */
package com.onlinetutorialspoint.swissdec;

import org.apache.wss4j.common.ext.WSPasswordCallback;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

/**
 * {@link javax.security.auth.callback.CallbackHandler} implementation to resolve the private-key password.
 *
 * @author $Author: stettler $
 * @version $Date: 2020-09-04 12:00:08 +0200 (Fr., 04 Sep 2020) $
 */
public class PasswordCallback implements CallbackHandler {

    /**
     * {@inheritDoc}
     *
     * @param callbacks
     * @throws UnsupportedCallbackException
     */
    public void handle(Callback[] callbacks)
            throws UnsupportedCallbackException {
        for (Callback callback : callbacks) {
            if (callback instanceof WSPasswordCallback) {
                WSPasswordCallback pc = (WSPasswordCallback) callback;
                /*
                 * here call a function/method to lookup the password for
                 * the given identifier (e.g. a user name or keystore alias)
                 * e.g.: pc.setPassword(passStore.getPassword(pc.getIdentifier))
                 * for Testing we supply a fixed name here.
                 */
                pc.setPassword("refApp9876");
                //pc.setIdentifier("oasi");
                //pc.setPassword("testSwissdec");
            } else {
                throw new UnsupportedCallbackException(callback, "Unrecognized Callback");
            }
        }
    }
}

