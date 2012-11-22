
package com.oracdgs9db.data;

import java.util.Date;


/**
 *  oracdgs9DB.DatQryNewLog
 *  10/26/2555 14:17:40
 * 
 */
public class DatQryNewLog {

    private Long qryLogId;
    private String userId;
    private String orgCode;
    private String qryDate;
    private Long seqNo;
    private String condition;
    private String conGroup;
    private String conSource;
    private String ipAddr;
    private Date updDate;

    public Long getQryLogId() {
        return qryLogId;
    }

    public void setQryLogId(Long qryLogId) {
        this.qryLogId = qryLogId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getQryDate() {
        return qryDate;
    }

    public void setQryDate(String qryDate) {
        this.qryDate = qryDate;
    }

    public Long getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(Long seqNo) {
        this.seqNo = seqNo;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getConGroup() {
        return conGroup;
    }

    public void setConGroup(String conGroup) {
        this.conGroup = conGroup;
    }

    public String getConSource() {
        return conSource;
    }

    public void setConSource(String conSource) {
        this.conSource = conSource;
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
