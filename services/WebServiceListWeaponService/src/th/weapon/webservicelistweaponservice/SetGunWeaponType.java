
package th.weapon.webservicelistweaponservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setGunWeapon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setGunWeapon">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="crimeNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="crimeYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="licence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sizeWeapon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weaponName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "setGunWeapon", namespace = "http://Weapon.th/", propOrder = {
    "brand",
    "crimeNO",
    "crimeYear",
    "licence",
    "orgCode",
    "orgName",
    "sizeWeapon",
    "weaponName",
    "weaponSEQ"
})
public class SetGunWeaponType {

    protected String brand;
    protected int crimeNO;
    protected int crimeYear;
    protected String licence;
    protected String orgCode;
    protected String orgName;
    protected String sizeWeapon;
    protected String weaponName;
    protected String weaponSEQ;

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

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
     * Gets the value of the licence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicence() {
        return licence;
    }

    /**
     * Sets the value of the licence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicence(String value) {
        this.licence = value;
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
     * Gets the value of the sizeWeapon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSizeWeapon() {
        return sizeWeapon;
    }

    /**
     * Sets the value of the sizeWeapon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSizeWeapon(String value) {
        this.sizeWeapon = value;
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
