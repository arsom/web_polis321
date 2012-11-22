
package th.lawsuit.webservicelistlawsuitservice;

import java.io.IOException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import com.wavemaker.runtime.ws.BindingProperties;
import com.wavemaker.runtime.ws.jaxws.SOAPBindingResolver;
import org.springframework.core.io.ClassPathResource;


/**
 *  Operations for service "WebServiceListLawsuitService"
 *  10/29/2555 09:37:38
 * 
 */
public class WebServiceListLawsuitService {

    public String serviceId = "WebServiceListLawsuitService";
    private QName webServiceListLawsuitServiceQName = new QName("http://Lawsuit.th/", "WebServiceListLawsuitService");
    private BindingProperties bindingProperties;
    private GetLawsuitList getLawsuitListService;

    public WebServiceListLawsuitService() {
        WebServiceListLawsuitServiceClient webServiceListLawsuitServiceClient;
        try {
            URL wsdlLocation = new ClassPathResource("th/lawsuit/webservicelistlawsuitservice/WebServiceListLawsuitService.wsdl").getURL();
            webServiceListLawsuitServiceClient = new WebServiceListLawsuitServiceClient(wsdlLocation, webServiceListLawsuitServiceQName);
        } catch (IOException e) {
            webServiceListLawsuitServiceClient = new WebServiceListLawsuitServiceClient();
        }
        getLawsuitListService = webServiceListLawsuitServiceClient.getWebServiceListLawsuitPort();
    }

    public GetCrimeListResponse getCrimeList(GetCrimeList parameters)
        throws Exception
    {
        GetCrimeListResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getLawsuitListService), bindingProperties);
        response = getLawsuitListService.getCrimeList(parameters);
        return response;
    }

    public GetCrimeListOtherResponse getCrimeListOther(GetCrimeListOther parameters)
        throws Exception
    {
        GetCrimeListOtherResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getLawsuitListService), bindingProperties);
        response = getLawsuitListService.getCrimeListOther(parameters);
        return response;
    }

    public GetLostAssetListResponse getLostAssetList(GetLostAssetList parameters)
        throws Exception
    {
        GetLostAssetListResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getLawsuitListService), bindingProperties);
        response = getLawsuitListService.getLostAssetList(parameters);
        return response;
    }

    public GetLostCarListResponse getLostCarList(GetLostCarList parameters)
        throws Exception
    {
        GetLostCarListResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getLawsuitListService), bindingProperties);
        response = getLawsuitListService.getLostCarList(parameters);
        return response;
    }

    public GetLostCarListCrimeResponse getLostCarListCrime(GetLostCarListCrime parameters)
        throws Exception
    {
        GetLostCarListCrimeResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getLawsuitListService), bindingProperties);
        response = getLawsuitListService.getLostCarListCrime(parameters);
        return response;
    }

    public GetLostManListResponse getLostManList(GetLostManList parameters)
        throws Exception
    {
        GetLostManListResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getLawsuitListService), bindingProperties);
        response = getLawsuitListService.getLostManList(parameters);
        return response;
    }

    public GetOjHisListResponse getOjHisList(GetOjHisList parameters)
        throws Exception
    {
        GetOjHisListResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getLawsuitListService), bindingProperties);
        response = getLawsuitListService.getOjHisList(parameters);
        return response;
    }

    public GetPlanHisListResponse getPlanHisList(GetPlanHisList parameters)
        throws Exception
    {
        GetPlanHisListResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getLawsuitListService), bindingProperties);
        response = getLawsuitListService.getPlanHisList(parameters);
        return response;
    }

    public GetWanHisListResponse getWanHisList(GetWanHisList parameters)
        throws Exception
    {
        GetWanHisListResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getLawsuitListService), bindingProperties);
        response = getLawsuitListService.getWanHisList(parameters);
        return response;
    }

    public GetWanHisListCrimeResponse getWanHisListCrime(GetWanHisListCrime parameters)
        throws Exception
    {
        GetWanHisListCrimeResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getLawsuitListService), bindingProperties);
        response = getLawsuitListService.getWanHisListCrime(parameters);
        return response;
    }

    public GetWanHisListTrafResponse getWanHisListTraf(GetWanHisListTraf parameters)
        throws Exception
    {
        GetWanHisListTrafResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getLawsuitListService), bindingProperties);
        response = getLawsuitListService.getWanHisListTraf(parameters);
        return response;
    }

    public BindingProperties getBindingProperties() {
        return bindingProperties;
    }

    public void setBindingProperties(BindingProperties bindingProperties) {
        this.bindingProperties = bindingProperties;
    }

}
