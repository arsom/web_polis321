
package th.vehicles.webservicedetailvehicleservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for setByKeyTransport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="setByKeyTransport">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ampDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brandDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kindDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provBRDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provDESC2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provDESC3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="provDesc1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subKindDESC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transDESC1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transDESC2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trc01HOLDST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trc01NoteST" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trc01OccDD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trc01OccMM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trc01OccYYYY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trc01OffBr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trc01OffProv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trc01OwnAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trc01OwnDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trc01OwnName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trc01OwnName1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trc01OwnPId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trc01OwnZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trc01Plate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trc01PrevPlate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trc01RegDD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trc01RegMM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trc01RegYYYY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trc01TaxDD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trc01TaxMM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trc01TaxYYYY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trc06BrandCar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trc06ModelCar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trc06Numbody" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trc06Numeng" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trc06TypeTRC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="trc06TypeTRF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "setByKeyTransport", namespace = "http://vehicles.th/", propOrder = {
    "ampDESC",
    "brandDESC",
    "kindDESC",
    "provBRDESC",
    "provDESC2",
    "provDESC3",
    "provDesc1",
    "subKindDESC",
    "transDESC1",
    "transDESC2",
    "trc01HOLDST",
    "trc01NoteST",
    "trc01OccDD",
    "trc01OccMM",
    "trc01OccYYYY",
    "trc01OffBr",
    "trc01OffProv",
    "trc01OwnAddr",
    "trc01OwnDetail",
    "trc01OwnName",
    "trc01OwnName1",
    "trc01OwnPId",
    "trc01OwnZip",
    "trc01Plate",
    "trc01PrevPlate",
    "trc01RegDD",
    "trc01RegMM",
    "trc01RegYYYY",
    "trc01TaxDD",
    "trc01TaxMM",
    "trc01TaxYYYY",
    "trc06BrandCar",
    "trc06ModelCar",
    "trc06Numbody",
    "trc06Numeng",
    "trc06TypeTRC",
    "trc06TypeTRF"
})
public class SetByKeyTransportType {

    protected String ampDESC;
    protected String brandDESC;
    protected String kindDESC;
    protected String provBRDESC;
    protected String provDESC2;
    protected String provDESC3;
    protected String provDesc1;
    protected String subKindDESC;
    protected String transDESC1;
    protected String transDESC2;
    protected String trc01HOLDST;
    protected String trc01NoteST;
    protected String trc01OccDD;
    protected String trc01OccMM;
    protected String trc01OccYYYY;
    protected String trc01OffBr;
    protected String trc01OffProv;
    protected String trc01OwnAddr;
    protected String trc01OwnDetail;
    protected String trc01OwnName;
    protected String trc01OwnName1;
    protected String trc01OwnPId;
    protected String trc01OwnZip;
    protected String trc01Plate;
    protected String trc01PrevPlate;
    protected String trc01RegDD;
    protected String trc01RegMM;
    protected String trc01RegYYYY;
    protected String trc01TaxDD;
    protected String trc01TaxMM;
    protected String trc01TaxYYYY;
    protected String trc06BrandCar;
    protected String trc06ModelCar;
    protected String trc06Numbody;
    protected String trc06Numeng;
    protected String trc06TypeTRC;
    protected String trc06TypeTRF;

