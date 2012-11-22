
package th.location.webservicedetaillocationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setPersonVInfomation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setPersonVInfomation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="branDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colorCarDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgCde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perCde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serialNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "setPersonVInfomation", namespace = "http://Location.th/", propOrder = {
    "branDesc",
    "colorCarDesc",
    "orgCde",
    "perCde",
    "provName",
    "serialNo",
    "vehModel",
    "vehPlate",
    "vehTypeName"
})
public class SetPersonVInfomationType {

    protected String branDesc;
    protected String colorCarDesc;
    protected String orgCde;
    protected String perCde;
    protected String provName;
    protected int serialNo;
    protected String vehModel;
    protected String vehPlate;
    protected String vehTypeName;

    /**
     * Gets the value of the branDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranDesc() {
        return branDesc;
    }

    /**
     * Sets the value of the branDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranDesc(String value) {
        this.branDesc = value;
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
