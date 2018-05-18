
package za.ac.tut.jws.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the za.ac.tut.jws.client package. 
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
    private final static QName _Exception_QNAME = new QName("http://jws.transformer.com/", "Exception");
    private final static QName _ForwardStudent_QNAME = new QName("http://jws.transformer.com/", "forwardStudent");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: za.ac.tut.jws.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ForwardStudent }
     * 
     */
    public ForwardStudent createForwardStudent() {
        return new ForwardStudent();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ForwardStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.transformer.com/", name = "forwardStudentResponse")
    public JAXBElement<ForwardStudentResponse> createForwardStudentResponse(ForwardStudentResponse value) {
        return new JAXBElement<ForwardStudentResponse>(_ForwardStudentResponse_QNAME, ForwardStudentResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ForwardStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.transformer.com/", name = "forwardStudent")
    public JAXBElement<ForwardStudent> createForwardStudent(ForwardStudent value) {
        return new JAXBElement<ForwardStudent>(_ForwardStudent_QNAME, ForwardStudent.class, null, value);
    }

}
