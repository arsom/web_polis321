
package th.vehicles.webservicedetailvehicleservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setLostCar complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setLostCar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ampName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brandName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carBrand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carFuel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carKind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carNumbody" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carNumeng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carOccAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carOccComp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carOccFName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carOccLName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carOccProv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carOccProv1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carOffProv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carOwnAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carOwnComp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carOwnFName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carOwnLName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carOwnProv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carPlate1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carPlate2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carProvName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carSEQ" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="carType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caseNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="caseOff" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="caseY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="charge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fualName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="happenAmp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="happenArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="happenDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="happenProv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="happenTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kindName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occProvName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownProvName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="police" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="position" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="untilDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="untilTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setLostCar", namespace = "http://vehicles.th/", propOrder = {
    "action",
    "ampName",
    "brandName",
    "carBrand",
    "carFuel",
    "carID",
    "carKind",
    "carModel",
    "carName",
    "carNumbody",
    "carNumeng",
    "carOccAddr",
    "carOccComp",
    "carOccFName",
    "carOccLName",
    "carOccProv",
    "carOccProv1",
    "carOffProv",
    "carOwnAddr",
    "carOwnComp",
    "carOwnFName",
    "carOwnLName",
    "carOwnProv",
    "carPlate1",
    "carPlate2",
    "carProvName",
    "carRemark",
    "carSEQ",
    "carType",
    "caseName",
    "caseNo",
    "caseOff",
    "caseY",
    "charge",
    "fualName",
    "happenAmp",
    "happenArea",
    "happenDate",
    "happenProv",
    "happenTime",
    "kindName",
    "occProvName",
    "ownProvName",
    "police",
    "position",
    "provName",
    "untilDate",
    "untilTime"
})
public class SetLostCarType {

    protected String action;
    protected String ampName;
    protected String brandName;
    protected String carBrand;
    protected String carFuel;
    protected String carID;
    protected String carKind;
    protected String carModel;
    protected String carName;
    protected String carNumbody;
    protected String carNumeng;
    protected String carOccAddr;
    protected String carOccComp;
    protected String carOccFName;
    protected String carOccLName;
    protected String carOccProv;
    protected String carOccProv1;
    protected String carOffProv;
    protected String carOwnAddr;
    protected String carOwnComp;
    protected String carOwnFName;
    protected String carOwnLName;
    protected String carOwnProv;
    protected String carPlate1;
    protected String carPlate2;
    protected String carProvName;
    protected String carRemark;
    protected int carSEQ;
    protected String carType;
    protected String caseName;
    protected int caseNo;
    protected String caseOff;
    protected int caseY;
    protected String charge;
    protected String fualName;
    protected String happenAmp;
    protected String happenArea;
    protected String happenDate;
    protected String happenProv;
    protected String happenTime;
    protected String kindName;
    protected String occProvName;
    protected String ownProvName;
    protected String police;
    protected String position;
    protected String provName;
    protected String untilDate;
    protected String untilTime;

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the ampName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmpName() {
        return ampName;
    }

