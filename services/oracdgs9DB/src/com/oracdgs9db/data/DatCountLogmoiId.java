
package com.oracdgs9db.data;

import java.io.Serializable;


/**
 *  oracdgs9DB.DatCountLogmoiId
 *  10/26/2555 14:17:40
 * 
 */
public class DatCountLogmoiId
    implements Serializable
{

    private String userIs;
    private Long qryAmt;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof DatCountLogmoiId)) {
            return false;
        }
        DatCountLogmoiId other = ((DatCountLogmoiId) o);
        if (this.userIs == null) {
            if (other.userIs!= null) {
                return false;
            }
        } else {
            if (!this.userIs.equals(other.userIs)) {
                return false;
            }
        }
        if (this.qryAmt == null) {
            if (other.qryAmt!= null) {
                return false;
            }
        } else {
            if (!this.qryAmt.equals(other.qryAmt)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int rtn = 17;
        rtn = (rtn* 37);
        if (this.userIs!= null) {
            rtn = (rtn + this.userIs.hashCode());
        }
        rtn = (rtn* 37);
        if (this.qryAmt!= null) {
            rtn = (rtn + this.qryAmt.hashCode());
        }
        return rtn;
    }

    public String getUserIs() {
        return userIs;
    }

    public void setUserIs(String userIs) {
        this.userIs = userIs;
    }

    public Long getQryAmt() {
        return qryAmt;
    }

    public void setQryAmt(Long qryAmt) {
        this.qryAmt = qryAmt;
    }

}
