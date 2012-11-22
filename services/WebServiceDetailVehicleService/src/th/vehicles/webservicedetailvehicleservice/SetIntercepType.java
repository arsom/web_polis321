
package th.vehicles.webservicedetailvehicleservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setIntercep complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setIntercep">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="brandCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brandName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cancelCause" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cancelDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cancelFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cancelRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carAccMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carCC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carCriMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carKind" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carNumbody" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carNumeng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cause" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="defect" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exhibitMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="helmetMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="holdCause" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="holdDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="holdRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="informFName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="informPID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="informSName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="insureMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="licenceMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="manualMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newPlate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="notPayMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occFName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occFNameSDX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occPId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occSName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occSNameSDX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="offenderFName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="offenderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="offenderLName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="other" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="otherMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownFName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownFNameSDX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownPId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownSName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ownSNameSDX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pjvDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pjvNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pjvTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="place" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="plate1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="plate2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="plateMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="plateProv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="policName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seizeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="seizeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="staffName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="toolMT" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setIntercep", namespace = "http://vehicles.th/", propOrder = {
    "brandCode",
    "brandName",
    "cancelCause",
    "cancelDate",
    "cancelFlag",
    "cancelRemark",
    "carAccMT",
    "carCC",
    "carCriMT",
    "carKind",
    "carModel",
    "carNumbody",
    "carNumeng",
    "carType",
    "cause",
    "colorCode",
    "colorName",
    "defect",
    "exhibitMT",
    "helmetMT",
    "holdCause",
    "holdDate",
    "holdRemark",
    "informFName",
    "informPID",
    "informSName",
    "insureMT",
    "licenceMT",
    "manualMT",
    "newPlate",
    "notPayMT",
    "occFName",
    "occFNameSDX",
    "occPId",
    "occSName",
    "occSNameSDX",
    "offenderFName",
    "offenderID",
    "offenderLName",
    "orgCode",
    "other",
    "otherMT",
    "ownFName",
    "ownFNameSDX",
    "ownPId",
    "ownSName",
    "ownSNameSDX",
    "pjvDate",
    "pjvNo",
    "pjvTime",
    "place",
    "plate1",
    "plate2",
    "plateMT",
    "plateProv",
    "policName",
    "provName",
    "regDate",
    "seizeCode",
    "seizeType",
    "staffName",
    "taxMT",
    "toolMT",
    "typeName"
})
public class SetIntercepType {

    protected String brandCode;
    protected String brandName;
    protected String cancelCause;
    protected String cancelDate;
    protected String cancelFlag;
    protected String cancelRemark;
    protected String carAccMT;
    protected String carCC;
    protected String carCriMT;
    protected String carKind;
    protected String carModel;
    protected String carNumbody;
    protected String carNumeng;
    protected String carType;
    protected String cause;
    protected String colorCode;
    protected String colorName;
    protected String defect;
    protected String exhibitMT;
    protected String helmetMT;
    protected String holdCause;
    protected String holdDate;
    protected String holdRemark;
    protected String informFName;
    protected String informPID;
    protected String informSName;
    protected String insureMT;
    protected String licenceMT;
    protected String manualMT;
    protected String newPlate;
    protected String notPayMT;
    protected String occFName;
    protected String occFNameSDX;
    protected String occPId;
    protected String occSName;
    protected String occSNameSDX;
    protected String offenderFName;
    protected String offenderID;
    protected String offenderLName;
    protected String orgCode;
    protected String other;
    protected String otherMT;
    protected String ownFName;
    protected String ownFNameSDX;
    protected String ownPId;
    protected String ownSName;
    protected String ownSNameSDX;
    protected String pjvDate;
    protected String pjvNo;
    protected String pjvTime;
    protected String place;
    protected String plate1;
    protected String plate2;
    protected String plateMT;
    protected String plateProv;
    protected String policName;
    protected String provName;
    protected String regDate;
    protected String seizeCode;
    protected String seizeType;
    protected String staffName;
    protected String taxMT;
    protected String toolMT;
    protected String typeName;

