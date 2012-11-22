
package th.lawsuit.webservicedetaillawsuitservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetOjHisAcquittedResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetOjHisAcquittedResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://Lawsuit.th/}setOjHisAcquitted" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetOjHisAcquittedResponse", namespace = "http://Lawsuit.th/", propOrder = {
    "returns"
})
@XmlRootElement(name = "GetOjHisAcquittedResponse", namespace = "http://Lawsuit.th/")
public class GetOjHisAcquittedResponse {

    @XmlElement(name = "return")
    protected List<SetOjHisAcquittedType> returns;

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
     * {@link SetOjHisAcquittedType }
     * 
     * 
     */
    public List<SetOjHisAcquittedType> getReturns() {
        if (returns == null) {
            returns = new ArrayList<SetOjHisAcquittedType>();
        }
        return this.returns;
    }

    /**
     * Sets the value of the returns property.
     * 
     * @param returns
     *     allowed object is
     *     {@link SetOjHisAcquittedType }
     *     
     */
    public void setReturns(List<SetOjHisAcquittedType> returns) {
        this.returns = returns;
    }

}
