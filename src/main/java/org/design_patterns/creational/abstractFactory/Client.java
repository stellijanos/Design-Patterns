package org.design_patterns.creational.abstractFactory;

public class Client {

    private Service service;
    private Response response;

    public Client(DataSourceAbstractFactory factory) {
        this.service = factory.createService();
        this.response = factory.createResponse();
    }

    public void communicate() {
        if(service != null && response != null) {
            System.out.println(service.runService());
            System.out.println(response.getResponse());
        }
    }
}
