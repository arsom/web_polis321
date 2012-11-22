
package th.vehicles.webservicelistvehicleservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setByList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setByList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="brandDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="grpDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgCde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perCde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="plate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serialNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setByList", namespace = "http://vehicles.th/", propOrder = {
    "brandDesc",
    "grpDesc",
    "name",
    "orgCde",
    "orgName",
    "perCde",
    "perId",
    "plate",
    "provDesc",
    "serialNo",
    "sex"
})
public class SetByListType {

    protected String brandDesc;
    protected String grpDesc;
    protected String name;
    protected String orgCde;
    protected String orgName;
    protected String perCde;
    protected String perId;
    protected String plate;
    protected String provDesc;
    protected String serialNo;
    protected String sex;

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
     * Gets the value of the grpDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrpDesc() {
        return grpDesc;
    }

    /**
     * Sets the value of the grpDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrpDesc(String value) {
        this.grpDesc = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Gets the value of the perId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerId() {
        return perId;
    }

    /**
     * Sets the value of the perId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerId(String value) {
        this.perId = value;
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
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSex(String value) {
        this.sex = value;
    }

}
