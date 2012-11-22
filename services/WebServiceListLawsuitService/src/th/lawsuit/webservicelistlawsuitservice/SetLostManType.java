
package th.lawsuit.webservicelistlawsuitservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setLostMan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setLostMan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lostDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lostNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="lostOff" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lostY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="police1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recvDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lAge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setLostMan", namespace = "http://Lawsuit.th/", propOrder = {
    "idNo",
    "lostDate",
    "lostNo",
    "lostOff",
    "lostY",
    "name",
    "orgName",
    "police1",
    "recvDate",
    "sex",
    "lAge"
})
public class SetLostManType {

    protected String idNo;
    protected String lostDate;
    protected int lostNo;
    protected String lostOff;
    protected int lostY;
    protected String name;
    protected String orgName;
    protected String police1;
    protected String recvDate;
    protected String sex;
    protected String lAge;

    /**
     * Gets the value of the idNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdNo() {
        return idNo;
    }

    /**
     * Sets the value of the idNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdNo(String value) {
        this.idNo = value;
    }

    /**
     * Gets the value of the lostDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLostDate() {
        return lostDate;
    }

    /**
     * Sets the value of the lostDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLostDate(String value) {
        this.lostDate = value;
    }

    /**
     * Gets the value of the lostNo property.
     * 
     */
    public int getLostNo() {
        return lostNo;
    }

    /**
     * Sets the value of the lostNo property.
     * 
     */
    public void setLostNo(int value) {
        this.lostNo = value;
    }

    /**
     * Gets the value of the lostOff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLostOff() {
        return lostOff;
    }

    /**
     * Sets the value of the lostOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLostOff(String value) {
        this.lostOff = value;
    }

    /**
     * Gets the value of the lostY property.
     * 
     */
    public int getLostY() {
        return lostY;
    }

    /**
     * Sets the value of the lostY property.
     * 
     */
    public void setLostY(int value) {
        this.lostY = value;
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

    /**
     * Gets the value of the police1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolice1() {
        return police1;
    }

    /**
     * Sets the value of the police1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolice1(String value) {
        this.police1 = value;
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

    /**
     * Gets the value of the lAge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLAge() {
        return lAge;
    }

    /**
     * Sets the value of the lAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLAge(String value) {
        this.lAge = value;
    }

}
