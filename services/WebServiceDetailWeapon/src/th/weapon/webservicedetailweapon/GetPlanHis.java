
package th.weapon.webservicedetailweapon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPlanHis complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPlanHis">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caseNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "GetPlanHis", namespace = "http://Weapon.th/", propOrder = {
    "caseNO",
    "caseY",
    "caseOff",
    "cplanNo"
})
@XmlRootElement(name = "GetPlanHis", namespace = "http://Weapon.th/")
public class GetPlanHis {

    protected String caseNO;
    protected String caseY;
    protected String caseOff;
    protected String cplanNo;

    /**
     * Gets the value of the caseNO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseNO() {
        return caseNO;
    }

    /**
     * Sets the value of the caseNO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseNO(String value) {
        this.caseNO = value;
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
