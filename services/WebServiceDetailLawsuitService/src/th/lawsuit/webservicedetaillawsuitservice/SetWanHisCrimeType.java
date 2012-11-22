
package th.lawsuit.webservicedetaillawsuitservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setWanHisCrime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setWanHisCrime">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cmajorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="crimeNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="crimeYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occurCwCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occurFromDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occurFromTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occurPlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occurToDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occurToTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passportNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="polisName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="polisPos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="raceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="raceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="releaseCause" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="releaseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="releaseOthers" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stopCatchDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uncName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="warrantDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="warrantDueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="warrantLimitYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="warrantNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="warrantOrgCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="warrantPolisName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="warrantYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="worgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setWanHisCrime", namespace = "http://Lawsuit.th/", propOrder = {
    "address",
    "attFlag",
    "birthDate",
    "chaName",
    "cmajorCode",
    "crimeNo",
    "crimeYear",
    "idNo",
    "name",
    "nationCode",
    "nationName",
    "occurCwCode",
    "occurFromDate",
    "occurFromTime",
    "occurPlace",
    "occurToDate",
    "occurToTime",
    "orgCode",
    "orgName",
    "passportNo",
    "polisName",
    "polisPos",
    "provName",
    "raceCode",
    "raceName",
    "releaseCause",
    "releaseDate",
    "releaseOthers",
    "sex",
    "stopCatchDate",
    "uncName",
    "warrantDate",
    "warrantDueDate",
    "warrantLimitYear",
    "warrantNo",
    "warrantOrgCode",
    "warrantPolisName",
    "warrantYear",
    "worgName"
})
public class SetWanHisCrimeType {

    protected String address;
    protected String attFlag;
    protected String birthDate;
    protected String chaName;
    protected String cmajorCode;
    protected int crimeNo;
    protected int crimeYear;
    protected String idNo;
    protected String name;
    protected String nationCode;
    protected String nationName;
    protected String occurCwCode;
    protected String occurFromDate;
    protected String occurFromTime;
    protected String occurPlace;
    protected String occurToDate;
    protected String occurToTime;
    protected String orgCode;
    protected String orgName;
    protected String passportNo;
    protected String polisName;
    protected String polisPos;
    protected String provName;
    protected String raceCode;
    protected String raceName;
    protected String releaseCause;
    protected String releaseDate;
    protected String releaseOthers;
    protected String sex;
    protected String stopCatchDate;
    protected String uncName;
    protected String warrantDate;
    protected String warrantDueDate;
    protected String warrantLimitYear;
    protected String warrantNo;
    protected String warrantOrgCode;
    protected String warrantPolisName;
    protected String warrantYear;
    protected String worgName;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the attFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttFlag() {
        return attFlag;
    }

    /**
     * Sets the value of the attFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttFlag(String value) {
        this.attFlag = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDate(String value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the chaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChaName() {
        return chaName;
    }

    /**
     * Sets the value of the chaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChaName(String value) {
        this.chaName = value;
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
     * Gets the value of the idNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdNo() {
        return idNo;
    }

    /**
     * Sets the value of the idNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdNo(String value) {
        this.idNo = value;
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
     * Gets the value of the nationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationCode() {
        return nationCode;
    }

    /**
     * Sets the value of the nationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationCode(String value) {
        this.nationCode = value;
    }

    /**
     * Gets the value of the nationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationName() {
        return nationName;
    }

    /**
     * Sets the value of the nationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationName(String value) {
        this.nationName = value;
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
     * Gets the value of the passportNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportNo() {
        return passportNo;
    }

    /**
     * Sets the value of the passportNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportNo(String value) {
        this.passportNo = value;
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
     * Gets the value of the polisPos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolisPos() {
        return polisPos;
    }

    /**
     * Sets the value of the polisPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolisPos(String value) {
        this.polisPos = value;
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
     * Gets the value of the raceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRaceCode() {
        return raceCode;
    }

    /**
     * Sets the value of the raceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRaceCode(String value) {
        this.raceCode = value;
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
     * Gets the value of the releaseCause property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseCause() {
        return releaseCause;
    }

    /**
     * Sets the value of the releaseCause property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseCause(String value) {
        this.releaseCause = value;
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
     * Gets the value of the releaseOthers property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseOthers() {
        return releaseOthers;
    }

    /**
     * Sets the value of the releaseOthers property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReleaseOthers(String value) {
        this.releaseOthers = value;
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
     * Gets the value of the stopCatchDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopCatchDate() {
        return stopCatchDate;
    }

    /**
     * Sets the value of the stopCatchDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopCatchDate(String value) {
        this.stopCatchDate = value;
    }

    /**
     * Gets the value of the uncName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUncName() {
        return uncName;
    }

    /**
     * Sets the value of the uncName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUncName(String value) {
        this.uncName = value;
    }

    /**
     * Gets the value of the warrantDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantDate() {
        return warrantDate;
    }

    /**
     * Sets the value of the warrantDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantDate(String value) {
        this.warrantDate = value;
    }

    /**
     * Gets the value of the warrantDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantDueDate() {
        return warrantDueDate;
    }

    /**
     * Sets the value of the warrantDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantDueDate(String value) {
        this.warrantDueDate = value;
    }

    /**
     * Gets the value of the warrantLimitYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantLimitYear() {
        return warrantLimitYear;
    }

    /**
     * Sets the value of the warrantLimitYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantLimitYear(String value) {
        this.warrantLimitYear = value;
    }

    /**
     * Gets the value of the warrantNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantNo() {
        return warrantNo;
    }

    /**
     * Sets the value of the warrantNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantNo(String value) {
        this.warrantNo = value;
    }

    /**
     * Gets the value of the warrantOrgCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantOrgCode() {
        return warrantOrgCode;
    }

    /**
     * Sets the value of the warrantOrgCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantOrgCode(String value) {
        this.warrantOrgCode = value;
    }

    /**
     * Gets the value of the warrantPolisName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantPolisName() {
        return warrantPolisName;
    }

    /**
     * Sets the value of the warrantPolisName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantPolisName(String value) {
        this.warrantPolisName = value;
    }

    /**
     * Gets the value of the warrantYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantYear() {
        return warrantYear;
    }

    /**
     * Sets the value of the warrantYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantYear(String value) {
        this.warrantYear = value;
    }

    /**
     * Gets the value of the worgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorgName() {
        return worgName;
    }

    /**
     * Sets the value of the worgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorgName(String value) {
        this.worgName = value;
    }

}
