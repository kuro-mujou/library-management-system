
package databaseClass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;

public class DocGiaCRUD {
    SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-mm-dd");
    Connection conn = null;
    PreparedStatement sttm = null;
    
    public DocGia FindDocGiaTheoTen(String tendocgia)
    {
        ResultSet rs = null;
        Statement sttm =null;
        try {
            String sSQL ="select *from DocGia where TenDocGia="+tendocgia;
            
            conn = DatabaseConnect.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while(rs.next())
            {
                DocGia docGia = new DocGia();
                docGia.setMaDocGia(rs.getInt(1));
                docGia.setTenDocGia(rs.getString(2));
                docGia.setDiaChiDG(rs.getString(3));
                docGia.setSoThe(rs.getInt(4));
                return docGia;
            }
                
        } catch (Exception e) {
            
        }
        finally {
            try {
                rs.close();
                sttm.close();
                conn.close();
            } catch (Exception e) {
            }
        }
        return null;
    }
    public DocGia FindDocGiaTheoID(int ID)
    {
        ResultSet rs = null;
        Statement sttm =null;
        try {
            String sSQL ="select *from DocGia where SoThe="+ID;
            
            conn = DatabaseConnect.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while(rs.next())
            {
                DocGia docGia = new DocGia();
                docGia.setMaDocGia(rs.getInt(1));
                docGia.setTenDocGia(rs.getString(2));
                docGia.setDiaChiDG(rs.getString(3));
                docGia.setSoThe(rs.getInt(4));
                return docGia;
            }
                
        } catch (Exception e) {
            
        }
        finally {
            try {
                rs.close();
                sttm.close();
                conn.close();
            } catch (Exception e) {
            }
        }
        return null;
    }
}
