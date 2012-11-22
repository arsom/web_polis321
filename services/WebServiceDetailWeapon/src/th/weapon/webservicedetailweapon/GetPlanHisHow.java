
package th.weapon.webservicedetailweapon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPlanHisHow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPlanHisHow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caseNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caseY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caseOff" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cplanNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPlanHisHow", namespace = "http://Weapon.th/", propOrder = {
    "caseNo",
    "caseY",
    "caseOff",
    "cplanNo"
})
@XmlRootElement(name = "GetPlanHisHow", namespace = "http://Weapon.th/")
public class GetPlanHisHow {

    protected String caseNo;
    protected String caseY;
    protected String caseOff;
    protected String cplanNo;

    /**
     * Gets the value of the caseNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseNo() {
        return caseNo;
    }

    /**
     * Sets the value of the caseNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseNo(String value) {
        this.caseNo = value;
    }

    /**
     * Gets the value of the caseY property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseY() {
        return caseY;
    }

    /**
     * Sets the value of the caseY property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseY(String value) {
        this.caseY = value;
    }

    /**
     * Gets the value of the caseOff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseOff() {
        return caseOff;
    }

    /**
     * Sets the value of the caseOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseOff(String value) {
        this.caseOff = value;
    }

    /**
     * Gets the value of the cplanNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCplanNo() {
        return cplanNo;
    }

    /**
     * Sets the value of the cplanNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCplanNo(String value) {
        this.cplanNo = value;
    }

}
