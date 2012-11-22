
package th.lawsuit.webservicelistlawsuitservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setWanHisListCrime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setWanHisListCrime">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="catchDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="crimeNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="crimeYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occurFromDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="offenderNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="releaseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stopCathchDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setWanHisListCrime", namespace = "http://Lawsuit.th/", propOrder = {
    "catchDate",
    "crimeNo",
    "crimeYear",
    "name",
    "occurFromDate",
    "offenderNo",
    "orgCode",
    "orgName",
    "releaseDate",
    "stopCathchDate"
})
public class SetWanHisListCrimeType {

    protected String catchDate;
    protected int crimeNo;
    protected int crimeYear;
    protected String name;
    protected String occurFromDate;
    protected String offenderNo;
    protected String orgCode;
    protected String orgName;
    protected String releaseDate;
    protected String stopCathchDate;

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
     * Gets the value of the offenderNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffenderNo() {
        return offenderNo;
    }

    /**
     * Sets the value of the offenderNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffenderNo(String value) {
        this.offenderNo = value;
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
     * Gets the value of the stopCathchDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopCathchDate() {
        return stopCathchDate;
    }

    /**
     * Sets the value of the stopCathchDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopCathchDate(String value) {
        this.stopCathchDate = value;
    }

}
