
package th.weapon.webservicedetailweapon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setPlanHisHow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setPlanHisHow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caseNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="method1Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="method2Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="method3Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicle1Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicle2Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicle3Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weapon1Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weapon2Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weapon3Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setPlanHisHow", namespace = "http://Weapon.th/", propOrder = {
    "caseNo",
    "method1Name",
    "method2Name",
    "method3Name",
    "vehicle1Name",
    "vehicle2Name",
    "vehicle3Name",
    "weapon1Name",
    "weapon2Name",
    "weapon3Name"
})
public class SetPlanHisHowType {

    protected int caseNo;
    protected String method1Name;
    protected String method2Name;
    protected String method3Name;
    protected String vehicle1Name;
    protected String vehicle2Name;
    protected String vehicle3Name;
    protected String weapon1Name;
    protected String weapon2Name;
    protected String weapon3Name;

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
     * Gets the value of the method1Name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethod1Name() {
        return method1Name;
    }

    /**
     * Sets the value of the method1Name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethod1Name(String value) {
        this.method1Name = value;
    }

    /**
     * Gets the value of the method2Name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethod2Name() {
        return method2Name;
    }

    /**
     * Sets the value of the method2Name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethod2Name(String value) {
        this.method2Name = value;
    }

    /**
     * Gets the value of the method3Name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethod3Name() {
        return method3Name;
    }

    /**
     * Sets the value of the method3Name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethod3Name(String value) {
        this.method3Name = value;
    }

    /**
     * Gets the value of the vehicle1Name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicle1Name() {
        return vehicle1Name;
    }

    /**
     * Sets the value of the vehicle1Name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicle1Name(String value) {
        this.vehicle1Name = value;
    }

    /**
     * Gets the value of the vehicle2Name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicle2Name() {
        return vehicle2Name;
    }

    /**
     * Sets the value of the vehicle2Name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicle2Name(String value) {
        this.vehicle2Name = value;
    }

    /**
     * Gets the value of the vehicle3Name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicle3Name() {
        return vehicle3Name;
    }

    /**
     * Sets the value of the vehicle3Name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicle3Name(String value) {
        this.vehicle3Name = value;
    }

    /**
     * Gets the value of the weapon1Name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeapon1Name() {
        return weapon1Name;
    }

    /**
     * Sets the value of the weapon1Name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeapon1Name(String value) {
        this.weapon1Name = value;
    }

    /**
     * Gets the value of the weapon2Name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeapon2Name() {
        return weapon2Name;
    }

    /**
     * Sets the value of the weapon2Name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeapon2Name(String value) {
        this.weapon2Name = value;
    }

    /**
     * Gets the value of the weapon3Name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeapon3Name() {
        return weapon3Name;
    }

    /**
     * Sets the value of the weapon3Name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeapon3Name(String value) {
        this.weapon3Name = value;
    }

}
