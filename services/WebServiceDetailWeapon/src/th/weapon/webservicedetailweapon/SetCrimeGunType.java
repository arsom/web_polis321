
package th.weapon.webservicedetailweapon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setCrimeGun complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setCrimeGun">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="charge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cmajorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commonFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commonMistaked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commonUsed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commonWrong" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="complainDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="complainTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="crimeNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="crimeYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="damageFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="licence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occurCwCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occurFromDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occurFromTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occurPlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occurToDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occurToTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="polisName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sizeWeapon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weaponName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weaponSEQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weaponStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "setCrimeGun", namespace = "http://Weapon.th/", propOrder = {
    "amount",
    "brand",
    "charge",
    "cmajorCode",
    "commonFlag",
    "commonMistaked",
    "commonUsed",
    "commonWrong",
    "complainDate",
    "complainTime",
    "crimeNo",
    "crimeYear",
    "damageFlag",
    "licence",
    "occurCwCode",
    "occurFromDate",
    "occurFromTime",
    "occurPlace",
    "occurToDate",
    "occurToTime",
    "orgCode",
    "orgName",
    "ownCode",
    "ownStatus",
    "polisName",
    "provName",
    "sizeWeapon",
    "weaponName",
    "weaponSEQ",
    "weaponStatus",
    "weaponType"
})
public class SetCrimeGunType {

    protected int amount;
    protected String brand;
    protected String charge;
    protected String cmajorCode;
    protected String commonFlag;
    protected String commonMistaked;
    protected String commonUsed;
    protected String commonWrong;
    protected String complainDate;
    protected String complainTime;
    protected int crimeNo;
    protected int crimeYear;
    protected String damageFlag;
    protected String licence;
    protected String occurCwCode;
    protected String occurFromDate;
    protected String occurFromTime;
    protected String occurPlace;
    protected String occurToDate;
    protected String occurToTime;
    protected String orgCode;
    protected String orgName;
    protected String ownCode;
    protected String ownStatus;
    protected String polisName;
    protected String provName;
    protected String sizeWeapon;
    protected String weaponName;
    protected String weaponSEQ;
    protected String weaponStatus;
    protected String weaponType;

    /**
     * Gets the value of the amount property.
     * 
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(int value) {
        this.amount = value;
    }

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
     * Gets the value of the charge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharge() {
        return charge;
    }

    /**
     * Sets the value of the charge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharge(String value) {
        this.charge = value;
    }

    /**
     * Gets the value of the cmajorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmajorCode() {
        return cmajorCode;
    }

    /**
     * Sets the value of the cmajorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmajorCode(String value) {
        this.cmajorCode = value;
    }

    /**
     * Gets the value of the commonFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommonFlag() {
        return commonFlag;
    }

    /**
     * Sets the value of the commonFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommonFlag(String value) {
        this.commonFlag = value;
    }

    /**
     * Gets the value of the commonMistaked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommonMistaked() {
        return commonMistaked;
    }

    /**
     * Sets the value of the commonMistaked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommonMistaked(String value) {
        this.commonMistaked = value;
    }

    /**
     * Gets the value of the commonUsed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommonUsed() {
        return commonUsed;
    }

    /**
     * Sets the value of the commonUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommonUsed(String value) {
        this.commonUsed = value;
    }

    /**
     * Gets the value of the commonWrong property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommonWrong() {
        return commonWrong;
    }

    /**
     * Sets the value of the commonWrong property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommonWrong(String value) {
        this.commonWrong = value;
    }

    /**
     * Gets the value of the complainDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplainDate() {
        return complainDate;
    }

    /**
     * Sets the value of the complainDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplainDate(String value) {
        this.complainDate = value;
    }

    /**
     * Gets the value of the complainTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplainTime() {
        return complainTime;
    }

    /**
     * Sets the value of the complainTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplainTime(String value) {
        this.complainTime = value;
    }

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
     * Gets the value of the damageFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDamageFlag() {
        return damageFlag;
    }

    /**
     * Sets the value of the damageFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDamageFlag(String value) {
        this.damageFlag = value;
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
     * Gets the value of the occurCwCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccurCwCode() {
        return occurCwCode;
    }

    /**
     * Sets the value of the occurCwCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccurCwCode(String value) {
        this.occurCwCode = value;
    }

    /**
     * Gets the value of the occurFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccurFromDate() {
        return occurFromDate;
    }

    /**
     * Sets the value of the occurFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccurFromDate(String value) {
        this.occurFromDate = value;
    }

    /**
     * Gets the value of the occurFromTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccurFromTime() {
        return occurFromTime;
    }

    /**
     * Sets the value of the occurFromTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccurFromTime(String value) {
        this.occurFromTime = value;
    }

    /**
     * Gets the value of the occurPlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccurPlace() {
        return occurPlace;
    }

    /**
     * Sets the value of the occurPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccurPlace(String value) {
        this.occurPlace = value;
    }

    /**
     * Gets the value of the occurToDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccurToDate() {
        return occurToDate;
    }

    /**
     * Sets the value of the occurToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccurToDate(String value) {
        this.occurToDate = value;
    }

    /**
     * Gets the value of the occurToTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccurToTime() {
        return occurToTime;
    }

    /**
     * Sets the value of the occurToTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccurToTime(String value) {
        this.occurToTime = value;
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
     * Gets the value of the ownStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnStatus() {
        return ownStatus;
    }

    /**
     * Sets the value of the ownStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnStatus(String value) {
        this.ownStatus = value;
    }

    /**
     * Gets the value of the polisName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolisName() {
        return polisName;
    }

    /**
     * Sets the value of the polisName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolisName(String value) {
        this.polisName = value;
    }

    /**
     * Gets the value of the provName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvName() {
        return provName;
    }

    /**
     * Sets the value of the provName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvName(String value) {
        this.provName = value;
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

    /**
     * Gets the value of the weaponStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeaponStatus() {
        return weaponStatus;
    }

    /**
     * Sets the value of the weaponStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeaponStatus(String value) {
        this.weaponStatus = value;
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
