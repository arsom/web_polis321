
package th.asset.webservicedetailassetservice;

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
@WebServiceClient(name = "WebServiceDetailAssetService", targetNamespace = "http://Asset.th/", wsdlLocation = "WebServiceDetailAssetService.wsdl")
public class WebServiceDetailAssetServiceClient
    extends Service
{

    private final static URL WEBSERVICEDETAILASSETSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(th.asset.webservicedetailassetservice.WebServiceDetailAssetServiceClient.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = th.asset.webservicedetailassetservice.WebServiceDetailAssetServiceClient.class.getResource(".");
            url = new URL(baseUrl, "WebServiceDetailAssetService.wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'WebServiceDetailAssetService.wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        WEBSERVICEDETAILASSETSERVICE_WSDL_LOCATION = url;
    }

    public WebServiceDetailAssetServiceClient(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WebServiceDetailAssetServiceClient() {
        super(WEBSERVICEDETAILASSETSERVICE_WSDL_LOCATION, new QName("http://Asset.th/", "WebServiceDetailAssetService"));
    }

    /**
     * 
     * @return
     *     returns GetAssetDetail
     */
    @WebEndpoint(name = "WebServiceDetailAssetPort")
    public GetAssetDetail getWebServiceDetailAssetPort() {
        return super.getPort(new QName("http://Asset.th/", "WebServiceDetailAssetPort"), GetAssetDetail.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GetAssetDetail
     */
    @WebEndpoint(name = "WebServiceDetailAssetPort")
    public GetAssetDetail getWebServiceDetailAssetPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://Asset.th/", "WebServiceDetailAssetPort"), GetAssetDetail.class, features);
    }

}
