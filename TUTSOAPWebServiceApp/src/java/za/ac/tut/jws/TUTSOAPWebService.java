/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.jws;

import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import za.ac.tut.business.StudentFacadeLocal;
import za.ac.tut.entities.Student;

/**
 *
 * @author sydney
 */
@WebService(serviceName = "TUTSOAPWebService")
@Stateless()
public class TUTSOAPWebService {

    @EJB
    private StudentFacadeLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "addStudent")
    public void addStudent(@WebParam(name = "studentXML") String studentXML) throws Exception {
        ejbRef.addStudent(studentXML);
    }

    @WebMethod(operationName = "getStudent")
    public Student getStudent(@WebParam(name = "id") Long id) throws Exception {
        return ejbRef.getStudent(id);
    }

    @WebMethod(operationName = "getStudents")
    public List<Student> getStudents() throws Exception {
        return ejbRef.getStudents();
    }

    @WebMethod(operationName = "deleteStudent")
    public void deleteStudent(@WebParam(name = "id") Long id) throws Exception {
        ejbRef.deleteStudent(id);
    }

    @WebMethod(operationName = "updateStudent")
    public void updateStudent(@WebParam(name = "StudentXML") String StudentXML) throws Exception {
        ejbRef.updateStudent(StudentXML);
    }
    
}
