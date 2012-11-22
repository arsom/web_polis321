
package th.asset.webservicelistassetservice;

import java.io.IOException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import com.wavemaker.runtime.ws.BindingProperties;
import com.wavemaker.runtime.ws.jaxws.SOAPBindingResolver;
import org.springframework.core.io.ClassPathResource;


/**
 *  Operations for service "WebServiceListAssetService"
 *  10/29/2555 09:37:59
 * 
 */
public class WebServiceListAssetService {

    public String serviceId = "WebServiceListAssetService";
    private QName webServiceListAssetServiceQName = new QName("http://Asset.th/", "WebServiceListAssetService");
    private BindingProperties bindingProperties;
    private GetAssetList getAssetListService;

    public WebServiceListAssetService() {
        WebServiceListAssetServiceClient webServiceListAssetServiceClient;
        try {
            URL wsdlLocation = new ClassPathResource("th/asset/webservicelistassetservice/WebServiceListAssetService.wsdl").getURL();
            webServiceListAssetServiceClient = new WebServiceListAssetServiceClient(wsdlLocation, webServiceListAssetServiceQName);
        } catch (IOException e) {
            webServiceListAssetServiceClient = new WebServiceListAssetServiceClient();
        }
        getAssetListService = webServiceListAssetServiceClient.getWebServiceListAssetPort();
    }

    public GetLostAsseetListAccessoriesResponse getLostAsseetListAccessories(GetLostAsseetListAccessories parameters)
        throws Exception
    {
        GetLostAsseetListAccessoriesResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getAssetListService), bindingProperties);
        response = getAssetListService.getLostAsseetListAccessories(parameters);
        return response;
    }

    public GetLostAssetListElecResponse getLostAssetListElec(GetLostAssetListElec parameters)
        throws Exception
    {
        GetLostAssetListElecResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getAssetListService), bindingProperties);
        response = getAssetListService.getLostAssetListElec(parameters);
        return response;
    }

    public GetLostAssetListGunResponse getLostAssetListGun(GetLostAssetListGun parameters)
        throws Exception
    {
        GetLostAssetListGunResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getAssetListService), bindingProperties);
        response = getAssetListService.getLostAssetListGun(parameters);
        return response;
    }

    public GetLostAssetListUnknowPriceResponse getLostAssetListUnknowPrice(GetLostAssetListUnknowPrice parameters)
        throws Exception
    {
        GetLostAssetListUnknowPriceResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getAssetListService), bindingProperties);
        response = getAssetListService.getLostAssetListUnknowPrice(parameters);
        return response;
    }

    public GetSelectPageResponse getSelectPage(GetSelectPage parameters)
        throws Exception
    {
        GetSelectPageResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getAssetListService), bindingProperties);
        response = getAssetListService.getSelectPage(parameters);
        return response;
    }

    public BindingProperties getBindingProperties() {
        return bindingProperties;
    }

    public void setBindingProperties(BindingProperties bindingProperties) {
        this.bindingProperties = bindingProperties;
    }

}
