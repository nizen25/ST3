
package com.transformer.jws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.transformer.jws package. 
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

    private final static QName _ForwardStudentResponse_QNAME = new QName("http://jws.transformer.com/", "forwardStudentResponse");
    private final static QName _ForwardUpdateResponse_QNAME = new QName("http://jws.transformer.com/", "forwardUpdateResponse");
    private final static QName _Exception_QNAME = new QName("http://jws.transformer.com/", "Exception");
    private final static QName _ForwardUpdate_QNAME = new QName("http://jws.transformer.com/", "forwardUpdate");
    private final static QName _ForwardDelete_QNAME = new QName("http://jws.transformer.com/", "forwardDelete");
    private final static QName _ForwardDeleteResponse_QNAME = new QName("http://jws.transformer.com/", "forwardDeleteResponse");
    private final static QName _ForwardStudent_QNAME = new QName("http://jws.transformer.com/", "forwardStudent");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.transformer.jws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ForwardUpdate }
     * 
     */
    public ForwardUpdate createForwardUpdate() {
        return new ForwardUpdate();
    }

    /**
     * Create an instance of {@link ForwardStudent }
     * 
     */
    public ForwardStudent createForwardStudent() {
        return new ForwardStudent();
    }

    /**
     * Create an instance of {@link ForwardDelete }
     * 
     */
    public ForwardDelete createForwardDelete() {
        return new ForwardDelete();
    }

    /**
     * Create an instance of {@link ForwardDeleteResponse }
     * 
     */
    public ForwardDeleteResponse createForwardDeleteResponse() {
        return new ForwardDeleteResponse();
    }

    /**
     * Create an instance of {@link ForwardStudentResponse }
     * 
     */
    public ForwardStudentResponse createForwardStudentResponse() {
        return new ForwardStudentResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link ForwardUpdateResponse }
     * 
     */
    public ForwardUpdateResponse createForwardUpdateResponse() {
        return new ForwardUpdateResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForwardStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.transformer.com/", name = "forwardStudentResponse")
    public JAXBElement<ForwardStudentResponse> createForwardStudentResponse(ForwardStudentResponse value) {
        return new JAXBElement<ForwardStudentResponse>(_ForwardStudentResponse_QNAME, ForwardStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForwardUpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.transformer.com/", name = "forwardUpdateResponse")
    public JAXBElement<ForwardUpdateResponse> createForwardUpdateResponse(ForwardUpdateResponse value) {
        return new JAXBElement<ForwardUpdateResponse>(_ForwardUpdateResponse_QNAME, ForwardUpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.transformer.com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForwardUpdate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.transformer.com/", name = "forwardUpdate")
    public JAXBElement<ForwardUpdate> createForwardUpdate(ForwardUpdate value) {
        return new JAXBElement<ForwardUpdate>(_ForwardUpdate_QNAME, ForwardUpdate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForwardDelete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.transformer.com/", name = "forwardDelete")
    public JAXBElement<ForwardDelete> createForwardDelete(ForwardDelete value) {
        return new JAXBElement<ForwardDelete>(_ForwardDelete_QNAME, ForwardDelete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForwardDeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.transformer.com/", name = "forwardDeleteResponse")
    public JAXBElement<ForwardDeleteResponse> createForwardDeleteResponse(ForwardDeleteResponse value) {
        return new JAXBElement<ForwardDeleteResponse>(_ForwardDeleteResponse_QNAME, ForwardDeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForwardStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.transformer.com/", name = "forwardStudent")
    public JAXBElement<ForwardStudent> createForwardStudent(ForwardStudent value) {
        return new JAXBElement<ForwardStudent>(_ForwardStudent_QNAME, ForwardStudent.class, null, value);
    }

}
