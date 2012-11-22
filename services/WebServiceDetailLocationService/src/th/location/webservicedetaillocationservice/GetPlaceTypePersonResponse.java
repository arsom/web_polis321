
package th.location.webservicedetaillocationservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetPlaceTypePersonResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetPlaceTypePersonResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://Location.th/}setPlaceTypePerson" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetPlaceTypePersonResponse", namespace = "http://Location.th/", propOrder = {
    "returns"
})
@XmlRootElement(name = "GetPlaceTypePersonResponse", namespace = "http://Location.th/")
public class GetPlaceTypePersonResponse {

    @XmlElement(name = "return")
    protected List<SetPlaceTypePersonType> returns;

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
     * {@link SetPlaceTypePersonType }
     * 
     * 
     */
    public List<SetPlaceTypePersonType> getReturns() {
        if (returns == null) {
            returns = new ArrayList<SetPlaceTypePersonType>();
        }
        return this.returns;
    }

    /**
     * Sets the value of the returns property.
     * 
     * @param returns
     *     allowed object is
     *     {@link SetPlaceTypePersonType }
     *     
     */
    public void setReturns(List<SetPlaceTypePersonType> returns) {
        this.returns = returns;
    }

}
