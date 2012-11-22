
package th.weapon.webservicelistweaponservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCrimeList2Response complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCrimeList2Response">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://Weapon.th/}setCrimeWeapon2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCrimeList2Response", namespace = "http://Weapon.th/", propOrder = {
    "returns"
})
@XmlRootElement(name = "GetCrimeList2Response", namespace = "http://Weapon.th/")
public class GetCrimeList2Response {

    @XmlElement(name = "return")
    protected List<SetCrimeWeapon2Type> returns;

    /**
     * Gets the value of the returns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the returns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SetCrimeWeapon2Type }
     * 
     * 
     */
    public List<SetCrimeWeapon2Type> getReturns() {
        if (returns == null) {
            returns = new ArrayList<SetCrimeWeapon2Type>();
        }
        return this.returns;
    }

    /**
     * Sets the value of the returns property.
     * 
     * @param returns
     *     allowed object is
     *     {@link SetCrimeWeapon2Type }
     *     
     */
    public void setReturns(List<SetCrimeWeapon2Type> returns) {
        this.returns = returns;
    }

}
