
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
    private final static QName _DeleteLearner_QNAME = new QName("http://jws.dhe.org.za/", "deleteLearner");
    private final static QName _UpdateLearner_QNAME = new QName("http://jws.dhe.org.za/", "updateLearner");
    private final static QName _Learner_QNAME = new QName("http://jws.dhe.org.za/", "learner");
    private final static QName _UpdateLearnerResponse_QNAME = new QName("http://jws.dhe.org.za/", "updateLearnerResponse");
    private final static QName _GetLearners_QNAME = new QName("http://jws.dhe.org.za/", "getLearners");
    private final static QName _GetLearnersResponse_QNAME = new QName("http://jws.dhe.org.za/", "getLearnersResponse");
    private final static QName _PhysicalAddress_QNAME = new QName("http://jws.dhe.org.za/", "physicalAddress");
    private final static QName _AddLearnerResponse_QNAME = new QName("http://jws.dhe.org.za/", "addLearnerResponse");
    private final static QName _DeleteLearnerResponse_QNAME = new QName("http://jws.dhe.org.za/", "deleteLearnerResponse");
    private final static QName _GetLearnerResponse_QNAME = new QName("http://jws.dhe.org.za/", "getLearnerResponse");
    private final static QName _GetLearner_QNAME = new QName("http://jws.dhe.org.za/", "getLearner");
    private final static QName _Exception_QNAME = new QName("http://jws.dhe.org.za/", "Exception");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.transformer.jws.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetLearnerResponse }
     * 
     */
    public GetLearnerResponse createGetLearnerResponse() {
        return new GetLearnerResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link GetLearner }
     * 
     */
    public GetLearner createGetLearner() {
        return new GetLearner();
    }

    /**
     * Create an instance of {@link GetLearnersResponse }
     * 
     */
    public GetLearnersResponse createGetLearnersResponse() {
        return new GetLearnersResponse();
    }

    /**
     * Create an instance of {@link AddLearner }
     * 
     */
    public AddLearner createAddLearner() {
        return new AddLearner();
    }

    /**
     * Create an instance of {@link DeleteLearner }
     * 
     */
    public DeleteLearner createDeleteLearner() {
        return new DeleteLearner();
    }

    /**
     * Create an instance of {@link UpdateLearner }
     * 
     */
    public UpdateLearner createUpdateLearner() {
        return new UpdateLearner();
    }

    /**
     * Create an instance of {@link GetLearners }
     * 
     */
    public GetLearners createGetLearners() {
        return new GetLearners();
    }

    /**
     * Create an instance of {@link Learner }
     * 
     */
    public Learner createLearner() {
        return new Learner();
    }

    /**
     * Create an instance of {@link UpdateLearnerResponse }
     * 
     */
    public UpdateLearnerResponse createUpdateLearnerResponse() {
        return new UpdateLearnerResponse();
    }

    /**
     * Create an instance of {@link PhysicalAddress }
     * 
     */
    public PhysicalAddress createPhysicalAddress() {
        return new PhysicalAddress();
    }

    /**
     * Create an instance of {@link AddLearnerResponse }
     * 
     */
    public AddLearnerResponse createAddLearnerResponse() {
        return new AddLearnerResponse();
    }

    /**
     * Create an instance of {@link DeleteLearnerResponse }
     * 
     */
    public DeleteLearnerResponse createDeleteLearnerResponse() {
        return new DeleteLearnerResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteLearner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.dhe.org.za/", name = "deleteLearner")
    public JAXBElement<DeleteLearner> createDeleteLearner(DeleteLearner value) {
        return new JAXBElement<DeleteLearner>(_DeleteLearner_QNAME, DeleteLearner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateLearner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.dhe.org.za/", name = "updateLearner")
    public JAXBElement<UpdateLearner> createUpdateLearner(UpdateLearner value) {
        return new JAXBElement<UpdateLearner>(_UpdateLearner_QNAME, UpdateLearner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Learner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.dhe.org.za/", name = "learner")
    public JAXBElement<Learner> createLearner(Learner value) {
        return new JAXBElement<Learner>(_Learner_QNAME, Learner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateLearnerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.dhe.org.za/", name = "updateLearnerResponse")
    public JAXBElement<UpdateLearnerResponse> createUpdateLearnerResponse(UpdateLearnerResponse value) {
        return new JAXBElement<UpdateLearnerResponse>(_UpdateLearnerResponse_QNAME, UpdateLearnerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLearners }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.dhe.org.za/", name = "getLearners")
    public JAXBElement<GetLearners> createGetLearners(GetLearners value) {
        return new JAXBElement<GetLearners>(_GetLearners_QNAME, GetLearners.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLearnersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.dhe.org.za/", name = "getLearnersResponse")
    public JAXBElement<GetLearnersResponse> createGetLearnersResponse(GetLearnersResponse value) {
        return new JAXBElement<GetLearnersResponse>(_GetLearnersResponse_QNAME, GetLearnersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhysicalAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.dhe.org.za/", name = "physicalAddress")
    public JAXBElement<PhysicalAddress> createPhysicalAddress(PhysicalAddress value) {
        return new JAXBElement<PhysicalAddress>(_PhysicalAddress_QNAME, PhysicalAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddLearnerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.dhe.org.za/", name = "addLearnerResponse")
    public JAXBElement<AddLearnerResponse> createAddLearnerResponse(AddLearnerResponse value) {
        return new JAXBElement<AddLearnerResponse>(_AddLearnerResponse_QNAME, AddLearnerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteLearnerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.dhe.org.za/", name = "deleteLearnerResponse")
    public JAXBElement<DeleteLearnerResponse> createDeleteLearnerResponse(DeleteLearnerResponse value) {
        return new JAXBElement<DeleteLearnerResponse>(_DeleteLearnerResponse_QNAME, DeleteLearnerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLearnerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.dhe.org.za/", name = "getLearnerResponse")
    public JAXBElement<GetLearnerResponse> createGetLearnerResponse(GetLearnerResponse value) {
        return new JAXBElement<GetLearnerResponse>(_GetLearnerResponse_QNAME, GetLearnerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLearner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.dhe.org.za/", name = "getLearner")
    public JAXBElement<GetLearner> createGetLearner(GetLearner value) {
        return new JAXBElement<GetLearner>(_GetLearner_QNAME, GetLearner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://jws.dhe.org.za/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

}
