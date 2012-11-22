
package th.vehicles.webservicelistvehicleservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setTicketList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setTicketList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accuseDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bookNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bookPre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brandCarCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brandDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carPlate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carPlate1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="carPlate2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pageNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="perID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provPlateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="refNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="staffName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setTicketList", namespace = "http://vehicles.th/", propOrder = {
    "accuseDesc",
    "bookNo",
    "bookPre",
    "brandCarCode",
    "brandDesc",
    "carPlate",
    "carPlate1",
    "carPlate2",
    "name",
    "occDate",
    "orderID",
    "orderName",
    "orderYear",
    "orgName",
    "pageNo",
    "perID",
    "provPlateCode",
    "refNo",
    "staffName"
})
public class SetTicketListType {

    protected String accuseDesc;
    protected String bookNo;
    protected String bookPre;
    protected String brandCarCode;
    protected String brandDesc;
    protected String carPlate;
    protected String carPlate1;
    protected String carPlate2;
    protected String name;
    protected String occDate;
    protected String orderID;
    protected String orderName;
    protected String orderYear;
    protected String orgName;
    protected String pageNo;
    protected String perID;
    protected String provPlateCode;
    protected String refNo;
    protected String staffName;

    /**
     * Gets the value of the accuseDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccuseDesc() {
        return accuseDesc;
    }

    /**
     * Sets the value of the accuseDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccuseDesc(String value) {
        this.accuseDesc = value;
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
     * Gets the value of the bookPre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookPre() {
        return bookPre;
    }

    /**
     * Sets the value of the bookPre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookPre(String value) {
        this.bookPre = value;
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
     * Gets the value of the brandDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandDesc() {
        return brandDesc;
    }

    /**
     * Sets the value of the brandDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandDesc(String value) {
        this.brandDesc = value;
    }

    /**
     * Gets the value of the carPlate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarPlate() {
        return carPlate;
    }

    /**
     * Sets the value of the carPlate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarPlate(String value) {
        this.carPlate = value;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Gets the value of the orderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderID() {
        return orderID;
    }

    /**
     * Sets the value of the orderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderID(String value) {
        this.orderID = value;
    }

    /**
     * Gets the value of the orderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderName() {
        return orderName;
    }

    /**
     * Sets the value of the orderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderName(String value) {
        this.orderName = value;
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
     * Gets the value of the perID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerID() {
        return perID;
    }

    /**
     * Sets the value of the perID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerID(String value) {
        this.perID = value;
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
     * Gets the value of the refNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefNo() {
        return refNo;
    }

    /**
     * Sets the value of the refNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefNo(String value) {
        this.refNo = value;
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

}
