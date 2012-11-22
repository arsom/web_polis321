
package th.weapon.webservicedetailweapon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCrimeGun complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCrimeGun">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="crimeNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="crimeYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCrimeGun", namespace = "http://Weapon.th/", propOrder = {
    "crimeNo",
    "crimeYear",
    "orgCode"
})
@XmlRootElement(name = "GetCrimeGun", namespace = "http://Weapon.th/")
public class GetCrimeGun {

    protected String crimeNo;
    protected String crimeYear;
    protected String orgCode;

    /**
     * Gets the value of the crimeNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrimeNo() {
        return crimeNo;
    }

    /**
     * Sets the value of the crimeNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrimeNo(String value) {
        this.crimeNo = value;
    }

    /**
     * Gets the value of the crimeYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrimeYear() {
        return crimeYear;
    }

    /**
     * Sets the value of the crimeYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrimeYear(String value) {
        this.crimeYear = value;
    }

    /**
     * Gets the value of the orgCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * Sets the value of the orgCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgCode(String value) {
        this.orgCode = value;
    }

}
