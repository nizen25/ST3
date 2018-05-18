/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.jws;

import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import za.ac.tut.business.StudentFacadeLocal;

/**
 *
 * @author localhost
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
    
}
