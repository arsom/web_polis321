
package com.oracdgs9db.data;

import java.math.BigDecimal;


/**
 *  oracdgs9DB.DatMatchSource
 *  10/26/2555 14:17:40
 * 
 */
public class DatMatchSource {

    private BigDecimal matchId;
    private String groupCode;
    private String sourceCode;

    public BigDecimal getMatchId() {
        return matchId;
    }

    public void setMatchId(BigDecimal matchId) {
        this.matchId = matchId;
    }

    public String getGroupCode() {
        return groupCode;
    }

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

}
