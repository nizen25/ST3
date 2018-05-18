/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.business;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.xml.ws.WebServiceRef;
import za.ac.tut.common.Utility;
import za.ac.tut.entities.Student;
import za.ac.tut.jws.client.Exception_Exception;
import za.ac.tut.jws.client.TransformerSOAPWebService_Service;


/**
 *
 * @author localhost
 */
@Stateless
public class StudentFacade extends AbstractFacade<Student> implements StudentFacadeLocal {
    @WebServiceRef(wsdlLocation = "META-INF/wsdl/localhost_8080/TransformerSOAPWebService/TransformerSOAPWebService.wsdl")
    private TransformerSOAPWebService_Service service;

    @PersistenceContext(unitName = "TUTSOAPWebServiceAppPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    public StudentFacade() {
        super(Student.class);
    }

    @Override
    public void addStudent(String studentXML) throws Exception {
        //Location where student xsd file is located
        String studentXSDFileName = "/home/sydney/studentXSDFile.xsd";
        if(Utility.validate(studentXML, studentXSDFileName)) {
            //umarshal the xml string: xml --> student object
            Student student = (Student)Utility.unmarshal(studentXML, Student.class);
            //add the student to the database
            create(student);
            //forward the student xml
            forwardStudent(studentXML);
        } else {
            throw new Exception("This XML file is not valid.");
        }
    }

    private void forwardStudent(java.lang.String studentXML) throws Exception_Exception {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        za.ac.tut.jws.client.TransformerSOAPWebService port = service.getTransformerSOAPWebServicePort();
        port.forwardStudent(studentXML);
    }
    
}
