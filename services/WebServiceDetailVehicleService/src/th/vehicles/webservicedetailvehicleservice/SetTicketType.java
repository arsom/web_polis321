
package th.vehicles.webservicedetailvehicleservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setTicket complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setTicket">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accuse1Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accuseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acrossName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="allowDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ampName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bookNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bookPRE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brandCarCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brandName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carPlate1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carPlate2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colorCarCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="colorPlate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="licCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="licName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameShow" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occCrossCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occRoadCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occSoiCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pageNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perSumScore" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="polId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provPlateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provPlateName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roadName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="soiName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="stationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeCar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeCarCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setTicket", namespace = "http://vehicles.th/", propOrder = {
    "accuse1Code",
    "accuseName",
    "acrossName",
    "allowDate",
    "ampName",
    "bookNo",
    "bookPRE",
    "brandCarCode",
    "brandName",
    "carPlate1",
    "carPlate2",
    "colorCarCode",
    "colorName",
    "colorPlate",
    "flag",
    "licCode",
    "licName",
    "locCode",
    "locName",
    "nameShow",
    "occCrossCode",
    "occDate",
    "occRoadCode",
    "occSoiCode",
    "occTime",
    "orderId",
    "orderYear",
    "orgName",
    "pageNo",
    "perAddr",
    "perId",
    "perName",
    "perSumScore",
    "polId",
    "provName",
    "provPlateCode",
    "provPlateName",
    "roadName",
    "soiName",
    "stationCode",
    "typeCar",
    "typeCarCode"
})
public class SetTicketType {

    protected String accuse1Code;
    protected String accuseName;
    protected String acrossName;
    protected String allowDate;
    protected String ampName;
    protected String bookNo;
    protected String bookPRE;
    protected String brandCarCode;
    protected String brandName;
    protected String carPlate1;
    protected String carPlate2;
    protected String colorCarCode;
    protected String colorName;
    protected String colorPlate;
    protected String flag;
    protected String licCode;
    protected String licName;
    protected String locCode;
    protected String locName;
    protected String nameShow;
    protected String occCrossCode;
    protected String occDate;
    protected String occRoadCode;
    protected String occSoiCode;
    protected String occTime;
    protected String orderId;
    protected String orderYear;
    protected String orgName;
    protected String pageNo;
    protected String perAddr;
    protected String perId;
    protected String perName;
    protected int perSumScore;
    protected String polId;
    protected String provName;
    protected String provPlateCode;
    protected String provPlateName;
    protected String roadName;
    protected String soiName;
    protected String stationCode;
    protected String typeCar;
    protected String typeCarCode;

