///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package databaseClass;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// *
// * @author ADMIN
// */
//public class sachCRUD {
//    SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-mm-dd");
//    Connection conn = null;
//    PreparedStatement sttm = null;
//    public int add (Sach sach)
//    {
//        try {
//            String sSQL = "insert Sach(TenSach,MaTacGia,MaTheLoai,MaNXB,NamXB)"
//                            + "values(?,?,?,?,?)";
//            
//            conn = DatabaseConnect.getDBConnect();
//            sttm = conn.prepareStatement(sSQL);
////            sttm.setInt(1, sach.getMaSach());
//            sttm.setString(1, sach.getTenSach());
//            sttm.setInt(2,sach.getMaTacGia().getMaTacGia());
//            sttm.setInt(3,sach.getMaTheLoai().getMaTheLoai());
//            sttm.setInt(4,sach.getMaNXB().getMaNXB());
//            sttm.setInt(5,sach.getNamXB());
//            System.out.println("abc:"
//                    +sach.getMaTacGia().getMaTacGia());
//            if(sttm.executeUpdate() > 0)
//            {
//                System.out.println("Add thanh cong!");
//                return 1;
//            }
//                
//        } catch (Exception e) {
//        }
//        return -1;
//    }
//    public int update (Sach sach)
//    {
//        try {
//            String sSQL = "update Sach set TenSach=?,MaTacGia=?,MaTheLoai=?,MaNXB=?,NamXB=? where MaSach =?";
//                   
//            
//            conn = DatabaseConnect.getDBConnect();
//            sttm = conn.prepareStatement(sSQL);
//            sttm.setString(1, sach.getTenSach());
//            sttm.setInt(2,sach.getMaTacGia().getMaTacGia());
//            sttm.setInt(3,sach.getMaTheLoai().getMaTheLoai());
//            sttm.setInt(4,sach.getMaNXB().getMaNXB());
//            sttm.setInt(5,sach.getNamXB());
//            sttm.setInt(6,sach.getMaSach());
//            if(sttm.executeUpdate() > 0)
//            {
//                System.out.println("Update thanh cong!");
//                return 1;
//            }
//                
//        } catch (Exception e) {
//        }
//        return -1;
//    }
//    public int delete (Sach sach)
//    {
//        try {
//            String sSQL = "delete Sach where MaSach =? ";
//            
//            conn = DatabaseConnect.getDBConnect();
//            sttm = conn.prepareStatement(sSQL);
//            sttm.setInt(1, sach.getMaSach());
//  
//            if(sttm.executeUpdate() > 0)
//            {
//                System.out.println("Delete thanh cong!");
//                return 1;
//            }
//                
//        } catch (Exception e) {
//        }
//        return -1;
//    }
//    public List<Sach> getAll ()
//    {
//        
//        List<Sach> ls = new ArrayList<>();
//        ResultSet rs = null;
//        Statement sttm =null;
//        try {
//            String sSQL = "select *from Sach";
//            
//            conn = DatabaseConnect.getDBConnect();
//            sttm = conn.createStatement();
//            rs = sttm.executeQuery(sSQL);
//            while(rs.next())
//            {
//                Sach sach = new Sach();
//                sach.setMaSach(rs.getInt(1));
//                sach.setTenSach(rs.getString(2));
//                sach.setMaNXB(new NhaXuatBan(rs.getInt(3)));
//                sach.setMaTacGia(new TacGia(rs.getInt(4)));
//                sach.setMaTheLoai(new TheLoai(rs.getInt(5)));
//                sach.setNamXB(rs.getInt(6));
////                
////                System.out.println(sach.getMaNXB().getMaNXB());
//                ls.add(sach);
//            }
//               
//                
//        } catch (Exception e) {
//        }
//        finally {
//            try {
//                rs.close();
//                sttm.close();
//                conn.close();
//            } catch (Exception e) {
//            }
//        }
//        return ls;
//    }
//    
//    
//    public Sach  findTacGiaById (int MaSach)
//    {
//        ResultSet rs = null;
//        Statement sttm =null;
//        try {
//            String sSQL ="select *from Sach where MaSach="+MaSach;
//            
//            conn = DatabaseConnect.getDBConnect();
//            sttm = conn.createStatement();
//            rs = sttm.executeQuery(sSQL);
//            while(rs.next())
//            {
//                 Sach sach = new Sach();
//                 sach.setMaSach(rs.getInt(1));
//                sach.setTenSach(rs.getString(2));
//                sach.setMaNXB(new NhaXuatBan(rs.getInt(3)));
//                sach.setMaTacGia(new TacGia(rs.getInt(4)));
//                sach.setMaTheLoai(new TheLoai(rs.getInt(5)));
//                sach.setNamXB(rs.getInt(6));
//                return sach;
//            }
//                
//        } catch (Exception e) {
//        }
//        finally {
//            try {
//                rs.close();
//                sttm.close();
//                conn.close();
//            } catch (Exception e) {
//            }
//        }
//        return null;
//    }
//    public static void main(String[] args) {
//        sachCRUD a= new sachCRUD();
//        NhaXuatBan nhaXuatBan = new NhaXuatBan(1);
//        TacGia tacGia = new TacGia(1);
//        TheLoai theLoai = new TheLoai(1);
//                
//        
//        Sach sach = new Sach(4,"update",nhaXuatBan,tacGia,theLoai,2003);
//        
//        
//        
////        System.out.println(a.add(sach));
////        System.out.println(a.update(sach));
//
//  a.getAll();
//        a.findTacGiaById (5);
//    }
//}
