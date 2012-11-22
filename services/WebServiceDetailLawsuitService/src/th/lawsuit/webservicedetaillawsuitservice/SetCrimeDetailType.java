
package th.lawsuit.webservicedetaillawsuitservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setCrimeDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setCrimeDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="age1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="age2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caseDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="catchShow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="complainDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="complainTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="crimeNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="crimeYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="firstName1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idNo1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idNo2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationCode1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationCode2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationName1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationName2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occurCwCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occurFromDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occurFromTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occurPlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occurToTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occurTodate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="org" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pjvNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="polisName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serioursNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serioursYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sex1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sex2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setCrimeDetail", namespace = "http://Lawsuit.th/", propOrder = {
    "age1",
    "age2",
    "caseCode",
    "caseDesc",
    "catchShow",
    "complainDate",
    "complainTime",
    "crimeNo",
    "crimeYear",
    "firstName1",
    "firstName2",
    "idNo1",
    "idNo2",
    "lastName1",
    "lastName2",
    "nationCode1",
    "nationCode2",
    "nationName1",
    "nationName2",
    "occurCwCode",
    "occurFromDate",
    "occurFromTime",
    "occurPlace",
    "occurToTime",
    "occurTodate",
    "org",
    "orgCode",
    "pjvNo",
    "polisName",
    "provName",
    "serioursNo",
    "serioursYear",
    "sex1",
    "sex2",
    "title1",
    "title2"
})
public class SetCrimeDetailType {

    protected String age1;
    protected String age2;
    protected String caseCode;
    protected String caseDesc;
    protected String catchShow;
    protected String complainDate;
    protected String complainTime;
    protected int crimeNo;
    protected int crimeYear;
    protected String firstName1;
    protected String firstName2;
    protected String idNo1;
    protected String idNo2;
    protected String lastName1;
    protected String lastName2;
    protected String nationCode1;
    protected String nationCode2;
    protected String nationName1;
    protected String nationName2;
    protected String occurCwCode;
    protected String occurFromDate;
    protected String occurFromTime;
    protected String occurPlace;
    protected String occurToTime;
    protected String occurTodate;
    protected String org;
    protected String orgCode;
    protected String pjvNo;
    protected String polisName;
    protected String provName;
    protected String serioursNo;
    protected String serioursYear;
    protected String sex1;
    protected String sex2;
    protected String title1;
    protected String title2;

    /**
     * Gets the value of the age1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge1() {
        return age1;
    }

    /**
     * Sets the value of the age1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge1(String value) {
        this.age1 = value;
    }

    /**
     * Gets the value of the age2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAge2() {
        return age2;
    }

    /**
     * Sets the value of the age2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge2(String value) {
        this.age2 = value;
    }

    /**
     * Gets the value of the caseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseCode() {
        return caseCode;
    }

    /**
     * Sets the value of the caseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseCode(String value) {
        this.caseCode = value;
    }

    /**
     * Gets the value of the caseDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseDesc() {
        return caseDesc;
    }

    /**
     * Sets the value of the caseDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseDesc(String value) {
        this.caseDesc = value;
    }

    /**
     * Gets the value of the catchShow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatchShow() {
        return catchShow;
    }

    /**
     * Sets the value of the catchShow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatchShow(String value) {
        this.catchShow = value;
    }

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
     * Gets the value of the firstName1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName1() {
        return firstName1;
    }

    /**
     * Sets the value of the firstName1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName1(String value) {
        this.firstName1 = value;
    }

    /**
     * Gets the value of the firstName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName2() {
        return firstName2;
    }

    /**
     * Sets the value of the firstName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName2(String value) {
        this.firstName2 = value;
    }

    /**
     * Gets the value of the idNo1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdNo1() {
        return idNo1;
    }

    /**
     * Sets the value of the idNo1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdNo1(String value) {
        this.idNo1 = value;
    }

    /**
     * Gets the value of the idNo2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdNo2() {
        return idNo2;
    }

    /**
     * Sets the value of the idNo2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdNo2(String value) {
        this.idNo2 = value;
    }

    /**
     * Gets the value of the lastName1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName1() {
        return lastName1;
    }

    /**
     * Sets the value of the lastName1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName1(String value) {
        this.lastName1 = value;
    }

    /**
     * Gets the value of the lastName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName2() {
        return lastName2;
    }

    /**
     * Sets the value of the lastName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName2(String value) {
        this.lastName2 = value;
    }

    /**
     * Gets the value of the nationCode1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationCode1() {
        return nationCode1;
    }

    /**
     * Sets the value of the nationCode1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationCode1(String value) {
        this.nationCode1 = value;
    }

    /**
     * Gets the value of the nationCode2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationCode2() {
        return nationCode2;
    }

    /**
     * Sets the value of the nationCode2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationCode2(String value) {
        this.nationCode2 = value;
    }

    /**
     * Gets the value of the nationName1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationName1() {
        return nationName1;
    }

    /**
     * Sets the value of the nationName1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationName1(String value) {
        this.nationName1 = value;
    }

    /**
     * Gets the value of the nationName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationName2() {
        return nationName2;
    }

    /**
     * Sets the value of the nationName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationName2(String value) {
        this.nationName2 = value;
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
     * Gets the value of the occurTodate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccurTodate() {
        return occurTodate;
    }

    /**
     * Sets the value of the occurTodate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccurTodate(String value) {
        this.occurTodate = value;
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

    /**
     * Gets the value of the sex1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSex1() {
        return sex1;
    }

    /**
     * Sets the value of the sex1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSex1(String value) {
        this.sex1 = value;
    }

    /**
     * Gets the value of the sex2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSex2() {
        return sex2;
    }

    /**
     * Sets the value of the sex2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSex2(String value) {
        this.sex2 = value;
    }

    /**
     * Gets the value of the title1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle1() {
        return title1;
    }

    /**
     * Sets the value of the title1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle1(String value) {
        this.title1 = value;
    }

    /**
     * Gets the value of the title2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle2() {
        return title2;
    }

    /**
     * Sets the value of the title2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle2(String value) {
        this.title2 = value;
    }

}
