
package com.oracdgs9db.data;

import java.math.BigDecimal;
import java.sql.Blob;


/**
 *  oracdgs9DB.DatGroupC
 *  10/26/2555 14:17:40
 * 
 */
public class DatGroupC {

    private BigDecimal groupId;
    private String groupCode;
    private String groupDesc;
    private String groupMom;
    private String level;
    private Blob groupImg;
    private Blob groupImgO;
    private Blob groupImgS;

    public BigDecimal getGroupId() {
        return groupId;
    }

    public void setGroupId(BigDecimal groupId) {
        this.groupId = groupId;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public String getGroupDesc() {
        return groupDesc;
    }

    public void setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
    }

    public String getGroupMom() {
        return groupMom;
    }

    public void setGroupMom(String groupMom) {
        this.groupMom = groupMom;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Blob getGroupImg() {
        return groupImg;
    }

    public void setGroupImg(Blob groupImg) {
        this.groupImg = groupImg;
    }

    public Blob getGroupImgO() {
        return groupImgO;
    }

    public void setGroupImgO(Blob groupImgO) {
        this.groupImgO = groupImgO;
    }

    public Blob getGroupImgS() {
        return groupImgS;
    }

    public void setGroupImgS(Blob groupImgS) {
        this.groupImgS = groupImgS;
    }

}
