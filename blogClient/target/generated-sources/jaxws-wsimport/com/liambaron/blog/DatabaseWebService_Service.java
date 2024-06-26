
package com.liambaron.blog;

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
@WebServiceClient(name = "DatabaseWebService", targetNamespace = "http://blog.liambaron.com/", wsdlLocation = "http://localhost:8080/blog/DatabaseWebService?wsdl")
public class DatabaseWebService_Service
    extends Service
{

    private final static URL DATABASEWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException DATABASEWEBSERVICE_EXCEPTION;
    private final static QName DATABASEWEBSERVICE_QNAME = new QName("http://blog.liambaron.com/", "DatabaseWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/blog/DatabaseWebService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DATABASEWEBSERVICE_WSDL_LOCATION = url;
        DATABASEWEBSERVICE_EXCEPTION = e;
    }

    public DatabaseWebService_Service() {
        super(__getWsdlLocation(), DATABASEWEBSERVICE_QNAME);
    }

    public DatabaseWebService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), DATABASEWEBSERVICE_QNAME, features);
    }

    public DatabaseWebService_Service(URL wsdlLocation) {
        super(wsdlLocation, DATABASEWEBSERVICE_QNAME);
    }

    public DatabaseWebService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DATABASEWEBSERVICE_QNAME, features);
    }

    public DatabaseWebService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DatabaseWebService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DatabaseWebService
     */
    @WebEndpoint(name = "DatabaseWebServicePort")
    public DatabaseWebService getDatabaseWebServicePort() {
        return super.getPort(new QName("http://blog.liambaron.com/", "DatabaseWebServicePort"), DatabaseWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DatabaseWebService
     */
    @WebEndpoint(name = "DatabaseWebServicePort")
    public DatabaseWebService getDatabaseWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://blog.liambaron.com/", "DatabaseWebServicePort"), DatabaseWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DATABASEWEBSERVICE_EXCEPTION!= null) {
            throw DATABASEWEBSERVICE_EXCEPTION;
        }
        return DATABASEWEBSERVICE_WSDL_LOCATION;
    }

}
