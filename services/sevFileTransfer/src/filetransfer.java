import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.*;
import java.util.*;
import oracle.jdbc.*;
import oracle.sql.*;
import org.hibernate.*;

import org.apache.commons.io.IOUtils;
import org.springframework.mail.javamail.ConfigurableMimeFileTypeMap;
import org.springframework.web.multipart.MultipartFile;

import com.activegrid.runtime.AGRuntime;
import com.wavemaker.runtime.server.DownloadResponse;
import com.wavemaker.runtime.server.ParamName;
import com.wavemaker.runtime.RuntimeAccess;
import com.oracdgs9db.Oracdgs9DB;
import com.oracdgs9db.data.DatGroupC;
import com.oracdgs9db.data.DatSourceC;

public class filetransfer{
    public DownloadResponse doDownload(@ParamName(name = "id") String id) throws IOException{
        DownloadResponse ret = new DownloadResponse();
        ConfigurableMimeFileTypeMap mimeFileTypeMap = new ConfigurableMimeFileTypeMap();

        Oracdgs9DB ft = (Oracdgs9DB)RuntimeAccess.getInstance().getService("oracdgs9DB");
        //Filedb filedb = (Filedb)RuntimeAccess.getInstance().getService("filedb");
        //ft.getImgSourceByCode(new BigDecimal(id));
        //ret.setContentType(mimeFileTypeMap.getContentType(image.getFilename()));
        //ret.setContents(new ByteArrayInputStream(image.getImagedata().getData()));
        //ret.setFileName(image.getFilename());
        return ret;
    }
    public DownloadResponse getPhoto(@ParamName(name = "id") String id, @ParamName(name = "action") String action, 
        @ParamName(name = "base") String base) throws Exception{
        Connection connection = null;
        byte[] imgData = null ;
        DownloadResponse ret = new DownloadResponse();
        try {
            Oracdgs9DB db = (Oracdgs9DB)RuntimeAccess.getInstance().getService("oracdgs9DB");
            db.begin();
            Session session = db.getDataServiceManager().getSession();
            
            connection = session.connection();
        
            String req = "";
            Blob img ;
            
            Statement stmt = connection.createStatement();
            
            // Query
            if(base.equals("DAT_GROUP_C")){
                req = "SELECT " + action + " FROM DAT_GROUP_C WHERE GROUP_CODE = '" + id + "'";
            }
            else{
                req = "SELECT " + action + " FROM DAT_SOURCE_C WHERE SOURCE_CODE = '" + id + "'";
            }
            
            SQLQuery query = session.createSQLQuery(req);
            
            ResultSet rset  = stmt.executeQuery(req);
            
            while (rset.next ()){    
              img = rset.getBlob(1);
              imgData = img.getBytes(1,(int)img.length());
            }
            
            rset.close();
            stmt.close();
            
            ret.setContents(new ByteArrayInputStream(imgData));
            ret.setContentType("image/png");
            ret.setFileName("name");
            
        } catch (Exception e) {
            // Could not connect to the database
        }
        return ret;
    }
}