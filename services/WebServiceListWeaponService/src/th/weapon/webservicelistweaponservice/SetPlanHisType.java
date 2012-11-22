
package th.weapon.webservicelistweaponservice;

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
 *         &lt;element name="caseNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="caseOff" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caseY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cplanNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="gunNO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="happenD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "setPlanHis", namespace = "http://Weapon.th/", propOrder = {
    "caseNo",
    "caseOff",
    "caseY",
    "cplanNo",
    "gunNO",
    "happenD",
    "orgName"
})
public class SetPlanHisType {

    protected int caseNo;
    protected String caseOff;
    protected int caseY;
    protected int cplanNo;
    protected String gunNO;
    protected String happenD;
    protected String orgName;

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
     * Gets the value of the cplanNo property.
     * 
     */
    public int getCplanNo() {
        return cplanNo;
    }

    /**
     * Sets the value of the cplanNo property.
     * 
     */
    public void setCplanNo(int value) {
        this.cplanNo = value;
    }

    /**
     * Gets the value of the gunNO property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGunNO() {
        return gunNO;
    }

    /**
     * Sets the value of the gunNO property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGunNO(String value) {
        this.gunNO = value;
    }

    /**
     * Gets the value of the happenD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHappenD() {
        return happenD;
    }

    /**
     * Sets the value of the happenD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHappenD(String value) {
        this.happenD = value;
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
