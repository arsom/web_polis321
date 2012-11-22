
package th.vehicles.webservicedetailvehicleservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setVehicleEXT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setVehicleEXT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cc" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cly" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fuel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kindDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numBody" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numEng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occDOBDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occFName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occLName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occPId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occProvDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="offBr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="offBrName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="offProv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="offProvDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="offProvName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prevOffProv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prevPlate1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prevPlate2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="regDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sizeCar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wheel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="whlDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setVehicleEXT", namespace = "http://vehicles.th/", propOrder = {
    "carType",
    "cc",
    "cly",
    "fuel",
    "kind",
    "kindDesc",
    "model",
    "numBody",
    "numEng",
    "occDOBDate",
    "occDate",
    "occFName",
    "occLName",
    "occPId",
    "occProvDesc",
    "occTitle",
    "offBr",
    "offBrName",
    "offProv",
    "offProvDesc",
    "offProvName",
    "prevOffProv",
    "prevPlate1",
    "prevPlate2",
    "price",
    "regDate",
    "sizeCar",
    "taxDate",
    "wheel",
    "whlDesc"
})
public class SetVehicleEXTType {

    protected String carType;
    protected int cc;
    protected int cly;
    protected String fuel;
    protected String kind;
    protected String kindDesc;
    protected String model;
    protected String numBody;
    protected String numEng;
    protected String occDOBDate;
    protected String occDate;
    protected String occFName;
    protected String occLName;
    protected String occPId;
    protected String occProvDesc;
    protected String occTitle;
    protected String offBr;
    protected String offBrName;
    protected String offProv;
    protected String offProvDesc;
    protected String offProvName;
    protected String prevOffProv;
    protected String prevPlate1;
    protected String prevPlate2;
    protected int price;
    protected String regDate;
    protected String sizeCar;
    protected String taxDate;
    protected String wheel;
    protected String whlDesc;

    /**
     * Gets the value of the carType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarType() {
        return carType;
    }

    /**
     * Sets the value of the carType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarType(String value) {
        this.carType = value;
    }

    /**
     * Gets the value of the cc property.
     * 
     */
    public int getCc() {
        return cc;
    }

    /**
     * Sets the value of the cc property.
     * 
     */
    public void setCc(int value) {
        this.cc = value;
    }

    /**
     * Gets the value of the cly property.
     * 
     */
    public int getCly() {
        return cly;
    }

    /**
     * Sets the value of the cly property.
     * 
     */
    public void setCly(int value) {
        this.cly = value;
    }

    /**
     * Gets the value of the fuel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuel() {
        return fuel;
    }

    /**
     * Sets the value of the fuel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuel(String value) {
        this.fuel = value;
    }

    /**
     * Gets the value of the kind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKind(String value) {
        this.kind = value;
    }

    /**
     * Gets the value of the kindDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKindDesc() {
        return kindDesc;
    }

    /**
     * Sets the value of the kindDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKindDesc(String value) {
        this.kindDesc = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the numBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumBody() {
        return numBody;
    }

    /**
     * Sets the value of the numBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumBody(String value) {
        this.numBody = value;
    }

    /**
     * Gets the value of the numEng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumEng() {
        return numEng;
    }

    /**
     * Sets the value of the numEng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumEng(String value) {
        this.numEng = value;
    }

    /**
     * Gets the value of the occDOBDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccDOBDate() {
        return occDOBDate;
    }

    /**
     * Sets the value of the occDOBDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccDOBDate(String value) {
        this.occDOBDate = value;
    }

    /**
     * Gets the value of the occDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccDate() {
        return occDate;
    }

    /**
     * Sets the value of the occDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccDate(String value) {
        this.occDate = value;
    }

    /**
     * Gets the value of the occFName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccFName() {
        return occFName;
    }

    /**
     * Sets the value of the occFName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccFName(String value) {
        this.occFName = value;
    }

    /**
     * Gets the value of the occLName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccLName() {
        return occLName;
    }

    /**
     * Sets the value of the occLName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccLName(String value) {
        this.occLName = value;
    }

    /**
     * Gets the value of the occPId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccPId() {
        return occPId;
    }

    /**
     * Sets the value of the occPId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccPId(String value) {
        this.occPId = value;
    }

    /**
     * Gets the value of the occProvDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccProvDesc() {
        return occProvDesc;
    }

    /**
     * Sets the value of the occProvDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccProvDesc(String value) {
        this.occProvDesc = value;
    }

    /**
     * Gets the value of the occTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccTitle() {
        return occTitle;
    }

    /**
     * Sets the value of the occTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccTitle(String value) {
        this.occTitle = value;
    }

    /**
     * Gets the value of the offBr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffBr() {
        return offBr;
    }

    /**
     * Sets the value of the offBr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffBr(String value) {
        this.offBr = value;
    }

    /**
     * Gets the value of the offBrName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffBrName() {
        return offBrName;
    }

    /**
     * Sets the value of the offBrName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffBrName(String value) {
        this.offBrName = value;
    }

    /**
     * Gets the value of the offProv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffProv() {
        return offProv;
    }

    /**
     * Sets the value of the offProv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffProv(String value) {
        this.offProv = value;
    }

    /**
     * Gets the value of the offProvDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffProvDesc() {
        return offProvDesc;
    }

    /**
     * Sets the value of the offProvDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffProvDesc(String value) {
        this.offProvDesc = value;
    }

    /**
     * Gets the value of the offProvName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffProvName() {
        return offProvName;
    }

    /**
     * Sets the value of the offProvName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffProvName(String value) {
        this.offProvName = value;
    }

    /**
     * Gets the value of the prevOffProv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevOffProv() {
        return prevOffProv;
    }

    /**
     * Sets the value of the prevOffProv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevOffProv(String value) {
        this.prevOffProv = value;
    }

    /**
     * Gets the value of the prevPlate1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevPlate1() {
        return prevPlate1;
    }

    /**
     * Sets the value of the prevPlate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevPlate1(String value) {
        this.prevPlate1 = value;
    }

    /**
     * Gets the value of the prevPlate2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevPlate2() {
        return prevPlate2;
    }

    /**
     * Sets the value of the prevPlate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevPlate2(String value) {
        this.prevPlate2 = value;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    public int getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(int value) {
        this.price = value;
    }

    /**
     * Gets the value of the regDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegDate() {
        return regDate;
    }

    /**
     * Sets the value of the regDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegDate(String value) {
        this.regDate = value;
    }

    /**
     * Gets the value of the sizeCar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSizeCar() {
        return sizeCar;
    }

    /**
     * Sets the value of the sizeCar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSizeCar(String value) {
        this.sizeCar = value;
    }

    /**
     * Gets the value of the taxDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxDate() {
        return taxDate;
    }

    /**
     * Sets the value of the taxDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxDate(String value) {
        this.taxDate = value;
    }

    /**
     * Gets the value of the wheel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWheel() {
        return wheel;
    }

    /**
     * Sets the value of the wheel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWheel(String value) {
        this.wheel = value;
    }

    /**
     * Gets the value of the whlDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWhlDesc() {
        return whlDesc;
    }

    /**
     * Sets the value of the whlDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWhlDesc(String value) {
        this.whlDesc = value;
    }

}
