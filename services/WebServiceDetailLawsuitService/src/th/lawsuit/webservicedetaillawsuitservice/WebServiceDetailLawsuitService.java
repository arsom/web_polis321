
package th.lawsuit.webservicedetaillawsuitservice;

import java.io.IOException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import com.wavemaker.runtime.ws.BindingProperties;
import com.wavemaker.runtime.ws.jaxws.SOAPBindingResolver;
import org.springframework.core.io.ClassPathResource;


/**
 *  Operations for service "WebServiceDetailLawsuitService"
 *  10/29/2555 09:37:27
 * 
 */
public class WebServiceDetailLawsuitService {

    public String serviceId = "WebServiceDetailLawsuitService";
    private QName webServiceDetailLawsuitServiceQName = new QName("http://Lawsuit.th/", "WebServiceDetailLawsuitService");
    private BindingProperties bindingProperties;
    private GetLawsuitDetail getLawsuitDetailService;

    public WebServiceDetailLawsuitService() {
        WebServiceDetailLawsuitServiceClient webServiceDetailLawsuitServiceClient;
        try {
            URL wsdlLocation = new ClassPathResource("th/lawsuit/webservicedetaillawsuitservice/WebServiceDetailLawsuitService.wsdl").getURL();
            webServiceDetailLawsuitServiceClient = new WebServiceDetailLawsuitServiceClient(wsdlLocation, webServiceDetailLawsuitServiceQName);
        } catch (IOException e) {
            webServiceDetailLawsuitServiceClient = new WebServiceDetailLawsuitServiceClient();
        }
        getLawsuitDetailService = webServiceDetailLawsuitServiceClient.getWebServiceDetailLawsuitPort();
    }

