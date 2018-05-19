/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.business;

import java.util.List;
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
    
    @Override
    public Student getStudent(Long id) throws Exception {
        final Student student = find(id);
        return (student != null) ? student : null;
    }

    @Override
    public List<Student> getStudents() throws Exception {
        return findAll();
    }

    @Override
    public void deleteStudent(Long id) throws Exception {
        final Student student = getStudent(id);
        if (student != null) {
            remove(student);
        } else{
            System.out.println("Student does not exist.");
        }
    }

    @Override
    public void updateStudent(String studentXML) throws Exception {
        String studentXSDFile = "/home/sydney/learnerXSDFile.xsd";
        //validate this xml
        if (Utility.validate(studentXML, studentXSDFile)) {
            //umarshal the xml string: xml --> student object
            Student learner = (Student) Utility.unmarshal(studentXML, Student.class);
            //Update the learner's details in the database
            edit(learner);
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
