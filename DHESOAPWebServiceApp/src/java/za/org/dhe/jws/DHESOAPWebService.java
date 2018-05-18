/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.org.dhe.jws;

import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import za.org.dhe.business.LearnerFacadeLocal;

/**
 *
 * @author localhost
 */
@WebService(serviceName = "DHESOAPWebService")
@Stateless()
public class DHESOAPWebService {
    @EJB
    private LearnerFacadeLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "addLearner")
    public void addLearner(@WebParam(name = "learnerXML") String learnerXML) throws Exception {
        ejbRef.addLearner(learnerXML);
    }
    
}
