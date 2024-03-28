package org.design_patterns.behavioral.chainOfResponsability;

import org.design_patterns.behavioral.chainOfResponsability.interfaces.HandlerChain;

public class ContentTypeHandler implements HandlerChain {

    private String contentType;

    public HandlerChain next;

    public ContentTypeHandler(String contentType) {
        this.contentType = contentType;
    }

    @Override
    public String addHandler(String inputHeader) {

        String outputHeader = inputHeader + "\nContentType: " + contentType;
        if (next == null) {
            return outputHeader;
        }
        return next.addHandler(outputHeader);
    }
}
