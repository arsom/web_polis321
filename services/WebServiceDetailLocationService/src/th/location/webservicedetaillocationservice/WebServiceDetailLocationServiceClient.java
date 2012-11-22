
package th.location.webservicedetaillocationservice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.5-b03-
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "WebServiceDetailLocationService", targetNamespace = "http://Location.th/", wsdlLocation = "WebServiceDetailLocationService.wsdl")
public class WebServiceDetailLocationServiceClient
    extends Service
{

    private final static URL WEBSERVICEDETAILLOCATIONSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(th.location.webservicedetaillocationservice.WebServiceDetailLocationServiceClient.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = th.location.webservicedetaillocationservice.WebServiceDetailLocationServiceClient.class.getResource(".");
            url = new URL(baseUrl, "WebServiceDetailLocationService.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'WebServiceDetailLocationService.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        WEBSERVICEDETAILLOCATIONSERVICE_WSDL_LOCATION = url;
    }

    public WebServiceDetailLocationServiceClient(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WebServiceDetailLocationServiceClient() {
        super(WEBSERVICEDETAILLOCATIONSERVICE_WSDL_LOCATION, new QName("http://Location.th/", "WebServiceDetailLocationService"));
    }

    /**
     * 
     * @return
     *     returns GetLocationDetail
     */
    @WebEndpoint(name = "WebServiceDetailLocationPort")
    public GetLocationDetail getWebServiceDetailLocationPort() {
        return super.getPort(new QName("http://Location.th/", "WebServiceDetailLocationPort"), GetLocationDetail.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GetLocationDetail
     */
    @WebEndpoint(name = "WebServiceDetailLocationPort")
    public GetLocationDetail getWebServiceDetailLocationPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Location.th/", "WebServiceDetailLocationPort"), GetLocationDetail.class, features);
    }

}
