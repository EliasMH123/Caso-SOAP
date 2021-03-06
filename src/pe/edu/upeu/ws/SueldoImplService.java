
package pe.edu.upeu.ws;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "SueldoImplService", targetNamespace = "http://ws.upeu.edu.pe/", wsdlLocation = "http://localhost:2123/soap/sueldo?wsdl")
public class SueldoImplService
    extends Service
{

    private final static URL SUELDOIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException SUELDOIMPLSERVICE_EXCEPTION;
    private final static QName SUELDOIMPLSERVICE_QNAME = new QName("http://ws.upeu.edu.pe/", "SueldoImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:2123/soap/sueldo?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SUELDOIMPLSERVICE_WSDL_LOCATION = url;
        SUELDOIMPLSERVICE_EXCEPTION = e;
    }

    public SueldoImplService() {
        super(__getWsdlLocation(), SUELDOIMPLSERVICE_QNAME);
    }

    public SueldoImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SUELDOIMPLSERVICE_QNAME, features);
    }

    public SueldoImplService(URL wsdlLocation) {
        super(wsdlLocation, SUELDOIMPLSERVICE_QNAME);
    }

    public SueldoImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SUELDOIMPLSERVICE_QNAME, features);
    }

    public SueldoImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SueldoImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns SueldoDao
     */
    @WebEndpoint(name = "SueldoImplPort")
    public SueldoDao getSueldoImplPort() {
        return super.getPort(new QName("http://ws.upeu.edu.pe/", "SueldoImplPort"), SueldoDao.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SueldoDao
     */
    @WebEndpoint(name = "SueldoImplPort")
    public SueldoDao getSueldoImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.upeu.edu.pe/", "SueldoImplPort"), SueldoDao.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SUELDOIMPLSERVICE_EXCEPTION!= null) {
            throw SUELDOIMPLSERVICE_EXCEPTION;
        }
        return SUELDOIMPLSERVICE_WSDL_LOCATION;
    }

}
