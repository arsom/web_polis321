
package th.asset.webservicedetailassetservice;

import java.io.IOException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import com.wavemaker.runtime.ws.BindingProperties;
import com.wavemaker.runtime.ws.jaxws.SOAPBindingResolver;
import org.springframework.core.io.ClassPathResource;


/**
 *  Operations for service "WebServiceDetailAssetService"
 *  10/29/2555 09:37:49
 * 
 */
public class WebServiceDetailAssetService {

    public String serviceId = "WebServiceDetailAssetService";
    private QName webServiceDetailAssetServiceQName = new QName("http://Asset.th/", "WebServiceDetailAssetService");
    private BindingProperties bindingProperties;
    private GetAssetDetail getAssetDetailService;

    public WebServiceDetailAssetService() {
        WebServiceDetailAssetServiceClient webServiceDetailAssetServiceClient;
        try {
            URL wsdlLocation = new ClassPathResource("th/asset/webservicedetailassetservice/WebServiceDetailAssetService.wsdl").getURL();
            webServiceDetailAssetServiceClient = new WebServiceDetailAssetServiceClient(wsdlLocation, webServiceDetailAssetServiceQName);
        } catch (IOException e) {
            webServiceDetailAssetServiceClient = new WebServiceDetailAssetServiceClient();
        }
        getAssetDetailService = webServiceDetailAssetServiceClient.getWebServiceDetailAssetPort();
    }

    public GetLostAssetAccessoriesResponse getLostAssetAccessories(GetLostAssetAccessories parameters)
        throws Exception
    {
        GetLostAssetAccessoriesResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getAssetDetailService), bindingProperties);
        response = getAssetDetailService.getLostAssetAccessories(parameters);
        return response;
    }

    public GetLostAssetAccessoriesDetailResponse getLostAssetAccessoriesDetail(GetLostAssetAccessoriesDetail parameters)
        throws Exception
    {
        GetLostAssetAccessoriesDetailResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getAssetDetailService), bindingProperties);
        response = getAssetDetailService.getLostAssetAccessoriesDetail(parameters);
        return response;
    }

    public GetLostAssetElecResponse getLostAssetElec(GetLostAssetElec parameters)
        throws Exception
    {
        GetLostAssetElecResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getAssetDetailService), bindingProperties);
        response = getAssetDetailService.getLostAssetElec(parameters);
        return response;
    }

    public GetLostAssetElecBrandResponse getLostAssetElecBrand(GetLostAssetElecBrand parameters)
        throws Exception
    {
        GetLostAssetElecBrandResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getAssetDetailService), bindingProperties);
        response = getAssetDetailService.getLostAssetElecBrand(parameters);
        return response;
    }

    public GetLostAssetElecCharacterResponse getLostAssetElecCharacter(GetLostAssetElecCharacter parameters)
        throws Exception
    {
        GetLostAssetElecCharacterResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getAssetDetailService), bindingProperties);
        response = getAssetDetailService.getLostAssetElecCharacter(parameters);
        return response;
    }

    public GetLostAssetGunResponse getLostAssetGun(GetLostAssetGun parameters)
        throws Exception
    {
        GetLostAssetGunResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getAssetDetailService), bindingProperties);
        response = getAssetDetailService.getLostAssetGun(parameters);
        return response;
    }

    public GetLostAssetGunBrandResponse getLostAssetGunBrand(GetLostAssetGunBrand parameters)
        throws Exception
    {
        GetLostAssetGunBrandResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getAssetDetailService), bindingProperties);
        response = getAssetDetailService.getLostAssetGunBrand(parameters);
        return response;
    }

    public GetLostAssetGunDetailResponse getLostAssetGunDetail(GetLostAssetGunDetail parameters)
        throws Exception
    {
        GetLostAssetGunDetailResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getAssetDetailService), bindingProperties);
        response = getAssetDetailService.getLostAssetGunDetail(parameters);
        return response;
    }

    public GetLostAssetUnknowsResponse getLostAssetUnknows(GetLostAssetUnknows parameters)
        throws Exception
    {
        GetLostAssetUnknowsResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getAssetDetailService), bindingProperties);
        response = getAssetDetailService.getLostAssetUnknows(parameters);
        return response;
    }

    public GetLostAssetUnknowsDetailResponse getLostAssetUnknowsDetail(GetLostAssetUnknowsDetail parameters)
        throws Exception
    {
        GetLostAssetUnknowsDetailResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getAssetDetailService), bindingProperties);
        response = getAssetDetailService.getLostAssetUnknowsDetail(parameters);
        return response;
    }

    public BindingProperties getBindingProperties() {
        return bindingProperties;
    }

    public void setBindingProperties(BindingProperties bindingProperties) {
        this.bindingProperties = bindingProperties;
    }

}
