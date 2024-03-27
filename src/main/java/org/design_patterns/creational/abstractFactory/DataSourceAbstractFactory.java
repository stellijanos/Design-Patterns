package org.design_patterns.creational.abstractFactory;

public interface DataSourceAbstractFactory {
    Service createService();
    Response createResponse();
}
