
package com.oracdgs9db.data;

import java.util.Date;


/**
 *  oracdgs9DB.DatSoi
 *  10/26/2555 14:17:40
 * 
 */
public class DatSoi {

    private String soiCode;
    private String soiDesc1;
    private String soiDesc2;
    private String updId;
    private Date updDate;

    public String getSoiCode() {
        return soiCode;
    }

    public void setSoiCode(String soiCode) {
        this.soiCode = soiCode;
    }

    public String getSoiDesc1() {
        return soiDesc1;
    }

    public void setSoiDesc1(String soiDesc1) {
        this.soiDesc1 = soiDesc1;
    }

    public String getSoiDesc2() {
        return soiDesc2;
    }

    public void setSoiDesc2(String soiDesc2) {
        this.soiDesc2 = soiDesc2;
    }

    public String getUpdId() {
        return updId;
    }

    public void setUpdId(String updId) {
        this.updId = updId;
    }

    public Date getUpdDate() {
        return updDate;
    }

    public void setUpdDate(Date updDate) {
        this.updDate = updDate;
    }

}
