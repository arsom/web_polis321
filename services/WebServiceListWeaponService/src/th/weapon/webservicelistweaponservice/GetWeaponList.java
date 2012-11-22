
package th.weapon.webservicelistweaponservice;

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
@WebService(name = "GetWeaponList", targetNamespace = "http://Weapon.th/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GetWeaponList {


    /**
     * 
     * @param parameters
     * @return
     *     returns th.weapon.webservicelistweaponservice.GetCrimeListGunResponse
     * @throws SQLException_Exception
     */
    @WebMethod(operationName = "GetCrimeListGun")
    @WebResult(name = "GetCrimeListGunResponse", targetNamespace = "http://Weapon.th/", partName = "parameters")
    public GetCrimeListGunResponse getCrimeListGun(
        @WebParam(name = "GetCrimeListGun", targetNamespace = "http://Weapon.th/", partName = "parameters")
        GetCrimeListGun parameters)
        throws SQLException_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns th.weapon.webservicelistweaponservice.GetCrimeListResponse
     * @throws SQLException_Exception
     */
    @WebMethod(operationName = "GetCrimeList")
    @WebResult(name = "GetCrimeListResponse", targetNamespace = "http://Weapon.th/", partName = "parameters")
    public GetCrimeListResponse getCrimeList(
        @WebParam(name = "GetCrimeList", targetNamespace = "http://Weapon.th/", partName = "parameters")
        GetCrimeList parameters)
        throws SQLException_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns th.weapon.webservicelistweaponservice.GetPlanHisListResponse
     * @throws SQLException_Exception
     */
    @WebMethod(operationName = "GetPlanHisList")
    @WebResult(name = "GetPlanHisListResponse", targetNamespace = "http://Weapon.th/", partName = "parameters")
    public GetPlanHisListResponse getPlanHisList(
        @WebParam(name = "GetPlanHisList", targetNamespace = "http://Weapon.th/", partName = "parameters")
        GetPlanHisList parameters)
        throws SQLException_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns th.weapon.webservicelistweaponservice.GetCrimeList2Response
     * @throws SQLException_Exception
     */
    @WebMethod(operationName = "GetCrimeList2")
    @WebResult(name = "GetCrimeList2Response", targetNamespace = "http://Weapon.th/", partName = "parameters")
    public GetCrimeList2Response getCrimeList2(
        @WebParam(name = "GetCrimeList2", targetNamespace = "http://Weapon.th/", partName = "parameters")
        GetCrimeList2 parameters)
        throws SQLException_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns th.weapon.webservicelistweaponservice.GetPersonListResponse
     * @throws SQLException_Exception
     */
    @WebMethod(operationName = "GetPersonList")
    @WebResult(name = "GetPersonListResponse", targetNamespace = "http://Weapon.th/", partName = "parameters")
    public GetPersonListResponse getPersonList(
        @WebParam(name = "GetPersonList", targetNamespace = "http://Weapon.th/", partName = "parameters")
        GetPersonList parameters)
        throws SQLException_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns th.weapon.webservicelistweaponservice.GetLostAssetListResponse
     * @throws SQLException_Exception
     */
    @WebMethod(operationName = "GetLostAssetList")
    @WebResult(name = "GetLostAssetListResponse", targetNamespace = "http://Weapon.th/", partName = "parameters")
    public GetLostAssetListResponse getLostAssetList(
        @WebParam(name = "GetLostAssetList", targetNamespace = "http://Weapon.th/", partName = "parameters")
        GetLostAssetList parameters)
        throws SQLException_Exception
    ;

}