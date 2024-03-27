package org.design_patterns.creational.abstractFactory;

import org.design_patterns.creational.abstractFactory.interfaces.Service;

public class NetworkServiceImpl implements Service {
    @Override
    public String runService() {
        return "Network service running.";
    }
}
