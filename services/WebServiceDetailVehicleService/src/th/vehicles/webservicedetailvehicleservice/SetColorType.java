
package th.vehicles.webservicedetailvehicleservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setColor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setColor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="colorDesc1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colorDesc2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colorDesc3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cColor1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setColor", namespace = "http://vehicles.th/", propOrder = {
    "colorDesc1",
    "colorDesc2",
    "colorDesc3",
    "cColor1"
})
public class SetColorType {

    protected String colorDesc1;
    protected String colorDesc2;
    protected String colorDesc3;
    protected String cColor1;

    /**
     * Gets the value of the colorDesc1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorDesc1() {
        return colorDesc1;
    }

    /**
     * Sets the value of the colorDesc1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorDesc1(String value) {
        this.colorDesc1 = value;
    }

    /**
     * Gets the value of the colorDesc2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorDesc2() {
        return colorDesc2;
    }

    /**
     * Sets the value of the colorDesc2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorDesc2(String value) {
        this.colorDesc2 = value;
    }

    /**
     * Gets the value of the colorDesc3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorDesc3() {
        return colorDesc3;
    }

    /**
     * Sets the value of the colorDesc3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorDesc3(String value) {
        this.colorDesc3 = value;
    }

    /**
     * Gets the value of the cColor1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCColor1() {
        return cColor1;
    }

    /**
     * Sets the value of the cColor1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCColor1(String value) {
        this.cColor1 = value;
    }

}
