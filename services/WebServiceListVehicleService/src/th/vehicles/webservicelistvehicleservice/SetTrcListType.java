
package th.vehicles.webservicelistvehicleservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setTrcList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setTrcList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="brandDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trc01OffBr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trc01OffProv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trc01OwnName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trc01Plate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trc06Numbody" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trc06Numeng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setTrcList", namespace = "http://vehicles.th/", propOrder = {
    "brandDesc",
    "provDesc",
    "trc01OffBr",
    "trc01OffProv",
    "trc01OwnName",
    "trc01Plate",
    "trc06Numbody",
    "trc06Numeng"
})
public class SetTrcListType {

    protected String brandDesc;
    protected String provDesc;
    protected String trc01OffBr;
    protected String trc01OffProv;
    protected String trc01OwnName;
    protected String trc01Plate;
    protected String trc06Numbody;
    protected String trc06Numeng;

    /**
     * Gets the value of the brandDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandDesc() {
        return brandDesc;
    }

    /**
     * Sets the value of the brandDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandDesc(String value) {
        this.brandDesc = value;
    }

    /**
     * Gets the value of the provDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvDesc() {
        return provDesc;
    }

    /**
     * Sets the value of the provDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvDesc(String value) {
        this.provDesc = value;
    }

    /**
     * Gets the value of the trc01OffBr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrc01OffBr() {
        return trc01OffBr;
    }

    /**
     * Sets the value of the trc01OffBr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrc01OffBr(String value) {
        this.trc01OffBr = value;
    }

    /**
     * Gets the value of the trc01OffProv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrc01OffProv() {
        return trc01OffProv;
    }

    /**
     * Sets the value of the trc01OffProv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrc01OffProv(String value) {
        this.trc01OffProv = value;
    }

    /**
     * Gets the value of the trc01OwnName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrc01OwnName() {
        return trc01OwnName;
    }

    /**
     * Sets the value of the trc01OwnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrc01OwnName(String value) {
        this.trc01OwnName = value;
    }

    /**
     * Gets the value of the trc01Plate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrc01Plate() {
        return trc01Plate;
    }

    /**
     * Sets the value of the trc01Plate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrc01Plate(String value) {
        this.trc01Plate = value;
    }

    /**
     * Gets the value of the trc06Numbody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrc06Numbody() {
        return trc06Numbody;
    }

    /**
     * Sets the value of the trc06Numbody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrc06Numbody(String value) {
        this.trc06Numbody = value;
    }

    /**
     * Gets the value of the trc06Numeng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrc06Numeng() {
        return trc06Numeng;
    }

    /**
     * Sets the value of the trc06Numeng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrc06Numeng(String value) {
        this.trc06Numeng = value;
    }

}
