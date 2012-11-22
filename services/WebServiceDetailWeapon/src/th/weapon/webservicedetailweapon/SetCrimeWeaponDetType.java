
package th.weapon.webservicedetailweapon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setCrimeWeaponDet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setCrimeWeaponDet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="characterSpecial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commonDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commonDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commonDocDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commonFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commonMistaked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commonPjv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commonReturn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commonTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commonUsed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="commonWrong" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="crimeNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="crimeYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="damageFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="licence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="returnDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnPlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sizeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sizeWeapon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="updDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="updId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weaponGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weaponGroupDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weaponSEQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weaponStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weaponType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weaponTypeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setCrimeWeaponDet", namespace = "http://Weapon.th/", propOrder = {
    "amount",
    "brand",
    "characterSpecial",
    "commonDate",
    "commonDoc",
    "commonDocDate",
    "commonFlag",
    "commonMistaked",
    "commonPjv",
    "commonReturn",
    "commonTime",
    "commonUsed",
    "commonWrong",
    "crimeNo",
    "crimeYear",
    "damageFlag",
    "licence",
    "orgCode",
    "ownCode",
    "ownStatus",
    "price",
    "returnDate",
    "returnMethod",
    "returnPlace",
    "sizeCode",
    "sizeWeapon",
    "type",
    "updDate",
    "updId",
    "weaponGroup",
    "weaponGroupDesc",
    "weaponSEQ",
    "weaponStatus",
    "weaponType",
    "weaponTypeDesc"
})
public class SetCrimeWeaponDetType {

    protected int amount;
    protected String brand;
    protected String characterSpecial;
    protected String commonDate;
    protected String commonDoc;
    protected String commonDocDate;
    protected String commonFlag;
    protected String commonMistaked;
    protected String commonPjv;
    protected String commonReturn;
    protected String commonTime;
    protected String commonUsed;
    protected String commonWrong;
    protected int crimeNo;
    protected int crimeYear;
    protected String damageFlag;
    protected String licence;
    protected String orgCode;
    protected String ownCode;
    protected String ownStatus;
    protected int price;
    protected String returnDate;
    protected String returnMethod;
    protected String returnPlace;
    protected String sizeCode;
    protected String sizeWeapon;
    protected String type;
    protected String updDate;
    protected String updId;
    protected String weaponGroup;
    protected String weaponGroupDesc;
    protected String weaponSEQ;
    protected String weaponStatus;
    protected String weaponType;
    protected String weaponTypeDesc;

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
     * Gets the value of the characterSpecial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacterSpecial() {
        return characterSpecial;
    }

    /**
     * Sets the value of the characterSpecial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacterSpecial(String value) {
        this.characterSpecial = value;
    }

    /**
     * Gets the value of the commonDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommonDate() {
        return commonDate;
    }

    /**
     * Sets the value of the commonDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommonDate(String value) {
        this.commonDate = value;
    }

    /**
     * Gets the value of the commonDoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommonDoc() {
        return commonDoc;
    }

    /**
     * Sets the value of the commonDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommonDoc(String value) {
        this.commonDoc = value;
    }

    /**
     * Gets the value of the commonDocDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommonDocDate() {
        return commonDocDate;
    }

    /**
     * Sets the value of the commonDocDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommonDocDate(String value) {
        this.commonDocDate = value;
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
     * Gets the value of the commonPjv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommonPjv() {
        return commonPjv;
    }

    /**
     * Sets the value of the commonPjv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommonPjv(String value) {
        this.commonPjv = value;
    }

    /**
     * Gets the value of the commonReturn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommonReturn() {
        return commonReturn;
    }

    /**
     * Sets the value of the commonReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommonReturn(String value) {
        this.commonReturn = value;
    }

    /**
     * Gets the value of the commonTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommonTime() {
        return commonTime;
    }

    /**
     * Sets the value of the commonTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommonTime(String value) {
        this.commonTime = value;
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
     * Gets the value of the price property.
     * 
     */
    public int getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(int value) {
        this.price = value;
    }

    /**
     * Gets the value of the returnDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnDate() {
        return returnDate;
    }

    /**
     * Sets the value of the returnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnDate(String value) {
        this.returnDate = value;
    }

    /**
     * Gets the value of the returnMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnMethod() {
        return returnMethod;
    }

    /**
     * Sets the value of the returnMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnMethod(String value) {
        this.returnMethod = value;
    }

    /**
     * Gets the value of the returnPlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnPlace() {
        return returnPlace;
    }

    /**
     * Sets the value of the returnPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnPlace(String value) {
        this.returnPlace = value;
    }

    /**
     * Gets the value of the sizeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSizeCode() {
        return sizeCode;
    }

    /**
     * Sets the value of the sizeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSizeCode(String value) {
        this.sizeCode = value;
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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the updDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdDate() {
        return updDate;
    }

    /**
     * Sets the value of the updDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdDate(String value) {
        this.updDate = value;
    }

    /**
     * Gets the value of the updId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdId() {
        return updId;
    }

    /**
     * Sets the value of the updId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdId(String value) {
        this.updId = value;
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
     * Gets the value of the weaponGroupDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeaponGroupDesc() {
        return weaponGroupDesc;
    }

    /**
     * Sets the value of the weaponGroupDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeaponGroupDesc(String value) {
        this.weaponGroupDesc = value;
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

    /**
     * Gets the value of the weaponTypeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeaponTypeDesc() {
        return weaponTypeDesc;
    }

    /**
     * Sets the value of the weaponTypeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeaponTypeDesc(String value) {
        this.weaponTypeDesc = value;
    }

}
