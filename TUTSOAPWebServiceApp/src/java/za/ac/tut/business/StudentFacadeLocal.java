/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.business;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entities.Student;

/**
 *
 * @author sydney
 */
@Local
public interface StudentFacadeLocal {

    public void addStudent(String studentXML) throws Exception;   
    public Student getStudent(Long id) throws Exception;
    public List<Student> getStudents() throws Exception;
    public void deleteStudent(Long id) throws Exception;
    public void updateStudent(String studentXML) throws Exception;
    
}
