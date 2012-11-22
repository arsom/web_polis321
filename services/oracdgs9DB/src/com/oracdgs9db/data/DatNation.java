
package com.oracdgs9db.data;

import java.util.Date;


/**
 *  oracdgs9DB.DatNation
 *  10/26/2555 14:17:40
 * 
 */
public class DatNation {

    private String natCode;
    private String natEng;
    private String natThai;
    private String updId;
    private Date updDate;

    public String getNatCode() {
        return natCode;
    }

    public void setNatCode(String natCode) {
        this.natCode = natCode;
    }

    public String getNatEng() {
        return natEng;
    }

    public void setNatEng(String natEng) {
        this.natEng = natEng;
    }

    public String getNatThai() {
        return natThai;
    }

    public void setNatThai(String natThai) {
        this.natThai = natThai;
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
