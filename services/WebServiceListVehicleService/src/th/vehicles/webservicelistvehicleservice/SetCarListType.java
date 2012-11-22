
package th.vehicles.webservicelistvehicleservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setCarList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setCarList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="brandDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carNumbody" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carPlate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carSEQ" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="caseNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="caseOff" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caseY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="org" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="police" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setCarList", namespace = "http://vehicles.th/", propOrder = {
    "brandDesc",
    "carId",
    "carNumbody",
    "carPlate",
    "carSEQ",
    "caseNo",
    "caseOff",
    "caseY",
    "name",
    "org",
    "police",
    "provDesc"
})
public class SetCarListType {

    protected String brandDesc;
    protected String carId;
    protected String carNumbody;
    protected String carPlate;
    protected int carSEQ;
    protected int caseNo;
    protected String caseOff;
    protected int caseY;
    protected String name;
    protected String org;
    protected String police;
    protected String provDesc;

    /**
     * Gets the value of the brandDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandDesc() {
        return brandDesc;
    }

    /**
     * Sets the value of the brandDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandDesc(String value) {
        this.brandDesc = value;
    }

    /**
     * Gets the value of the carId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarId() {
        return carId;
    }

    /**
     * Sets the value of the carId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarId(String value) {
        this.carId = value;
    }

    /**
     * Gets the value of the carNumbody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarNumbody() {
        return carNumbody;
    }

    /**
     * Sets the value of the carNumbody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarNumbody(String value) {
        this.carNumbody = value;
    }

    /**
     * Gets the value of the carPlate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarPlate() {
        return carPlate;
    }

    /**
     * Sets the value of the carPlate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarPlate(String value) {
        this.carPlate = value;
    }

    /**
     * Gets the value of the carSEQ property.
     * 
     */
    public int getCarSEQ() {
        return carSEQ;
    }

    /**
     * Sets the value of the carSEQ property.
     * 
     */
    public void setCarSEQ(int value) {
        this.carSEQ = value;
    }

    /**
     * Gets the value of the caseNo property.
     * 
     */
    public int getCaseNo() {
        return caseNo;
    }

    /**
     * Sets the value of the caseNo property.
     * 
     */
    public void setCaseNo(int value) {
        this.caseNo = value;
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
     * Gets the value of the caseY property.
     * 
     */
    public int getCaseY() {
        return caseY;
    }

    /**
     * Sets the value of the caseY property.
     * 
     */
    public void setCaseY(int value) {
        this.caseY = value;
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
     * Gets the value of the provDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvDesc() {
        return provDesc;
    }

    /**
     * Sets the value of the provDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvDesc(String value) {
        this.provDesc = value;
    }

}
