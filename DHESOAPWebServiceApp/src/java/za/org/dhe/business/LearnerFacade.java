/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.org.dhe.business;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.org.dhe.common.Utility;
import za.org.dhe.entities.Learner;

/**
 *
 * @author localhost
 */
@Stateless
public class LearnerFacade extends AbstractFacade<Learner> implements LearnerFacadeLocal {
    @PersistenceContext(unitName = "DHESOAPWebServiceAppPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    public LearnerFacade() {
        super(Learner.class);
    }
    @Override
    public void addLearner(String learnerXML) throws Exception {
       String learnerXSDFile = "/home/sydney/learnerXSDFile.xsd";
        //validate this xml
        if(Utility.validate(learnerXML, learnerXSDFile)) {
            //umarshal the xml string: xml --> student object
            Learner learner = (Learner)Utility.unmarshal(learnerXML, Learner.class);
            //add the student to the database
            create(learner);
            System.out.println("LEARNER: " + getLearner(learner.getId()));
        } else {
            throw new Exception("This XML file is not valid.");
        }
    }

    @Override
    public Learner getLearner(Long id) throws Exception {
        final Learner learner = find(id);
        return (learner != null) ? learner : null;
    }

    @Override
    public List<Learner> getLearners() throws Exception {
        return findAll();
    }

    @Override
    public void deleteLearner(Long id) throws Exception {
        final Learner learner = getLearner(id);
        if (learner != null) remove(learner);
    }

    @Override
    public void updateLearner(final String learnerXML) throws Exception {
        final String learnerXSDFile = "/home/sydney/learnerXSDFile.xsd";
        //validate this xml
        if (Utility.validate(learnerXML, learnerXSDFile)) {
            //umarshal the xml string: xml --> student object
            final Learner learner = (Learner) Utility.unmarshal(learnerXML, Learner.class);
            //Update the learner's details in the database
            edit(learner);
        } else {
            throw new Exception("This XML file is not valid.");
        }
    }
    
}
