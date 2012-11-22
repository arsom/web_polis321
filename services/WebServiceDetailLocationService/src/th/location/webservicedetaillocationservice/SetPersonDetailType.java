
package th.location.webservicedetaillocationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setPersonDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setPersonDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acrossName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actionStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addrDesc31" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addrDesc32" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthDte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstEnme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstTnme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hisDte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastEnme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastTnme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="middleEnme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="natCde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="natName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="org" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgCde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perCde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="raceCde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="raceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="religionCde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="religionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roadName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="soiName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setPersonDetail", namespace = "http://Location.th/", propOrder = {
    "acrossName",
    "actionStatus",
    "addrDesc31",
    "addrDesc32",
    "birthDte",
    "firstEnme",
    "firstTnme",
    "hisDte",
    "lastEnme",
    "lastTnme",
    "locName",
    "middleEnme",
    "natCde",
    "natName",
    "org",
    "orgCde",
    "perCde",
    "perId",
    "raceCde",
    "raceName",
    "religionCde",
    "religionName",
    "roadName",
    "sex",
    "soiName"
})
public class SetPersonDetailType {

    protected String acrossName;
    protected String actionStatus;
    protected String addrDesc31;
    protected String addrDesc32;
    protected String birthDte;
    protected String firstEnme;
    protected String firstTnme;
    protected String hisDte;
    protected String lastEnme;
    protected String lastTnme;
    protected String locName;
    protected String middleEnme;
    protected String natCde;
    protected String natName;
    protected String org;
    protected String orgCde;
    protected String perCde;
    protected String perId;
    protected String raceCde;
    protected String raceName;
    protected String religionCde;
    protected String religionName;
    protected String roadName;
    protected String sex;
    protected String soiName;

    /**
     * Gets the value of the acrossName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcrossName() {
        return acrossName;
    }

    /**
     * Sets the value of the acrossName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcrossName(String value) {
        this.acrossName = value;
    }

    /**
     * Gets the value of the actionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionStatus() {
        return actionStatus;
    }

    /**
     * Sets the value of the actionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionStatus(String value) {
        this.actionStatus = value;
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
     * Gets the value of the firstEnme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstEnme() {
        return firstEnme;
    }

    /**
     * Sets the value of the firstEnme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstEnme(String value) {
        this.firstEnme = value;
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
     * Gets the value of the hisDte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHisDte() {
        return hisDte;
    }

    /**
     * Sets the value of the hisDte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHisDte(String value) {
        this.hisDte = value;
    }

    /**
     * Gets the value of the lastEnme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastEnme() {
        return lastEnme;
    }

    /**
     * Sets the value of the lastEnme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastEnme(String value) {
        this.lastEnme = value;
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
     * Gets the value of the locName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocName() {
        return locName;
    }

    /**
     * Sets the value of the locName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocName(String value) {
        this.locName = value;
    }

    /**
     * Gets the value of the middleEnme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleEnme() {
        return middleEnme;
    }

    /**
     * Sets the value of the middleEnme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleEnme(String value) {
        this.middleEnme = value;
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
     * Gets the value of the raceCde property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRaceCde() {
        return raceCde;
    }

    /**
     * Sets the value of the raceCde property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRaceCde(String value) {
        this.raceCde = value;
    }

    /**
     * Gets the value of the raceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRaceName() {
        return raceName;
    }

    /**
     * Sets the value of the raceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRaceName(String value) {
        this.raceName = value;
    }

    /**
     * Gets the value of the religionCde property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReligionCde() {
        return religionCde;
    }

    /**
     * Sets the value of the religionCde property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReligionCde(String value) {
        this.religionCde = value;
    }

    /**
     * Gets the value of the religionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReligionName() {
        return religionName;
    }

    /**
     * Sets the value of the religionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReligionName(String value) {
        this.religionName = value;
    }

    /**
     * Gets the value of the roadName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadName() {
        return roadName;
    }

    /**
     * Sets the value of the roadName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadName(String value) {
        this.roadName = value;
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
     * Gets the value of the soiName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoiName() {
        return soiName;
    }

    /**
     * Sets the value of the soiName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoiName(String value) {
        this.soiName = value;
    }

}
