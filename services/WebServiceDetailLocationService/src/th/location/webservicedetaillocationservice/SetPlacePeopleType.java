
package th.location.webservicedetaillocationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setPlacePeople complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setPlacePeople">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="firstEnme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstTnme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastEnme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastTnme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="middleEnme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgCde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perCde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="placeCde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="placeSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="placeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prefixCde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serialNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="titleDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setPlacePeople", namespace = "http://Location.th/", propOrder = {
    "firstEnme",
    "firstTnme",
    "lastEnme",
    "lastTnme",
    "middleEnme",
    "orgCde",
    "perCde",
    "perId",
    "perType",
    "placeCde",
    "placeSubType",
    "placeType",
    "prefixCde",
    "serialNo",
    "titleDesc"
})
public class SetPlacePeopleType {

    protected String firstEnme;
    protected String firstTnme;
    protected String lastEnme;
    protected String lastTnme;
    protected String middleEnme;
    protected String orgCde;
    protected String perCde;
    protected String perId;
    protected String perType;
    protected String placeCde;
    protected String placeSubType;
    protected String placeType;
    protected String prefixCde;
    protected int serialNo;
    protected String titleDesc;

    /**
     * Gets the value of the firstEnme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstEnme() {
        return firstEnme;
    }

    /**
     * Sets the value of the firstEnme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstEnme(String value) {
        this.firstEnme = value;
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
     * Gets the value of the lastEnme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastEnme() {
        return lastEnme;
    }

    /**
     * Sets the value of the lastEnme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastEnme(String value) {
        this.lastEnme = value;
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
     * Gets the value of the middleEnme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleEnme() {
        return middleEnme;
    }

    /**
     * Sets the value of the middleEnme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleEnme(String value) {
        this.middleEnme = value;
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
     * Gets the value of the perCde property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerCde() {
        return perCde;
    }

    /**
     * Sets the value of the perCde property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerCde(String value) {
        this.perCde = value;
    }

    /**
     * Gets the value of the perId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerId() {
        return perId;
    }

    /**
     * Sets the value of the perId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerId(String value) {
        this.perId = value;
    }

    /**
     * Gets the value of the perType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerType() {
        return perType;
    }

    /**
     * Sets the value of the perType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerType(String value) {
        this.perType = value;
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
     * Gets the value of the placeSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaceSubType() {
        return placeSubType;
    }

    /**
     * Sets the value of the placeSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaceSubType(String value) {
        this.placeSubType = value;
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
     * Gets the value of the prefixCde property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefixCde() {
        return prefixCde;
    }

    /**
     * Sets the value of the prefixCde property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefixCde(String value) {
        this.prefixCde = value;
    }

    /**
     * Gets the value of the serialNo property.
     * 
     */
    public int getSerialNo() {
        return serialNo;
    }

    /**
     * Sets the value of the serialNo property.
     * 
     */
    public void setSerialNo(int value) {
        this.serialNo = value;
    }

    /**
     * Gets the value of the titleDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleDesc() {
        return titleDesc;
    }

    /**
     * Sets the value of the titleDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleDesc(String value) {
        this.titleDesc = value;
    }

}
