
package th.lawsuit.webservicedetaillawsuitservice;

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
@WebServiceClient(name = "WebServiceDetailLawsuitService", targetNamespace = "http://Lawsuit.th/", wsdlLocation = "WebServiceDetailLawsuitService.wsdl")
public class WebServiceDetailLawsuitServiceClient
    extends Service
{

    private final static URL WEBSERVICEDETAILLAWSUITSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(th.lawsuit.webservicedetaillawsuitservice.WebServiceDetailLawsuitServiceClient.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = th.lawsuit.webservicedetaillawsuitservice.WebServiceDetailLawsuitServiceClient.class.getResource(".");
            url = new URL(baseUrl, "WebServiceDetailLawsuitService.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'WebServiceDetailLawsuitService.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        WEBSERVICEDETAILLAWSUITSERVICE_WSDL_LOCATION = url;
    }

    public WebServiceDetailLawsuitServiceClient(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WebServiceDetailLawsuitServiceClient() {
        super(WEBSERVICEDETAILLAWSUITSERVICE_WSDL_LOCATION, new QName("http://Lawsuit.th/", "WebServiceDetailLawsuitService"));
    }

    /**
     * 
     * @return
     *     returns GetLawsuitDetail
     */
    @WebEndpoint(name = "WebServiceDetailLawsuitPort")
    public GetLawsuitDetail getWebServiceDetailLawsuitPort() {
        return super.getPort(new QName("http://Lawsuit.th/", "WebServiceDetailLawsuitPort"), GetLawsuitDetail.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GetLawsuitDetail
     */
    @WebEndpoint(name = "WebServiceDetailLawsuitPort")
    public GetLawsuitDetail getWebServiceDetailLawsuitPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Lawsuit.th/", "WebServiceDetailLawsuitPort"), GetLawsuitDetail.class, features);
    }

}
