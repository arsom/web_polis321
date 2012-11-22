
package th.lawsuit.webservicedetaillawsuitservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setCarLostDetailCrime complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setCarLostDetailCrime">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="brandName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carProvDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="crimeNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="crimeYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fuel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="historyDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kindName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numbody" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numeng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occProv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occProvName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occurCwCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occurFromDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occurFromTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occurPlace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occurToDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occurToTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownProv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownProvName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="polisName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="polisPos" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleBnameCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleColourCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleCwCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleRegNo1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vehicleRegNo2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setCarLostDetailCrime", namespace = "http://Lawsuit.th/", propOrder = {
    "brandName",
    "carProvDesc",
    "carType",
    "carTypeName",
    "chaName",
    "colorName",
    "crimeNo",
    "crimeYear",
    "fuel",
    "historyDesc",
    "kind",
    "kindName",
    "model",
    "numbody",
    "numeng",
    "occAddr",
    "occName",
    "occProv",
    "occProvName",
    "occurCwCode",
    "occurFromDate",
    "occurFromTime",
    "occurPlace",
    "occurToDate",
    "occurToTime",
    "orgCode",
    "orgName",
    "ownAddr",
    "ownName",
    "ownProv",
    "ownProvName",
    "polisName",
    "polisPos",
    "provName",
    "vehicleBnameCode",
    "vehicleColourCode",
    "vehicleCwCode",
    "vehicleNo",
    "vehicleRegNo1",
    "vehicleRegNo2"
})
public class SetCarLostDetailCrimeType {

    protected String brandName;
    protected String carProvDesc;
    protected String carType;
    protected String carTypeName;
    protected String chaName;
    protected String colorName;
    protected int crimeNo;
    protected int crimeYear;
    protected String fuel;
    protected String historyDesc;
    protected String kind;
    protected String kindName;
    protected String model;
    protected String numbody;
    protected String numeng;
    protected String occAddr;
    protected String occName;
    protected String occProv;
    protected String occProvName;
    protected String occurCwCode;
    protected String occurFromDate;
    protected String occurFromTime;
    protected String occurPlace;
    protected String occurToDate;
    protected String occurToTime;
    protected String orgCode;
    protected String orgName;
    protected String ownAddr;
    protected String ownName;
    protected String ownProv;
    protected String ownProvName;
    protected String polisName;
    protected String polisPos;
    protected String provName;
    protected String vehicleBnameCode;
    protected String vehicleColourCode;
    protected String vehicleCwCode;
    protected String vehicleNo;
    protected String vehicleRegNo1;
    protected String vehicleRegNo2;

    /**
     * Gets the value of the brandName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * Sets the value of the brandName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandName(String value) {
        this.brandName = value;
    }

    /**
     * Gets the value of the carProvDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarProvDesc() {
        return carProvDesc;
    }

    /**
     * Sets the value of the carProvDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarProvDesc(String value) {
        this.carProvDesc = value;
    }

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
     * Gets the value of the carTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarTypeName() {
        return carTypeName;
    }

    /**
     * Sets the value of the carTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarTypeName(String value) {
        this.carTypeName = value;
    }

    /**
     * Gets the value of the chaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChaName() {
        return chaName;
    }

    /**
     * Sets the value of the chaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChaName(String value) {
        this.chaName = value;
    }

    /**
     * Gets the value of the colorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorName() {
        return colorName;
    }

    /**
     * Sets the value of the colorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorName(String value) {
        this.colorName = value;
    }

    /**
     * Gets the value of the crimeNo property.
     * 
     */
    public int getCrimeNo() {
        return crimeNo;
    }

    /**
     * Sets the value of the crimeNo property.
     * 
     */
    public void setCrimeNo(int value) {
        this.crimeNo = value;
    }

    /**
     * Gets the value of the crimeYear property.
     * 
     */
    public int getCrimeYear() {
        return crimeYear;
    }

