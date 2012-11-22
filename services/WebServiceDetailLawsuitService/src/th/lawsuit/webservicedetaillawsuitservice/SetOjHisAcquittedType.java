
package th.lawsuit.webservicedetaillawsuitservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setOjHisAcquitted complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setOjHisAcquitted">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="charge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occupation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ojAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ojD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ojHome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ojNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ojOff" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ojProv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ojStat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ojoffName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ojprovName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ojstatName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="religionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setOjHisAcquitted", namespace = "http://Lawsuit.th/", propOrder = {
    "charge",
    "occupation",
    "ojAddr",
    "ojD",
    "ojHome",
    "ojNo",
    "ojOff",
    "ojProv",
    "ojStat",
    "ojoffName",
    "ojprovName",
    "ojstatName",
    "relCode",
    "religionName",
    "spouseName"
})
public class SetOjHisAcquittedType {

    protected String charge;
    protected String occupation;
    protected String ojAddr;
    protected String ojD;
    protected String ojHome;
    protected String ojNo;
    protected String ojOff;
    protected String ojProv;
    protected String ojStat;
    protected String ojoffName;
    protected String ojprovName;
    protected String ojstatName;
    protected String relCode;
    protected String religionName;
    protected String spouseName;

    /**
     * Gets the value of the charge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharge() {
        return charge;
    }

    /**
     * Sets the value of the charge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharge(String value) {
        this.charge = value;
    }

    /**
     * Gets the value of the occupation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * Sets the value of the occupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupation(String value) {
        this.occupation = value;
    }

    /**
     * Gets the value of the ojAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOjAddr() {
        return ojAddr;
    }

    /**
     * Sets the value of the ojAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOjAddr(String value) {
        this.ojAddr = value;
    }

    /**
     * Gets the value of the ojD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOjD() {
        return ojD;
    }

    /**
     * Sets the value of the ojD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOjD(String value) {
        this.ojD = value;
    }

    /**
     * Gets the value of the ojHome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOjHome() {
        return ojHome;
    }

    /**
     * Sets the value of the ojHome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOjHome(String value) {
        this.ojHome = value;
    }

    /**
     * Gets the value of the ojNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOjNo() {
        return ojNo;
    }

    /**
     * Sets the value of the ojNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOjNo(String value) {
        this.ojNo = value;
    }

    /**
     * Gets the value of the ojOff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOjOff() {
        return ojOff;
    }

    /**
     * Sets the value of the ojOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOjOff(String value) {
        this.ojOff = value;
    }

    /**
     * Gets the value of the ojProv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOjProv() {
        return ojProv;
    }

    /**
     * Sets the value of the ojProv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOjProv(String value) {
        this.ojProv = value;
    }

    /**
     * Gets the value of the ojStat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOjStat() {
        return ojStat;
    }

    /**
     * Sets the value of the ojStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOjStat(String value) {
        this.ojStat = value;
    }

    /**
     * Gets the value of the ojoffName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOjoffName() {
        return ojoffName;
    }

    /**
     * Sets the value of the ojoffName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOjoffName(String value) {
        this.ojoffName = value;
    }

    /**
     * Gets the value of the ojprovName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOjprovName() {
        return ojprovName;
    }

    /**
     * Sets the value of the ojprovName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOjprovName(String value) {
        this.ojprovName = value;
    }

    /**
     * Gets the value of the ojstatName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOjstatName() {
        return ojstatName;
    }

    /**
     * Sets the value of the ojstatName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOjstatName(String value) {
        this.ojstatName = value;
    }

    /**
     * Gets the value of the relCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelCode() {
        return relCode;
    }

    /**
     * Sets the value of the relCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelCode(String value) {
        this.relCode = value;
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
     * Gets the value of the spouseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseName() {
        return spouseName;
    }

    /**
     * Sets the value of the spouseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseName(String value) {
        this.spouseName = value;
    }

}
