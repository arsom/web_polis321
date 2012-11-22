
package th.lawsuit.webservicelistlawsuitservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setWanHisListTraffic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setWanHisListTraffic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carPerFname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carPerLname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carPerMname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carSEQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="catchDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cgtAccideAtDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cgtAccideCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cgtAccideYY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="releaseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setWanHisListTraffic", namespace = "http://Lawsuit.th/", propOrder = {
    "carPerFname",
    "carPerLname",
    "carPerMname",
    "carSEQ",
    "catchDate",
    "cgtAccideAtDate",
    "cgtAccideCode",
    "cgtAccideYY",
    "orgCode",
    "orgName",
    "releaseDate",
    "title"
})
public class SetWanHisListTrafficType {

    protected String carPerFname;
    protected String carPerLname;
    protected String carPerMname;
    protected String carSEQ;
    protected String catchDate;
    protected String cgtAccideAtDate;
    protected String cgtAccideCode;
    protected String cgtAccideYY;
    protected String orgCode;
    protected String orgName;
    protected String releaseDate;
    protected String title;

    /**
     * Gets the value of the carPerFname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarPerFname() {
        return carPerFname;
    }

    /**
     * Sets the value of the carPerFname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarPerFname(String value) {
        this.carPerFname = value;
    }

    /**
     * Gets the value of the carPerLname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarPerLname() {
        return carPerLname;
    }

    /**
     * Sets the value of the carPerLname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarPerLname(String value) {
        this.carPerLname = value;
    }

    /**
     * Gets the value of the carPerMname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarPerMname() {
        return carPerMname;
    }

    /**
     * Sets the value of the carPerMname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarPerMname(String value) {
        this.carPerMname = value;
    }

    /**
     * Gets the value of the carSEQ property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarSEQ() {
        return carSEQ;
    }

    /**
     * Sets the value of the carSEQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarSEQ(String value) {
        this.carSEQ = value;
    }

    /**
     * Gets the value of the catchDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatchDate() {
        return catchDate;
    }

    /**
     * Sets the value of the catchDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatchDate(String value) {
        this.catchDate = value;
    }

    /**
     * Gets the value of the cgtAccideAtDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCgtAccideAtDate() {
        return cgtAccideAtDate;
    }

    /**
     * Sets the value of the cgtAccideAtDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCgtAccideAtDate(String value) {
        this.cgtAccideAtDate = value;
    }

    /**
     * Gets the value of the cgtAccideCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCgtAccideCode() {
        return cgtAccideCode;
    }

    /**
     * Sets the value of the cgtAccideCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCgtAccideCode(String value) {
        this.cgtAccideCode = value;
    }

    /**
     * Gets the value of the cgtAccideYY property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCgtAccideYY() {
        return cgtAccideYY;
    }

    /**
     * Sets the value of the cgtAccideYY property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCgtAccideYY(String value) {
        this.cgtAccideYY = value;
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
     * Gets the value of the releaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseDate() {
        return releaseDate;
    }

    /**
     * Sets the value of the releaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseDate(String value) {
        this.releaseDate = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

}
