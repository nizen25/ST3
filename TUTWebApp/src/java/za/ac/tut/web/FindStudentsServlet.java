/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
public class FindStudentsServlet extends HttpServlet {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/TUTSOAPWebService/TUTSOAPWebService.wsdl")
    private TUTSOAPWebService_Service service;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            final List<Student> students = service.getTUTSOAPWebServicePort().getStudents();
            if (students.size() == 0) {
                request.setAttribute("zeroStudents", "No students currently enrolled!");
                final RequestDispatcher dispatcher = request.getRequestDispatcher("students.jsp");
                dispatcher.forward(request, response);
            } else {
                request.setAttribute("students", students);
                final RequestDispatcher dispatcher = request.getRequestDispatcher("students.jsp");
                dispatcher.forward(request, response);
            }
        } catch (Exception_Exception ex) {
            Logger.getLogger(FindStudentServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