    /**
     * Gets the value of the ampDESC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmpDESC() {
        return ampDESC;
    }

    /**
     * Sets the value of the ampDESC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmpDESC(String value) {
        this.ampDESC = value;
    }

    /**
     * Gets the value of the brandDESC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandDESC() {
        return brandDESC;
    }

    /**
     * Sets the value of the brandDESC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandDESC(String value) {
        this.brandDESC = value;
    }

    /**
     * Gets the value of the kindDESC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKindDESC() {
        return kindDESC;
    }

    /**
     * Sets the value of the kindDESC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKindDESC(String value) {
        this.kindDESC = value;
    }

    /**
     * Gets the value of the provBRDESC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvBRDESC() {
        return provBRDESC;
    }

    /**
     * Sets the value of the provBRDESC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvBRDESC(String value) {
        this.provBRDESC = value;
    }

    /**
     * Gets the value of the provDESC2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvDESC2() {
        return provDESC2;
    }

    /**
     * Sets the value of the provDESC2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvDESC2(String value) {
        this.provDESC2 = value;
    }

    /**
     * Gets the value of the provDESC3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvDESC3() {
        return provDESC3;
    }

    /**
     * Sets the value of the provDESC3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvDESC3(String value) {
        this.provDESC3 = value;
    }

    /**
     * Gets the value of the provDesc1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvDesc1() {
        return provDesc1;
    }

    /**
     * Sets the value of the provDesc1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvDesc1(String value) {
        this.provDesc1 = value;
    }

    /**
     * Gets the value of the subKindDESC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubKindDESC() {
        return subKindDESC;
    }

    /**
     * Sets the value of the subKindDESC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubKindDESC(String value) {
        this.subKindDESC = value;
    }

    /**
     * Gets the value of the transDESC1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransDESC1() {
        return transDESC1;
    }

    /**
     * Sets the value of the transDESC1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransDESC1(String value) {
        this.transDESC1 = value;
    }

    /**
     * Gets the value of the transDESC2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransDESC2() {
        return transDESC2;
    }

    /**
     * Sets the value of the transDESC2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransDESC2(String value) {
        this.transDESC2 = value;
    }

    /**
     * Gets the value of the trc01HOLDST property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrc01HOLDST() {
        return trc01HOLDST;
    }

    /**
     * Sets the value of the trc01HOLDST property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrc01HOLDST(String value) {
        this.trc01HOLDST = value;
    }

    /**
     * Gets the value of the trc01NoteST property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrc01NoteST() {
        return trc01NoteST;
    }

    /**
     * Sets the value of the trc01NoteST property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrc01NoteST(String value) {
        this.trc01NoteST = value;
    }

    /**
     * Gets the value of the trc01OccDD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrc01OccDD() {
        return trc01OccDD;
    }

    /**
     * Sets the value of the trc01OccDD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrc01OccDD(String value) {
        this.trc01OccDD = value;
    }

    /**
     * Gets the value of the trc01OccMM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrc01OccMM() {
        return trc01OccMM;
    }

    /**
     * Sets the value of the trc01OccMM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrc01OccMM(String value) {
        this.trc01OccMM = value;
    }

    /**
     * Gets the value of the trc01OccYYYY property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrc01OccYYYY() {
        return trc01OccYYYY;
    }

    /**
     * Sets the value of the trc01OccYYYY property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrc01OccYYYY(String value) {
        this.trc01OccYYYY = value;
    }

    /**
     * Gets the value of the trc01OffBr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrc01OffBr() {
        return trc01OffBr;
    }

    /**
     * Sets the value of the trc01OffBr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrc01OffBr(String value) {
        this.trc01OffBr = value;
    }

    /**
     * Gets the value of the trc01OffProv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrc01OffProv() {
        return trc01OffProv;
    }

    /**
     * Sets the value of the trc01OffProv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrc01OffProv(String value) {
        this.trc01OffProv = value;
    }

    /**
     * Gets the value of the trc01OwnAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrc01OwnAddr() {
        return trc01OwnAddr;
    }

    /**
     * Sets the value of the trc01OwnAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrc01OwnAddr(String value) {
        this.trc01OwnAddr = value;
    }

    /**
     * Gets the value of the trc01OwnDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrc01OwnDetail() {
        return trc01OwnDetail;
    }

    /**
     * Sets the value of the trc01OwnDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrc01OwnDetail(String value) {
        this.trc01OwnDetail = value;
    }

    /**
     * Gets the value of the trc01OwnName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrc01OwnName() {
        return trc01OwnName;
    }

    /**
     * Sets the value of the trc01OwnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrc01OwnName(String value) {
        this.trc01OwnName = value;
    }

    /**
     * Gets the value of the trc01OwnName1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrc01OwnName1() {
        return trc01OwnName1;
    }

    /**
     * Sets the value of the trc01OwnName1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrc01OwnName1(String value) {
        this.trc01OwnName1 = value;
    }

    /**
     * Gets the value of the trc01OwnPId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrc01OwnPId() {
        return trc01OwnPId;
    }

    /**
     * Sets the value of the trc01OwnPId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrc01OwnPId(String value) {
        this.trc01OwnPId = value;
    }

    /**
     * Gets the value of the trc01OwnZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrc01OwnZip() {
        return trc01OwnZip;
    }

    /**
     * Sets the value of the trc01OwnZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrc01OwnZip(String value) {
        this.trc01OwnZip = value;
    }

    /**
     * Gets the value of the trc01Plate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrc01Plate() {
        return trc01Plate;
    }

    /**
     * Sets the value of the trc01Plate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrc01Plate(String value) {
        this.trc01Plate = value;
    }

    /**
     * Gets the value of the trc01PrevPlate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrc01PrevPlate() {
        return trc01PrevPlate;
    }

    /**
     * Sets the value of the trc01PrevPlate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrc01PrevPlate(String value) {
        this.trc01PrevPlate = value;
    }

    /**
     * Gets the value of the trc01RegDD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrc01RegDD() {
        return trc01RegDD;
    }

    /**
     * Sets the value of the trc01RegDD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrc01RegDD(String value) {
        this.trc01RegDD = value;
    }

    /**
     * Gets the value of the trc01RegMM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrc01RegMM() {
        return trc01RegMM;
    }

    /**
     * Sets the value of the trc01RegMM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrc01RegMM(String value) {
        this.trc01RegMM = value;
    }

    /**
     * Gets the value of the trc01RegYYYY property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrc01RegYYYY() {
        return trc01RegYYYY;
    }

    /**
     * Sets the value of the trc01RegYYYY property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrc01RegYYYY(String value) {
        this.trc01RegYYYY = value;
    }

    /**
     * Gets the value of the trc01TaxDD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrc01TaxDD() {
        return trc01TaxDD;
    }

    /**
     * Sets the value of the trc01TaxDD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrc01TaxDD(String value) {
        this.trc01TaxDD = value;
    }

    /**
     * Gets the value of the trc01TaxMM property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrc01TaxMM() {
        return trc01TaxMM;
    }

    /**
     * Sets the value of the trc01TaxMM property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrc01TaxMM(String value) {
        this.trc01TaxMM = value;
    }

    /**
     * Gets the value of the trc01TaxYYYY property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrc01TaxYYYY() {
        return trc01TaxYYYY;
    }

    /**
     * Sets the value of the trc01TaxYYYY property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrc01TaxYYYY(String value) {
        this.trc01TaxYYYY = value;
    }

    /**
     * Gets the value of the trc06BrandCar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrc06BrandCar() {
        return trc06BrandCar;
    }

    /**
     * Sets the value of the trc06BrandCar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrc06BrandCar(String value) {
        this.trc06BrandCar = value;
    }

    /**
     * Gets the value of the trc06ModelCar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrc06ModelCar() {
        return trc06ModelCar;
    }

    /**
     * Sets the value of the trc06ModelCar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrc06ModelCar(String value) {
        this.trc06ModelCar = value;
    }

    /**
     * Gets the value of the trc06Numbody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrc06Numbody() {
        return trc06Numbody;
    }

    /**
     * Sets the value of the trc06Numbody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrc06Numbody(String value) {
        this.trc06Numbody = value;
    }

    /**
     * Gets the value of the trc06Numeng property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrc06Numeng() {
        return trc06Numeng;
    }

    /**
     * Sets the value of the trc06Numeng property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrc06Numeng(String value) {
        this.trc06Numeng = value;
    }

    /**
     * Gets the value of the trc06TypeTRC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrc06TypeTRC() {
        return trc06TypeTRC;
    }

    /**
     * Sets the value of the trc06TypeTRC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrc06TypeTRC(String value) {
        this.trc06TypeTRC = value;
    }

    /**
     * Gets the value of the trc06TypeTRF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrc06TypeTRF() {
        return trc06TypeTRF;
    }

    /**
     * Sets the value of the trc06TypeTRF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrc06TypeTRF(String value) {
        this.trc06TypeTRF = value;
    }

}
