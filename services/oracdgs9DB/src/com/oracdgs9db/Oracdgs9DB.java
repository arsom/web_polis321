
package com.oracdgs9db;

import java.util.List;
import com.oracdgs9db.data.DatMatchSource;
import com.oracdgs9db.data.output.SelDatGroupCRtnType;
import com.oracdgs9db.data.output.SelStartAppRtnType;
import com.wavemaker.json.type.TypeDefinition;
import com.wavemaker.runtime.data.DataServiceManager;
import com.wavemaker.runtime.data.DataServiceManagerAccess;
import com.wavemaker.runtime.data.TaskManager;
import com.wavemaker.runtime.service.LiveDataService;
import com.wavemaker.runtime.service.PagingOptions;
import com.wavemaker.runtime.service.PropertyOptions;
import com.wavemaker.runtime.service.TypedServiceReturn;


/**
 *  Operations for service "oracdgs9DB"
 *  11/08/2555 19:08:44
 * 
 */
@SuppressWarnings("unchecked")
public class Oracdgs9DB
    implements DataServiceManagerAccess, LiveDataService
{

    private DataServiceManager dsMgr;
    private TaskManager taskMgr;

    public List<DatMatchSource> selDatMatchSourceByCode(String code, PagingOptions pagingOptions) {
        return ((List<DatMatchSource> ) dsMgr.invoke(taskMgr.getQueryTask(), (Oracdgs9DBConstants.selDatMatchSourceByCodeQueryName), code, pagingOptions));
    }

    public com.oracdgs9db.data.DatSuit getDatSuitById(String id, PagingOptions pagingOptions) {
        List<com.oracdgs9db.data.DatSuit> rtn = ((List<com.oracdgs9db.data.DatSuit> ) dsMgr.invoke(taskMgr.getQueryTask(), (Oracdgs9DBConstants.getDatSuitByIdQueryName), id, pagingOptions));
        if (rtn.isEmpty()) {
            return null;
        } else {
            return rtn.get(0);
        }
    }

    public List<SelDatGroupCRtnType> selDatGroupC(PagingOptions pagingOptions) {
        return ((List<SelDatGroupCRtnType> ) dsMgr.invoke(taskMgr.getQueryTask(), (Oracdgs9DBConstants.selDatGroupCQueryName), pagingOptions));
    }

    public List<SelStartAppRtnType> selStartApp(String user, PagingOptions pagingOptions) {
        return ((List<SelStartAppRtnType> ) dsMgr.invoke(taskMgr.getQueryTask(), (Oracdgs9DBConstants.selStartAppQueryName), user, pagingOptions));
    }

    public Object insert(Object o) {
        return dsMgr.invoke(taskMgr.getInsertTask(), o);
    }

    public TypedServiceReturn read(TypeDefinition rootType, Object o, PropertyOptions propertyOptions, PagingOptions pagingOptions) {
        return ((TypedServiceReturn) dsMgr.invoke(taskMgr.getReadTask(), rootType, o, propertyOptions, pagingOptions));
    }

    public Object update(Object o) {
        return dsMgr.invoke(taskMgr.getUpdateTask(), o);
    }

    public void delete(Object o) {
        dsMgr.invoke(taskMgr.getDeleteTask(), o);
    }

    public void begin() {
        dsMgr.begin();
    }

    public void commit() {
        dsMgr.commit();
    }

    public void rollback() {
        dsMgr.rollback();
    }

    public DataServiceManager getDataServiceManager() {
        return dsMgr;
    }

    public void setDataServiceManager(DataServiceManager dsMgr) {
        this.dsMgr = dsMgr;
    }

    public TaskManager getTaskManager() {
        return taskMgr;
    }

    public void setTaskManager(TaskManager taskMgr) {
        this.taskMgr = taskMgr;
    }

}
