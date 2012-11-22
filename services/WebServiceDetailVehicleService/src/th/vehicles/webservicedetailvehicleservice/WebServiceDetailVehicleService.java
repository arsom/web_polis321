
package th.vehicles.webservicedetailvehicleservice;

import java.io.IOException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import com.wavemaker.runtime.ws.BindingProperties;
import com.wavemaker.runtime.ws.jaxws.SOAPBindingResolver;
import org.springframework.core.io.ClassPathResource;


/**
 *  Operations for service "WebServiceDetailVehicleService"
 *  10/29/2555 09:36:52
 * 
 */
public class WebServiceDetailVehicleService {

    public String serviceId = "WebServiceDetailVehicleService";
    private QName webServiceDetailVehicleServiceQName = new QName("http://vehicles.th/", "WebServiceDetailVehicleService");
    private BindingProperties bindingProperties;
    private GetVehicleDetail getVehicleDetailService;

    public WebServiceDetailVehicleService() {
        WebServiceDetailVehicleServiceClient webServiceDetailVehicleServiceClient;
        try {
            URL wsdlLocation = new ClassPathResource("th/vehicles/webservicedetailvehicleservice/WebServiceDetailVehicleService.wsdl").getURL();
            webServiceDetailVehicleServiceClient = new WebServiceDetailVehicleServiceClient(wsdlLocation, webServiceDetailVehicleServiceQName);
        } catch (IOException e) {
            webServiceDetailVehicleServiceClient = new WebServiceDetailVehicleServiceClient();
        }
        getVehicleDetailService = webServiceDetailVehicleServiceClient.getWebServiceDetailVehiclePort();
    }

    public GetAccNationResponse getAccNation(GetAccNation parameters)
        throws Exception
    {
        GetAccNationResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getVehicleDetailService), bindingProperties);
        response = getVehicleDetailService.getAccNation(parameters);
        return response;
    }

    public GetAccidentCarResponse getAccidentCar(GetAccidentCar parameters)
        throws Exception
    {
        GetAccidentCarResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getVehicleDetailService), bindingProperties);
        response = getVehicleDetailService.getAccidentCar(parameters);
        return response;
    }

    public GetCarByKeyResponse getCarByKey(GetCarByKey parameters)
        throws Exception
    {
        GetCarByKeyResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getVehicleDetailService), bindingProperties);
        response = getVehicleDetailService.getCarByKey(parameters);
        return response;
    }

    public GetCarByKeyColorResponse getCarByKeyColor(GetCarByKeyColor parameters)
        throws Exception
    {
        GetCarByKeyColorResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getVehicleDetailService), bindingProperties);
        response = getVehicleDetailService.getCarByKeyColor(parameters);
        return response;
    }

    public GetConfiscateResponse getConfiscate(GetConfiscate parameters)
        throws Exception
    {
        GetConfiscateResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getVehicleDetailService), bindingProperties);
        response = getVehicleDetailService.getConfiscate(parameters);
        return response;
    }

    public GetCrimeResponse getCrime(GetCrime parameters)
        throws Exception
    {
        GetCrimeResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getVehicleDetailService), bindingProperties);
        response = getVehicleDetailService.getCrime(parameters);
        return response;
    }

    public GetCrimeEXTResponse getCrimeEXT(GetCrimeEXT parameters)
        throws Exception
    {
        GetCrimeEXTResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getVehicleDetailService), bindingProperties);
        response = getVehicleDetailService.getCrimeEXT(parameters);
        return response;
    }

    public GetInterceptResponse getIntercept(GetIntercept parameters)
        throws Exception
    {
        GetInterceptResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getVehicleDetailService), bindingProperties);
        response = getVehicleDetailService.getIntercept(parameters);
        return response;
    }

    public GetLostCarResponse getLostCar(GetLostCar parameters)
        throws Exception
    {
        GetLostCarResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getVehicleDetailService), bindingProperties);
        response = getVehicleDetailService.getLostCar(parameters);
        return response;
    }

    public GetLostCarColorResponse getLostCarColor(GetLostCarColor parameters)
        throws Exception
    {
        GetLostCarColorResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getVehicleDetailService), bindingProperties);
        response = getVehicleDetailService.getLostCarColor(parameters);
        return response;
    }

    public GetLostCarPenaltyResponse getLostCarPenalty(GetLostCarPenalty parameters)
        throws Exception
    {
        GetLostCarPenaltyResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getVehicleDetailService), bindingProperties);
        response = getVehicleDetailService.getLostCarPenalty(parameters);
        return response;
    }

    public GetPersonResponse getPerson(GetPerson parameters)
        throws Exception
    {
        GetPersonResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getVehicleDetailService), bindingProperties);
        response = getVehicleDetailService.getPerson(parameters);
        return response;
    }

    public GetPersonCRIMEResponse getPersonCRIME(GetPersonCRIME parameters)
        throws Exception
    {
        GetPersonCRIMEResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getVehicleDetailService), bindingProperties);
        response = getVehicleDetailService.getPersonCRIME(parameters);
        return response;
    }

    public GetPersonVEHICLEResponse getPersonVEHICLE(GetPersonVEHICLE parameters)
        throws Exception
    {
        GetPersonVEHICLEResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getVehicleDetailService), bindingProperties);
        response = getVehicleDetailService.getPersonVEHICLE(parameters);
        return response;
    }

    public GetTicketMBVResponse getTicketMBV(GetTicketMBV parameters)
        throws Exception
    {
        GetTicketMBVResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getVehicleDetailService), bindingProperties);
        response = getVehicleDetailService.getTicketMBV(parameters);
        return response;
    }

    public GetTicketsResponse getTickets(GetTickets parameters)
        throws Exception
    {
        GetTicketsResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getVehicleDetailService), bindingProperties);
        response = getVehicleDetailService.getTickets(parameters);
        return response;
    }

    public GetTrcByKeyResponse getTrcByKey(GetTrcByKey parameters)
        throws Exception
    {
        GetTrcByKeyResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getVehicleDetailService), bindingProperties);
        response = getVehicleDetailService.getTrcByKey(parameters);
        return response;
    }

    public GetTrcByKeyColorResponse getTrcByKeyColor(GetTrcByKeyColor parameters)
        throws Exception
    {
        GetTrcByKeyColorResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getVehicleDetailService), bindingProperties);
        response = getVehicleDetailService.getTrcByKeyColor(parameters);
        return response;
    }

    public BindingProperties getBindingProperties() {
        return bindingProperties;
    }

    public void setBindingProperties(BindingProperties bindingProperties) {
        this.bindingProperties = bindingProperties;
    }

}
