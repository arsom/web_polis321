
package th.weapon.webservicelistweaponservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setCrimeWeapon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setCrimeWeapon">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="crimeNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="crimeYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="groupDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weaponGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weaponSEQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weaponType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setCrimeWeapon", namespace = "http://Weapon.th/", propOrder = {
    "crimeNo",
    "crimeYear",
    "groupDesc",
    "orgCode",
    "orgName",
    "ownCode",
    "ownName",
    "typeDesc",
    "weaponGroup",
    "weaponSEQ",
    "weaponType"
})
public class SetCrimeWeaponType {

    protected int crimeNo;
    protected int crimeYear;
    protected String groupDesc;
    protected String orgCode;
    protected String orgName;
    protected String ownCode;
    protected String ownName;
    protected String typeDesc;
    protected String weaponGroup;
    protected String weaponSEQ;
    protected String weaponType;

    /**
     * Gets the value of the crimeNo property.
     * 
     */
    public int getCrimeNo() {
        return crimeNo;
    }

    /**
     * Sets the value of the crimeNo property.
     * 
     */
    public void setCrimeNo(int value) {
        this.crimeNo = value;
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
     * Gets the value of the groupDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupDesc() {
        return groupDesc;
    }

    /**
     * Sets the value of the groupDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupDesc(String value) {
        this.groupDesc = value;
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
     * Gets the value of the ownCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnCode() {
        return ownCode;
    }

    /**
     * Sets the value of the ownCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnCode(String value) {
        this.ownCode = value;
    }

    /**
     * Gets the value of the ownName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnName() {
        return ownName;
    }

    /**
     * Sets the value of the ownName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnName(String value) {
        this.ownName = value;
    }

    /**
     * Gets the value of the typeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeDesc() {
        return typeDesc;
    }

    /**
     * Sets the value of the typeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeDesc(String value) {
        this.typeDesc = value;
    }

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

    /**
     * Gets the value of the weaponType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeaponType() {
        return weaponType;
    }

    /**
     * Sets the value of the weaponType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeaponType(String value) {
        this.weaponType = value;
    }

}
