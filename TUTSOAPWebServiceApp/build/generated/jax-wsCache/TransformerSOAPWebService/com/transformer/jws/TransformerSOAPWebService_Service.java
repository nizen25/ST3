
package com.transformer.jws;

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
@WebServiceClient(name = "TransformerSOAPWebService", targetNamespace = "http://jws.transformer.com/", wsdlLocation = "file:/home/sydney/TransformerSOAPWebService.wsdl")
public class TransformerSOAPWebService_Service
    extends Service
{

    private final static URL TRANSFORMERSOAPWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException TRANSFORMERSOAPWEBSERVICE_EXCEPTION;
    private final static QName TRANSFORMERSOAPWEBSERVICE_QNAME = new QName("http://jws.transformer.com/", "TransformerSOAPWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/home/sydney/TransformerSOAPWebService.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TRANSFORMERSOAPWEBSERVICE_WSDL_LOCATION = url;
        TRANSFORMERSOAPWEBSERVICE_EXCEPTION = e;
    }

    public TransformerSOAPWebService_Service() {
        super(__getWsdlLocation(), TRANSFORMERSOAPWEBSERVICE_QNAME);
    }

    public TransformerSOAPWebService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), TRANSFORMERSOAPWEBSERVICE_QNAME, features);
    }

    public TransformerSOAPWebService_Service(URL wsdlLocation) {
        super(wsdlLocation, TRANSFORMERSOAPWEBSERVICE_QNAME);
    }

    public TransformerSOAPWebService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TRANSFORMERSOAPWEBSERVICE_QNAME, features);
    }

    public TransformerSOAPWebService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TransformerSOAPWebService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TransformerSOAPWebService
     */
    @WebEndpoint(name = "TransformerSOAPWebServicePort")
    public TransformerSOAPWebService getTransformerSOAPWebServicePort() {
        return super.getPort(new QName("http://jws.transformer.com/", "TransformerSOAPWebServicePort"), TransformerSOAPWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TransformerSOAPWebService
     */
    @WebEndpoint(name = "TransformerSOAPWebServicePort")
    public TransformerSOAPWebService getTransformerSOAPWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://jws.transformer.com/", "TransformerSOAPWebServicePort"), TransformerSOAPWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TRANSFORMERSOAPWEBSERVICE_EXCEPTION!= null) {
            throw TRANSFORMERSOAPWEBSERVICE_EXCEPTION;
        }
        return TRANSFORMERSOAPWEBSERVICE_WSDL_LOCATION;
    }

}