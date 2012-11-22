
package th.location.webservicelistlocationservice;

import java.io.IOException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import com.wavemaker.runtime.ws.BindingProperties;
import com.wavemaker.runtime.ws.jaxws.SOAPBindingResolver;
import org.springframework.core.io.ClassPathResource;


/**
 *  Operations for service "WebServiceListLocationService"
 *  10/29/2555 09:37:14
 * 
 */
public class WebServiceListLocationService {

    public String serviceId = "WebServiceListLocationService";
    private QName webServiceListLocationServiceQName = new QName("http://Location.th/", "WebServiceListLocationService");
    private BindingProperties bindingProperties;
    private GetLocationList getLocationListService;

    public WebServiceListLocationService() {
        WebServiceListLocationServiceClient webServiceListLocationServiceClient;
        try {
            URL wsdlLocation = new ClassPathResource("th/location/webservicelistlocationservice/WebServiceListLocationService.wsdl").getURL();
            webServiceListLocationServiceClient = new WebServiceListLocationServiceClient(wsdlLocation, webServiceListLocationServiceQName);
        } catch (IOException e) {
            webServiceListLocationServiceClient = new WebServiceListLocationServiceClient();
        }
        getLocationListService = webServiceListLocationServiceClient.getWebServiceListLocationPort();
    }

    public GetPersonListResponse getPersonList(GetPersonList parameters)
        throws Exception
    {
        GetPersonListResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getLocationListService), bindingProperties);
        response = getLocationListService.getPersonList(parameters);
        return response;
    }

    public GetPlaceListResponse getPlaceList(GetPlaceList parameters)
        throws Exception
    {
        GetPlaceListResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getLocationListService), bindingProperties);
        response = getLocationListService.getPlaceList(parameters);
        return response;
    }

    public BindingProperties getBindingProperties() {
        return bindingProperties;
    }

    public void setBindingProperties(BindingProperties bindingProperties) {
        this.bindingProperties = bindingProperties;
    }

}