    public GetCarLostResponse getCarLost(GetCarLost parameters)
        throws Exception
    {
        GetCarLostResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getLawsuitDetailService), bindingProperties);
        response = getLawsuitDetailService.getCarLost(parameters);
        return response;
    }

    public GetCarLostColorResponse getCarLostColor(GetCarLostColor parameters)
        throws Exception
    {
        GetCarLostColorResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getLawsuitDetailService), bindingProperties);
        response = getLawsuitDetailService.getCarLostColor(parameters);
        return response;
    }

    public GetCrimeResponse getCrime(GetCrime parameters)
        throws Exception
    {
        GetCrimeResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getLawsuitDetailService), bindingProperties);
        response = getLawsuitDetailService.getCrime(parameters);
        return response;
    }

    public GetCrimeComplainantResponse getCrimeComplainant(GetCrimeComplainant parameters)
        throws Exception
    {
        GetCrimeComplainantResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getLawsuitDetailService), bindingProperties);
        response = getLawsuitDetailService.getCrimeComplainant(parameters);
        return response;
    }

    public GetCrimeOffenderResponse getCrimeOffender(GetCrimeOffender parameters)
        throws Exception
    {
        GetCrimeOffenderResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getLawsuitDetailService), bindingProperties);
        response = getLawsuitDetailService.getCrimeOffender(parameters);
        return response;
    }

    public GetCrimeOtherResponse getCrimeOther(GetCrimeOther parameters)
        throws Exception
    {
        GetCrimeOtherResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getLawsuitDetailService), bindingProperties);
        response = getLawsuitDetailService.getCrimeOther(parameters);
        return response;
    }

    public GetLostAssetResponse getLostAsset(GetLostAsset parameters)
        throws Exception
    {
        GetLostAssetResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getLawsuitDetailService), bindingProperties);
        response = getLawsuitDetailService.getLostAsset(parameters);
        return response;
    }

    public GetLostAssetDetailResponse getLostAssetDetail(GetLostAssetDetail parameters)
        throws Exception
    {
        GetLostAssetDetailResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getLawsuitDetailService), bindingProperties);
        response = getLawsuitDetailService.getLostAssetDetail(parameters);
        return response;
    }

    public GetLostCarCrimeResponse getLostCarCrime(GetLostCarCrime parameters)
        throws Exception
    {
        GetLostCarCrimeResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getLawsuitDetailService), bindingProperties);
        response = getLawsuitDetailService.getLostCarCrime(parameters);
        return response;
    }

    public GetLostManResponse getLostMan(GetLostMan parameters)
        throws Exception
    {
        GetLostManResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getLawsuitDetailService), bindingProperties);
        response = getLawsuitDetailService.getLostMan(parameters);
        return response;
    }

    public GetOjHisResponse getOjHis(GetOjHis parameters)
        throws Exception
    {
        GetOjHisResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getLawsuitDetailService), bindingProperties);
        response = getLawsuitDetailService.getOjHis(parameters);
        return response;
    }

    public GetOjHisAcquittedResponse getOjHisAcquitted(GetOjHisAcquitted parameters)
        throws Exception
    {
        GetOjHisAcquittedResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getLawsuitDetailService), bindingProperties);
        response = getLawsuitDetailService.getOjHisAcquitted(parameters);
        return response;
    }

    public GetOjHisJudgmentsResponse getOjHisJudgments(GetOjHisJudgments parameters)
        throws Exception
    {
        GetOjHisJudgmentsResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getLawsuitDetailService), bindingProperties);
        response = getLawsuitDetailService.getOjHisJudgments(parameters);
        return response;
    }

    public GetPlanHisResponse getPlanHis(GetPlanHis parameters)
        throws Exception
    {
        GetPlanHisResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getLawsuitDetailService), bindingProperties);
        response = getLawsuitDetailService.getPlanHis(parameters);
        return response;
    }

    public GetPlanHisNameResponse getPlanHisName(GetPlanHisName parameters)
        throws Exception
    {
        GetPlanHisNameResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getLawsuitDetailService), bindingProperties);
        response = getLawsuitDetailService.getPlanHisName(parameters);
        return response;
    }

    public GetPlanHisOtherNameResponse getPlanHisOtherName(GetPlanHisOtherName parameters)
        throws Exception
    {
        GetPlanHisOtherNameResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getLawsuitDetailService), bindingProperties);
        response = getLawsuitDetailService.getPlanHisOtherName(parameters);
        return response;
    }

    public GetPlanHisSpouseResponse getPlanHisSpouse(GetPlanHisSpouse parameters)
        throws Exception
    {
        GetPlanHisSpouseResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getLawsuitDetailService), bindingProperties);
        response = getLawsuitDetailService.getPlanHisSpouse(parameters);
        return response;
    }

    public GetWanHisCrimeResponse getWanHisCrime(GetWanHisCrime parameters)
        throws Exception
    {
        GetWanHisCrimeResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getLawsuitDetailService), bindingProperties);
        response = getLawsuitDetailService.getWanHisCrime(parameters);
        return response;
    }

    public GetWanHisDownloadResponse getWanHisDownload(GetWanHisDownload parameters)
        throws Exception
    {
        GetWanHisDownloadResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getLawsuitDetailService), bindingProperties);
        response = getLawsuitDetailService.getWanHisDownload(parameters);
        return response;
    }

    public GetWanHisDownloadTrafResponse getWanHisDownloadTraf(GetWanHisDownloadTraf parameters)
        throws Exception
    {
        GetWanHisDownloadTrafResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getLawsuitDetailService), bindingProperties);
        response = getLawsuitDetailService.getWanHisDownloadTraf(parameters);
        return response;
    }

    public GetWanHisEducateStatusResponse getWanHisEducateStatus(GetWanHisEducateStatus parameters)
        throws Exception
    {
        GetWanHisEducateStatusResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getLawsuitDetailService), bindingProperties);
        response = getLawsuitDetailService.getWanHisEducateStatus(parameters);
        return response;
    }

    public GetWanHisEducationResponse getWanHisEducation(GetWanHisEducation parameters)
        throws Exception
    {
        GetWanHisEducationResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getLawsuitDetailService), bindingProperties);
        response = getLawsuitDetailService.getWanHisEducation(parameters);
        return response;
    }

    public GetWanHisProvResponse getWanHisProv(GetWanHisProv parameters)
        throws Exception
    {
        GetWanHisProvResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getLawsuitDetailService), bindingProperties);
        response = getLawsuitDetailService.getWanHisProv(parameters);
        return response;
    }

    public GetWanHisProvinceResponse getWanHisProvince(GetWanHisProvince parameters)
        throws Exception
    {
        GetWanHisProvinceResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getLawsuitDetailService), bindingProperties);
        response = getLawsuitDetailService.getWanHisProvince(parameters);
        return response;
    }

    public GetWanHisTrafficResponse getWanHisTraffic(GetWanHisTraffic parameters)
        throws Exception
    {
        GetWanHisTrafficResponse response;
        SOAPBindingResolver.setBindingProperties(((BindingProvider) getLawsuitDetailService), bindingProperties);
        response = getLawsuitDetailService.getWanHisTraffic(parameters);
        return response;
    }

    public BindingProperties getBindingProperties() {
        return bindingProperties;
    }

    public void setBindingProperties(BindingProperties bindingProperties) {
        this.bindingProperties = bindingProperties;
    }

}
