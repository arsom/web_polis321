
package th.location.webservicelistlocationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setPlace complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setPlace">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="birthDte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstTnme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastTnme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="natCde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="natName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="org" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgCde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="placeCde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="placeGrp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="placeNme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="placeSubname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="placeSubtype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="placeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="placeTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "setPlace", namespace = "http://Location.th/", propOrder = {
    "birthDte",
    "firstTnme",
    "lastTnme",
    "natCde",
    "natName",
    "org",
    "orgCde",
    "placeCde",
    "placeGrp",
    "placeNme",
    "placeSubname",
    "placeSubtype",
    "placeType",
    "placeTypeName",
    "sex"
})
public class SetPlaceType {

    protected String birthDte;
    protected String firstTnme;
    protected String lastTnme;
    protected String natCde;
    protected String natName;
    protected String org;
    protected String orgCde;
    protected String placeCde;
    protected String placeGrp;
    protected String placeNme;
    protected String placeSubname;
    protected String placeSubtype;
    protected String placeType;
    protected String placeTypeName;
    protected String sex;

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
     * Gets the value of the placeCde property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceCde() {
        return placeCde;
    }

    /**
     * Sets the value of the placeCde property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceCde(String value) {
        this.placeCde = value;
    }

    /**
     * Gets the value of the placeGrp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceGrp() {
        return placeGrp;
    }

    /**
     * Sets the value of the placeGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceGrp(String value) {
        this.placeGrp = value;
    }

    /**
     * Gets the value of the placeNme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceNme() {
        return placeNme;
    }

    /**
     * Sets the value of the placeNme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceNme(String value) {
        this.placeNme = value;
    }

    /**
     * Gets the value of the placeSubname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceSubname() {
        return placeSubname;
    }

    /**
     * Sets the value of the placeSubname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceSubname(String value) {
        this.placeSubname = value;
    }

    /**
     * Gets the value of the placeSubtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceSubtype() {
        return placeSubtype;
    }

    /**
     * Sets the value of the placeSubtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceSubtype(String value) {
        this.placeSubtype = value;
    }

    /**
     * Gets the value of the placeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceType() {
        return placeType;
    }

    /**
     * Sets the value of the placeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceType(String value) {
        this.placeType = value;
    }

    /**
     * Gets the value of the placeTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceTypeName() {
        return placeTypeName;
    }

    /**
     * Sets the value of the placeTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceTypeName(String value) {
        this.placeTypeName = value;
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
