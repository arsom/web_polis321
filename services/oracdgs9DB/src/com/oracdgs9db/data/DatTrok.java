
package com.oracdgs9db.data;

import java.util.Date;


/**
 *  oracdgs9DB.DatTrok
 *  10/26/2555 14:17:40
 * 
 */
public class DatTrok {

    private String trokCode;
    private String trokDesc;
    private String updId;
    private Date updDate;

    public String getTrokCode() {
        return trokCode;
    }

    public void setTrokCode(String trokCode) {
        this.trokCode = trokCode;
    }

    public String getTrokDesc() {
        return trokDesc;
    }

    public void setTrokDesc(String trokDesc) {
        this.trokDesc = trokDesc;
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
