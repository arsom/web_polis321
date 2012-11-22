
package th.vehicles.webservicedetailvehicleservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setKeyCRIME complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setKeyCRIME">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caseNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caseYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dsc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="org" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgCde1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perCde1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serialNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setKeyCRIME", namespace = "http://vehicles.th/", propOrder = {
    "caseNo",
    "caseYear",
    "dsc",
    "org",
    "orgCde1",
    "perCde1",
    "serialNo"
})
public class SetKeyCRIMEType {

    protected String caseNo;
    protected String caseYear;
    protected String dsc;
    protected String org;
    protected String orgCde1;
    protected String perCde1;
    protected String serialNo;

    /**
     * Gets the value of the caseNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseNo() {
        return caseNo;
    }

    /**
     * Sets the value of the caseNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseNo(String value) {
        this.caseNo = value;
    }

    /**
     * Gets the value of the caseYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseYear() {
        return caseYear;
    }

    /**
     * Sets the value of the caseYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseYear(String value) {
        this.caseYear = value;
    }

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

}
