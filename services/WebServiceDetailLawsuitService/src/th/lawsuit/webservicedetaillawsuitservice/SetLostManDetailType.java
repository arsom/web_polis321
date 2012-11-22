
package th.lawsuit.webservicedetaillawsuitservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setLostManDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setLostManDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ampName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assumeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="happenAmp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="happenArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="happenProv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="happenProvName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lostDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lostNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lostOff" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lostOffName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lostTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lostY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lprovName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passportNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="police1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="police2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="position1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="position2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="raceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recvDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recvTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tprovName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="untilDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="untilTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lAge" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lBirthD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lNation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lOccupation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lProv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lRace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tAge" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tIdNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tProv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tRela" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setLostManDetail", namespace = "http://Lawsuit.th/", propOrder = {
    "address",
    "ampName",
    "assumeName",
    "country",
    "countryName",
    "happenAmp",
    "happenArea",
    "happenProv",
    "happenProvName",
    "idNo",
    "lostDate",
    "lostNo",
    "lostOff",
    "lostOffName",
    "lostTime",
    "lostY",
    "lprovName",
    "name1",
    "name2",
    "nationName",
    "passportNo",
    "police1",
    "police2",
    "position1",
    "position2",
    "raceName",
    "recvDate",
    "recvTime",
    "relaName",
    "sex",
    "tprovName",
    "untilDate",
    "untilTime",
    "fName",
    "lAddress",
    "lAge",
    "lBirthD",
    "lNation",
    "lOccupation",
    "lProv",
    "lRace",
    "mName",
    "rName",
    "sName",
    "tAddress",
    "tAge",
    "tIdNo",
    "tName",
    "tProv",
    "tRela"
})
public class SetLostManDetailType {

    protected String address;
    protected String ampName;
    protected String assumeName;
    protected String country;
    protected String countryName;
    protected String happenAmp;
    protected String happenArea;
    protected String happenProv;
    protected String happenProvName;
    protected String idNo;
    protected String lostDate;
    protected int lostNo;
    protected String lostOff;
    protected String lostOffName;
    protected String lostTime;
    protected int lostY;
    protected String lprovName;
    protected String name1;
    protected String name2;
    protected String nationName;
    protected String passportNo;
    protected String police1;
    protected String police2;
    protected String position1;
    protected String position2;
    protected String raceName;
    protected String recvDate;
    protected String recvTime;
    protected String relaName;
    protected String sex;
    protected String tprovName;
    protected String untilDate;
    protected String untilTime;
    protected String fName;
    protected String lAddress;
    protected int lAge;
    protected String lBirthD;
    protected String lNation;
    protected String lOccupation;
    protected String lProv;
    protected String lRace;
    protected String mName;
    protected String rName;
    protected String sName;
    protected String tAddress;
    protected int tAge;
    protected String tIdNo;
    protected String tName;
    protected String tProv;
    protected String tRela;

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
     * Gets the value of the ampName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmpName() {
        return ampName;
    }

    /**
     * Sets the value of the ampName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmpName(String value) {
        this.ampName = value;
    }

    /**
     * Gets the value of the assumeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssumeName() {
        return assumeName;
    }

    /**
     * Sets the value of the assumeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssumeName(String value) {
        this.assumeName = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the happenAmp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHappenAmp() {
        return happenAmp;
    }

    /**
     * Sets the value of the happenAmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHappenAmp(String value) {
        this.happenAmp = value;
    }

    /**
     * Gets the value of the happenArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHappenArea() {
        return happenArea;
    }

    /**
     * Sets the value of the happenArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHappenArea(String value) {
        this.happenArea = value;
    }

    /**
     * Gets the value of the happenProv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHappenProv() {
        return happenProv;
    }

    /**
     * Sets the value of the happenProv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHappenProv(String value) {
        this.happenProv = value;
    }

    /**
     * Gets the value of the happenProvName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHappenProvName() {
        return happenProvName;
    }

    /**
     * Sets the value of the happenProvName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHappenProvName(String value) {
        this.happenProvName = value;
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
     * Gets the value of the lostDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLostDate() {
        return lostDate;
    }

    /**
     * Sets the value of the lostDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLostDate(String value) {
        this.lostDate = value;
    }

    /**
     * Gets the value of the lostNo property.
     * 
     */
    public int getLostNo() {
        return lostNo;
    }

    /**
     * Sets the value of the lostNo property.
     * 
     */
    public void setLostNo(int value) {
        this.lostNo = value;
    }

    /**
     * Gets the value of the lostOff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLostOff() {
        return lostOff;
    }

    /**
     * Sets the value of the lostOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLostOff(String value) {
        this.lostOff = value;
    }

    /**
     * Gets the value of the lostOffName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLostOffName() {
        return lostOffName;
    }

    /**
     * Sets the value of the lostOffName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLostOffName(String value) {
        this.lostOffName = value;
    }

    /**
     * Gets the value of the lostTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLostTime() {
        return lostTime;
    }

    /**
     * Sets the value of the lostTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLostTime(String value) {
        this.lostTime = value;
    }

    /**
     * Gets the value of the lostY property.
     * 
     */
    public int getLostY() {
        return lostY;
    }

    /**
     * Sets the value of the lostY property.
     * 
     */
    public void setLostY(int value) {
        this.lostY = value;
    }

