
package com.oracdgs9db.data;

import java.io.Serializable;


/**
 *  oracdgs9DB.DatQryLimitId
 *  10/26/2555 14:17:40
 * 
 */
public class DatQryLimitId
    implements Serializable
{

    private String userId;
    private String qryDate;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof DatQryLimitId)) {
            return false;
        }
        DatQryLimitId other = ((DatQryLimitId) o);
        if (this.userId == null) {
            if (other.userId!= null) {
                return false;
            }
        } else {
            if (!this.userId.equals(other.userId)) {
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
        return true;
    }

    public int hashCode() {
        int rtn = 17;
        rtn = (rtn* 37);
        if (this.userId!= null) {
            rtn = (rtn + this.userId.hashCode());
        }
        rtn = (rtn* 37);
        if (this.qryDate!= null) {
            rtn = (rtn + this.qryDate.hashCode());
        }
        return rtn;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getQryDate() {
        return qryDate;
    }

    public void setQryDate(String qryDate) {
        this.qryDate = qryDate;
    }

}
