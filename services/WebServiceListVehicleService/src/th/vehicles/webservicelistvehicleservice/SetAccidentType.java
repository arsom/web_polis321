
package th.vehicles.webservicelistvehicleservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setAccident complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setAccident">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carPerAge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carPerCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carPlate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carSEQ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cgtAccideCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cgtAccideYY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="driveSta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setAccident", namespace = "http://vehicles.th/", propOrder = {
    "carPerAge",
    "carPerCard",
    "carPlate",
    "carSEQ",
    "cgtAccideCode",
    "cgtAccideYY",
    "driveSta",
    "name",
    "nationName",
    "orgCode",
    "orgName",
    "sex"
})
public class SetAccidentType {

    protected String carPerAge;
    protected String carPerCard;
    protected String carPlate;
    protected String carSEQ;
    protected String cgtAccideCode;
    protected String cgtAccideYY;
    protected String driveSta;
    protected String name;
    protected String nationName;
    protected String orgCode;
    protected String orgName;
    protected String sex;

    /**
     * Gets the value of the carPerAge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarPerAge() {
        return carPerAge;
    }

    /**
     * Sets the value of the carPerAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarPerAge(String value) {
        this.carPerAge = value;
    }

    /**
     * Gets the value of the carPerCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarPerCard() {
        return carPerCard;
    }

    /**
     * Sets the value of the carPerCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarPerCard(String value) {
        this.carPerCard = value;
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
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarSEQ() {
        return carSEQ;
    }

    /**
     * Sets the value of the carSEQ property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarSEQ(String value) {
        this.carSEQ = value;
    }

    /**
     * Gets the value of the cgtAccideCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCgtAccideCode() {
        return cgtAccideCode;
    }

    /**
     * Sets the value of the cgtAccideCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCgtAccideCode(String value) {
        this.cgtAccideCode = value;
    }

    /**
     * Gets the value of the cgtAccideYY property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCgtAccideYY() {
        return cgtAccideYY;
    }

    /**
     * Sets the value of the cgtAccideYY property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCgtAccideYY(String value) {
        this.cgtAccideYY = value;
    }

    /**
     * Gets the value of the driveSta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriveSta() {
        return driveSta;
    }

    /**
     * Sets the value of the driveSta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriveSta(String value) {
        this.driveSta = value;
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

}
