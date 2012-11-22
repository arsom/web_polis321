
package com.oracdgs9db.data;



/**
 *  oracdgs9DB.DatQryLimit
 *  10/26/2555 14:17:40
 * 
 */
public class DatQryLimit {

    private DatQryLimitId id;
    private Long qryTot;

    public DatQryLimitId getId() {
        return id;
    }

    public void setId(DatQryLimitId id) {
        this.id = id;
    }

    public Long getQryTot() {
        return qryTot;
    }

    public void setQryTot(Long qryTot) {
        this.qryTot = qryTot;
    }

}
