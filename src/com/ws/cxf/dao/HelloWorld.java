package com.ws.cxf.dao;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-08-03T10:33:37.322+08:00
 * Generated source version: 3.1.6
 * 
 */
@WebServiceClient(name = "helloWorld", 
                  wsdlLocation = "http://127.0.0.1:8036/cxfdemo/webservice/HelloWorld?wsdl",
                  targetNamespace = "http://dao.cxf.ws.com/") 
public class HelloWorld extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://dao.cxf.ws.com/", "helloWorld");
    public final static QName HelloWorldImplPort = new QName("http://dao.cxf.ws.com/", "HelloWorldImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://127.0.0.1:8036/cxfdemo/webservice/HelloWorld?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(HelloWorld.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://127.0.0.1:8036/cxfdemo/webservice/HelloWorld?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public HelloWorld(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public HelloWorld(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloWorld() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public HelloWorld(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public HelloWorld(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public HelloWorld(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns HelloWorld
     */
    @WebEndpoint(name = "HelloWorldImplPort")
    public com.chen.webservice.HelloWorld getHelloWorldImplPort() {
        return super.getPort(HelloWorldImplPort, com.chen.webservice.HelloWorld.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloWorld
     */
    @WebEndpoint(name = "HelloWorldImplPort")
    public com.chen.webservice.HelloWorld getHelloWorldImplPort(WebServiceFeature... features) {
        return super.getPort(HelloWorldImplPort, com.chen.webservice.HelloWorld.class, features);
    }

}
