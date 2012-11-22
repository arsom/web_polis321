
package com.oracdgs9db.data;

import java.util.Date;


/**
 *  oracdgs9DB.DatPatm
 *  10/26/2555 14:17:40
 * 
 */
public class DatPatm {

    private String patmCode;
    private String patmDesc;
    private String updId;
    private Date updDate;

    public String getPatmCode() {
        return patmCode;
    }

    public void setPatmCode(String patmCode) {
        this.patmCode = patmCode;
    }

    public String getPatmDesc() {
        return patmDesc;
    }

    public void setPatmDesc(String patmDesc) {
        this.patmDesc = patmDesc;
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
