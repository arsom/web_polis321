
package th.lawsuit.webservicelistlawsuitservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setCrimeLaw complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setCrimeLaw">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="complainDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="crimeNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="crimeYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="orgCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="polisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="polisName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serioursNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serioursYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setCrimeLaw", namespace = "http://Lawsuit.th/", propOrder = {
    "complainDate",
    "crimeNo",
    "crimeYear",
    "orgCode",
    "orgName",
    "polisCode",
    "polisName",
    "serioursNo",
    "serioursYear"
})
public class SetCrimeLawType {

    protected String complainDate;
    protected int crimeNo;
    protected int crimeYear;
    protected String orgCode;
    protected String orgName;
    protected String polisCode;
    protected String polisName;
    protected String serioursNo;
    protected String serioursYear;

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

    /**
     * Gets the value of the serioursNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerioursNo() {
        return serioursNo;
    }

    /**
     * Sets the value of the serioursNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerioursNo(String value) {
        this.serioursNo = value;
    }

    /**
     * Gets the value of the serioursYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerioursYear() {
        return serioursYear;
    }

    /**
     * Sets the value of the serioursYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerioursYear(String value) {
        this.serioursYear = value;
    }

}
