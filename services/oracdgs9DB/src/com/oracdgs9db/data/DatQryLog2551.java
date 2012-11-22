
package com.oracdgs9db.data;

import java.util.Date;


/**
 *  oracdgs9DB.DatQryLog2551
 *  10/26/2555 14:17:40
 * 
 */
public class DatQryLog2551 {

    private DatQryLog2551Id id;
    private String condition;
    private String sysDesc;
    private String conGroup;
    private String ipAddr;
    private Date updDate;

    public DatQryLog2551Id getId() {
        return id;
    }

    public void setId(DatQryLog2551Id id) {
        this.id = id;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getSysDesc() {
        return sysDesc;
    }

    public void setSysDesc(String sysDesc) {
        this.sysDesc = sysDesc;
    }

    public String getConGroup() {
        return conGroup;
    }

    public void setConGroup(String conGroup) {
        this.conGroup = conGroup;
    }

    public String getIpAddr() {
        return ipAddr;
    }

    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
    }

    public Date getUpdDate() {
        return updDate;
    }

    public void setUpdDate(Date updDate) {
        this.updDate = updDate;
    }

}
