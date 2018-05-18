/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.org.dhe.business;

import java.util.List;
import javax.ejb.Local;
import za.org.dhe.entities.Learner;

/**
 *
 * @author localhost
 */
@Local
public interface LearnerFacadeLocal {
    
    public void addLearner(String learnerXML) throws Exception;   
    public Learner getLearner(Long id) throws Exception;
    public List<Learner> getLearners() throws Exception;
    public void deleteLearner(Long id) throws Exception;
    public void updateLearner(String learnerXML) throws Exception;
}
