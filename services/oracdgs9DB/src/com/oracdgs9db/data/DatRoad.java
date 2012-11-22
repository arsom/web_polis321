
package com.oracdgs9db.data;

import java.util.Date;


/**
 *  oracdgs9DB.DatRoad
 *  10/26/2555 14:17:40
 * 
 */
public class DatRoad {

    private String roadCode;
    private String roadDesc;
    private String updId;
    private Date updDate;

    public String getRoadCode() {
        return roadCode;
    }

    public void setRoadCode(String roadCode) {
        this.roadCode = roadCode;
    }

    public String getRoadDesc() {
        return roadDesc;
    }

    public void setRoadDesc(String roadDesc) {
        this.roadDesc = roadDesc;
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
