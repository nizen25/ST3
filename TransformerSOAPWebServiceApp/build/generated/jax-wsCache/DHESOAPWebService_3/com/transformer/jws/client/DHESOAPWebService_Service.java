
package com.transformer.jws.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "DHESOAPWebService", targetNamespace = "http://jws.dhe.org.za/", wsdlLocation = "http://localhost:8080/DHESOAPWebService/DHESOAPWebService?wsdl")
public class DHESOAPWebService_Service
    extends Service
{

    private final static URL DHESOAPWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException DHESOAPWEBSERVICE_EXCEPTION;
    private final static QName DHESOAPWEBSERVICE_QNAME = new QName("http://jws.dhe.org.za/", "DHESOAPWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/DHESOAPWebService/DHESOAPWebService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DHESOAPWEBSERVICE_WSDL_LOCATION = url;
        DHESOAPWEBSERVICE_EXCEPTION = e;
    }

    public DHESOAPWebService_Service() {
        super(__getWsdlLocation(), DHESOAPWEBSERVICE_QNAME);
    }

    public DHESOAPWebService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), DHESOAPWEBSERVICE_QNAME, features);
    }

    public DHESOAPWebService_Service(URL wsdlLocation) {
        super(wsdlLocation, DHESOAPWEBSERVICE_QNAME);
    }

    public DHESOAPWebService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DHESOAPWEBSERVICE_QNAME, features);
    }

    public DHESOAPWebService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DHESOAPWebService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DHESOAPWebService
     */
    @WebEndpoint(name = "DHESOAPWebServicePort")
    public DHESOAPWebService getDHESOAPWebServicePort() {
        return super.getPort(new QName("http://jws.dhe.org.za/", "DHESOAPWebServicePort"), DHESOAPWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DHESOAPWebService
     */
    @WebEndpoint(name = "DHESOAPWebServicePort")
    public DHESOAPWebService getDHESOAPWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://jws.dhe.org.za/", "DHESOAPWebServicePort"), DHESOAPWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DHESOAPWEBSERVICE_EXCEPTION!= null) {
            throw DHESOAPWEBSERVICE_EXCEPTION;
        }
        return DHESOAPWEBSERVICE_WSDL_LOCATION;
    }

}