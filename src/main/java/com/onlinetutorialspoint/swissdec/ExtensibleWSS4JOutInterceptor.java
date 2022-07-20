/*
 * Copyright 1996-2020 itServe AG. All rights reserved.
 *
 * This software is the proprietary information of itServe AG
 * Bern Switzerland. Use is subject to license terms.
 */
package com.onlinetutorialspoint.swissdec;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.PhaseInterceptor;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

/**
 * {@link WSS4JOutInterceptor} extension to add callbacks after the {@link WSS4JOutInterceptor#handleMessage(SoapMessage)}.
 *
 * @author $Author: stettler $
 * @version $Date: 2020-09-03 12:13:26 +0200 (Do., 03 Sep 2020) $
 */
@SuppressWarnings("unchecked")
public class ExtensibleWSS4JOutInterceptor extends WSS4JOutInterceptor {
    private final List<PhaseInterceptor<SoapMessage>> callbacks;

    /**
     * Constructor
     *
     * @param properties WSS outbound properties
     * @param callbacks List of {@link PhaseInterceptor} to add to the {@link org.apache.cxf.interceptor.InterceptorChain}
     */
    public ExtensibleWSS4JOutInterceptor(Map<String, Object> properties,
                                         List<PhaseInterceptor<SoapMessage>> callbacks) {
        super(properties);
        this.callbacks = callbacks;
    }

    /**
     * Intercepts a message and adds the callbacks to the {@link org.apache.cxf.interceptor.InterceptorChain}.
     *
     * @param message {@link SoapMessage} to intercept
     */
    @Override
    public void handleMessage(SoapMessage message) throws Fault {
        super.handleMessage(message);
        if (getEndingInterceptor() != null) {
            String internalId = getEndingInterceptor().getId();
            for (PhaseInterceptor<SoapMessage> pi : callbacks) {
                pi.getAfter().add(internalId);
                message.getInterceptorChain().add(pi);
            }
        }
    }

    //
    // PRIVATE HELPER METHODS
    //

    private PhaseInterceptor<SoapMessage> getEndingInterceptor() {
        try {
            Field field = WSS4JOutInterceptor.class.getDeclaredField("ending");
            field.setAccessible(true);
            Object value = field.get(this);
            field.setAccessible(false);

            if (value == null) {
                return null;
            }
            return (PhaseInterceptor<SoapMessage>) value;
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    }
}
