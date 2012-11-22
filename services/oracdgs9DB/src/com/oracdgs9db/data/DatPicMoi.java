
package com.oracdgs9db.data;

import java.sql.Blob;


/**
 *  oracdgs9DB.DatPicMoi
 *  10/26/2555 14:17:40
 * 
 */
public class DatPicMoi {

    private String pid;
    private Blob picNo;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public Blob getPicNo() {
        return picNo;
    }

    public void setPicNo(Blob picNo) {
        this.picNo = picNo;
    }

}
