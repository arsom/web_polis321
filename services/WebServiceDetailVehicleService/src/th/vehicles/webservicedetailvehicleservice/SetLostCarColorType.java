
package th.vehicles.webservicedetailvehicleservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setLostCarColor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setLostCarColor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carColor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colorCarDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setLostCarColor", namespace = "http://vehicles.th/", propOrder = {
    "carColor",
    "colorCarDesc"
})
public class SetLostCarColorType {

    protected String carColor;
    protected String colorCarDesc;

    /**
     * Gets the value of the carColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarColor() {
        return carColor;
    }

    /**
     * Sets the value of the carColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarColor(String value) {
        this.carColor = value;
    }

    /**
     * Gets the value of the colorCarDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorCarDesc() {
        return colorCarDesc;
    }

    /**
     * Sets the value of the colorCarDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorCarDesc(String value) {
        this.colorCarDesc = value;
    }

}
