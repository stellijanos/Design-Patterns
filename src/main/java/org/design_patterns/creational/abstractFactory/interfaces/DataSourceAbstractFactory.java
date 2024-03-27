package org.design_patterns.creational.abstractFactory.interfaces;

public interface DataSourceAbstractFactory {
    Service createService();
    Response createResponse();
}
