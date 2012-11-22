
package th.vehicles.webservicelistvehicleservice;

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
@WebService(name = "GetVehicleList", targetNamespace = "http://vehicles.th/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GetVehicleList {


    /**
     * 
     * @param parameters
     * @return
     *     returns th.vehicles.webservicelistvehicleservice.GetLostCarListResponse
     * @throws SQLException_Exception
     */
    @WebMethod(operationName = "GetLostCarList")
    @WebResult(name = "GetLostCarListResponse", targetNamespace = "http://vehicles.th/", partName = "parameters")
    public GetLostCarListResponse getLostCarList(
        @WebParam(name = "GetLostCarList", targetNamespace = "http://vehicles.th/", partName = "parameters")
        GetLostCarList parameters)
        throws SQLException_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns th.vehicles.webservicelistvehicleservice.GetInterceptListResponse
     * @throws SQLException_Exception
     */
    @WebMethod(operationName = "GetInterceptList")
    @WebResult(name = "GetInterceptListResponse", targetNamespace = "http://vehicles.th/", partName = "parameters")
    public GetInterceptListResponse getInterceptList(
        @WebParam(name = "GetInterceptList", targetNamespace = "http://vehicles.th/", partName = "parameters")
        GetInterceptList parameters)
        throws SQLException_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns th.vehicles.webservicelistvehicleservice.GetTrcListResponse
     * @throws SQLException_Exception
     */
    @WebMethod(operationName = "GetTrcList")
    @WebResult(name = "GetTrcListResponse", targetNamespace = "http://vehicles.th/", partName = "parameters")
    public GetTrcListResponse getTrcList(
        @WebParam(name = "GetTrcList", targetNamespace = "http://vehicles.th/", partName = "parameters")
        GetTrcList parameters)
        throws SQLException_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns th.vehicles.webservicelistvehicleservice.GetPersonListResponse
     * @throws SQLException_Exception
     */
    @WebMethod(operationName = "GetPersonList")
    @WebResult(name = "GetPersonListResponse", targetNamespace = "http://vehicles.th/", partName = "parameters")
    public GetPersonListResponse getPersonList(
        @WebParam(name = "GetPersonList", targetNamespace = "http://vehicles.th/", partName = "parameters")
        GetPersonList parameters)
        throws SQLException_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns th.vehicles.webservicelistvehicleservice.GetCarListResponse
     * @throws SQLException_Exception
     */
    @WebMethod(operationName = "GetCarList")
    @WebResult(name = "GetCarListResponse", targetNamespace = "http://vehicles.th/", partName = "parameters")
    public GetCarListResponse getCarList(
        @WebParam(name = "GetCarList", targetNamespace = "http://vehicles.th/", partName = "parameters")
        GetCarList parameters)
        throws SQLException_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns th.vehicles.webservicelistvehicleservice.GetAccidentCarListResponse
     * @throws SQLException_Exception
     */
    @WebMethod(operationName = "GetAccidentCarList")
    @WebResult(name = "GetAccidentCarListResponse", targetNamespace = "http://vehicles.th/", partName = "parameters")
    public GetAccidentCarListResponse getAccidentCarList(
        @WebParam(name = "GetAccidentCarList", targetNamespace = "http://vehicles.th/", partName = "parameters")
        GetAccidentCarList parameters)
        throws SQLException_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns th.vehicles.webservicelistvehicleservice.GetLostCarList2Response
     * @throws SQLException_Exception
     */
    @WebMethod(operationName = "GetLostCarList2")
    @WebResult(name = "GetLostCarList2Response", targetNamespace = "http://vehicles.th/", partName = "parameters")
    public GetLostCarList2Response getLostCarList2(
        @WebParam(name = "GetLostCarList2", targetNamespace = "http://vehicles.th/", partName = "parameters")
        GetLostCarList2 parameters)
        throws SQLException_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns th.vehicles.webservicelistvehicleservice.GetConfiscateListResponse
     * @throws SQLException_Exception
     */
    @WebMethod(operationName = "GetConfiscateList")
    @WebResult(name = "GetConfiscateListResponse", targetNamespace = "http://vehicles.th/", partName = "parameters")
    public GetConfiscateListResponse getConfiscateList(
        @WebParam(name = "GetConfiscateList", targetNamespace = "http://vehicles.th/", partName = "parameters")
        GetConfiscateList parameters)
        throws SQLException_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns th.vehicles.webservicelistvehicleservice.GetCrimeListResponse
     * @throws SQLException_Exception
     */
    @WebMethod(operationName = "GetCrimeList")
    @WebResult(name = "GetCrimeListResponse", targetNamespace = "http://vehicles.th/", partName = "parameters")
    public GetCrimeListResponse getCrimeList(
        @WebParam(name = "GetCrimeList", targetNamespace = "http://vehicles.th/", partName = "parameters")
        GetCrimeList parameters)
        throws SQLException_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns th.vehicles.webservicelistvehicleservice.GetTicketListResponse
     * @throws SQLException_Exception
     */
    @WebMethod(operationName = "GetTicketList")
    @WebResult(name = "GetTicketListResponse", targetNamespace = "http://vehicles.th/", partName = "parameters")
    public GetTicketListResponse getTicketList(
        @WebParam(name = "GetTicketList", targetNamespace = "http://vehicles.th/", partName = "parameters")
        GetTicketList parameters)
        throws SQLException_Exception
    ;

}