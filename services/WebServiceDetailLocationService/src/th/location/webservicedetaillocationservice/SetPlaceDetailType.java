
package th.location.webservicedetaillocationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setPlaceDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setPlaceDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acrossName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="actDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addrDesc1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addrDesc2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="behaDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gangNme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hisDte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgCde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgNme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="palceNme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="placeCde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="placeGrp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roadName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="soiName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setPlaceDetail", namespace = "http://Location.th/", propOrder = {
    "acrossName",
    "actDesc",
    "addrDesc1",
    "addrDesc2",
    "behaDesc",
    "gangNme",
    "hisDte",
    "locName",
    "orgCde",
    "orgName",
    "orgNme",
    "palceNme",
    "placeCde",
    "placeGrp",
    "roadName",
    "soiName",
    "subName",
    "typeName"
})
public class SetPlaceDetailType {

    protected String acrossName;
    protected String actDesc;
    protected String addrDesc1;
    protected String addrDesc2;
    protected String behaDesc;
    protected String gangNme;
    protected String hisDte;
    protected String locName;
    protected String orgCde;
    protected String orgName;
    protected String orgNme;
    protected String palceNme;
    protected String placeCde;
    protected String placeGrp;
    protected String roadName;
    protected String soiName;
    protected String subName;
    protected String typeName;

    /**
     * Gets the value of the acrossName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcrossName() {
        return acrossName;
    }

    /**
     * Sets the value of the acrossName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcrossName(String value) {
        this.acrossName = value;
    }

    /**
     * Gets the value of the actDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActDesc() {
        return actDesc;
    }

    /**
     * Sets the value of the actDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActDesc(String value) {
        this.actDesc = value;
    }

    /**
     * Gets the value of the addrDesc1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrDesc1() {
        return addrDesc1;
    }

    /**
     * Sets the value of the addrDesc1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrDesc1(String value) {
        this.addrDesc1 = value;
    }

    /**
     * Gets the value of the addrDesc2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrDesc2() {
        return addrDesc2;
    }

    /**
     * Sets the value of the addrDesc2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrDesc2(String value) {
        this.addrDesc2 = value;
    }

    /**
     * Gets the value of the behaDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBehaDesc() {
        return behaDesc;
    }

    /**
     * Sets the value of the behaDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBehaDesc(String value) {
        this.behaDesc = value;
    }

    /**
     * Gets the value of the gangNme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGangNme() {
        return gangNme;
    }

    /**
     * Sets the value of the gangNme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGangNme(String value) {
        this.gangNme = value;
    }

    /**
     * Gets the value of the hisDte property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHisDte() {
        return hisDte;
    }

    /**
     * Sets the value of the hisDte property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHisDte(String value) {
        this.hisDte = value;
    }

    /**
     * Gets the value of the locName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocName() {
        return locName;
    }

    /**
     * Sets the value of the locName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocName(String value) {
        this.locName = value;
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
     * Gets the value of the orgNme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgNme() {
        return orgNme;
    }

    /**
     * Sets the value of the orgNme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgNme(String value) {
        this.orgNme = value;
    }

    /**
     * Gets the value of the palceNme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPalceNme() {
        return palceNme;
    }

    /**
     * Sets the value of the palceNme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPalceNme(String value) {
        this.palceNme = value;
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
     * Gets the value of the roadName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadName() {
        return roadName;
    }

    /**
     * Sets the value of the roadName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadName(String value) {
        this.roadName = value;
    }

    /**
     * Gets the value of the soiName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoiName() {
        return soiName;
    }

    /**
     * Sets the value of the soiName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoiName(String value) {
        this.soiName = value;
    }

    /**
     * Gets the value of the subName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubName() {
        return subName;
    }

    /**
     * Sets the value of the subName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubName(String value) {
        this.subName = value;
    }

    /**
     * Gets the value of the typeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * Sets the value of the typeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeName(String value) {
        this.typeName = value;
    }

}
