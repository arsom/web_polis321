
package th.vehicles.webservicelistvehicleservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setConfiscateList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setConfiscateList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="brandName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cancelFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="plate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seizeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seizeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="updDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setConfiscateList", namespace = "http://vehicles.th/", propOrder = {
    "brandName",
    "cancelFlag",
    "carModel",
    "colorName",
    "orgCode",
    "orgName",
    "plate",
    "provName",
    "seizeCode",
    "seizeType",
    "updDate"
})
public class SetConfiscateListType {

    protected String brandName;
    protected String cancelFlag;
    protected String carModel;
    protected String colorName;
    protected String orgCode;
    protected String orgName;
    protected String plate;
    protected String provName;
    protected String seizeCode;
    protected String seizeType;
    protected String updDate;

    /**
     * Gets the value of the brandName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * Sets the value of the brandName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandName(String value) {
        this.brandName = value;
    }

    /**
     * Gets the value of the cancelFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelFlag() {
        return cancelFlag;
    }

    /**
     * Sets the value of the cancelFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelFlag(String value) {
        this.cancelFlag = value;
    }

    /**
     * Gets the value of the carModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarModel() {
        return carModel;
    }

    /**
     * Sets the value of the carModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarModel(String value) {
        this.carModel = value;
    }

    /**
     * Gets the value of the colorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorName() {
        return colorName;
    }

    /**
     * Sets the value of the colorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorName(String value) {
        this.colorName = value;
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
     * Gets the value of the plate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlate() {
        return plate;
    }

    /**
     * Sets the value of the plate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlate(String value) {
        this.plate = value;
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
     * Gets the value of the seizeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeizeCode() {
        return seizeCode;
    }

    /**
     * Sets the value of the seizeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeizeCode(String value) {
        this.seizeCode = value;
    }

    /**
     * Gets the value of the seizeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeizeType() {
        return seizeType;
    }

    /**
     * Sets the value of the seizeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeizeType(String value) {
        this.seizeType = value;
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

}
