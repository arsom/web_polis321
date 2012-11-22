
package com.oracdgs9db.data;

import java.io.Serializable;
import java.util.Date;


/**
 *  oracdgs9DB.DatQryNewLogTestId
 *  09/27/2555 16:51:59
 * 
 */
public class DatQryNewLogTestId
    implements Serializable
{

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

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof DatQryNewLogTestId)) {
            return false;
        }
        DatQryNewLogTestId other = ((DatQryNewLogTestId) o);
        if (this.qryLogId == null) {
            if (other.qryLogId!= null) {
                return false;
            }
        } else {
            if (!this.qryLogId.equals(other.qryLogId)) {
                return false;
            }
        }
        if (this.userId == null) {
            if (other.userId!= null) {
                return false;
            }
        } else {
            if (!this.userId.equals(other.userId)) {
                return false;
            }
        }
        if (this.orgCode == null) {
            if (other.orgCode!= null) {
                return false;
            }
        } else {
            if (!this.orgCode.equals(other.orgCode)) {
                return false;
            }
        }
        if (this.qryDate == null) {
            if (other.qryDate!= null) {
                return false;
            }
        } else {
            if (!this.qryDate.equals(other.qryDate)) {
                return false;
            }
        }
        if (this.seqNo == null) {
            if (other.seqNo!= null) {
                return false;
            }
        } else {
            if (!this.seqNo.equals(other.seqNo)) {
                return false;
            }
        }
        if (this.condition == null) {
            if (other.condition!= null) {
                return false;
            }
        } else {
            if (!this.condition.equals(other.condition)) {
                return false;
            }
        }
        if (this.conGroup == null) {
            if (other.conGroup!= null) {
                return false;
            }
        } else {
            if (!this.conGroup.equals(other.conGroup)) {
                return false;
            }
        }
        if (this.conSource == null) {
            if (other.conSource!= null) {
                return false;
            }
        } else {
            if (!this.conSource.equals(other.conSource)) {
                return false;
            }
        }
        if (this.ipAddr == null) {
            if (other.ipAddr!= null) {
                return false;
            }
        } else {
            if (!this.ipAddr.equals(other.ipAddr)) {
                return false;
            }
        }
        if (this.updDate == null) {
            if (other.updDate!= null) {
                return false;
            }
        } else {
            if (!this.updDate.equals(other.updDate)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int rtn = 17;
        rtn = (rtn* 37);
        if (this.qryLogId!= null) {
            rtn = (rtn + this.qryLogId.hashCode());
        }
        rtn = (rtn* 37);
        if (this.userId!= null) {
            rtn = (rtn + this.userId.hashCode());
        }
        rtn = (rtn* 37);
        if (this.orgCode!= null) {
            rtn = (rtn + this.orgCode.hashCode());
        }
        rtn = (rtn* 37);
        if (this.qryDate!= null) {
            rtn = (rtn + this.qryDate.hashCode());
        }
        rtn = (rtn* 37);
        if (this.seqNo!= null) {
            rtn = (rtn + this.seqNo.hashCode());
        }
        rtn = (rtn* 37);
        if (this.condition!= null) {
            rtn = (rtn + this.condition.hashCode());
        }
        rtn = (rtn* 37);
        if (this.conGroup!= null) {
            rtn = (rtn + this.conGroup.hashCode());
        }
        rtn = (rtn* 37);
        if (this.conSource!= null) {
            rtn = (rtn + this.conSource.hashCode());
        }
        rtn = (rtn* 37);
        if (this.ipAddr!= null) {
            rtn = (rtn + this.ipAddr.hashCode());
        }
        rtn = (rtn* 37);
        if (this.updDate!= null) {
            rtn = (rtn + this.updDate.hashCode());
        }
        return rtn;
    }

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
