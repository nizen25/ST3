/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.org.dhe.jws;

import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import za.org.dhe.business.LearnerFacadeLocal;
import za.org.dhe.entities.Learner;

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
    
    @WebMethod(operationName = "getLearner")
    public Learner getLearner(@WebParam(name = "id") Long id) throws Exception {
        return ejbRef.getLearner(id);
    }

    @WebMethod(operationName = "getLearners")
    public List<Learner> getLearners() throws Exception {
        return ejbRef.getLearners();
    }

    @WebMethod(operationName = "deleteLearner")
    public void deleteLearner(@WebParam(name = "id") Long id) throws Exception {
        ejbRef.deleteLearner(id);
    }

    @WebMethod(operationName = "updateLearner")
    public void updateLearner(@WebParam(name = "learnerXML") String learnerXML) throws Exception {
        ejbRef.updateLearner(learnerXML);
    }
}
