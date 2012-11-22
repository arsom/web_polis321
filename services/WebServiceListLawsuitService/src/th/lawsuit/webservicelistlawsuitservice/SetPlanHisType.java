
package th.lawsuit.webservicelistlawsuitservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setPlanHis complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setPlanHis">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cardId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caseNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="caseY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="chaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="happendD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="metName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setPlanHis", namespace = "http://Lawsuit.th/", propOrder = {
    "cardId",
    "cardType",
    "caseNo",
    "caseY",
    "chaName",
    "happendD",
    "metName",
    "name",
    "orgName"
})
public class SetPlanHisType {

    protected String cardId;
    protected String cardType;
    protected int caseNo;
    protected int caseY;
    protected String chaName;
    protected String happendD;
    protected String metName;
    protected String name;
    protected String orgName;

    /**
     * Gets the value of the cardId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * Sets the value of the cardId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardId(String value) {
        this.cardId = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
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
     * Gets the value of the chaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChaName() {
        return chaName;
    }

    /**
     * Sets the value of the chaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChaName(String value) {
        this.chaName = value;
    }

    /**
     * Gets the value of the happendD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHappendD() {
        return happendD;
    }

    /**
     * Sets the value of the happendD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHappendD(String value) {
        this.happendD = value;
    }

    /**
     * Gets the value of the metName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetName() {
        return metName;
    }

    /**
     * Sets the value of the metName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetName(String value) {
        this.metName = value;
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

}
