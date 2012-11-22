
package th.lawsuit.webservicelistlawsuitservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setAssetLost complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setAssetLost">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="astId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="astSEQ" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="caseNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="caseOff" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caseY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="happenDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setAssetLost", namespace = "http://Lawsuit.th/", propOrder = {
    "astId",
    "astSEQ",
    "caseNo",
    "caseOff",
    "caseY",
    "happenDate",
    "orgName",
    "stypeName",
    "typeName",
    "lName",
    "tName"
})
public class SetAssetLostType {

    protected String astId;
    protected int astSEQ;
    protected int caseNo;
    protected String caseOff;
    protected int caseY;
    protected String happenDate;
    protected String orgName;
    protected String stypeName;
    protected String typeName;
    protected String lName;
    protected String tName;

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
     * Gets the value of the happenDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHappenDate() {
        return happenDate;
    }

    /**
     * Sets the value of the happenDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHappenDate(String value) {
        this.happenDate = value;
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

    /**
     * Gets the value of the lName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLName() {
        return lName;
    }

    /**
     * Sets the value of the lName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLName(String value) {
        this.lName = value;
    }

    /**
     * Gets the value of the tName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTName() {
        return tName;
    }

    /**
     * Sets the value of the tName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTName(String value) {
        this.tName = value;
    }

}
