package org.design_patterns.creational.abstractFactory;

import org.design_patterns.creational.abstractFactory.interfaces.Service;

public class DatabaseServiceImpl implements Service {
    @Override
    public String runService() {
        return "Database service running.";
    }
}
