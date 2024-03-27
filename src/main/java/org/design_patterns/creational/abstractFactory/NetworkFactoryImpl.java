package org.design_patterns.creational.abstractFactory;

import org.design_patterns.creational.abstractFactory.interfaces.DataSourceAbstractFactory;
import org.design_patterns.creational.abstractFactory.interfaces.Response;
import org.design_patterns.creational.abstractFactory.interfaces.Service;

public class NetworkFactoryImpl implements DataSourceAbstractFactory {
    @Override
    public Service createService() {
        return new NetworkServiceImpl();
    }

    @Override
    public Response createResponse() {
        return new NetworkResponseImpl();
    }
}
