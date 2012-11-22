
package com.oracdgs9db.data;

import java.io.Serializable;


/**
 *  oracdgs9DB.DatQryLog2551Id
 *  10/26/2555 14:17:40
 * 
 */
public class DatQryLog2551Id
    implements Serializable
{

    private String userId;
    private String orgCode;
    private String qryDate;
    private Long seqNo;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof DatQryLog2551Id)) {
            return false;
        }
        DatQryLog2551Id other = ((DatQryLog2551Id) o);
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

}
