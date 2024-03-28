package org.design_patterns.behavioral.chainOfResponsability;

import org.design_patterns.behavioral.chainOfResponsability.interfaces.HandlerChain;

public class PayloadHandler implements HandlerChain {

    String payload;
    public HandlerChain next;

    public PayloadHandler(String payload) {
        this.payload = payload;
    }

    @Override
    public String addHandler(String inputHeader) {
        String outputHeader = inputHeader + "\n" + payload;
        if (next == null) {
            return outputHeader;
        }
        return next.addHandler(outputHeader);
    }
}
