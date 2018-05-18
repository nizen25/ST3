/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.org.dhe.business;

import java.util.List;
import javax.ejb.Local;
import za.org.dhe.entities.PhysicalAddress;

/**
 *
 * @author localhost
 */
@Local
public interface PhysicalAddressFacadeLocal {

    void create(PhysicalAddress address);

    void edit(PhysicalAddress address);

    void remove(PhysicalAddress address);

    PhysicalAddress find(Object id);

    List<PhysicalAddress> findAll();

    List<PhysicalAddress> findRange(int[] range);

    int count();

    
}
