
package com.oracdgs9db.data;

import java.math.BigDecimal;
import java.sql.Blob;


/**
 *  oracdgs9DB.DatSourceC
 *  10/26/2555 14:17:40
 * 
 */
public class DatSourceC {

    private BigDecimal sourceId;
    private String sourceCode;
    private String sourceDesc;
    private Blob sourceImg;
    private Blob sourceImgA;
    private Blob sourceImgO;

    public BigDecimal getSourceId() {
        return sourceId;
    }

    public void setSourceId(BigDecimal sourceId) {
        this.sourceId = sourceId;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public String getSourceDesc() {
        return sourceDesc;
    }

    public void setSourceDesc(String sourceDesc) {
        this.sourceDesc = sourceDesc;
    }

    public Blob getSourceImg() {
        return sourceImg;
    }

    public void setSourceImg(Blob sourceImg) {
        this.sourceImg = sourceImg;
    }

    public Blob getSourceImgA() {
        return sourceImgA;
    }

    public void setSourceImgA(Blob sourceImgA) {
        this.sourceImgA = sourceImgA;
    }

    public Blob getSourceImgO() {
        return sourceImgO;
    }

    public void setSourceImgO(Blob sourceImgO) {
        this.sourceImgO = sourceImgO;
    }

}