    /**
     * Gets the value of the accuse1Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccuse1Code() {
        return accuse1Code;
    }

    /**
     * Sets the value of the accuse1Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccuse1Code(String value) {
        this.accuse1Code = value;
    }

    /**
     * Gets the value of the accuseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccuseName() {
        return accuseName;
    }

    /**
     * Sets the value of the accuseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccuseName(String value) {
        this.accuseName = value;
    }

    /**
     * Gets the value of the acrossName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcrossName() {
        return acrossName;
    }

    /**
     * Sets the value of the acrossName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcrossName(String value) {
        this.acrossName = value;
    }

    /**
     * Gets the value of the allowDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowDate() {
        return allowDate;
    }

    /**
     * Sets the value of the allowDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowDate(String value) {
        this.allowDate = value;
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
     * Gets the value of the bookNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookNo() {
        return bookNo;
    }

    /**
     * Sets the value of the bookNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookNo(String value) {
        this.bookNo = value;
    }

    /**
     * Gets the value of the bookPRE property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookPRE() {
        return bookPRE;
    }

    /**
     * Sets the value of the bookPRE property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookPRE(String value) {
        this.bookPRE = value;
    }

    /**
     * Gets the value of the brandCarCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandCarCode() {
        return brandCarCode;
    }

    /**
     * Sets the value of the brandCarCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandCarCode(String value) {
        this.brandCarCode = value;
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
     * Gets the value of the colorCarCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorCarCode() {
        return colorCarCode;
    }

    /**
     * Sets the value of the colorCarCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorCarCode(String value) {
        this.colorCarCode = value;
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
     * Gets the value of the colorPlate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorPlate() {
        return colorPlate;
    }

    /**
     * Sets the value of the colorPlate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorPlate(String value) {
        this.colorPlate = value;
    }

    /**
     * Gets the value of the flag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlag() {
        return flag;
    }

    /**
     * Sets the value of the flag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlag(String value) {
        this.flag = value;
    }

    /**
     * Gets the value of the licCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicCode() {
        return licCode;
    }

    /**
     * Sets the value of the licCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicCode(String value) {
        this.licCode = value;
    }

    /**
     * Gets the value of the licName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicName() {
        return licName;
    }

    /**
     * Sets the value of the licName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicName(String value) {
        this.licName = value;
    }

    /**
     * Gets the value of the locCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocCode() {
        return locCode;
    }

    /**
     * Sets the value of the locCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocCode(String value) {
        this.locCode = value;
    }

    /**
     * Gets the value of the locName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocName() {
        return locName;
    }

    /**
     * Sets the value of the locName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocName(String value) {
        this.locName = value;
    }

    /**
     * Gets the value of the nameShow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameShow() {
        return nameShow;
    }

    /**
     * Sets the value of the nameShow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameShow(String value) {
        this.nameShow = value;
    }

    /**
     * Gets the value of the occCrossCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccCrossCode() {
        return occCrossCode;
    }

    /**
     * Sets the value of the occCrossCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccCrossCode(String value) {
        this.occCrossCode = value;
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
     * Gets the value of the occRoadCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccRoadCode() {
        return occRoadCode;
    }

    /**
     * Sets the value of the occRoadCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccRoadCode(String value) {
        this.occRoadCode = value;
    }

    /**
     * Gets the value of the occSoiCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccSoiCode() {
        return occSoiCode;
    }

    /**
     * Sets the value of the occSoiCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccSoiCode(String value) {
        this.occSoiCode = value;
    }

    /**
     * Gets the value of the occTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccTime() {
        return occTime;
    }

    /**
     * Sets the value of the occTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccTime(String value) {
        this.occTime = value;
    }

    /**
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderId(String value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the orderYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderYear() {
        return orderYear;
    }

    /**
     * Sets the value of the orderYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderYear(String value) {
        this.orderYear = value;
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
     * Gets the value of the pageNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPageNo() {
        return pageNo;
    }

    /**
     * Sets the value of the pageNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPageNo(String value) {
        this.pageNo = value;
    }

    /**
     * Gets the value of the perAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerAddr() {
        return perAddr;
    }

    /**
     * Sets the value of the perAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerAddr(String value) {
        this.perAddr = value;
    }

    /**
     * Gets the value of the perId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerId() {
        return perId;
    }

    /**
     * Sets the value of the perId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerId(String value) {
        this.perId = value;
    }

    /**
     * Gets the value of the perName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerName() {
        return perName;
    }

    /**
     * Sets the value of the perName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerName(String value) {
        this.perName = value;
    }

    /**
     * Gets the value of the perSumScore property.
     * 
     */
    public int getPerSumScore() {
        return perSumScore;
    }

    /**
     * Sets the value of the perSumScore property.
     * 
     */
    public void setPerSumScore(int value) {
        this.perSumScore = value;
    }

    /**
     * Gets the value of the polId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolId() {
        return polId;
    }

    /**
     * Sets the value of the polId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolId(String value) {
        this.polId = value;
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
     * Gets the value of the provPlateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvPlateCode() {
        return provPlateCode;
    }

    /**
     * Sets the value of the provPlateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvPlateCode(String value) {
        this.provPlateCode = value;
    }

    /**
     * Gets the value of the provPlateName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvPlateName() {
        return provPlateName;
    }

    /**
     * Sets the value of the provPlateName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvPlateName(String value) {
        this.provPlateName = value;
    }

    /**
     * Gets the value of the roadName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoadName() {
        return roadName;
    }

    /**
     * Sets the value of the roadName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoadName(String value) {
        this.roadName = value;
    }

    /**
     * Gets the value of the soiName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoiName() {
        return soiName;
    }

    /**
     * Sets the value of the soiName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoiName(String value) {
        this.soiName = value;
    }

    /**
     * Gets the value of the stationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationCode() {
        return stationCode;
    }

    /**
     * Sets the value of the stationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationCode(String value) {
        this.stationCode = value;
    }

    /**
     * Gets the value of the typeCar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCar() {
        return typeCar;
    }

    /**
     * Sets the value of the typeCar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeCar(String value) {
        this.typeCar = value;
    }

    /**
     * Gets the value of the typeCarCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCarCode() {
        return typeCarCode;
    }

    /**
     * Sets the value of the typeCarCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeCarCode(String value) {
        this.typeCarCode = value;
    }

}
