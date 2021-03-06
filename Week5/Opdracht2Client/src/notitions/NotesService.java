
package notitions;

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
@WebServiceClient(name = "NotesService", targetNamespace = "http://notews/", wsdlLocation = "http://localhost:9191/notitions?wsdl")
public class NotesService
    extends Service
{

    private final static URL NOTESSERVICE_WSDL_LOCATION;
    private final static WebServiceException NOTESSERVICE_EXCEPTION;
    private final static QName NOTESSERVICE_QNAME = new QName("http://notews/", "NotesService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9191/notitions?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        NOTESSERVICE_WSDL_LOCATION = url;
        NOTESSERVICE_EXCEPTION = e;
    }

    public NotesService() {
        super(__getWsdlLocation(), NOTESSERVICE_QNAME);
    }

    public NotesService(WebServiceFeature... features) {
        super(__getWsdlLocation(), NOTESSERVICE_QNAME, features);
    }

    public NotesService(URL wsdlLocation) {
        super(wsdlLocation, NOTESSERVICE_QNAME);
    }

    public NotesService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, NOTESSERVICE_QNAME, features);
    }

    public NotesService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public NotesService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Notes
     */
    @WebEndpoint(name = "NotesPort")
    public Notes getNotesPort() {
        return super.getPort(new QName("http://notews/", "NotesPort"), Notes.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Notes
     */
    @WebEndpoint(name = "NotesPort")
    public Notes getNotesPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://notews/", "NotesPort"), Notes.class, features);
    }

    private static URL __getWsdlLocation() {
        if (NOTESSERVICE_EXCEPTION!= null) {
            throw NOTESSERVICE_EXCEPTION;
        }
        return NOTESSERVICE_WSDL_LOCATION;
    }

}
