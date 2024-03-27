package org.design_patterns.structural.facade;

public class NetworkAccessFacade {

    private Communication comm = new Communication();
    private Cache cache = new Cache();
    private Interceptor interceptor = new Interceptor();
    private Converter converter = new Converter();

    public void communicate() {
        cache.cache();
        comm.send("Some data");
        comm.recieve("response");
        interceptor.intercept();
        converter.convert();
    }
}
