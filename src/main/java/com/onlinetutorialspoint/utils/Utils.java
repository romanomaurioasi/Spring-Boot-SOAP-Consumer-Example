/*
 * Copyright 1996-2020 itServe AG. All rights reserved.
 *
 * This software is the proprietary information of itServe AG
 * Bern Switzerland. Use is subject to license terms.
 */
package com.onlinetutorialspoint.utils;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.security.SecureRandom;
import java.util.GregorianCalendar;

import static org.apache.wss4j.common.util.Loader.getTCL;

/**
 * Helper Util class
 *
 * @author $Author: stettler $
 * @version $Date: 2020-09-04 12:00:08 +0200 (Fr., 04 Sep 2020) $
 */
@SuppressWarnings("rawtypes")
public class Utils {

    /**
     * Lowercase umlaut string for the CheckInteroperability operation
     */
    public static final String CHECK_INTEROP_UMLAUT_STRING_LOWER = "\u00e4\u00EB\u00F6\u00FC\u00E1\u00E9\u00F3\u00FA\u00E0\u00E8\u00F2\u00F9\u00E2\u00EA\u00F4\u00FB";

    private static final SecureRandom RANDOM = new SecureRandom();
    private static final DatatypeFactory DATATYPE_FACTORY;

    static {
        // load the painful DatatypeFactory
        try {
            DATATYPE_FACTORY = DatatypeFactory.newInstance();
        } catch (DatatypeConfigurationException e) {
            throw new RuntimeException(e);
        }
    }

    public static XMLGregorianCalendar getXMLGregorianCalendar() {
        return getXMLGregorianCalendar(new GregorianCalendar());
    }

    public static XMLGregorianCalendar getXMLGregorianCalendar(GregorianCalendar gregorianCalendar) {
        //it's not clear if the datatype factory is thread safe...
        return DATATYPE_FACTORY.newXMLGregorianCalendar(gregorianCalendar);
    }

    public static String generateID() {
        String hexTime = Long.toHexString(System.currentTimeMillis());
        int value = RANDOM.nextInt(999) + 1;
        String hexRandom = Integer.toHexString(value);
        return hexTime + hexRandom;
    }

    public static Class loadClass(String clazz) throws ClassNotFoundException {
        try {
            ClassLoader tcl = getTCL();

            if (tcl != null) {
                Class c = tcl.loadClass(clazz);
                if (c != null) {
                    return c;
                }
            }
        } catch (Exception e) {
            // intentionally left blank
        }
        // we reached here because tcl was null or because of a
        // security exception, or because clazz could not be loaded...
        // In any case we now try one more time
        return Class.forName(clazz);
    }
}
