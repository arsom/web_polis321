import com.wavemaker.runtime.RuntimeAccess;
import com.oracdgs9db.Oracdgs9DB;
import com.oracdgs9db.data.DatQryLogNew;
import com.oracdgs9db.data.DatQryLogNewId;
import com.wavemaker.runtime.server.ParamName;
import org.hibernate.*;
import java.sql.Timestamp;
import java.util.Date;

public class instoLognew extends com.wavemaker.runtime.javaservice.JavaServiceSuperClass {
    public void insertLognew(long logid, String userid, String orgcode, String qrydate, long seqno, 
        String condition, String group, String source, String ip){
        Oracdgs9DB oracDBService = (Oracdgs9DB)RuntimeAccess.getInstance().getService("oracdgs9DB");
        oracDBService.begin();
        DatQryLogNew lognew =  new DatQryLogNew();
        DatQryLogNewId bean =  new DatQryLogNewId();
    //    lognew.setQryLogId(logid);
        bean.setUserId(userid);
        bean.setOrgCode(orgcode);
        bean.setQryDate(qrydate);
        bean.setSeqNo(seqno);
        bean.setCondition(condition);
        bean.setQryGroup(group);
        bean.setQrySource(source);
        bean.setIpAddr(ip);
        bean.setUpdDate(new Timestamp(new Date().getTime()));
        
        lognew.setId(bean);
        
   //     log(INFO,lognew.getQryLogId().toString());
        
        Session session = oracDBService.getDataServiceManager().getSession();
        session.beginTransaction();
        
        session.save(lognew);
        session.getTransaction().commit();
        session.close();
    }
}