    /**
     * Sets the value of the crimeYear property.
     * 
     */
    public void setCrimeYear(int value) {
        this.crimeYear = value;
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
     * Gets the value of the historyDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHistoryDesc() {
        return historyDesc;
    }

    /**
     * Sets the value of the historyDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHistoryDesc(String value) {
        this.historyDesc = value;
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
     * Gets the value of the kindName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKindName() {
        return kindName;
    }

    /**
     * Sets the value of the kindName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKindName(String value) {
        this.kindName = value;
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
     * Gets the value of the numbody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumbody() {
        return numbody;
    }

    /**
     * Sets the value of the numbody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumbody(String value) {
        this.numbody = value;
    }

    /**
     * Gets the value of the numeng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeng() {
        return numeng;
    }

    /**
     * Sets the value of the numeng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeng(String value) {
        this.numeng = value;
    }

    /**
     * Gets the value of the occAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccAddr() {
        return occAddr;
    }

    /**
     * Sets the value of the occAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccAddr(String value) {
        this.occAddr = value;
    }

    /**
     * Gets the value of the occName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccName() {
        return occName;
    }

    /**
     * Sets the value of the occName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccName(String value) {
        this.occName = value;
    }

    /**
     * Gets the value of the occProv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccProv() {
        return occProv;
    }

    /**
     * Sets the value of the occProv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccProv(String value) {
        this.occProv = value;
    }

    /**
     * Gets the value of the occProvName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccProvName() {
        return occProvName;
    }

    /**
     * Sets the value of the occProvName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccProvName(String value) {
        this.occProvName = value;
    }

    /**
     * Gets the value of the occurCwCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccurCwCode() {
        return occurCwCode;
    }

    /**
     * Sets the value of the occurCwCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccurCwCode(String value) {
        this.occurCwCode = value;
    }

    /**
     * Gets the value of the occurFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccurFromDate() {
        return occurFromDate;
    }

    /**
     * Sets the value of the occurFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccurFromDate(String value) {
        this.occurFromDate = value;
    }

    /**
     * Gets the value of the occurFromTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccurFromTime() {
        return occurFromTime;
    }

    /**
     * Sets the value of the occurFromTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccurFromTime(String value) {
        this.occurFromTime = value;
    }

    /**
     * Gets the value of the occurPlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccurPlace() {
        return occurPlace;
    }

    /**
     * Sets the value of the occurPlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccurPlace(String value) {
        this.occurPlace = value;
    }

    /**
     * Gets the value of the occurToDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccurToDate() {
        return occurToDate;
    }

    /**
     * Sets the value of the occurToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccurToDate(String value) {
        this.occurToDate = value;
    }

    /**
     * Gets the value of the occurToTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccurToTime() {
        return occurToTime;
    }

    /**
     * Sets the value of the occurToTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccurToTime(String value) {
        this.occurToTime = value;
    }

    /**
     * Gets the value of the orgCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * Sets the value of the orgCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgCode(String value) {
        this.orgCode = value;
    }

    /**
     * Gets the value of the orgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * Sets the value of the orgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgName(String value) {
        this.orgName = value;
    }

    /**
     * Gets the value of the ownAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnAddr() {
        return ownAddr;
    }

    /**
     * Sets the value of the ownAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnAddr(String value) {
        this.ownAddr = value;
    }

    /**
     * Gets the value of the ownName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnName() {
        return ownName;
    }

    /**
     * Sets the value of the ownName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnName(String value) {
        this.ownName = value;
    }

    /**
     * Gets the value of the ownProv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnProv() {
        return ownProv;
    }

    /**
     * Sets the value of the ownProv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnProv(String value) {
        this.ownProv = value;
    }

    /**
     * Gets the value of the ownProvName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnProvName() {
        return ownProvName;
    }

    /**
     * Sets the value of the ownProvName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnProvName(String value) {
        this.ownProvName = value;
    }

    /**
     * Gets the value of the polisName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolisName() {
        return polisName;
    }

    /**
     * Sets the value of the polisName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolisName(String value) {
        this.polisName = value;
    }

    /**
     * Gets the value of the polisPos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolisPos() {
        return polisPos;
    }

    /**
     * Sets the value of the polisPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolisPos(String value) {
        this.polisPos = value;
    }

    /**
     * Gets the value of the provName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvName() {
        return provName;
    }

    /**
     * Sets the value of the provName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvName(String value) {
        this.provName = value;
    }

    /**
     * Gets the value of the vehicleBnameCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleBnameCode() {
        return vehicleBnameCode;
    }

    /**
     * Sets the value of the vehicleBnameCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleBnameCode(String value) {
        this.vehicleBnameCode = value;
    }

    /**
     * Gets the value of the vehicleColourCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleColourCode() {
        return vehicleColourCode;
    }

    /**
     * Sets the value of the vehicleColourCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleColourCode(String value) {
        this.vehicleColourCode = value;
    }

    /**
     * Gets the value of the vehicleCwCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleCwCode() {
        return vehicleCwCode;
    }

    /**
     * Sets the value of the vehicleCwCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleCwCode(String value) {
        this.vehicleCwCode = value;
    }

    /**
     * Gets the value of the vehicleNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleNo() {
        return vehicleNo;
    }

    /**
     * Sets the value of the vehicleNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleNo(String value) {
        this.vehicleNo = value;
    }

    /**
     * Gets the value of the vehicleRegNo1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleRegNo1() {
        return vehicleRegNo1;
    }

    /**
     * Sets the value of the vehicleRegNo1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleRegNo1(String value) {
        this.vehicleRegNo1 = value;
    }

    /**
     * Gets the value of the vehicleRegNo2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleRegNo2() {
        return vehicleRegNo2;
    }

    /**
     * Sets the value of the vehicleRegNo2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleRegNo2(String value) {
        this.vehicleRegNo2 = value;
    }

}
