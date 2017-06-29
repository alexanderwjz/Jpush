
package com.alexanderwjz.servicepushAsAlias;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.alexanderwjz.servicepushAsAlias package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Push_QNAME = new QName("http://service.alexanderwjz.com/", "push");
    private final static QName _PushResponse_QNAME = new QName("http://service.alexanderwjz.com/", "pushResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.alexanderwjz.servicepushAsAlias
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PushResponse }
     * 
     */
    public PushResponse createPushResponse() {
        return new PushResponse();
    }

    /**
     * Create an instance of {@link Push }
     * 
     */
    public Push createPush() {
        return new Push();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Push }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.alexanderwjz.com/", name = "push")
    public JAXBElement<Push> createPush(Push value) {
        return new JAXBElement<Push>(_Push_QNAME, Push.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PushResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.alexanderwjz.com/", name = "pushResponse")
    public JAXBElement<PushResponse> createPushResponse(PushResponse value) {
        return new JAXBElement<PushResponse>(_PushResponse_QNAME, PushResponse.class, null, value);
    }

}
