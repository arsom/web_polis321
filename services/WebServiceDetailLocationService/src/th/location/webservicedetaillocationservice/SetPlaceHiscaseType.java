
package th.location.webservicedetaillocationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setPlaceHiscase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setPlaceHiscase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caseNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="caseYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dsc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgCde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="placeCde" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serialNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setPlaceHiscase", namespace = "http://Location.th/", propOrder = {
    "caseNo",
    "caseYear",
    "dsc",
    "orgCde",
    "orgName",
    "placeCde",
    "serialNo"
})
public class SetPlaceHiscaseType {

    protected int caseNo;
    protected int caseYear;
    protected String dsc;
    protected String orgCde;
    protected String orgName;
    protected String placeCde;
    protected int serialNo;

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
     * Gets the value of the caseYear property.
     * 
     */
    public int getCaseYear() {
        return caseYear;
    }

    /**
     * Sets the value of the caseYear property.
     * 
     */
    public void setCaseYear(int value) {
        this.caseYear = value;
    }

    /**
     * Gets the value of the dsc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsc() {
        return dsc;
    }

    /**
     * Sets the value of the dsc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDsc(String value) {
        this.dsc = value;
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

}
