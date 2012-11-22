
package com.oracdgs9db.data;

import java.util.Date;


/**
 *  oracdgs9DB.DatSuit
 *  10/26/2555 14:17:40
 * 
 */
public class DatSuit {

    private String suitCode;
    private String suitDesc;
    private String updId;
    private Date updDate;

    public String getSuitCode() {
        return suitCode;
    }

    public void setSuitCode(String suitCode) {
        this.suitCode = suitCode;
    }

    public String getSuitDesc() {
        return suitDesc;
    }

    public void setSuitDesc(String suitDesc) {
        this.suitDesc = suitDesc;
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
