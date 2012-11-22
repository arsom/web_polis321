
package th.weapon.webservicedetailweapon;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetLostAssetMaker complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetLostAssetMaker">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cctMakerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetLostAssetMaker", namespace = "http://Weapon.th/", propOrder = {
    "cctMakerCode"
})
@XmlRootElement(name = "GetLostAssetMaker", namespace = "http://Weapon.th/")
public class GetLostAssetMaker {

    protected String cctMakerCode;

    /**
     * Gets the value of the cctMakerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCctMakerCode() {
        return cctMakerCode;
    }

    /**
     * Sets the value of the cctMakerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCctMakerCode(String value) {
        this.cctMakerCode = value;
    }

}
