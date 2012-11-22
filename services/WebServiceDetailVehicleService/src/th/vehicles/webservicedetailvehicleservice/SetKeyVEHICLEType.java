
package th.vehicles.webservicedetailvehicleservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setKeyVEHICLE complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setKeyVEHICLE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="brandDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colorCarDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgCde1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perCde1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serialNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehPlate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setKeyVEHICLE", namespace = "http://vehicles.th/", propOrder = {
    "brandDesc",
    "colorCarDesc",
    "orgCde1",
    "perCde1",
    "provName",
    "serialNo",
    "vehModel",
    "vehPlate",
    "vehTypeName"
})
public class SetKeyVEHICLEType {

    protected String brandDesc;
    protected String colorCarDesc;
    protected String orgCde1;
    protected String perCde1;
    protected String provName;
    protected String serialNo;
    protected String vehModel;
    protected String vehPlate;
    protected String vehTypeName;

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
     * Gets the value of the orgCde1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgCde1() {
        return orgCde1;
    }

    /**
     * Sets the value of the orgCde1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgCde1(String value) {
        this.orgCde1 = value;
    }

    /**
     * Gets the value of the perCde1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerCde1() {
        return perCde1;
    }

    /**
     * Sets the value of the perCde1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerCde1(String value) {
        this.perCde1 = value;
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
     * Gets the value of the serialNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNo() {
        return serialNo;
    }

    /**
     * Sets the value of the serialNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNo(String value) {
        this.serialNo = value;
    }

    /**
     * Gets the value of the vehModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehModel() {
        return vehModel;
    }

    /**
     * Sets the value of the vehModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehModel(String value) {
        this.vehModel = value;
    }

    /**
     * Gets the value of the vehPlate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehPlate() {
        return vehPlate;
    }

    /**
     * Sets the value of the vehPlate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehPlate(String value) {
        this.vehPlate = value;
    }

    /**
     * Gets the value of the vehTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehTypeName() {
        return vehTypeName;
    }

    /**
     * Sets the value of the vehTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehTypeName(String value) {
        this.vehTypeName = value;
    }

}
