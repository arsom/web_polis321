
package th.lawsuit.webservicedetaillawsuitservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setWanHisDownload complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setWanHisDownload">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="warrantDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setWanHisDownload", namespace = "http://Lawsuit.th/", propOrder = {
    "warrantDoc"
})
public class SetWanHisDownloadType {

    protected String warrantDoc;

    /**
     * Gets the value of the warrantDoc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantDoc() {
        return warrantDoc;
    }

    /**
     * Sets the value of the warrantDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantDoc(String value) {
        this.warrantDoc = value;
    }

}
