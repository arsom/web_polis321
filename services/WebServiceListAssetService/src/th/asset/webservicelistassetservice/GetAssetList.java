
package th.asset.webservicelistassetservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.5-b03-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "GetAssetList", targetNamespace = "http://Asset.th/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GetAssetList {


    /**
     * 
     * @param parameters
     * @return
     *     returns th.asset.webservicelistassetservice.GetLostAssetListGunResponse
     * @throws SQLException_Exception
     */
    @WebMethod(operationName = "GetLostAssetListGun")
    @WebResult(name = "GetLostAssetListGunResponse", targetNamespace = "http://Asset.th/", partName = "parameters")
    public GetLostAssetListGunResponse getLostAssetListGun(
        @WebParam(name = "GetLostAssetListGun", targetNamespace = "http://Asset.th/", partName = "parameters")
        GetLostAssetListGun parameters)
        throws SQLException_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns th.asset.webservicelistassetservice.GetLostAssetListElecResponse
     * @throws SQLException_Exception
     */
    @WebMethod(operationName = "GetLostAssetListElec")
    @WebResult(name = "GetLostAssetListElecResponse", targetNamespace = "http://Asset.th/", partName = "parameters")
    public GetLostAssetListElecResponse getLostAssetListElec(
        @WebParam(name = "GetLostAssetListElec", targetNamespace = "http://Asset.th/", partName = "parameters")
        GetLostAssetListElec parameters)
        throws SQLException_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns th.asset.webservicelistassetservice.GetSelectPageResponse
     * @throws SQLException_Exception
     */
    @WebMethod(operationName = "GetSelectPage")
    @WebResult(name = "GetSelectPageResponse", targetNamespace = "http://Asset.th/", partName = "parameters")
    public GetSelectPageResponse getSelectPage(
        @WebParam(name = "GetSelectPage", targetNamespace = "http://Asset.th/", partName = "parameters")
        GetSelectPage parameters)
        throws SQLException_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns th.asset.webservicelistassetservice.GetLostAsseetListAccessoriesResponse
     * @throws SQLException_Exception
     */
    @WebMethod(operationName = "GetLostAsseetListAccessories")
    @WebResult(name = "GetLostAsseetListAccessoriesResponse", targetNamespace = "http://Asset.th/", partName = "parameters")
    public GetLostAsseetListAccessoriesResponse getLostAsseetListAccessories(
        @WebParam(name = "GetLostAsseetListAccessories", targetNamespace = "http://Asset.th/", partName = "parameters")
        GetLostAsseetListAccessories parameters)
        throws SQLException_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns th.asset.webservicelistassetservice.GetLostAssetListUnknowPriceResponse
     * @throws SQLException_Exception
     */
    @WebMethod(operationName = "GetLostAssetListUnknowPrice")
    @WebResult(name = "GetLostAssetListUnknowPriceResponse", targetNamespace = "http://Asset.th/", partName = "parameters")
    public GetLostAssetListUnknowPriceResponse getLostAssetListUnknowPrice(
        @WebParam(name = "GetLostAssetListUnknowPrice", targetNamespace = "http://Asset.th/", partName = "parameters")
        GetLostAssetListUnknowPrice parameters)
        throws SQLException_Exception
    ;

}