/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.org.dhe.business;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.org.dhe.entities.PhysicalAddress;

/**
 *
 * @author localhost
 */
@Stateless
public class PhysicalAddressFacade extends AbstractFacade<PhysicalAddress> implements PhysicalAddressFacadeLocal {
    @PersistenceContext(unitName = "DHESOAPWebServiceAppPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PhysicalAddressFacade() {
        super(PhysicalAddress.class);
    }
    
}
