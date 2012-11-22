
package th.vehicles.webservicelistvehicleservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setVariable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setVariable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="brandDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="c01BrandCar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="c01ColorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="c01Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="c01Numbody" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="c01Numeng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="c01OffProve" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="c01Plate1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="c01Plate2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="proveDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setVariable", namespace = "http://vehicles.th/", propOrder = {
    "brandDesc",
    "c01BrandCar",
    "c01ColorName",
    "c01Name",
    "c01Numbody",
    "c01Numeng",
    "c01OffProve",
    "c01Plate1",
    "c01Plate2",
    "proveDesc",
    "title"
})
public class SetVariableType {

    protected String brandDesc;
    protected String c01BrandCar;
    protected String c01ColorName;
    protected String c01Name;
    protected String c01Numbody;
    protected String c01Numeng;
    protected String c01OffProve;
    protected String c01Plate1;
    protected String c01Plate2;
    protected String proveDesc;
    protected String title;

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
     * Gets the value of the c01BrandCar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getC01BrandCar() {
        return c01BrandCar;
    }

    /**
     * Sets the value of the c01BrandCar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setC01BrandCar(String value) {
        this.c01BrandCar = value;
    }

    /**
     * Gets the value of the c01ColorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getC01ColorName() {
        return c01ColorName;
    }

    /**
     * Sets the value of the c01ColorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setC01ColorName(String value) {
        this.c01ColorName = value;
    }

    /**
     * Gets the value of the c01Name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getC01Name() {
        return c01Name;
    }

    /**
     * Sets the value of the c01Name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setC01Name(String value) {
        this.c01Name = value;
    }

    /**
     * Gets the value of the c01Numbody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getC01Numbody() {
        return c01Numbody;
    }

    /**
     * Sets the value of the c01Numbody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setC01Numbody(String value) {
        this.c01Numbody = value;
    }

    /**
     * Gets the value of the c01Numeng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getC01Numeng() {
        return c01Numeng;
    }

    /**
     * Sets the value of the c01Numeng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setC01Numeng(String value) {
        this.c01Numeng = value;
    }

    /**
     * Gets the value of the c01OffProve property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getC01OffProve() {
        return c01OffProve;
    }

    /**
     * Sets the value of the c01OffProve property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setC01OffProve(String value) {
        this.c01OffProve = value;
    }

    /**
     * Gets the value of the c01Plate1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getC01Plate1() {
        return c01Plate1;
    }

    /**
     * Sets the value of the c01Plate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setC01Plate1(String value) {
        this.c01Plate1 = value;
    }

    /**
     * Gets the value of the c01Plate2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getC01Plate2() {
        return c01Plate2;
    }

    /**
     * Sets the value of the c01Plate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setC01Plate2(String value) {
        this.c01Plate2 = value;
    }

    /**
     * Gets the value of the proveDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProveDesc() {
        return proveDesc;
    }

    /**
     * Sets the value of the proveDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProveDesc(String value) {
        this.proveDesc = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

}
