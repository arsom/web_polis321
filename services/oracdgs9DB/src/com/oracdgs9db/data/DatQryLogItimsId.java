
package com.oracdgs9db.data;

import java.io.Serializable;
import java.util.Date;


/**
 *  oracdgs9DB.DatQryLogItimsId
 *  10/26/2555 14:17:40
 * 
 */
public class DatQryLogItimsId
    implements Serializable
{

    private String userId;
    private String orgCode;
    private String qryDate;
    private Long seqNo;
    private String condition;
    private String sysDesc;
    private String conGroup;
    private String ipAddr;
    private Date updDate;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof DatQryLogItimsId)) {
            return false;
        }
        DatQryLogItimsId other = ((DatQryLogItimsId) o);
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
        if (this.sysDesc == null) {
            if (other.sysDesc!= null) {
                return false;
            }
        } else {
            if (!this.sysDesc.equals(other.sysDesc)) {
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
        if (this.sysDesc!= null) {
            rtn = (rtn + this.sysDesc.hashCode());
        }
        rtn = (rtn* 37);
        if (this.conGroup!= null) {
            rtn = (rtn + this.conGroup.hashCode());
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
