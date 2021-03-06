package com.chen.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-08-03T10:33:37.288+08:00
 * Generated source version: 3.1.6
 * 
 */
@WebService(targetNamespace = "http://webservice.chen.com/", name = "HelloWorld")
@XmlSeeAlso({ObjectFactory.class})
public interface HelloWorld {

    @WebMethod
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://webservice.chen.com/", className = "com.chen.webservice.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://webservice.chen.com/", className = "com.chen.webservice.SayHelloResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String sayHello(
        @WebParam(name = "username", targetNamespace = "")
        java.lang.String username
    );
}