    /**
     * Gets the value of the lprovName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLprovName() {
        return lprovName;
    }

    /**
     * Sets the value of the lprovName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLprovName(String value) {
        this.lprovName = value;
    }

    /**
     * Gets the value of the name1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName1() {
        return name1;
    }

    /**
     * Sets the value of the name1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName1(String value) {
        this.name1 = value;
    }

    /**
     * Gets the value of the name2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName2() {
        return name2;
    }

    /**
     * Sets the value of the name2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName2(String value) {
        this.name2 = value;
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
     * Gets the value of the police1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolice1() {
        return police1;
    }

    /**
     * Sets the value of the police1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolice1(String value) {
        this.police1 = value;
    }

    /**
     * Gets the value of the police2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolice2() {
        return police2;
    }

    /**
     * Sets the value of the police2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolice2(String value) {
        this.police2 = value;
    }

    /**
     * Gets the value of the position1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition1() {
        return position1;
    }

    /**
     * Sets the value of the position1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition1(String value) {
        this.position1 = value;
    }

    /**
     * Gets the value of the position2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition2() {
        return position2;
    }

    /**
     * Sets the value of the position2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition2(String value) {
        this.position2 = value;
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
     * Gets the value of the recvDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecvDate() {
        return recvDate;
    }

    /**
     * Sets the value of the recvDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecvDate(String value) {
        this.recvDate = value;
    }

    /**
     * Gets the value of the recvTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecvTime() {
        return recvTime;
    }

    /**
     * Sets the value of the recvTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecvTime(String value) {
        this.recvTime = value;
    }

    /**
     * Gets the value of the relaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelaName() {
        return relaName;
    }

    /**
     * Sets the value of the relaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelaName(String value) {
        this.relaName = value;
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
     * Gets the value of the tprovName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTprovName() {
        return tprovName;
    }

    /**
     * Sets the value of the tprovName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTprovName(String value) {
        this.tprovName = value;
    }

    /**
     * Gets the value of the untilDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUntilDate() {
        return untilDate;
    }

    /**
     * Sets the value of the untilDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUntilDate(String value) {
        this.untilDate = value;
    }

    /**
     * Gets the value of the untilTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUntilTime() {
        return untilTime;
    }

    /**
     * Sets the value of the untilTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUntilTime(String value) {
        this.untilTime = value;
    }

    /**
     * Gets the value of the fName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFName() {
        return fName;
    }

    /**
     * Sets the value of the fName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFName(String value) {
        this.fName = value;
    }

    /**
     * Gets the value of the lAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLAddress() {
        return lAddress;
    }

    /**
     * Sets the value of the lAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLAddress(String value) {
        this.lAddress = value;
    }

    /**
     * Gets the value of the lAge property.
     * 
     */
    public int getLAge() {
        return lAge;
    }

    /**
     * Sets the value of the lAge property.
     * 
     */
    public void setLAge(int value) {
        this.lAge = value;
    }

    /**
     * Gets the value of the lBirthD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLBirthD() {
        return lBirthD;
    }

    /**
     * Sets the value of the lBirthD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLBirthD(String value) {
        this.lBirthD = value;
    }

    /**
     * Gets the value of the lNation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLNation() {
        return lNation;
    }

    /**
     * Sets the value of the lNation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLNation(String value) {
        this.lNation = value;
    }

    /**
     * Gets the value of the lOccupation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOccupation() {
        return lOccupation;
    }

    /**
     * Sets the value of the lOccupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOccupation(String value) {
        this.lOccupation = value;
    }

    /**
     * Gets the value of the lProv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLProv() {
        return lProv;
    }

    /**
     * Sets the value of the lProv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLProv(String value) {
        this.lProv = value;
    }

    /**
     * Gets the value of the lRace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLRace() {
        return lRace;
    }

    /**
     * Sets the value of the lRace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLRace(String value) {
        this.lRace = value;
    }

    /**
     * Gets the value of the mName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMName() {
        return mName;
    }

    /**
     * Sets the value of the mName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMName(String value) {
        this.mName = value;
    }

    /**
     * Gets the value of the rName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRName() {
        return rName;
    }

    /**
     * Sets the value of the rName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRName(String value) {
        this.rName = value;
    }

    /**
     * Gets the value of the sName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSName() {
        return sName;
    }

    /**
     * Sets the value of the sName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSName(String value) {
        this.sName = value;
    }

    /**
     * Gets the value of the tAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAddress() {
        return tAddress;
    }

    /**
     * Sets the value of the tAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAddress(String value) {
        this.tAddress = value;
    }

    /**
     * Gets the value of the tAge property.
     * 
     */
    public int getTAge() {
        return tAge;
    }

    /**
     * Sets the value of the tAge property.
     * 
     */
    public void setTAge(int value) {
        this.tAge = value;
    }

    /**
     * Gets the value of the tIdNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIdNo() {
        return tIdNo;
    }

    /**
     * Sets the value of the tIdNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIdNo(String value) {
        this.tIdNo = value;
    }

    /**
     * Gets the value of the tName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTName() {
        return tName;
    }

    /**
     * Sets the value of the tName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTName(String value) {
        this.tName = value;
    }

    /**
     * Gets the value of the tProv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTProv() {
        return tProv;
    }

    /**
     * Sets the value of the tProv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTProv(String value) {
        this.tProv = value;
    }

    /**
     * Gets the value of the tRela property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRela() {
        return tRela;
    }

    /**
     * Sets the value of the tRela property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRela(String value) {
        this.tRela = value;
    }

}
