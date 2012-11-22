
package th.weapon.webservicedetailweapon;

import java.io.IOException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import com.wavemaker.runtime.ws.BindingProperties;
import com.wavemaker.runtime.ws.jaxws.SOAPBindingResolver;
import org.springframework.core.io.ClassPathResource;


/**
 *  Operations for service "WebServiceDetailWeapon"
 *  10/29/2555 09:35:48
 * 
 */
public class WebServiceDetailWeapon {

    public String serviceId = "WebServiceDetailWeapon";
    private QName webServiceDetailWeaponQName = new QName("http://Weapon.th/", "WebServiceDetailWeapon");
    private BindingProperties bindingProperties;
    private WebServiceDetailWeaponPortType webServiceDetailWeaponPortTypeService;

    public WebServiceDetailWeapon() {
        WebServiceDetailWeaponClient webServiceDetailWeaponClient;
        try {
            URL wsdlLocation = new ClassPathResource("th/weapon/webservicedetailweapon/WebServiceDetailWeapon.wsdl").getURL();
            webServiceDetailWeaponClient = new WebServiceDetailWeaponClient(wsdlLocation, webServiceDetailWeaponQName);
        } catch (IOException e) {
            webServiceDetailWeaponClient = new WebServiceDetailWeaponClient();
        }
        webServiceDetailWeaponPortTypeService = webServiceDetailWeaponClient.getWebServiceDetailWeaponPort();
    }

    public GetCrimeResponse getCrime(GetCrime parameters)
        throws Exception
    {
        GetCrimeResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) webServiceDetailWeaponPortTypeService), bindingProperties);
        response = webServiceDetailWeaponPortTypeService.getCrime(parameters);
        return response;
    }

    public GetCrimeGunResponse getCrimeGun(GetCrimeGun parameters)
        throws Exception
    {
        GetCrimeGunResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) webServiceDetailWeaponPortTypeService), bindingProperties);
        response = webServiceDetailWeaponPortTypeService.getCrimeGun(parameters);
        return response;
    }

    public GetCrimeGunOwnerResponse getCrimeGunOwner(GetCrimeGunOwner parameters)
        throws Exception
    {
        GetCrimeGunOwnerResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) webServiceDetailWeaponPortTypeService), bindingProperties);
        response = webServiceDetailWeaponPortTypeService.getCrimeGunOwner(parameters);
        return response;
    }

    public GetCrimeOwnerResponse getCrimeOwner(GetCrimeOwner parameters)
        throws Exception
    {
        GetCrimeOwnerResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) webServiceDetailWeaponPortTypeService), bindingProperties);
        response = webServiceDetailWeaponPortTypeService.getCrimeOwner(parameters);
        return response;
    }

    public GetLostAssetResponse getLostAsset(GetLostAsset parameters)
        throws Exception
    {
        GetLostAssetResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) webServiceDetailWeaponPortTypeService), bindingProperties);
        response = webServiceDetailWeaponPortTypeService.getLostAsset(parameters);
        return response;
    }

    public GetLostAsset2Response getLostAsset2(GetLostAsset2 parameters)
        throws Exception
    {
        GetLostAsset2Response response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) webServiceDetailWeaponPortTypeService), bindingProperties);
        response = webServiceDetailWeaponPortTypeService.getLostAsset2(parameters);
        return response;
    }

    public GetLostAssetBrandResponse getLostAssetBrand(GetLostAssetBrand parameters)
        throws Exception
    {
        GetLostAssetBrandResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) webServiceDetailWeaponPortTypeService), bindingProperties);
        response = webServiceDetailWeaponPortTypeService.getLostAssetBrand(parameters);
        return response;
    }

    public GetLostAssetMakerResponse getLostAssetMaker(GetLostAssetMaker parameters)
        throws Exception
    {
        GetLostAssetMakerResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) webServiceDetailWeaponPortTypeService), bindingProperties);
        response = webServiceDetailWeaponPortTypeService.getLostAssetMaker(parameters);
        return response;
    }

    public GetPersonResponse getPerson(GetPerson parameters)
        throws Exception
    {
        GetPersonResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) webServiceDetailWeaponPortTypeService), bindingProperties);
        response = webServiceDetailWeaponPortTypeService.getPerson(parameters);
        return response;
    }

    public GetPlanHisResponse getPlanHis(GetPlanHis parameters)
        throws Exception
    {
        GetPlanHisResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) webServiceDetailWeaponPortTypeService), bindingProperties);
        response = webServiceDetailWeaponPortTypeService.getPlanHis(parameters);
        return response;
    }

    public GetPlanHisHowResponse getPlanHisHow(GetPlanHisHow parameters)
        throws Exception
    {
        GetPlanHisHowResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) webServiceDetailWeaponPortTypeService), bindingProperties);
        response = webServiceDetailWeaponPortTypeService.getPlanHisHow(parameters);
        return response;
    }

    public BindingProperties getBindingProperties() {
        return bindingProperties;
    }

    public void setBindingProperties(BindingProperties bindingProperties) {
        this.bindingProperties = bindingProperties;
    }

}
