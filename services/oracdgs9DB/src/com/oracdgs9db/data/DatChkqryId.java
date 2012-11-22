
package com.oracdgs9db.data;

import java.io.Serializable;


/**
 *  oracdgs9DB.DatChkqryId
 *  10/26/2555 14:17:40
 * 
 */
public class DatChkqryId
    implements Serializable
{

    private String userId;
    private String qryPid;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof DatChkqryId)) {
            return false;
        }
        DatChkqryId other = ((DatChkqryId) o);
        if (this.userId == null) {
            if (other.userId!= null) {
                return false;
            }
        } else {
            if (!this.userId.equals(other.userId)) {
                return false;
            }
        }
        if (this.qryPid == null) {
            if (other.qryPid!= null) {
                return false;
            }
        } else {
            if (!this.qryPid.equals(other.qryPid)) {
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
        if (this.qryPid!= null) {
            rtn = (rtn + this.qryPid.hashCode());
        }
        return rtn;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getQryPid() {
        return qryPid;
    }

    public void setQryPid(String qryPid) {
        this.qryPid = qryPid;
    }

}
