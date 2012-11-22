
package th.lawsuit.webservicedetaillawsuitservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setPlanHisSpouse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setPlanHisSpouse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="charge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chargeAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chargeD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chargeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kindName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occupation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="police" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="religionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouseAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spouseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wantNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wantOff" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wantOffName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wantY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setPlanHisSpouse", namespace = "http://Lawsuit.th/", propOrder = {
    "charge",
    "chargeAddr",
    "chargeD",
    "chargeName",
    "kind",
    "kindName",
    "occupation",
    "police",
    "position",
    "relCode",
    "religionName",
    "spouseAddr",
    "spouseName",
    "wantNo",
    "wantOff",
    "wantOffName",
    "wantY"
})
public class SetPlanHisSpouseType {

    protected String charge;
    protected String chargeAddr;
    protected String chargeD;
    protected String chargeName;
    protected String kind;
    protected String kindName;
    protected String occupation;
    protected String police;
    protected String position;
    protected String relCode;
    protected String religionName;
    protected String spouseAddr;
    protected String spouseName;
    protected String wantNo;
    protected String wantOff;
    protected String wantOffName;
    protected String wantY;

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
     * Gets the value of the chargeAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeAddr() {
        return chargeAddr;
    }

    /**
     * Sets the value of the chargeAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeAddr(String value) {
        this.chargeAddr = value;
    }

    /**
     * Gets the value of the chargeD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeD() {
        return chargeD;
    }

    /**
     * Sets the value of the chargeD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeD(String value) {
        this.chargeD = value;
    }

    /**
     * Gets the value of the chargeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChargeName() {
        return chargeName;
    }

    /**
     * Sets the value of the chargeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChargeName(String value) {
        this.chargeName = value;
    }

    /**
     * Gets the value of the kind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKind(String value) {
        this.kind = value;
    }

    /**
     * Gets the value of the kindName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKindName() {
        return kindName;
    }

    /**
     * Sets the value of the kindName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKindName(String value) {
        this.kindName = value;
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
     * Gets the value of the police property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolice() {
        return police;
    }

    /**
     * Sets the value of the police property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolice(String value) {
        this.police = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition(String value) {
        this.position = value;
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
     * Gets the value of the spouseAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpouseAddr() {
        return spouseAddr;
    }

    /**
     * Sets the value of the spouseAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpouseAddr(String value) {
        this.spouseAddr = value;
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

    /**
     * Gets the value of the wantNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWantNo() {
        return wantNo;
    }

    /**
     * Sets the value of the wantNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWantNo(String value) {
        this.wantNo = value;
    }

    /**
     * Gets the value of the wantOff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWantOff() {
        return wantOff;
    }

    /**
     * Sets the value of the wantOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWantOff(String value) {
        this.wantOff = value;
    }

    /**
     * Gets the value of the wantOffName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWantOffName() {
        return wantOffName;
    }

    /**
     * Sets the value of the wantOffName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWantOffName(String value) {
        this.wantOffName = value;
    }

    /**
     * Gets the value of the wantY property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWantY() {
        return wantY;
    }

    /**
     * Sets the value of the wantY property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWantY(String value) {
        this.wantY = value;
    }

}
