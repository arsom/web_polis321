
package th.lawsuit.webservicedetaillawsuitservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setPlanHisDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setPlanHisDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="birthD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastProv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastProvName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passportNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="race" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="raceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "setPlanHisDetail", namespace = "http://Lawsuit.th/", propOrder = {
    "birthD",
    "cardId",
    "cardType",
    "idNO",
    "lastAddr",
    "lastProv",
    "lastProvName",
    "nation",
    "nationName",
    "passportNo",
    "race",
    "raceName",
    "sex",
    "fAddr",
    "fName",
    "mAddr",
    "mName",
    "pName"
})
public class SetPlanHisDetailType {

    protected String birthD;
    protected String cardId;
    protected String cardType;
    protected String idNO;
    protected String lastAddr;
    protected String lastProv;
    protected String lastProvName;
    protected String nation;
    protected String nationName;
    protected String passportNo;
    protected String race;
    protected String raceName;
    protected String sex;
    protected String fAddr;
    protected String fName;
    protected String mAddr;
    protected String mName;
    protected String pName;

    /**
     * Gets the value of the birthD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthD() {
        return birthD;
    }

    /**
     * Sets the value of the birthD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthD(String value) {
        this.birthD = value;
    }

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
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the idNO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdNO() {
        return idNO;
    }

    /**
     * Sets the value of the idNO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdNO(String value) {
        this.idNO = value;
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
     * Gets the value of the fAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAddr() {
        return fAddr;
    }

    /**
     * Sets the value of the fAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAddr(String value) {
        this.fAddr = value;
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
     * Gets the value of the mAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMAddr() {
        return mAddr;
    }

    /**
     * Sets the value of the mAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMAddr(String value) {
        this.mAddr = value;
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
