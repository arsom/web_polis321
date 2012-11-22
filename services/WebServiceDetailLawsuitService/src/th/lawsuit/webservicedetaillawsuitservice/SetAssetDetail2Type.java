
package th.lawsuit.webservicedetaillawsuitservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setAssetDetail2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setAssetDetail2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="astAmt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="astBrand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="astDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="astGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="astNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="astType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cctMakerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gunNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "setAssetDetail2", namespace = "http://Lawsuit.th/", propOrder = {
    "astAmt",
    "astBrand",
    "astDesc",
    "astGroup",
    "astNo",
    "astType",
    "cctMakerCode",
    "gunNo",
    "stypeName",
    "typeName"
})
public class SetAssetDetail2Type {

    protected String astAmt;
    protected String astBrand;
    protected String astDesc;
    protected String astGroup;
    protected String astNo;
    protected String astType;
    protected String cctMakerCode;
    protected String gunNo;
    protected String stypeName;
    protected String typeName;

    /**
     * Gets the value of the astAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAstAmt() {
        return astAmt;
    }

    /**
     * Sets the value of the astAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAstAmt(String value) {
        this.astAmt = value;
    }

    /**
     * Gets the value of the astBrand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAstBrand() {
        return astBrand;
    }

    /**
     * Sets the value of the astBrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAstBrand(String value) {
        this.astBrand = value;
    }

    /**
     * Gets the value of the astDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAstDesc() {
        return astDesc;
    }

    /**
     * Sets the value of the astDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAstDesc(String value) {
        this.astDesc = value;
    }

    /**
     * Gets the value of the astGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAstGroup() {
        return astGroup;
    }

    /**
     * Sets the value of the astGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAstGroup(String value) {
        this.astGroup = value;
    }

    /**
     * Gets the value of the astNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAstNo() {
        return astNo;
    }

    /**
     * Sets the value of the astNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAstNo(String value) {
        this.astNo = value;
    }

    /**
     * Gets the value of the astType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAstType() {
        return astType;
    }

    /**
     * Sets the value of the astType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAstType(String value) {
        this.astType = value;
    }

    /**
     * Gets the value of the cctMakerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCctMakerCode() {
        return cctMakerCode;
    }

    /**
     * Sets the value of the cctMakerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCctMakerCode(String value) {
        this.cctMakerCode = value;
    }

    /**
     * Gets the value of the gunNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGunNo() {
        return gunNo;
    }

    /**
     * Sets the value of the gunNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGunNo(String value) {
        this.gunNo = value;
    }

    /**
     * Gets the value of the stypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStypeName() {
        return stypeName;
    }

    /**
     * Sets the value of the stypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStypeName(String value) {
        this.stypeName = value;
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
