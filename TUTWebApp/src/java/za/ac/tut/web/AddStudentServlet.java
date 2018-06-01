/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import za.ac.tut.jws.client.Exception_Exception;
import za.ac.tut.jws.client.TUTSOAPWebService_Service;

/**
 *
 * @author localhost
 */
public class AddStudentServlet extends HttpServlet {
    @WebServiceRef(wsdlLocation = "/home/sydney/TUTSOAPWebService.wsdl")
    private TUTSOAPWebService_Service service;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            //get the values
            Long id = Long.parseLong(request.getParameter("id"));
            String name = request.getParameter("name");
            String surname = request.getParameter("surname");
            String street = request.getParameter("street");
            String location = request.getParameter("location");
            String code = request.getParameter("code");
            
            //generate a student xml string
            String studentXML = generateStudentXML(id, name, surname, street, location, code);
            
            System.out.println("XML:\n"+studentXML);
            
            //send the studentXML to TUTSOAPWebService
            addStudent(studentXML);
            
            //forward everything to the output page
            RequestDispatcher disp = request.getRequestDispatcher("/add_student_outcome.jsp");
            disp.forward(request, response);
        } catch (Exception_Exception ex) {
            Logger.getLogger(AddStudentServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String generateStudentXML(Long id, String name, String surname, String street, String location, String code) {
        String studentXML = "<student>" + 
                                "<id>" + id + "</id>" +
                                "<name>" + name + "</name>" +
                                "<surname>" + surname + "</surname>" +
                                "<address>" + 
                                    "<street>" + street + "</street>" +
                                    "<location>" + location + "</location>" +
                                    "<code>" + code + "</code>" +
                                "</address>" +
                            "</student>";
        return studentXML;
    }

    private void addStudent(java.lang.String studentXML) throws Exception_Exception {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        za.ac.tut.jws.client.TUTSOAPWebService port = service.getTUTSOAPWebServicePort();
        port.addStudent(studentXML);
    }

}

