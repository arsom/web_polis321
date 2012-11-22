
package th.lawsuit.webservicedetaillawsuitservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setOjHisJudgments complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setOjHisJudgments">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="casebNO" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="casebY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="caserNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="caserY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="judge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setOjHisJudgments", namespace = "http://Lawsuit.th/", propOrder = {
    "casebNO",
    "casebY",
    "caserNo",
    "caserY",
    "judge"
})
public class SetOjHisJudgmentsType {

    protected int casebNO;
    protected int casebY;
    protected int caserNo;
    protected int caserY;
    protected String judge;

    /**
     * Gets the value of the casebNO property.
     * 
     */
    public int getCasebNO() {
        return casebNO;
    }

    /**
     * Sets the value of the casebNO property.
     * 
     */
    public void setCasebNO(int value) {
        this.casebNO = value;
    }

    /**
     * Gets the value of the casebY property.
     * 
     */
    public int getCasebY() {
        return casebY;
    }

    /**
     * Sets the value of the casebY property.
     * 
     */
    public void setCasebY(int value) {
        this.casebY = value;
    }

    /**
     * Gets the value of the caserNo property.
     * 
     */
    public int getCaserNo() {
        return caserNo;
    }

    /**
     * Sets the value of the caserNo property.
     * 
     */
    public void setCaserNo(int value) {
        this.caserNo = value;
    }

    /**
     * Gets the value of the caserY property.
     * 
     */
    public int getCaserY() {
        return caserY;
    }

    /**
     * Sets the value of the caserY property.
     * 
     */
    public void setCaserY(int value) {
        this.caserY = value;
    }

    /**
     * Gets the value of the judge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJudge() {
        return judge;
    }

    /**
     * Sets the value of the judge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJudge(String value) {
        this.judge = value;
    }

}
