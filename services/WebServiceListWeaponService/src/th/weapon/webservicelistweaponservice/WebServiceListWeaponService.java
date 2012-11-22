
package th.weapon.webservicelistweaponservice;

import java.io.IOException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import com.wavemaker.runtime.ws.BindingProperties;
import com.wavemaker.runtime.ws.jaxws.SOAPBindingResolver;
import org.springframework.core.io.ClassPathResource;


/**
 *  Operations for service "WebServiceListWeaponService"
 *  10/29/2555 09:36:24
 * 
 */
public class WebServiceListWeaponService {

    public String serviceId = "WebServiceListWeaponService";
    private QName webServiceListWeaponServiceQName = new QName("http://Weapon.th/", "WebServiceListWeaponService");
    private BindingProperties bindingProperties;
    private GetWeaponList getWeaponListService;

    public WebServiceListWeaponService() {
        WebServiceListWeaponServiceClient webServiceListWeaponServiceClient;
        try {
            URL wsdlLocation = new ClassPathResource("th/weapon/webservicelistweaponservice/WebServiceListWeaponService.wsdl").getURL();
            webServiceListWeaponServiceClient = new WebServiceListWeaponServiceClient(wsdlLocation, webServiceListWeaponServiceQName);
        } catch (IOException e) {
            webServiceListWeaponServiceClient = new WebServiceListWeaponServiceClient();
        }
        getWeaponListService = webServiceListWeaponServiceClient.getWebServiceListWeaponPort();
    }

    public GetCrimeListResponse getCrimeList(GetCrimeList parameters)
        throws Exception
    {
        GetCrimeListResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getWeaponListService), bindingProperties);
        response = getWeaponListService.getCrimeList(parameters);
        return response;
    }

    public GetCrimeList2Response getCrimeList2(GetCrimeList2 parameters)
        throws Exception
    {
        GetCrimeList2Response response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getWeaponListService), bindingProperties);
        response = getWeaponListService.getCrimeList2(parameters);
        return response;
    }

    public GetCrimeListGunResponse getCrimeListGun(GetCrimeListGun parameters)
        throws Exception
    {
        GetCrimeListGunResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getWeaponListService), bindingProperties);
        response = getWeaponListService.getCrimeListGun(parameters);
        return response;
    }

    public GetLostAssetListResponse getLostAssetList(GetLostAssetList parameters)
        throws Exception
    {
        GetLostAssetListResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getWeaponListService), bindingProperties);
        response = getWeaponListService.getLostAssetList(parameters);
        return response;
    }

    public GetPersonListResponse getPersonList(GetPersonList parameters)
        throws Exception
    {
        GetPersonListResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getWeaponListService), bindingProperties);
        response = getWeaponListService.getPersonList(parameters);
        return response;
    }

    public GetPlanHisListResponse getPlanHisList(GetPlanHisList parameters)
        throws Exception
    {
        GetPlanHisListResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getWeaponListService), bindingProperties);
        response = getWeaponListService.getPlanHisList(parameters);
        return response;
    }

    public BindingProperties getBindingProperties() {
        return bindingProperties;
    }

    public void setBindingProperties(BindingProperties bindingProperties) {
        this.bindingProperties = bindingProperties;
    }

}
