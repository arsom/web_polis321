
package th.location.webservicedetaillocationservice;

import java.io.IOException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import com.wavemaker.runtime.ws.BindingProperties;
import com.wavemaker.runtime.ws.jaxws.SOAPBindingResolver;
import org.springframework.core.io.ClassPathResource;


/**
 *  Operations for service "WebServiceDetailLocationService"
 *  10/29/2555 09:37:02
 * 
 */
public class WebServiceDetailLocationService {

    public String serviceId = "WebServiceDetailLocationService";
    private QName webServiceDetailLocationServiceQName = new QName("http://Location.th/", "WebServiceDetailLocationService");
    private BindingProperties bindingProperties;
    private GetLocationDetail getLocationDetailService;

    public WebServiceDetailLocationService() {
        WebServiceDetailLocationServiceClient webServiceDetailLocationServiceClient;
        try {
            URL wsdlLocation = new ClassPathResource("th/location/webservicedetaillocationservice/WebServiceDetailLocationService.wsdl").getURL();
            webServiceDetailLocationServiceClient = new WebServiceDetailLocationServiceClient(wsdlLocation, webServiceDetailLocationServiceQName);
        } catch (IOException e) {
            webServiceDetailLocationServiceClient = new WebServiceDetailLocationServiceClient();
        }
        getLocationDetailService = webServiceDetailLocationServiceClient.getWebServiceDetailLocationPort();
    }

    public GetPersonResponse getPerson(GetPerson parameters)
        throws Exception
    {
        GetPersonResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getLocationDetailService), bindingProperties);
        response = getLocationDetailService.getPerson(parameters);
        return response;
    }

    public GetPersonVInforResponse getPersonVInfor(GetPersonVInfor parameters)
        throws Exception
    {
        GetPersonVInforResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getLocationDetailService), bindingProperties);
        response = getLocationDetailService.getPersonVInfor(parameters);
        return response;
    }

    public GetPlaceResponse getPlace(GetPlace parameters)
        throws Exception
    {
        GetPlaceResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getLocationDetailService), bindingProperties);
        response = getLocationDetailService.getPlace(parameters);
        return response;
    }

    public GetPlaceHisCaseResponse getPlaceHisCase(GetPlaceHisCase parameters)
        throws Exception
    {
        GetPlaceHisCaseResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getLocationDetailService), bindingProperties);
        response = getLocationDetailService.getPlaceHisCase(parameters);
        return response;
    }

    public GetPlacePeopleInvolResponse getPlacePeopleInvol(GetPlacePeopleInvol parameters)
        throws Exception
    {
        GetPlacePeopleInvolResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getLocationDetailService), bindingProperties);
        response = getLocationDetailService.getPlacePeopleInvol(parameters);
        return response;
    }

    public GetPlaceTypePersonResponse getPlaceTypePerson(GetPlaceTypePerson parameters)
        throws Exception
    {
        GetPlaceTypePersonResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getLocationDetailService), bindingProperties);
        response = getLocationDetailService.getPlaceTypePerson(parameters);
        return response;
    }

    public GetpersonOffenderResponse getpersonOffender(GetpersonOffender parameters)
        throws Exception
    {
        GetpersonOffenderResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getLocationDetailService), bindingProperties);
        response = getLocationDetailService.getpersonOffender(parameters);
        return response;
    }

    public BindingProperties getBindingProperties() {
        return bindingProperties;
    }

    public void setBindingProperties(BindingProperties bindingProperties) {
        this.bindingProperties = bindingProperties;
    }

}
