
package com.alexanderwjz.serviceimpl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.alexanderwjz.service.ObjectFactory;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "JpushAll", targetNamespace = "http://service.alexanderwjz.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface JpushAll {


    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "push", targetNamespace = "http://service.alexanderwjz.com/", className = "com.alexanderwjz.service.Push")
    @ResponseWrapper(localName = "pushResponse", targetNamespace = "http://service.alexanderwjz.com/", className = "com.alexanderwjz.service.PushResponse")
    public void push(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
