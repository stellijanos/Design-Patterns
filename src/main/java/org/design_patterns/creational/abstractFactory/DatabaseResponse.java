package org.design_patterns.creational.abstractFactory;

public class DatabaseResponse implements Response{
    @Override
    public String getResponse() {
        return "Database response.";
    }
}