    /**
     * Sets the value of the ampName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmpName(String value) {
        this.ampName = value;
    }

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
     * Gets the value of the carBrand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarBrand() {
        return carBrand;
    }

    /**
     * Sets the value of the carBrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarBrand(String value) {
        this.carBrand = value;
    }

    /**
     * Gets the value of the carFuel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarFuel() {
        return carFuel;
    }

    /**
     * Sets the value of the carFuel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarFuel(String value) {
        this.carFuel = value;
    }

    /**
     * Gets the value of the carID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarID() {
        return carID;
    }

    /**
     * Sets the value of the carID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarID(String value) {
        this.carID = value;
    }

    /**
     * Gets the value of the carKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarKind() {
        return carKind;
    }

    /**
     * Sets the value of the carKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarKind(String value) {
        this.carKind = value;
    }

    /**
     * Gets the value of the carModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarModel() {
        return carModel;
    }

    /**
     * Sets the value of the carModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarModel(String value) {
        this.carModel = value;
    }

    /**
     * Gets the value of the carName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarName() {
        return carName;
    }

    /**
     * Sets the value of the carName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarName(String value) {
        this.carName = value;
    }

    /**
     * Gets the value of the carNumbody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarNumbody() {
        return carNumbody;
    }

    /**
     * Sets the value of the carNumbody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarNumbody(String value) {
        this.carNumbody = value;
    }

    /**
     * Gets the value of the carNumeng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarNumeng() {
        return carNumeng;
    }

    /**
     * Sets the value of the carNumeng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarNumeng(String value) {
        this.carNumeng = value;
    }

    /**
     * Gets the value of the carOccAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarOccAddr() {
        return carOccAddr;
    }

    /**
     * Sets the value of the carOccAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarOccAddr(String value) {
        this.carOccAddr = value;
    }

    /**
     * Gets the value of the carOccComp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarOccComp() {
        return carOccComp;
    }

    /**
     * Sets the value of the carOccComp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarOccComp(String value) {
        this.carOccComp = value;
    }

    /**
     * Gets the value of the carOccFName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarOccFName() {
        return carOccFName;
    }

    /**
     * Sets the value of the carOccFName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarOccFName(String value) {
        this.carOccFName = value;
    }

    /**
     * Gets the value of the carOccLName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarOccLName() {
        return carOccLName;
    }

    /**
     * Sets the value of the carOccLName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarOccLName(String value) {
        this.carOccLName = value;
    }

    /**
     * Gets the value of the carOccProv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarOccProv() {
        return carOccProv;
    }

    /**
     * Sets the value of the carOccProv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarOccProv(String value) {
        this.carOccProv = value;
    }

    /**
     * Gets the value of the carOccProv1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarOccProv1() {
        return carOccProv1;
    }

    /**
     * Sets the value of the carOccProv1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarOccProv1(String value) {
        this.carOccProv1 = value;
    }

    /**
     * Gets the value of the carOffProv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarOffProv() {
        return carOffProv;
    }

    /**
     * Sets the value of the carOffProv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarOffProv(String value) {
        this.carOffProv = value;
    }

    /**
     * Gets the value of the carOwnAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarOwnAddr() {
        return carOwnAddr;
    }

    /**
     * Sets the value of the carOwnAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarOwnAddr(String value) {
        this.carOwnAddr = value;
    }

    /**
     * Gets the value of the carOwnComp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarOwnComp() {
        return carOwnComp;
    }

    /**
     * Sets the value of the carOwnComp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarOwnComp(String value) {
        this.carOwnComp = value;
    }

    /**
     * Gets the value of the carOwnFName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarOwnFName() {
        return carOwnFName;
    }

    /**
     * Sets the value of the carOwnFName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarOwnFName(String value) {
        this.carOwnFName = value;
    }

    /**
     * Gets the value of the carOwnLName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarOwnLName() {
        return carOwnLName;
    }

    /**
     * Sets the value of the carOwnLName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarOwnLName(String value) {
        this.carOwnLName = value;
    }

    /**
     * Gets the value of the carOwnProv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarOwnProv() {
        return carOwnProv;
    }

    /**
     * Sets the value of the carOwnProv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarOwnProv(String value) {
        this.carOwnProv = value;
    }

    /**
     * Gets the value of the carPlate1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarPlate1() {
        return carPlate1;
    }

    /**
     * Sets the value of the carPlate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarPlate1(String value) {
        this.carPlate1 = value;
    }

    /**
     * Gets the value of the carPlate2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarPlate2() {
        return carPlate2;
    }

    /**
     * Sets the value of the carPlate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarPlate2(String value) {
        this.carPlate2 = value;
    }

    /**
     * Gets the value of the carProvName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarProvName() {
        return carProvName;
    }

    /**
     * Sets the value of the carProvName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarProvName(String value) {
        this.carProvName = value;
    }

    /**
     * Gets the value of the carRemark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarRemark() {
        return carRemark;
    }

    /**
     * Sets the value of the carRemark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarRemark(String value) {
        this.carRemark = value;
    }

    /**
     * Gets the value of the carSEQ property.
     * 
     */
    public int getCarSEQ() {
        return carSEQ;
    }

    /**
     * Sets the value of the carSEQ property.
     * 
     */
    public void setCarSEQ(int value) {
        this.carSEQ = value;
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
     * Gets the value of the caseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseName() {
        return caseName;
    }

    /**
     * Sets the value of the caseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseName(String value) {
        this.caseName = value;
    }

    /**
     * Gets the value of the caseNo property.
     * 
     */
    public int getCaseNo() {
        return caseNo;
    }

    /**
     * Sets the value of the caseNo property.
     * 
     */
    public void setCaseNo(int value) {
        this.caseNo = value;
    }

    /**
     * Gets the value of the caseOff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseOff() {
        return caseOff;
    }

    /**
     * Sets the value of the caseOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseOff(String value) {
        this.caseOff = value;
    }

    /**
     * Gets the value of the caseY property.
     * 
     */
    public int getCaseY() {
        return caseY;
    }

    /**
     * Sets the value of the caseY property.
     * 
     */
    public void setCaseY(int value) {
        this.caseY = value;
    }

    /**
     * Gets the value of the charge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharge() {
        return charge;
    }

    /**
     * Sets the value of the charge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharge(String value) {
        this.charge = value;
    }

    /**
     * Gets the value of the fualName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFualName() {
        return fualName;
    }

    /**
     * Sets the value of the fualName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFualName(String value) {
        this.fualName = value;
    }

    /**
     * Gets the value of the happenAmp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHappenAmp() {
        return happenAmp;
    }

    /**
     * Sets the value of the happenAmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHappenAmp(String value) {
        this.happenAmp = value;
    }

    /**
     * Gets the value of the happenArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHappenArea() {
        return happenArea;
    }

    /**
     * Sets the value of the happenArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHappenArea(String value) {
        this.happenArea = value;
    }

    /**
     * Gets the value of the happenDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHappenDate() {
        return happenDate;
    }

    /**
     * Sets the value of the happenDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHappenDate(String value) {
        this.happenDate = value;
    }

    /**
     * Gets the value of the happenProv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHappenProv() {
        return happenProv;
    }

    /**
     * Sets the value of the happenProv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHappenProv(String value) {
        this.happenProv = value;
    }

    /**
     * Gets the value of the happenTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHappenTime() {
        return happenTime;
    }

    /**
     * Sets the value of the happenTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHappenTime(String value) {
        this.happenTime = value;
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
     * Gets the value of the police property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolice() {
        return police;
    }

    /**
     * Sets the value of the police property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolice(String value) {
        this.police = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition(String value) {
        this.position = value;
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
     * Gets the value of the untilDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUntilDate() {
        return untilDate;
    }

    /**
     * Sets the value of the untilDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUntilDate(String value) {
        this.untilDate = value;
    }

    /**
     * Gets the value of the untilTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUntilTime() {
        return untilTime;
    }

    /**
     * Sets the value of the untilTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUntilTime(String value) {
        this.untilTime = value;
    }

}
