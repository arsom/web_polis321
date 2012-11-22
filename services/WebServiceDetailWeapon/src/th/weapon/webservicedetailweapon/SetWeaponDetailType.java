
package th.weapon.webservicedetailweapon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setWeaponDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setWeaponDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dsc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgCde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perCde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reg_Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serialNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="updtDte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="updtId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weaponChar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weaponColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weaponColorDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weaponGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weaponGroupDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weaponKind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weaponKindDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weaponMax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weaponModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weaponModelDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weaponPrice" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="weaponSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weaponSizeDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weaponStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weaponType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weaponType2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "setWeaponDetail", namespace = "http://Weapon.th/", propOrder = {
    "dsc",
    "orgCde",
    "perCde",
    "regId",
    "serialNo",
    "updtDte",
    "updtId",
    "weaponChar",
    "weaponColor",
    "weaponColorDesc",
    "weaponGroup",
    "weaponGroupDesc",
    "weaponKind",
    "weaponKindDesc",
    "weaponMax",
    "weaponModel",
    "weaponModelDesc",
    "weaponPrice",
    "weaponSize",
    "weaponSizeDesc",
    "weaponStatus",
    "weaponType",
    "weaponType2",
    "weaponTypeDesc"
})
public class SetWeaponDetailType {

    protected String dsc;
    protected String orgCde;
    protected String perCde;
    @XmlElement(name = "reg_Id")
    protected String regId;
    protected int serialNo;
    protected String updtDte;
    protected String updtId;
    protected String weaponChar;
    protected String weaponColor;
    protected String weaponColorDesc;
    protected String weaponGroup;
    protected String weaponGroupDesc;
    protected String weaponKind;
    protected String weaponKindDesc;
    protected String weaponMax;
    protected String weaponModel;
    protected String weaponModelDesc;
    protected int weaponPrice;
    protected String weaponSize;
    protected String weaponSizeDesc;
    protected String weaponStatus;
    protected String weaponType;
    protected String weaponType2;
    protected String weaponTypeDesc;

    /**
     * Gets the value of the dsc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsc() {
        return dsc;
    }

    /**
     * Sets the value of the dsc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsc(String value) {
        this.dsc = value;
    }

    /**
     * Gets the value of the orgCde property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgCde() {
        return orgCde;
    }

    /**
     * Sets the value of the orgCde property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgCde(String value) {
        this.orgCde = value;
    }

    /**
     * Gets the value of the perCde property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerCde() {
        return perCde;
    }

    /**
     * Sets the value of the perCde property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerCde(String value) {
        this.perCde = value;
    }

    /**
     * Gets the value of the regId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegId() {
        return regId;
    }

    /**
     * Sets the value of the regId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegId(String value) {
        this.regId = value;
    }

    /**
     * Gets the value of the serialNo property.
     * 
     */
    public int getSerialNo() {
        return serialNo;
    }

    /**
     * Sets the value of the serialNo property.
     * 
     */
    public void setSerialNo(int value) {
        this.serialNo = value;
    }

    /**
     * Gets the value of the updtDte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdtDte() {
        return updtDte;
    }

    /**
     * Sets the value of the updtDte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdtDte(String value) {
        this.updtDte = value;
    }

    /**
     * Gets the value of the updtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdtId() {
        return updtId;
    }

    /**
     * Sets the value of the updtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdtId(String value) {
        this.updtId = value;
    }

    /**
     * Gets the value of the weaponChar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeaponChar() {
        return weaponChar;
    }

    /**
     * Sets the value of the weaponChar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeaponChar(String value) {
        this.weaponChar = value;
    }

    /**
     * Gets the value of the weaponColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeaponColor() {
        return weaponColor;
    }

    /**
     * Sets the value of the weaponColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeaponColor(String value) {
        this.weaponColor = value;
    }

    /**
     * Gets the value of the weaponColorDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeaponColorDesc() {
        return weaponColorDesc;
    }

    /**
     * Sets the value of the weaponColorDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeaponColorDesc(String value) {
        this.weaponColorDesc = value;
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
     * Gets the value of the weaponKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeaponKind() {
        return weaponKind;
    }

    /**
     * Sets the value of the weaponKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeaponKind(String value) {
        this.weaponKind = value;
    }

    /**
     * Gets the value of the weaponKindDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeaponKindDesc() {
        return weaponKindDesc;
    }

    /**
     * Sets the value of the weaponKindDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeaponKindDesc(String value) {
        this.weaponKindDesc = value;
    }

    /**
     * Gets the value of the weaponMax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeaponMax() {
        return weaponMax;
    }

    /**
     * Sets the value of the weaponMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeaponMax(String value) {
        this.weaponMax = value;
    }

    /**
     * Gets the value of the weaponModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeaponModel() {
        return weaponModel;
    }

    /**
     * Sets the value of the weaponModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeaponModel(String value) {
        this.weaponModel = value;
    }

    /**
     * Gets the value of the weaponModelDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeaponModelDesc() {
        return weaponModelDesc;
    }

    /**
     * Sets the value of the weaponModelDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeaponModelDesc(String value) {
        this.weaponModelDesc = value;
    }

    /**
     * Gets the value of the weaponPrice property.
     * 
     */
    public int getWeaponPrice() {
        return weaponPrice;
    }

    /**
     * Sets the value of the weaponPrice property.
     * 
     */
    public void setWeaponPrice(int value) {
        this.weaponPrice = value;
    }

    /**
     * Gets the value of the weaponSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeaponSize() {
        return weaponSize;
    }

    /**
     * Sets the value of the weaponSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeaponSize(String value) {
        this.weaponSize = value;
    }

    /**
     * Gets the value of the weaponSizeDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeaponSizeDesc() {
        return weaponSizeDesc;
    }

    /**
     * Sets the value of the weaponSizeDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeaponSizeDesc(String value) {
        this.weaponSizeDesc = value;
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
     * Gets the value of the weaponType2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeaponType2() {
        return weaponType2;
    }

    /**
     * Sets the value of the weaponType2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeaponType2(String value) {
        this.weaponType2 = value;
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