    /**
     * Gets the value of the brandCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandCode() {
        return brandCode;
    }

    /**
     * Sets the value of the brandCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandCode(String value) {
        this.brandCode = value;
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
     * Gets the value of the cancelCause property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelCause() {
        return cancelCause;
    }

    /**
     * Sets the value of the cancelCause property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelCause(String value) {
        this.cancelCause = value;
    }

    /**
     * Gets the value of the cancelDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelDate() {
        return cancelDate;
    }

    /**
     * Sets the value of the cancelDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelDate(String value) {
        this.cancelDate = value;
    }

    /**
     * Gets the value of the cancelFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelFlag() {
        return cancelFlag;
    }

    /**
     * Sets the value of the cancelFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelFlag(String value) {
        this.cancelFlag = value;
    }

    /**
     * Gets the value of the cancelRemark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelRemark() {
        return cancelRemark;
    }

    /**
     * Sets the value of the cancelRemark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelRemark(String value) {
        this.cancelRemark = value;
    }

    /**
     * Gets the value of the carAccMT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarAccMT() {
        return carAccMT;
    }

    /**
     * Sets the value of the carAccMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarAccMT(String value) {
        this.carAccMT = value;
    }

    /**
     * Gets the value of the carCC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarCC() {
        return carCC;
    }

    /**
     * Sets the value of the carCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarCC(String value) {
        this.carCC = value;
    }

    /**
     * Gets the value of the carCriMT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarCriMT() {
        return carCriMT;
    }

    /**
     * Sets the value of the carCriMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarCriMT(String value) {
        this.carCriMT = value;
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
     * Gets the value of the cause property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCause() {
        return cause;
    }

    /**
     * Sets the value of the cause property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCause(String value) {
        this.cause = value;
    }

    /**
     * Gets the value of the colorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorCode() {
        return colorCode;
    }

    /**
     * Sets the value of the colorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorCode(String value) {
        this.colorCode = value;
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
     * Gets the value of the defect property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefect() {
        return defect;
    }

    /**
     * Sets the value of the defect property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefect(String value) {
        this.defect = value;
    }

    /**
     * Gets the value of the exhibitMT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExhibitMT() {
        return exhibitMT;
    }

    /**
     * Sets the value of the exhibitMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExhibitMT(String value) {
        this.exhibitMT = value;
    }

    /**
     * Gets the value of the helmetMT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHelmetMT() {
        return helmetMT;
    }

    /**
     * Sets the value of the helmetMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHelmetMT(String value) {
        this.helmetMT = value;
    }

    /**
     * Gets the value of the holdCause property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldCause() {
        return holdCause;
    }

    /**
     * Sets the value of the holdCause property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldCause(String value) {
        this.holdCause = value;
    }

    /**
     * Gets the value of the holdDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldDate() {
        return holdDate;
    }

    /**
     * Sets the value of the holdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldDate(String value) {
        this.holdDate = value;
    }

    /**
     * Gets the value of the holdRemark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldRemark() {
        return holdRemark;
    }

    /**
     * Sets the value of the holdRemark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldRemark(String value) {
        this.holdRemark = value;
    }

    /**
     * Gets the value of the informFName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformFName() {
        return informFName;
    }

    /**
     * Sets the value of the informFName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformFName(String value) {
        this.informFName = value;
    }

    /**
     * Gets the value of the informPID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformPID() {
        return informPID;
    }

    /**
     * Sets the value of the informPID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformPID(String value) {
        this.informPID = value;
    }

    /**
     * Gets the value of the informSName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformSName() {
        return informSName;
    }

    /**
     * Sets the value of the informSName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformSName(String value) {
        this.informSName = value;
    }

    /**
     * Gets the value of the insureMT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsureMT() {
        return insureMT;
    }

    /**
     * Sets the value of the insureMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsureMT(String value) {
        this.insureMT = value;
    }

    /**
     * Gets the value of the licenceMT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenceMT() {
        return licenceMT;
    }

    /**
     * Sets the value of the licenceMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenceMT(String value) {
        this.licenceMT = value;
    }

    /**
     * Gets the value of the manualMT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManualMT() {
        return manualMT;
    }

    /**
     * Sets the value of the manualMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManualMT(String value) {
        this.manualMT = value;
    }

    /**
     * Gets the value of the newPlate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPlate() {
        return newPlate;
    }

    /**
     * Sets the value of the newPlate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPlate(String value) {
        this.newPlate = value;
    }

    /**
     * Gets the value of the notPayMT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotPayMT() {
        return notPayMT;
    }

    /**
     * Sets the value of the notPayMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotPayMT(String value) {
        this.notPayMT = value;
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
     * Gets the value of the occFNameSDX property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccFNameSDX() {
        return occFNameSDX;
    }

    /**
     * Sets the value of the occFNameSDX property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccFNameSDX(String value) {
        this.occFNameSDX = value;
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
     * Gets the value of the occSName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccSName() {
        return occSName;
    }

    /**
     * Sets the value of the occSName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccSName(String value) {
        this.occSName = value;
    }

    /**
     * Gets the value of the occSNameSDX property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccSNameSDX() {
        return occSNameSDX;
    }

    /**
     * Sets the value of the occSNameSDX property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccSNameSDX(String value) {
        this.occSNameSDX = value;
    }

    /**
     * Gets the value of the offenderFName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffenderFName() {
        return offenderFName;
    }

    /**
     * Sets the value of the offenderFName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffenderFName(String value) {
        this.offenderFName = value;
    }

    /**
     * Gets the value of the offenderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffenderID() {
        return offenderID;
    }

    /**
     * Sets the value of the offenderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffenderID(String value) {
        this.offenderID = value;
    }

    /**
     * Gets the value of the offenderLName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffenderLName() {
        return offenderLName;
    }

    /**
     * Sets the value of the offenderLName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffenderLName(String value) {
        this.offenderLName = value;
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
     * Gets the value of the other property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOther(String value) {
        this.other = value;
    }

    /**
     * Gets the value of the otherMT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherMT() {
        return otherMT;
    }

    /**
     * Sets the value of the otherMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherMT(String value) {
        this.otherMT = value;
    }

    /**
     * Gets the value of the ownFName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnFName() {
        return ownFName;
    }

    /**
     * Sets the value of the ownFName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnFName(String value) {
        this.ownFName = value;
    }

    /**
     * Gets the value of the ownFNameSDX property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnFNameSDX() {
        return ownFNameSDX;
    }

    /**
     * Sets the value of the ownFNameSDX property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnFNameSDX(String value) {
        this.ownFNameSDX = value;
    }

    /**
     * Gets the value of the ownPId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnPId() {
        return ownPId;
    }

    /**
     * Sets the value of the ownPId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnPId(String value) {
        this.ownPId = value;
    }

    /**
     * Gets the value of the ownSName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnSName() {
        return ownSName;
    }

    /**
     * Sets the value of the ownSName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnSName(String value) {
        this.ownSName = value;
    }

    /**
     * Gets the value of the ownSNameSDX property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnSNameSDX() {
        return ownSNameSDX;
    }

    /**
     * Sets the value of the ownSNameSDX property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnSNameSDX(String value) {
        this.ownSNameSDX = value;
    }

    /**
     * Gets the value of the pjvDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPjvDate() {
        return pjvDate;
    }

    /**
     * Sets the value of the pjvDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPjvDate(String value) {
        this.pjvDate = value;
    }

    /**
     * Gets the value of the pjvNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPjvNo() {
        return pjvNo;
    }

    /**
     * Sets the value of the pjvNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPjvNo(String value) {
        this.pjvNo = value;
    }

    /**
     * Gets the value of the pjvTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPjvTime() {
        return pjvTime;
    }

    /**
     * Sets the value of the pjvTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPjvTime(String value) {
        this.pjvTime = value;
    }

    /**
     * Gets the value of the place property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlace() {
        return place;
    }

    /**
     * Sets the value of the place property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlace(String value) {
        this.place = value;
    }

    /**
     * Gets the value of the plate1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlate1() {
        return plate1;
    }

    /**
     * Sets the value of the plate1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlate1(String value) {
        this.plate1 = value;
    }

    /**
     * Gets the value of the plate2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlate2() {
        return plate2;
    }

    /**
     * Sets the value of the plate2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlate2(String value) {
        this.plate2 = value;
    }

    /**
     * Gets the value of the plateMT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlateMT() {
        return plateMT;
    }

    /**
     * Sets the value of the plateMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlateMT(String value) {
        this.plateMT = value;
    }

    /**
     * Gets the value of the plateProv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlateProv() {
        return plateProv;
    }

    /**
     * Sets the value of the plateProv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlateProv(String value) {
        this.plateProv = value;
    }

    /**
     * Gets the value of the policName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicName() {
        return policName;
    }

    /**
     * Sets the value of the policName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicName(String value) {
        this.policName = value;
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
     * Gets the value of the seizeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeizeCode() {
        return seizeCode;
    }

    /**
     * Sets the value of the seizeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeizeCode(String value) {
        this.seizeCode = value;
    }

    /**
     * Gets the value of the seizeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeizeType() {
        return seizeType;
    }

    /**
     * Sets the value of the seizeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeizeType(String value) {
        this.seizeType = value;
    }

    /**
     * Gets the value of the staffName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffName() {
        return staffName;
    }

    /**
     * Sets the value of the staffName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffName(String value) {
        this.staffName = value;
    }

    /**
     * Gets the value of the taxMT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxMT() {
        return taxMT;
    }

    /**
     * Sets the value of the taxMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxMT(String value) {
        this.taxMT = value;
    }

    /**
     * Gets the value of the toolMT property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToolMT() {
        return toolMT;
    }

    /**
     * Sets the value of the toolMT property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToolMT(String value) {
        this.toolMT = value;
    }

    /**
     * Gets the value of the typeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * Sets the value of the typeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeName(String value) {
        this.typeName = value;
    }

}
