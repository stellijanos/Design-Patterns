package org.design_patterns.behavioral.chainOfResponsability;

import org.design_patterns.behavioral.chainOfResponsability.interfaces.HandlerChain;

public class AuthenticationHandler implements HandlerChain {

    private String token;

    public HandlerChain next;

    public AuthenticationHandler(String token) {
        this.token = token;
    }

    @Override
    public String addHandler(String inputHeader) {
        String outputHeader = inputHeader + "\nAuthentication: " + token;

        if (next == null) {
            return outputHeader;
        }
        return next.addHandler(outputHeader);
    }
}
