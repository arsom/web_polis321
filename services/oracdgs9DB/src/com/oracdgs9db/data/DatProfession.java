
package com.oracdgs9db.data;

import java.util.Date;


/**
 *  oracdgs9DB.DatProfession
 *  10/26/2555 14:17:40
 * 
 */
public class DatProfession {

    private String profCode;
    private String profDesc;
    private String updId;
    private Date updDate;

    public String getProfCode() {
        return profCode;
    }

    public void setProfCode(String profCode) {
        this.profCode = profCode;
    }

    public String getProfDesc() {
        return profDesc;
    }

    public void setProfDesc(String profDesc) {
        this.profDesc = profDesc;
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
