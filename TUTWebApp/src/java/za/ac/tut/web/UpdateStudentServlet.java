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
 * @author sydney
 */
public class UpdateStudentServlet extends HttpServlet {

    @WebServiceRef(wsdlLocation = "/home/sydney/TUTSOAPWebService.wsdl")
    private TUTSOAPWebService_Service service;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final Long id = Long.parseLong(request.getParameter("id"));
        final String name = request.getParameter("name");
        final String surname = request.getParameter("surname");
        final Long addressId = Long.parseLong(request.getParameter("addressId"));
        final String street = request.getParameter("street");
        final String location = request.getParameter("location");
        final String code = request.getParameter("code");
            
        try {
            final String studentXML = generateStudentXML(id, name, surname, addressId, street, location, code);
            updateStudent(studentXML);
            request.setAttribute("students", service.getTUTSOAPWebServicePort().getStudents());
            final RequestDispatcher dispatcher = request.getRequestDispatcher("students.jsp");
            dispatcher.forward(request, response);
        } catch (Exception_Exception ex) {
            Logger.getLogger(UpdateStudentServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String generateStudentXML(Long id, String name, String surname, Long addressId, String street, String location, String code) {
        String studentXML = "<student>" + 
                                "<id>" + id + "</id>" +
                                "<name>" + name + "</name>" +
                                "<surname>" + surname + "</surname>" +
                                "<address>" + 
                                    "<id>" + addressId + "</id>" +
                                    "<street>" + street + "</street>" +
                                    "<location>" + location + "</location>" +
                                    "<code>" + code + "</code>" +
                                "</address>" +
                            "</student>";
        return studentXML;
    }

    private void updateStudent(java.lang.String studentXML) throws Exception_Exception {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        za.ac.tut.jws.client.TUTSOAPWebService port = service.getTUTSOAPWebServicePort();
        port.updateStudent(studentXML);
    }
    
}
