
package th.vehicles.webservicelistvehicleservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.5-b03-
 * Generated source version: 2.1
 * 
 */
@WebFault(name = "SQLException", targetNamespace = "http://vehicles.th/")
public class SQLException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private SQLException faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public SQLException_Exception(String message, SQLException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public SQLException_Exception(String message, SQLException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: th.vehicles.webservicelistvehicleservice.SQLException
     */
    public SQLException getFaultInfo() {
        return faultInfo;
    }

}
