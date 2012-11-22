
package th.lawsuit.webservicedetaillawsuitservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setOtherDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setOtherDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cmajorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="complainTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="crimYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="crimeNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="occurCwCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occurFromDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occurFromTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occurPlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occurToDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occurToTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pjvNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setOtherDetail", namespace = "http://Lawsuit.th/", propOrder = {
    "caseName",
    "cmajorCode",
    "complainTime",
    "crimYear",
    "crimeNo",
    "occurCwCode",
    "occurFromDate",
    "occurFromTime",
    "occurPlace",
    "occurToDate",
    "occurToTime",
    "orgCode",
    "pjvNo",
    "provName"
})
public class SetOtherDetailType {

    protected String caseName;
    protected String cmajorCode;
    protected String complainTime;
    protected int crimYear;
    protected int crimeNo;
    protected String occurCwCode;
    protected String occurFromDate;
    protected String occurFromTime;
    protected String occurPlace;
    protected String occurToDate;
    protected String occurToTime;
    protected String orgCode;
    protected String pjvNo;
    protected String provName;

    /**
     * Gets the value of the caseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseName() {
        return caseName;
    }

    /**
     * Sets the value of the caseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseName(String value) {
        this.caseName = value;
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
     * Gets the value of the crimYear property.
     * 
     */
    public int getCrimYear() {
        return crimYear;
    }

    /**
     * Sets the value of the crimYear property.
     * 
     */
    public void setCrimYear(int value) {
        this.crimYear = value;
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
     * Gets the value of the pjvNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPjvNo() {
        return pjvNo;
    }

    /**
     * Sets the value of the pjvNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPjvNo(String value) {
        this.pjvNo = value;
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

}
