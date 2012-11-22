
package th.weapon.webservicelistweaponservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setCrimeWeapon2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setCrimeWeapon2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="crimeNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="crimeYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="orgCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weaponCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weaponName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weaponNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setCrimeWeapon2", namespace = "http://Weapon.th/", propOrder = {
    "crimeNO",
    "crimeYear",
    "orgCode",
    "orgName",
    "weaponCode",
    "weaponName",
    "weaponNo"
})
public class SetCrimeWeapon2Type {

    protected int crimeNO;
    protected int crimeYear;
    protected String orgCode;
    protected String orgName;
    protected String weaponCode;
    protected String weaponName;
    protected String weaponNo;

    /**
     * Gets the value of the crimeNO property.
     * 
     */
    public int getCrimeNO() {
        return crimeNO;
    }

    /**
     * Sets the value of the crimeNO property.
     * 
     */
    public void setCrimeNO(int value) {
        this.crimeNO = value;
    }

    /**
     * Gets the value of the crimeYear property.
     * 
     */
    public int getCrimeYear() {
        return crimeYear;
    }

    /**
     * Sets the value of the crimeYear property.
     * 
     */
    public void setCrimeYear(int value) {
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

    /**
     * Gets the value of the orgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * Sets the value of the orgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgName(String value) {
        this.orgName = value;
    }

    /**
     * Gets the value of the weaponCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeaponCode() {
        return weaponCode;
    }

    /**
     * Sets the value of the weaponCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeaponCode(String value) {
        this.weaponCode = value;
    }

    /**
     * Gets the value of the weaponName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeaponName() {
        return weaponName;
    }

    /**
     * Sets the value of the weaponName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeaponName(String value) {
        this.weaponName = value;
    }

    /**
     * Gets the value of the weaponNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeaponNo() {
        return weaponNo;
    }

    /**
     * Sets the value of the weaponNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeaponNo(String value) {
        this.weaponNo = value;
    }

}
