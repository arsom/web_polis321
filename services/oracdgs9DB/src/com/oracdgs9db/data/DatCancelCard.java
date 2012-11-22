
package com.oracdgs9db.data;

import java.util.Date;


/**
 *  oracdgs9DB.DatCancelCard
 *  10/26/2555 14:17:40
 * 
 */
public class DatCancelCard {

    private String cardCode;
    private String cardDesc;
    private String updId;
    private Date updDate;

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public String getCardDesc() {
        return cardDesc;
    }

    public void setCardDesc(String cardDesc) {
        this.cardDesc = cardDesc;
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
