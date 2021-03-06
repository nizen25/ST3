/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import za.ac.tut.jws.client.Exception_Exception;
import za.ac.tut.jws.client.Student;
import za.ac.tut.jws.client.TUTSOAPWebService_Service;

/**
 *
 * @author sydney
 */
public class FindStudentServlet extends HttpServlet {

    @WebServiceRef(wsdlLocation = "/home/sydney/TUTSOAPWebService.wsdl")
    private TUTSOAPWebService_Service service;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final String id = request.getParameter("id");
        try {
            final Student student = service.getTUTSOAPWebServicePort().getStudent(Long.valueOf(id));
            RequestDispatcher dispatcher;
            if (student == null) {
                request.setAttribute("error", "Student with id " + id + " doesn't exist!");
                dispatcher = request.getRequestDispatcher("find_student.jsp");
                dispatcher.forward(request, response);
            } else {
                request.setAttribute("student", student);
                request.setAttribute("found", "Student found!");
                dispatcher = request.getRequestDispatcher("update_student.jsp");
                dispatcher.forward(request, response);
            }
        } catch (Exception_Exception ex) {
            Logger.getLogger(FindStudentServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
