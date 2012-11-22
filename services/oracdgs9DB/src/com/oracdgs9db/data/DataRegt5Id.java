
package com.oracdgs9db.data;

import java.io.Serializable;


/**
 *  oracdgs9DB.DataRegt5Id
 *  10/26/2555 14:17:40
 * 
 */
public class DataRegt5Id
    implements Serializable
{

    private String rdlnnamt;
    private String rdlnname;
    private String provCode;
    private String provNamt;
    private String ampCode;
    private String ampNamt;
    private String tamCode;
    private String tamNamt;

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof DataRegt5Id)) {
            return false;
        }
        DataRegt5Id other = ((DataRegt5Id) o);
        if (this.rdlnnamt == null) {
            if (other.rdlnnamt!= null) {
                return false;
            }
        } else {
            if (!this.rdlnnamt.equals(other.rdlnnamt)) {
                return false;
            }
        }
        if (this.rdlnname == null) {
            if (other.rdlnname!= null) {
                return false;
            }
        } else {
            if (!this.rdlnname.equals(other.rdlnname)) {
                return false;
            }
        }
        if (this.provCode == null) {
            if (other.provCode!= null) {
                return false;
            }
        } else {
            if (!this.provCode.equals(other.provCode)) {
                return false;
            }
        }
        if (this.provNamt == null) {
            if (other.provNamt!= null) {
                return false;
            }
        } else {
            if (!this.provNamt.equals(other.provNamt)) {
                return false;
            }
        }
        if (this.ampCode == null) {
            if (other.ampCode!= null) {
                return false;
            }
        } else {
            if (!this.ampCode.equals(other.ampCode)) {
                return false;
            }
        }
        if (this.ampNamt == null) {
            if (other.ampNamt!= null) {
                return false;
            }
        } else {
            if (!this.ampNamt.equals(other.ampNamt)) {
                return false;
            }
        }
        if (this.tamCode == null) {
            if (other.tamCode!= null) {
                return false;
            }
        } else {
            if (!this.tamCode.equals(other.tamCode)) {
                return false;
            }
        }
        if (this.tamNamt == null) {
            if (other.tamNamt!= null) {
                return false;
            }
        } else {
            if (!this.tamNamt.equals(other.tamNamt)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int rtn = 17;
        rtn = (rtn* 37);
        if (this.rdlnnamt!= null) {
            rtn = (rtn + this.rdlnnamt.hashCode());
        }
        rtn = (rtn* 37);
        if (this.rdlnname!= null) {
            rtn = (rtn + this.rdlnname.hashCode());
        }
        rtn = (rtn* 37);
        if (this.provCode!= null) {
            rtn = (rtn + this.provCode.hashCode());
        }
        rtn = (rtn* 37);
        if (this.provNamt!= null) {
            rtn = (rtn + this.provNamt.hashCode());
        }
        rtn = (rtn* 37);
        if (this.ampCode!= null) {
            rtn = (rtn + this.ampCode.hashCode());
        }
        rtn = (rtn* 37);
        if (this.ampNamt!= null) {
            rtn = (rtn + this.ampNamt.hashCode());
        }
        rtn = (rtn* 37);
        if (this.tamCode!= null) {
            rtn = (rtn + this.tamCode.hashCode());
        }
        rtn = (rtn* 37);
        if (this.tamNamt!= null) {
            rtn = (rtn + this.tamNamt.hashCode());
        }
        return rtn;
    }

    public String getRdlnnamt() {
        return rdlnnamt;
    }

    public void setRdlnnamt(String rdlnnamt) {
        this.rdlnnamt = rdlnnamt;
    }

    public String getRdlnname() {
        return rdlnname;
    }

    public void setRdlnname(String rdlnname) {
        this.rdlnname = rdlnname;
    }

    public String getProvCode() {
        return provCode;
    }

    public void setProvCode(String provCode) {
        this.provCode = provCode;
    }

    public String getProvNamt() {
        return provNamt;
    }

    public void setProvNamt(String provNamt) {
        this.provNamt = provNamt;
    }

    public String getAmpCode() {
        return ampCode;
    }

    public void setAmpCode(String ampCode) {
        this.ampCode = ampCode;
    }

    public String getAmpNamt() {
        return ampNamt;
    }

    public void setAmpNamt(String ampNamt) {
        this.ampNamt = ampNamt;
    }

    public String getTamCode() {
        return tamCode;
    }

    public void setTamCode(String tamCode) {
        this.tamCode = tamCode;
    }

    public String getTamNamt() {
        return tamNamt;
    }

    public void setTamNamt(String tamNamt) {
        this.tamNamt = tamNamt;
    }

}
