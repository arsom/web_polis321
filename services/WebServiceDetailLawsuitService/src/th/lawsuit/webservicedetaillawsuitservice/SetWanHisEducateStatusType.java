
package th.lawsuit.webservicedetaillawsuitservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setWanHisEducateStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setWanHisEducateStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="unCause" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uncName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uwantD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="uwantNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setWanHisEducateStatus", namespace = "http://Lawsuit.th/", propOrder = {
    "unCause",
    "uncName",
    "uwantD",
    "uwantNo"
})
public class SetWanHisEducateStatusType {

    protected String unCause;
    protected String uncName;
    protected String uwantD;
    protected String uwantNo;

    /**
     * Gets the value of the unCause property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnCause() {
        return unCause;
    }

    /**
     * Sets the value of the unCause property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnCause(String value) {
        this.unCause = value;
    }

    /**
     * Gets the value of the uncName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUncName() {
        return uncName;
    }

    /**
     * Sets the value of the uncName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUncName(String value) {
        this.uncName = value;
    }

    /**
     * Gets the value of the uwantD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUwantD() {
        return uwantD;
    }

    /**
     * Sets the value of the uwantD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUwantD(String value) {
        this.uwantD = value;
    }

    /**
     * Gets the value of the uwantNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUwantNo() {
        return uwantNo;
    }

    /**
     * Sets the value of the uwantNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUwantNo(String value) {
        this.uwantNo = value;
    }

}
