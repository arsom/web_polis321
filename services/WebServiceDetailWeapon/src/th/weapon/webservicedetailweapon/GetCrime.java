
package th.weapon.webservicedetailweapon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCrime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCrime">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="weaponGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="crimeNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="crimeYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weaponSEQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCrime", namespace = "http://Weapon.th/", propOrder = {
    "weaponGroup",
    "orgCode",
    "crimeNO",
    "crimeYear",
    "weaponSEQ"
})
@XmlRootElement(name = "GetCrime", namespace = "http://Weapon.th/")
public class GetCrime {

    protected String weaponGroup;
    protected String orgCode;
    protected String crimeNO;
    protected String crimeYear;
    protected String weaponSEQ;

    /**
     * Gets the value of the weaponGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeaponGroup() {
        return weaponGroup;
    }

    /**
     * Sets the value of the weaponGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeaponGroup(String value) {
        this.weaponGroup = value;
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

    /**
     * Gets the value of the crimeNO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrimeNO() {
        return crimeNO;
    }

    /**
     * Sets the value of the crimeNO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrimeNO(String value) {
        this.crimeNO = value;
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
     * Gets the value of the weaponSEQ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeaponSEQ() {
        return weaponSEQ;
    }

    /**
     * Sets the value of the weaponSEQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeaponSEQ(String value) {
        this.weaponSEQ = value;
    }

}
