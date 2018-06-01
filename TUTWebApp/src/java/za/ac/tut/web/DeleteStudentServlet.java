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
public class DeleteStudentServlet extends HttpServlet {

    @WebServiceRef(wsdlLocation = "/home/sydney/TUTSOAPWebService.wsdl")
    private TUTSOAPWebService_Service service;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final Long id = Long.parseLong(request.getParameter("id"));
        try {
            deleteStudent(id);
            final RequestDispatcher dispatcher = request.getRequestDispatcher("/FindStudentsServlet.do");
            dispatcher.forward(request, response);
        } catch (Exception_Exception ex) {
            Logger.getLogger(DeleteStudentServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void deleteStudent(java.lang.Long id) throws Exception_Exception {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        za.ac.tut.jws.client.TUTSOAPWebService port = service.getTUTSOAPWebServicePort();
        port.deleteStudent(id);
    }
    
}
