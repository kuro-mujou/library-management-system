
package databaseClass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;

public class TheLoaiCRUD {
    SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-mm-dd");
    Connection conn = null;
    PreparedStatement sttm = null;
    public TheLoai  findTheLoaiById (int MaTheLoai)
    {
        ResultSet rs = null;
        Statement sttm =null;
        try {
            String sSQL ="select *from TheLoai where MaTheLoai="+MaTheLoai;
            
            conn = DatabaseConnect.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while(rs.next())
            {
                 TheLoai theloai = new TheLoai();
                 theloai.setMaTheLoai(rs.getInt(1));
                 theloai.setTenTheLoai(rs.getString(2));
             System.out.println("Nhaxuatban3");
                return theloai;
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
     
      public TheLoai  findTheLoaiByName (String TenTheLoai)
    {
        ResultSet rs = null;
        Statement sttm =null;
        try {
            String sSQL ="select *from TheLoai where TenTheLoai='"+TenTheLoai+"'";
            
            conn = DatabaseConnect.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while(rs.next())
            {
                 TheLoai theloai = new TheLoai();
                 theloai.setMaTheLoai(rs.getInt(1));
                 theloai.setTenTheLoai(rs.getString(2));
             System.out.println("Nhaxuatban3");
                return theloai;
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
