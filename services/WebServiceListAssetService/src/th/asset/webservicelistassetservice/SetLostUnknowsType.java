
package th.asset.webservicelistassetservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setLostUnknows complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setLostUnknows">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="astGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="astId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="astSEQ" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="astStype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="astType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caseNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="caseOff" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caseY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="org" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="police" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recvDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "setLostUnknows", namespace = "http://Asset.th/", propOrder = {
    "astGroup",
    "astId",
    "astSEQ",
    "astStype",
    "astType",
    "caseNo",
    "caseOff",
    "caseY",
    "org",
    "police",
    "recvDate",
    "stypeName",
    "typeName"
})
public class SetLostUnknowsType {

    protected String astGroup;
    protected String astId;
    protected int astSEQ;
    protected String astStype;
    protected String astType;
    protected int caseNo;
    protected String caseOff;
    protected int caseY;
    protected String org;
    protected String police;
    protected String recvDate;
    protected String stypeName;
    protected String typeName;

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
     * Gets the value of the astStype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAstStype() {
        return astStype;
    }

    /**
     * Sets the value of the astStype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAstStype(String value) {
        this.astStype = value;
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
     * Gets the value of the recvDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecvDate() {
        return recvDate;
    }

    /**
     * Sets the value of the recvDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecvDate(String value) {
        this.recvDate = value;
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
