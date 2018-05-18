/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.transformer.jws;

import com.transformer.common.Utility;
import com.transformer.jws.client.DHESOAPWebService_Service;
import com.transformer.jws.client.Exception_Exception;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author localhost
 */

@WebService(serviceName = "TransformerSOAPWebService")
@Stateless()
public class TransformerSOAPWebService {
    @WebServiceRef(wsdlLocation = "/home/sydney/DHESOAPWebService.wsdl")
    private DHESOAPWebService_Service service;

    /**
     * This is a sample web service operation
     * @param studentXML
     * @throws java.lang.Exception
     */
    @WebMethod(operationName = "forwardStudent")
    public void forwardStudent(@WebParam(name = "studentXML") String studentXML) throws Exception {
        //name of the xslt file
        String studentXSLTFile = "/home/sydney/studentXSLTFile.xsl";
        //transform the student xml to learner xml
        String learnerXML = Utility.transform(studentXML, studentXSLTFile);
        //forward the learner xml to DHE service for persisting
        addLearner(learnerXML);        
    }

    private void addLearner(java.lang.String learnerXML) throws Exception_Exception {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.transformer.jws.client.DHESOAPWebService port = service.getDHESOAPWebServicePort();
        port.addLearner(learnerXML);
    }
    
}
