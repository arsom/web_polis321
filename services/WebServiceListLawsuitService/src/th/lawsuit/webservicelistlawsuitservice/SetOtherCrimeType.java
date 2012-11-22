
package th.lawsuit.webservicelistlawsuitservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setOtherCrime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setOtherCrime">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="complainDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="complainTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="crimeNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="crimeYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="org" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="polisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="polisName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setOtherCrime", namespace = "http://Lawsuit.th/", propOrder = {
    "complainDate",
    "complainTime",
    "crimeNo",
    "crimeYear",
    "org",
    "orgCode",
    "polisCode",
    "polisName"
})
public class SetOtherCrimeType {

    protected String complainDate;
    protected String complainTime;
    protected int crimeNo;
    protected int crimeYear;
    protected String org;
    protected String orgCode;
    protected String polisCode;
    protected String polisName;

    /**
     * Gets the value of the complainDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplainDate() {
        return complainDate;
    }

    /**
     * Sets the value of the complainDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplainDate(String value) {
        this.complainDate = value;
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
     * Gets the value of the crimeYear property.
     * 
     */
    public int getCrimeYear() {
        return crimeYear;
    }

    /**
     * Sets the value of the crimeYear property.
     * 
     */
    public void setCrimeYear(int value) {
        this.crimeYear = value;
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
     * Gets the value of the polisCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolisCode() {
        return polisCode;
    }

    /**
     * Sets the value of the polisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolisCode(String value) {
        this.polisCode = value;
    }

    /**
     * Gets the value of the polisName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolisName() {
        return polisName;
    }

    /**
     * Sets the value of the polisName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolisName(String value) {
        this.polisName = value;
    }

}
