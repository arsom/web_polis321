
package th.lawsuit.webservicedetaillawsuitservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setOjHisDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setOjHisDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caseOff" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastProv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastProvName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameEng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameOth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameThai" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passportNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="race" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="raceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setOjHisDetail", namespace = "http://Lawsuit.th/", propOrder = {
    "cardId",
    "caseName",
    "caseOff",
    "country",
    "countryName",
    "idNo",
    "lastAddr",
    "lastProv",
    "lastProvName",
    "nameEng",
    "nameOth",
    "nameThai",
    "nation",
    "nationName",
    "passportNo",
    "race",
    "raceName",
    "fName",
    "mName",
    "pName"
})
public class SetOjHisDetailType {

    protected String cardId;
    protected String caseName;
    protected String caseOff;
    protected String country;
    protected String countryName;
    protected String idNo;
    protected String lastAddr;
    protected String lastProv;
    protected String lastProvName;
    protected String nameEng;
    protected String nameOth;
    protected String nameThai;
    protected String nation;
    protected String nationName;
    protected String passportNo;
    protected String race;
    protected String raceName;
    protected String fName;
    protected String mName;
    protected String pName;

    /**
     * Gets the value of the cardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * Sets the value of the cardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardId(String value) {
        this.cardId = value;
    }

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
     * Gets the value of the caseOff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseOff() {
        return caseOff;
    }

    /**
     * Sets the value of the caseOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseOff(String value) {
        this.caseOff = value;
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
     * Gets the value of the lastAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastAddr() {
        return lastAddr;
    }

    /**
     * Sets the value of the lastAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastAddr(String value) {
        this.lastAddr = value;
    }

    /**
     * Gets the value of the lastProv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastProv() {
        return lastProv;
    }

    /**
     * Sets the value of the lastProv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastProv(String value) {
        this.lastProv = value;
    }

    /**
     * Gets the value of the lastProvName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastProvName() {
        return lastProvName;
    }

    /**
     * Sets the value of the lastProvName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastProvName(String value) {
        this.lastProvName = value;
    }

    /**
     * Gets the value of the nameEng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameEng() {
        return nameEng;
    }

    /**
     * Sets the value of the nameEng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameEng(String value) {
        this.nameEng = value;
    }

    /**
     * Gets the value of the nameOth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOth() {
        return nameOth;
    }

    /**
     * Sets the value of the nameOth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOth(String value) {
        this.nameOth = value;
    }

    /**
     * Gets the value of the nameThai property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameThai() {
        return nameThai;
    }

    /**
     * Sets the value of the nameThai property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameThai(String value) {
        this.nameThai = value;
    }

    /**
     * Gets the value of the nation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNation() {
        return nation;
    }

    /**
     * Sets the value of the nation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNation(String value) {
        this.nation = value;
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
     * Gets the value of the race property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRace() {
        return race;
    }

    /**
     * Sets the value of the race property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRace(String value) {
        this.race = value;
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
     * Gets the value of the pName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPName() {
        return pName;
    }

    /**
     * Sets the value of the pName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPName(String value) {
        this.pName = value;
    }

}
