
package th.asset.webservicelistassetservice;

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
@WebServiceClient(name = "WebServiceListAssetService", targetNamespace = "http://Asset.th/", wsdlLocation = "WebServiceListAssetService.wsdl")
public class WebServiceListAssetServiceClient
    extends Service
{

    private final static URL WEBSERVICELISTASSETSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(th.asset.webservicelistassetservice.WebServiceListAssetServiceClient.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = th.asset.webservicelistassetservice.WebServiceListAssetServiceClient.class.getResource(".");
            url = new URL(baseUrl, "WebServiceListAssetService.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'WebServiceListAssetService.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        WEBSERVICELISTASSETSERVICE_WSDL_LOCATION = url;
    }

    public WebServiceListAssetServiceClient(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WebServiceListAssetServiceClient() {
        super(WEBSERVICELISTASSETSERVICE_WSDL_LOCATION, new QName("http://Asset.th/", "WebServiceListAssetService"));
    }

    /**
     * 
     * @return
     *     returns GetAssetList
     */
    @WebEndpoint(name = "WebServiceListAssetPort")
    public GetAssetList getWebServiceListAssetPort() {
        return super.getPort(new QName("http://Asset.th/", "WebServiceListAssetPort"), GetAssetList.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GetAssetList
     */
    @WebEndpoint(name = "WebServiceListAssetPort")
    public GetAssetList getWebServiceListAssetPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Asset.th/", "WebServiceListAssetPort"), GetAssetList.class, features);
    }

}
