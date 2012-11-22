
package th.location.webservicelistlocationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setPerson complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setPerson">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acrossCde3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acrossName3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addrDesc31" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addrDesc32" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthDte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstTnme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastTnme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locCode3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locName3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="natCde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="natName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="org" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgCde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perCde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roadCde3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roadName3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="soiCde3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="soiName3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setPerson", namespace = "http://Location.th/", propOrder = {
    "acrossCde3",
    "acrossName3",
    "addrDesc31",
    "addrDesc32",
    "birthDte",
    "firstTnme",
    "lastTnme",
    "locCode3",
    "locName3",
    "natCde",
    "natName",
    "org",
    "orgCde",
    "perCde",
    "perId",
    "roadCde3",
    "roadName3",
    "sex",
    "soiCde3",
    "soiName3"
})
public class SetPersonType {

    protected String acrossCde3;
    protected String acrossName3;
    protected String addrDesc31;
    protected String addrDesc32;
    protected String birthDte;
    protected String firstTnme;
    protected String lastTnme;
    protected String locCode3;
    protected String locName3;
    protected String natCde;
    protected String natName;
    protected String org;
    protected String orgCde;
    protected String perCde;
    protected String perId;
    protected String roadCde3;
    protected String roadName3;
    protected String sex;
    protected String soiCde3;
    protected String soiName3;

    /**
     * Gets the value of the acrossCde3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcrossCde3() {
        return acrossCde3;
    }

    /**
     * Sets the value of the acrossCde3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcrossCde3(String value) {
        this.acrossCde3 = value;
    }

    /**
     * Gets the value of the acrossName3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcrossName3() {
        return acrossName3;
    }

    /**
     * Sets the value of the acrossName3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcrossName3(String value) {
        this.acrossName3 = value;
    }

    /**
     * Gets the value of the addrDesc31 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrDesc31() {
        return addrDesc31;
    }

    /**
     * Sets the value of the addrDesc31 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrDesc31(String value) {
        this.addrDesc31 = value;
    }

    /**
     * Gets the value of the addrDesc32 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrDesc32() {
        return addrDesc32;
    }

    /**
     * Sets the value of the addrDesc32 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrDesc32(String value) {
        this.addrDesc32 = value;
    }

    /**
     * Gets the value of the birthDte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthDte() {
        return birthDte;
    }

    /**
     * Sets the value of the birthDte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDte(String value) {
        this.birthDte = value;
    }

    /**
     * Gets the value of the firstTnme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstTnme() {
        return firstTnme;
    }

    /**
     * Sets the value of the firstTnme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstTnme(String value) {
        this.firstTnme = value;
    }

    /**
     * Gets the value of the lastTnme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastTnme() {
        return lastTnme;
    }

    /**
     * Sets the value of the lastTnme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastTnme(String value) {
        this.lastTnme = value;
    }

    /**
     * Gets the value of the locCode3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocCode3() {
        return locCode3;
    }

    /**
     * Sets the value of the locCode3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocCode3(String value) {
        this.locCode3 = value;
    }

    /**
     * Gets the value of the locName3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocName3() {
        return locName3;
    }

    /**
     * Sets the value of the locName3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocName3(String value) {
        this.locName3 = value;
    }

    /**
     * Gets the value of the natCde property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNatCde() {
        return natCde;
    }

    /**
     * Sets the value of the natCde property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNatCde(String value) {
        this.natCde = value;
    }

    /**
     * Gets the value of the natName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNatName() {
        return natName;
    }

    /**
     * Sets the value of the natName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNatName(String value) {
        this.natName = value;
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
     * Gets the value of the roadCde3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadCde3() {
        return roadCde3;
    }

    /**
     * Sets the value of the roadCde3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadCde3(String value) {
        this.roadCde3 = value;
    }

    /**
     * Gets the value of the roadName3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadName3() {
        return roadName3;
    }

    /**
     * Sets the value of the roadName3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadName3(String value) {
        this.roadName3 = value;
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

    /**
     * Gets the value of the soiCde3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoiCde3() {
        return soiCde3;
    }

    /**
     * Sets the value of the soiCde3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoiCde3(String value) {
        this.soiCde3 = value;
    }

    /**
     * Gets the value of the soiName3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoiName3() {
        return soiName3;
    }

    /**
     * Sets the value of the soiName3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoiName3(String value) {
        this.soiName3 = value;
    }

}
