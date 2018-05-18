/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.business;

import javax.ejb.Local;

/**
 *
 * @author localhost
 */
@Local
public interface StudentFacadeLocal {
    public void addStudent(String studentXML) throws Exception;
}
