
package com.oracdgs9db.data;

import java.util.Date;


/**
 *  oracdgs9DB.DatChkqry
 *  10/26/2555 14:17:40
 * 
 */
public class DatChkqry {

    private DatChkqryId id;
    private String qryName;
    private String updId;
    private Date updDate;

    public DatChkqryId getId() {
        return id;
    }

    public void setId(DatChkqryId id) {
        this.id = id;
    }

    public String getQryName() {
        return qryName;
    }

    public void setQryName(String qryName) {
        this.qryName = qryName;
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
