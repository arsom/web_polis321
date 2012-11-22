
package th.weapon.webservicelistweaponservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setAsset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setAsset">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="astId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="astNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="astSEQ" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="caseNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="caseOff" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caseY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="gunNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="makerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setAsset", namespace = "http://Weapon.th/", propOrder = {
    "astId",
    "astNO",
    "astSEQ",
    "caseNo",
    "caseOff",
    "caseY",
    "gunNo",
    "lname",
    "makerName",
    "orgName",
    "stypeName"
})
public class SetAssetType {

    protected String astId;
    protected String astNO;
    protected int astSEQ;
    protected int caseNo;
    protected String caseOff;
    protected int caseY;
    protected String gunNo;
    protected String lname;
    protected String makerName;
    protected String orgName;
    protected String stypeName;

    /**
     * Gets the value of the astId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAstId() {
        return astId;
    }

    /**
     * Sets the value of the astId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAstId(String value) {
        this.astId = value;
    }

    /**
     * Gets the value of the astNO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAstNO() {
        return astNO;
    }

    /**
     * Sets the value of the astNO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAstNO(String value) {
        this.astNO = value;
    }

    /**
     * Gets the value of the astSEQ property.
     * 
     */
    public int getAstSEQ() {
        return astSEQ;
    }

    /**
     * Sets the value of the astSEQ property.
     * 
     */
    public void setAstSEQ(int value) {
        this.astSEQ = value;
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
     * Gets the value of the lname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLname() {
        return lname;
    }

    /**
     * Sets the value of the lname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLname(String value) {
        this.lname = value;
    }

    /**
     * Gets the value of the makerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMakerName() {
        return makerName;
    }

    /**
     * Sets the value of the makerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMakerName(String value) {
        this.makerName = value;
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

}
