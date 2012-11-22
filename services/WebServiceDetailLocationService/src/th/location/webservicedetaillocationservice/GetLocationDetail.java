
package th.location.webservicedetaillocationservice;

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
@WebService(name = "GetLocationDetail", targetNamespace = "http://Location.th/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface GetLocationDetail {


    /**
     * 
     * @param parameters
     * @return
     *     returns th.location.webservicedetaillocationservice.GetpersonOffenderResponse
     * @throws SQLException_Exception
     */
    @WebMethod(operationName = "GetpersonOffender")
    @WebResult(name = "GetpersonOffenderResponse", targetNamespace = "http://Location.th/", partName = "parameters")
    public GetpersonOffenderResponse getpersonOffender(
        @WebParam(name = "GetpersonOffender", targetNamespace = "http://Location.th/", partName = "parameters")
        GetpersonOffender parameters)
        throws SQLException_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns th.location.webservicedetaillocationservice.GetPlaceHisCaseResponse
     * @throws SQLException_Exception
     */
    @WebMethod(operationName = "GetPlaceHisCase")
    @WebResult(name = "GetPlaceHisCaseResponse", targetNamespace = "http://Location.th/", partName = "parameters")
    public GetPlaceHisCaseResponse getPlaceHisCase(
        @WebParam(name = "GetPlaceHisCase", targetNamespace = "http://Location.th/", partName = "parameters")
        GetPlaceHisCase parameters)
        throws SQLException_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns th.location.webservicedetaillocationservice.GetPlaceResponse
     * @throws SQLException_Exception
     */
    @WebMethod(operationName = "GetPlace")
    @WebResult(name = "GetPlaceResponse", targetNamespace = "http://Location.th/", partName = "parameters")
    public GetPlaceResponse getPlace(
        @WebParam(name = "GetPlace", targetNamespace = "http://Location.th/", partName = "parameters")
        GetPlace parameters)
        throws SQLException_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns th.location.webservicedetaillocationservice.GetPlaceTypePersonResponse
     * @throws SQLException_Exception
     */
    @WebMethod(operationName = "GetPlaceTypePerson")
    @WebResult(name = "GetPlaceTypePersonResponse", targetNamespace = "http://Location.th/", partName = "parameters")
    public GetPlaceTypePersonResponse getPlaceTypePerson(
        @WebParam(name = "GetPlaceTypePerson", targetNamespace = "http://Location.th/", partName = "parameters")
        GetPlaceTypePerson parameters)
        throws SQLException_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns th.location.webservicedetaillocationservice.GetPersonResponse
     * @throws SQLException_Exception
     */
    @WebMethod(operationName = "GetPerson")
    @WebResult(name = "GetPersonResponse", targetNamespace = "http://Location.th/", partName = "parameters")
    public GetPersonResponse getPerson(
        @WebParam(name = "GetPerson", targetNamespace = "http://Location.th/", partName = "parameters")
        GetPerson parameters)
        throws SQLException_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns th.location.webservicedetaillocationservice.GetPersonVInforResponse
     * @throws SQLException_Exception
     */
    @WebMethod(operationName = "GetPersonVInfor")
    @WebResult(name = "GetPersonVInforResponse", targetNamespace = "http://Location.th/", partName = "parameters")
    public GetPersonVInforResponse getPersonVInfor(
        @WebParam(name = "GetPersonVInfor", targetNamespace = "http://Location.th/", partName = "parameters")
        GetPersonVInfor parameters)
        throws SQLException_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns th.location.webservicedetaillocationservice.GetPlacePeopleInvolResponse
     * @throws SQLException_Exception
     */
    @WebMethod(operationName = "GetPlacePeopleInvol")
    @WebResult(name = "GetPlacePeopleInvolResponse", targetNamespace = "http://Location.th/", partName = "parameters")
    public GetPlacePeopleInvolResponse getPlacePeopleInvol(
        @WebParam(name = "GetPlacePeopleInvol", targetNamespace = "http://Location.th/", partName = "parameters")
        GetPlacePeopleInvol parameters)
        throws SQLException_Exception
    ;

}
