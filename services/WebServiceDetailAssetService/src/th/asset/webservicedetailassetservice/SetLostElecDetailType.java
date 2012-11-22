
package th.asset.webservicedetailassetservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setLostElecDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setLostElecDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ampName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="astId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caseNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="caseOff" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caseY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="charge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="happenAmp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="happenArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="happenDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="happenProv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="happenTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="police" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recvDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recvTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="untilDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="untilTIme" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lComp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lProv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lProvName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tComp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tProv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tProvName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setLostElecDetail", namespace = "http://Asset.th/", propOrder = {
    "ampName",
    "astId",
    "caseNo",
    "caseOff",
    "caseY",
    "charge",
    "happenAmp",
    "happenArea",
    "happenDate",
    "happenProv",
    "happenTime",
    "nameL",
    "nameT",
    "orgName",
    "police",
    "position",
    "provName",
    "recvDate",
    "recvTime",
    "untilDate",
    "untilTIme",
    "lAddress",
    "lComp",
    "lProv",
    "lProvName",
    "tAddress",
    "tComp",
    "tProv",
    "tProvName"
})
public class SetLostElecDetailType {

    protected String ampName;
    protected String astId;
    protected int caseNo;
    protected String caseOff;
    protected int caseY;
    protected String charge;
    protected String happenAmp;
    protected String happenArea;
    protected String happenDate;
    protected String happenProv;
    protected String happenTime;
    protected String nameL;
    protected String nameT;
    protected String orgName;
    protected String police;
    protected String position;
    protected String provName;
    protected String recvDate;
    protected String recvTime;
    protected String untilDate;
    protected String untilTIme;
    protected String lAddress;
    protected String lComp;
    protected String lProv;
    protected String lProvName;
    protected String tAddress;
    protected String tComp;
    protected String tProv;
    protected String tProvName;

    /**
     * Gets the value of the ampName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmpName() {
        return ampName;
    }

    /**
     * Sets the value of the ampName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmpName(String value) {
        this.ampName = value;
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
     * Gets the value of the happenAmp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHappenAmp() {
        return happenAmp;
    }

    /**
     * Sets the value of the happenAmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHappenAmp(String value) {
        this.happenAmp = value;
    }

    /**
     * Gets the value of the happenArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHappenArea() {
        return happenArea;
    }

    /**
     * Sets the value of the happenArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHappenArea(String value) {
        this.happenArea = value;
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
     * Gets the value of the happenProv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHappenProv() {
        return happenProv;
    }

    /**
     * Sets the value of the happenProv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHappenProv(String value) {
        this.happenProv = value;
    }

    /**
     * Gets the value of the happenTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHappenTime() {
        return happenTime;
    }

    /**
     * Sets the value of the happenTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHappenTime(String value) {
        this.happenTime = value;
    }

    /**
     * Gets the value of the nameL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameL() {
        return nameL;
    }

    /**
     * Sets the value of the nameL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameL(String value) {
        this.nameL = value;
    }

    /**
     * Gets the value of the nameT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameT() {
        return nameT;
    }

    /**
     * Sets the value of the nameT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameT(String value) {
        this.nameT = value;
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
     * Gets the value of the provName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvName() {
        return provName;
    }

    /**
     * Sets the value of the provName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvName(String value) {
        this.provName = value;
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
     * Gets the value of the recvTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecvTime() {
        return recvTime;
    }

    /**
     * Sets the value of the recvTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecvTime(String value) {
        this.recvTime = value;
    }

    /**
     * Gets the value of the untilDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUntilDate() {
        return untilDate;
    }

    /**
     * Sets the value of the untilDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUntilDate(String value) {
        this.untilDate = value;
    }

    /**
     * Gets the value of the untilTIme property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUntilTIme() {
        return untilTIme;
    }

    /**
     * Sets the value of the untilTIme property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUntilTIme(String value) {
        this.untilTIme = value;
    }

    /**
     * Gets the value of the lAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLAddress() {
        return lAddress;
    }

    /**
     * Sets the value of the lAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLAddress(String value) {
        this.lAddress = value;
    }

    /**
     * Gets the value of the lComp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLComp() {
        return lComp;
    }

    /**
     * Sets the value of the lComp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLComp(String value) {
        this.lComp = value;
    }

    /**
     * Gets the value of the lProv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLProv() {
        return lProv;
    }

    /**
     * Sets the value of the lProv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLProv(String value) {
        this.lProv = value;
    }

    /**
     * Gets the value of the lProvName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLProvName() {
        return lProvName;
    }

    /**
     * Sets the value of the lProvName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLProvName(String value) {
        this.lProvName = value;
    }

    /**
     * Gets the value of the tAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAddress() {
        return tAddress;
    }

    /**
     * Sets the value of the tAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAddress(String value) {
        this.tAddress = value;
    }

    /**
     * Gets the value of the tComp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTComp() {
        return tComp;
    }

    /**
     * Sets the value of the tComp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTComp(String value) {
        this.tComp = value;
    }

    /**
     * Gets the value of the tProv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTProv() {
        return tProv;
    }

    /**
     * Sets the value of the tProv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTProv(String value) {
        this.tProv = value;
    }

    /**
     * Gets the value of the tProvName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTProvName() {
        return tProvName;
    }

    /**
     * Sets the value of the tProvName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTProvName(String value) {
        this.tProvName = value;
    }

}
