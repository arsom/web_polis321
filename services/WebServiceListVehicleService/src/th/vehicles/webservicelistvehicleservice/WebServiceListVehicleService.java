
package th.vehicles.webservicelistvehicleservice;

import java.io.IOException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import com.wavemaker.runtime.ws.BindingProperties;
import com.wavemaker.runtime.ws.jaxws.SOAPBindingResolver;
import org.springframework.core.io.ClassPathResource;


/**
 *  Operations for service "WebServiceListVehicleService"
 *  10/29/2555 09:36:39
 * 
 */
public class WebServiceListVehicleService {

    public String serviceId = "WebServiceListVehicleService";
    private QName webServiceListVehicleServiceQName = new QName("http://vehicles.th/", "WebServiceListVehicleService");
    private BindingProperties bindingProperties;
    private GetVehicleList getVehicleListService;

    public WebServiceListVehicleService() {
        WebServiceListVehicleServiceClient webServiceListVehicleServiceClient;
        try {
            URL wsdlLocation = new ClassPathResource("th/vehicles/webservicelistvehicleservice/WebServiceListVehicleService.wsdl").getURL();
            webServiceListVehicleServiceClient = new WebServiceListVehicleServiceClient(wsdlLocation, webServiceListVehicleServiceQName);
        } catch (IOException e) {
            webServiceListVehicleServiceClient = new WebServiceListVehicleServiceClient();
        }
        getVehicleListService = webServiceListVehicleServiceClient.getWebServiceListVehiclePort();
    }

    public GetAccidentCarListResponse getAccidentCarList(GetAccidentCarList parameters)
        throws Exception
    {
        GetAccidentCarListResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getVehicleListService), bindingProperties);
        response = getVehicleListService.getAccidentCarList(parameters);
        return response;
    }

    public GetCarListResponse getCarList(GetCarList parameters)
        throws Exception
    {
        GetCarListResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getVehicleListService), bindingProperties);
        response = getVehicleListService.getCarList(parameters);
        return response;
    }

    public GetConfiscateListResponse getConfiscateList(GetConfiscateList parameters)
        throws Exception
    {
        GetConfiscateListResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getVehicleListService), bindingProperties);
        response = getVehicleListService.getConfiscateList(parameters);
        return response;
    }

    public GetCrimeListResponse getCrimeList(GetCrimeList parameters)
        throws Exception
    {
        GetCrimeListResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getVehicleListService), bindingProperties);
        response = getVehicleListService.getCrimeList(parameters);
        return response;
    }

    public GetInterceptListResponse getInterceptList(GetInterceptList parameters)
        throws Exception
    {
        GetInterceptListResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getVehicleListService), bindingProperties);
        response = getVehicleListService.getInterceptList(parameters);
        return response;
    }

    public GetLostCarListResponse getLostCarList(GetLostCarList parameters)
        throws Exception
    {
        GetLostCarListResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getVehicleListService), bindingProperties);
        response = getVehicleListService.getLostCarList(parameters);
        return response;
    }

    public GetLostCarList2Response getLostCarList2(GetLostCarList2 parameters)
        throws Exception
    {
        GetLostCarList2Response response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getVehicleListService), bindingProperties);
        response = getVehicleListService.getLostCarList2(parameters);
        return response;
    }

    public GetPersonListResponse getPersonList(GetPersonList parameters)
        throws Exception
    {
        GetPersonListResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getVehicleListService), bindingProperties);
        response = getVehicleListService.getPersonList(parameters);
        return response;
    }

    public GetTicketListResponse getTicketList(GetTicketList parameters)
        throws Exception
    {
        GetTicketListResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getVehicleListService), bindingProperties);
        response = getVehicleListService.getTicketList(parameters);
        return response;
    }

    public GetTrcListResponse getTrcList(GetTrcList parameters)
        throws Exception
    {
        GetTrcListResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getVehicleListService), bindingProperties);
        response = getVehicleListService.getTrcList(parameters);
        return response;
    }

    public BindingProperties getBindingProperties() {
        return bindingProperties;
    }

    public void setBindingProperties(BindingProperties bindingProperties) {
        this.bindingProperties = bindingProperties;
    }

}
