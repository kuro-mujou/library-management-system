
package databaseClass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class sachCRUD {
    SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-mm-dd");
    Connection conn = null;
    PreparedStatement sttm = null;
    public int add (Sach sach)
    {
        try {
            String sSQL = "insert Sach(MaSach,TenSach,MaTacGia,MaTheLoai,MaNXB,Soluong,NamXB)"
                            + "values(?,?,?,?,?,?,?)";
            
            conn = DatabaseConnect.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, sach.getMaSach());
            sttm.setString(2, sach.getTenSach());
            sttm.setInt(3,sach.getMaTacGia().getMaTacGia());
            sttm.setInt(4,sach.getMaTheLoai().getMaTheLoai());
            sttm.setInt(5,sach.getMaNXB().getMaNXB());
            sttm.setInt(6,sach.getSoLuong());
            sttm.setInt(7,sach.getNamXB());
            System.out.println("abc:"
                    +sach.getMaTacGia().getMaTacGia());
            if(sttm.executeUpdate() > 0)
            {
                System.out.println("Add thanh cong!");
                return 1;
            }
                
        } catch (Exception e) {
        }
        return -1;
    }
    public int update (Sach sach)
    {
        try {
            String sSQL = "update Sach set TenSach=?,MaTacGia=?,MaTheLoai=?,MaNXB=?,SoLuong=?,NamXB=? where MaSach =?";
                   
            
            conn = DatabaseConnect.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, sach.getTenSach());
            sttm.setInt(2,sach.getMaTacGia().getMaTacGia());
            sttm.setInt(3,sach.getMaTheLoai().getMaTheLoai());
            sttm.setInt(4,sach.getMaNXB().getMaNXB());
            sttm.setInt(5,sach.getSoLuong());
            sttm.setInt(6,sach.getNamXB());
    
            sttm.setInt(7,sach.getMaSach());
            if(sttm.executeUpdate() > 0)
            {
                System.out.println("Update thanh cong!");
                return 1;
            }
                
        } catch (Exception e) {
        }
        return -1;
    }
    public int delete (Sach sach)
    {
        try {
            String sSQL = "delete Sach where MaSach =? ";
            
            conn = DatabaseConnect.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, sach.getMaSach());
  
            if(sttm.executeUpdate() > 0)
            {
                System.out.println("Delete thanh cong!");
                return 1;
            }
                
        } catch (Exception e) {
        }
        return -1;
    }
    public List<Sach> getAll ()
    {
        
        List<Sach> ls = new ArrayList<>();
        ResultSet rs = null;
        Statement sttm =null;
       try {
//            String sSQL = "select Sach.MaSach,TenSach,TenTacGia,TenTheLoai,TenNXB,SoLuong,NamXB from (((Sach inner join TacGia on Sach.MaTacGia=TacGia.MaTacGia)inner join TheLoai on Sach.MaTheLoai=TheLoai.MaTheLoai) inner join NhaXuatBan on Sach.MaNXB=NhaXuatBan.MaNXB )";
//                    String sSQL ="select Sach.MaSach,TenSach,MaTheLoai,MaNXB,SoLuong,NamXB from Sach";
String sSQL = "select Sach.MaSach,TenSach,Sach.MaTacGia,TenTacGia,Sach.MaTheLoai,TenTheLoai,Sach.MaNXB,TenNXB,SoLuong,NamXB from (((Sach inner join TacGia on Sach.MaTacGia=TacGia.MaTacGia)inner join TheLoai on Sach.MaTheLoai=TheLoai.MaTheLoai) inner join NhaXuatBan on Sach.MaNXB=NhaXuatBan.MaNXB )";
            conn = DatabaseConnect.getDBConnect();
            sttm = conn.createStatement();  
           rs = sttm.executeQuery(sSQL);
             while(rs.next())
            {
                Sach sach = new Sach();
//                sach.setMaSach(rs.getInt(1));
//                sach.setTenSach(rs.getString(2));
//                sach.setMaTacGia(new TacGia(rs.getInt(3),rs.getString(4)));
//                sach.setMaTheLoai(new TheLoai(rs.getInt(5),rs.getString(6)));
//                sach.setMaNXB(new NhaXuatBan(rs.getInt(7),rs.getString(8)));
//                sach.setSoLuong(rs.getInt(9));
//                sach.setNamXB(rs.getInt(10));
//                 Sach sach = new Sach();
                sach.setMaSach(rs.getInt(1));
                sach.setTenSach(rs.getString(2));
                sach.setMaTacGia(new TacGia(rs.getInt(3),rs.getString(4)));
                sach.setMaTheLoai(new TheLoai(rs.getInt(5),rs.getString(6)));
                sach.setMaNXB(new NhaXuatBan(rs.getInt(7),rs.getString(8)));
                sach.setSoLuong(rs.getInt(9));
                sach.setNamXB(rs.getInt(10));
                System.out.println(">>>>"+sach.getMaTacGia().getMaTacGia());
                System.out.println(">>>>"+sach.getMaNXB().getMaNXB());
                ls.add(sach);
                
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
        return ls;
    }
    
    
    public Sach  findSachById (int MaSach)
    {
        ResultSet rs = null;
        Statement sttm =null;
        try {
            String sSQL ="select Sach.MaSach,TenSach,TenTacGia,TenTheLoai,TenNXB,SoLuong,NamXB from (((Sach inner join TacGia on Sach.MaTacGia=TacGia.MaTacGia)inner join TheLoai on Sach.MaTheLoai=TheLoai.MaTheLoai) inner join NhaXuatBan on Sach.MaNXB=NhaXuatBan.MaNXB ) where MaSach="+MaSach;
            
            conn = DatabaseConnect.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while(rs.next())
            {
                Sach sach = new Sach();
                 sach.setMaSach(rs.getInt(1));
                sach.setTenSach(rs.getString(2));
                sach.setMaTacGia(new TacGia(rs.getString(3)));
                sach.setMaTheLoai(new TheLoai(rs.getString(4)));
                sach.setMaNXB(new NhaXuatBan(rs.getString(5)));
                sach.setSoLuong(rs.getInt(6));
                sach.setNamXB(rs.getInt(7));
                System.out.println("tim dc roi");
                return sach;
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
    public static void main(String[] args) {
        sachCRUD a= new sachCRUD();
        NhaXuatBan nhaXuatBan = new NhaXuatBan(1,"xb1");
        TacGia tacGia = new TacGia(1,"tacgia1");
        TheLoai theLoai = new TheLoai(1,"theloai1");
                
        
        Sach sach = new Sach(4,"update",nhaXuatBan,tacGia,theLoai,100,2003);
        
        
//        System.out.println(a.add(sach));
//        System.out.println(a.update(sach));

//            a.getAll();
//        a.findSachById (5);
            System.out.println(a.getAll());
    }
}
