
package com.transformer.jws.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.transformer.jws.client package. 
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

    private final static QName _AddLearner_QNAME = new QName("http://jws.dhe.org.za/", "addLearner");
    private final static QName _Exception_QNAME = new QName("http://jws.dhe.org.za/", "Exception");
    private final static QName _AddLearnerResponse_QNAME = new QName("http://jws.dhe.org.za/", "addLearnerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.transformer.jws.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddLearner }
     * 
     */
    public AddLearner createAddLearner() {
        return new AddLearner();
    }

    /**
     * Create an instance of {@link AddLearnerResponse }
     * 
     */
    public AddLearnerResponse createAddLearnerResponse() {
        return new AddLearnerResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddLearner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.dhe.org.za/", name = "addLearner")
    public JAXBElement<AddLearner> createAddLearner(AddLearner value) {
        return new JAXBElement<AddLearner>(_AddLearner_QNAME, AddLearner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.dhe.org.za/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddLearnerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.dhe.org.za/", name = "addLearnerResponse")
    public JAXBElement<AddLearnerResponse> createAddLearnerResponse(AddLearnerResponse value) {
        return new JAXBElement<AddLearnerResponse>(_AddLearnerResponse_QNAME, AddLearnerResponse.class, null, value);
    }

}
