
package th.vehicles.webservicedetailvehicleservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setByKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setByKey">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="brandDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cgtCarName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colorCarDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="crimeNo1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="crimeYear1" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="keyDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgCode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleBnameCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleCarType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleCarWheel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleColourCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleCwCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleFoundFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleOtherDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleRegNo1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleRegNo2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setByKey", namespace = "http://vehicles.th/", propOrder = {
    "brandDesc",
    "cgtCarName",
    "colorCarDesc",
    "crimeNo1",
    "crimeYear1",
    "keyDate",
    "orgCode1",
    "provDesc",
    "vehicleBnameCode",
    "vehicleCarType",
    "vehicleCarWheel",
    "vehicleCode",
    "vehicleColourCode",
    "vehicleCwCode",
    "vehicleFoundFlag",
    "vehicleNo",
    "vehicleOtherDesc",
    "vehicleRegNo1",
    "vehicleRegNo2"
})
public class SetByKeyType {

    protected String brandDesc;
    protected String cgtCarName;
    protected String colorCarDesc;
    protected int crimeNo1;
    protected int crimeYear1;
    protected String keyDate;
    protected String orgCode1;
    protected String provDesc;
    protected String vehicleBnameCode;
    protected String vehicleCarType;
    protected String vehicleCarWheel;
    protected String vehicleCode;
    protected String vehicleColourCode;
    protected String vehicleCwCode;
    protected String vehicleFoundFlag;
    protected String vehicleNo;
    protected String vehicleOtherDesc;
    protected String vehicleRegNo1;
    protected String vehicleRegNo2;

    /**
     * Gets the value of the brandDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandDesc() {
        return brandDesc;
    }

    /**
     * Sets the value of the brandDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandDesc(String value) {
        this.brandDesc = value;
    }

    /**
     * Gets the value of the cgtCarName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCgtCarName() {
        return cgtCarName;
    }

    /**
     * Sets the value of the cgtCarName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCgtCarName(String value) {
        this.cgtCarName = value;
    }

    /**
     * Gets the value of the colorCarDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorCarDesc() {
        return colorCarDesc;
    }

    /**
     * Sets the value of the colorCarDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorCarDesc(String value) {
        this.colorCarDesc = value;
    }

    /**
     * Gets the value of the crimeNo1 property.
     * 
     */
    public int getCrimeNo1() {
        return crimeNo1;
    }

    /**
     * Sets the value of the crimeNo1 property.
     * 
     */
    public void setCrimeNo1(int value) {
        this.crimeNo1 = value;
    }

    /**
     * Gets the value of the crimeYear1 property.
     * 
     */
    public int getCrimeYear1() {
        return crimeYear1;
    }

    /**
     * Sets the value of the crimeYear1 property.
     * 
     */
    public void setCrimeYear1(int value) {
        this.crimeYear1 = value;
    }

    /**
     * Gets the value of the keyDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyDate() {
        return keyDate;
    }

    /**
     * Sets the value of the keyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyDate(String value) {
        this.keyDate = value;
    }

    /**
     * Gets the value of the orgCode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgCode1() {
        return orgCode1;
    }

    /**
     * Sets the value of the orgCode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgCode1(String value) {
        this.orgCode1 = value;
    }

    /**
     * Gets the value of the provDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvDesc() {
        return provDesc;
    }

    /**
     * Sets the value of the provDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvDesc(String value) {
        this.provDesc = value;
    }

    /**
     * Gets the value of the vehicleBnameCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleBnameCode() {
        return vehicleBnameCode;
    }

    /**
     * Sets the value of the vehicleBnameCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleBnameCode(String value) {
        this.vehicleBnameCode = value;
    }

    /**
     * Gets the value of the vehicleCarType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleCarType() {
        return vehicleCarType;
    }

    /**
     * Sets the value of the vehicleCarType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleCarType(String value) {
        this.vehicleCarType = value;
    }

    /**
     * Gets the value of the vehicleCarWheel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleCarWheel() {
        return vehicleCarWheel;
    }

    /**
     * Sets the value of the vehicleCarWheel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleCarWheel(String value) {
        this.vehicleCarWheel = value;
    }

    /**
     * Gets the value of the vehicleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleCode() {
        return vehicleCode;
    }

    /**
     * Sets the value of the vehicleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleCode(String value) {
        this.vehicleCode = value;
    }

    /**
     * Gets the value of the vehicleColourCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleColourCode() {
        return vehicleColourCode;
    }

    /**
     * Sets the value of the vehicleColourCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleColourCode(String value) {
        this.vehicleColourCode = value;
    }

    /**
     * Gets the value of the vehicleCwCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleCwCode() {
        return vehicleCwCode;
    }

    /**
     * Sets the value of the vehicleCwCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleCwCode(String value) {
        this.vehicleCwCode = value;
    }

    /**
     * Gets the value of the vehicleFoundFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleFoundFlag() {
        return vehicleFoundFlag;
    }

    /**
     * Sets the value of the vehicleFoundFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleFoundFlag(String value) {
        this.vehicleFoundFlag = value;
    }

    /**
     * Gets the value of the vehicleNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleNo() {
        return vehicleNo;
    }

    /**
     * Sets the value of the vehicleNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleNo(String value) {
        this.vehicleNo = value;
    }

    /**
     * Gets the value of the vehicleOtherDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleOtherDesc() {
        return vehicleOtherDesc;
    }

    /**
     * Sets the value of the vehicleOtherDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleOtherDesc(String value) {
        this.vehicleOtherDesc = value;
    }

    /**
     * Gets the value of the vehicleRegNo1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleRegNo1() {
        return vehicleRegNo1;
    }

    /**
     * Sets the value of the vehicleRegNo1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleRegNo1(String value) {
        this.vehicleRegNo1 = value;
    }

    /**
     * Gets the value of the vehicleRegNo2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleRegNo2() {
        return vehicleRegNo2;
    }

    /**
     * Sets the value of the vehicleRegNo2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleRegNo2(String value) {
        this.vehicleRegNo2 = value;
    }

}
