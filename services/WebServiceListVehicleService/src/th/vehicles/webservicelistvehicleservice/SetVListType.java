
package th.vehicles.webservicelistvehicleservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setVList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setVList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="brandDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="crimeNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="crimeYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occFname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occLname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="org" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeCarDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleBnameCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleCwCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "setVList", namespace = "http://vehicles.th/", propOrder = {
    "brandDesc",
    "crimeNo",
    "crimeYear",
    "occFname",
    "occLname",
    "occTitle",
    "org",
    "orgCode",
    "provDesc",
    "typeCarDesc",
    "vehicleBnameCode",
    "vehicleCwCode",
    "vehicleDesc",
    "vehicleNo",
    "vehicleRegNo1",
    "vehicleRegNo2"
})
public class SetVListType {

    protected String brandDesc;
    protected String crimeNo;
    protected String crimeYear;
    protected String occFname;
    protected String occLname;
    protected String occTitle;
    protected String org;
    protected String orgCode;
    protected String provDesc;
    protected String typeCarDesc;
    protected String vehicleBnameCode;
    protected String vehicleCwCode;
    protected String vehicleDesc;
    protected String vehicleNo;
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
     * Gets the value of the occFname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccFname() {
        return occFname;
    }

    /**
     * Sets the value of the occFname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccFname(String value) {
        this.occFname = value;
    }

    /**
     * Gets the value of the occLname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccLname() {
        return occLname;
    }

    /**
     * Sets the value of the occLname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccLname(String value) {
        this.occLname = value;
    }

    /**
     * Gets the value of the occTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccTitle() {
        return occTitle;
    }

    /**
     * Sets the value of the occTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccTitle(String value) {
        this.occTitle = value;
    }

    /**
     * Gets the value of the org property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrg() {
        return org;
    }

    /**
     * Sets the value of the org property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrg(String value) {
        this.org = value;
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
     * Gets the value of the typeCarDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCarDesc() {
        return typeCarDesc;
    }

    /**
     * Sets the value of the typeCarDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeCarDesc(String value) {
        this.typeCarDesc = value;
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
     * Gets the value of the vehicleDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleDesc() {
        return vehicleDesc;
    }

    /**
     * Sets the value of the vehicleDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleDesc(String value) {
        this.vehicleDesc = value;
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
