package org.design_patterns.creational.abstractFactory;

import org.design_patterns.creational.abstractFactory.interfaces.Response;

public class DatabaseResponseImpl implements Response {
    @Override
    public String getResponse() {
        return "Database response.";
    }
}
