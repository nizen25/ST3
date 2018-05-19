
package com.transformer.jws.client;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "DHESOAPWebService", targetNamespace = "http://jws.dhe.org.za/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DHESOAPWebService {


    /**
     * 
     * @param learnerXML
     * @throws Exception_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "addLearner", targetNamespace = "http://jws.dhe.org.za/", className = "com.transformer.jws.client.AddLearner")
    @ResponseWrapper(localName = "addLearnerResponse", targetNamespace = "http://jws.dhe.org.za/", className = "com.transformer.jws.client.AddLearnerResponse")
    @Action(input = "http://jws.dhe.org.za/DHESOAPWebService/addLearnerRequest", output = "http://jws.dhe.org.za/DHESOAPWebService/addLearnerResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://jws.dhe.org.za/DHESOAPWebService/addLearner/Fault/Exception")
    })
    public void addLearner(
        @WebParam(name = "learnerXML", targetNamespace = "")
        String learnerXML)
        throws Exception_Exception
    ;

    /**
     * 
     * @param id
     * @return
     *     returns com.transformer.jws.client.Learner
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getLearner", targetNamespace = "http://jws.dhe.org.za/", className = "com.transformer.jws.client.GetLearner")
    @ResponseWrapper(localName = "getLearnerResponse", targetNamespace = "http://jws.dhe.org.za/", className = "com.transformer.jws.client.GetLearnerResponse")
    @Action(input = "http://jws.dhe.org.za/DHESOAPWebService/getLearnerRequest", output = "http://jws.dhe.org.za/DHESOAPWebService/getLearnerResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://jws.dhe.org.za/DHESOAPWebService/getLearner/Fault/Exception")
    })
    public Learner getLearner(
        @WebParam(name = "id", targetNamespace = "")
        Long id)
        throws Exception_Exception
    ;

    /**
     * 
     * @return
     *     returns java.util.List<com.transformer.jws.client.Learner>
     * @throws Exception_Exception
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getLearners", targetNamespace = "http://jws.dhe.org.za/", className = "com.transformer.jws.client.GetLearners")
    @ResponseWrapper(localName = "getLearnersResponse", targetNamespace = "http://jws.dhe.org.za/", className = "com.transformer.jws.client.GetLearnersResponse")
    @Action(input = "http://jws.dhe.org.za/DHESOAPWebService/getLearnersRequest", output = "http://jws.dhe.org.za/DHESOAPWebService/getLearnersResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://jws.dhe.org.za/DHESOAPWebService/getLearners/Fault/Exception")
    })
    public List<Learner> getLearners()
        throws Exception_Exception
    ;

    /**
     * 
     * @param id
     * @throws Exception_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "deleteLearner", targetNamespace = "http://jws.dhe.org.za/", className = "com.transformer.jws.client.DeleteLearner")
    @ResponseWrapper(localName = "deleteLearnerResponse", targetNamespace = "http://jws.dhe.org.za/", className = "com.transformer.jws.client.DeleteLearnerResponse")
    @Action(input = "http://jws.dhe.org.za/DHESOAPWebService/deleteLearnerRequest", output = "http://jws.dhe.org.za/DHESOAPWebService/deleteLearnerResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://jws.dhe.org.za/DHESOAPWebService/deleteLearner/Fault/Exception")
    })
    public void deleteLearner(
        @WebParam(name = "id", targetNamespace = "")
        Long id)
        throws Exception_Exception
    ;

    /**
     * 
     * @param learnerXML
     * @throws Exception_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "updateLearner", targetNamespace = "http://jws.dhe.org.za/", className = "com.transformer.jws.client.UpdateLearner")
    @ResponseWrapper(localName = "updateLearnerResponse", targetNamespace = "http://jws.dhe.org.za/", className = "com.transformer.jws.client.UpdateLearnerResponse")
    @Action(input = "http://jws.dhe.org.za/DHESOAPWebService/updateLearnerRequest", output = "http://jws.dhe.org.za/DHESOAPWebService/updateLearnerResponse", fault = {
        @FaultAction(className = Exception_Exception.class, value = "http://jws.dhe.org.za/DHESOAPWebService/updateLearner/Fault/Exception")
    })
    public void updateLearner(
        @WebParam(name = "learnerXML", targetNamespace = "")
        String learnerXML)
        throws Exception_Exception
    ;

}