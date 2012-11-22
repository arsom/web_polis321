
package th.location.webservicedetaillocationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setPlaceTypePerson complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setPlaceTypePerson">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pertype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setPlaceTypePerson", namespace = "http://Location.th/", propOrder = {
    "pertype"
})
public class SetPlaceTypePersonType {

    protected String pertype;

    /**
     * Gets the value of the pertype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPertype() {
        return pertype;
    }

    /**
     * Sets the value of the pertype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPertype(String value) {
        this.pertype = value;
    }

}
