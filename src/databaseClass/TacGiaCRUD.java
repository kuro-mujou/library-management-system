/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databaseClass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;

/**
 *
 * @author ADMIN
 */
public class TacGiaCRUD {
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-mm-dd");
    Connection conn = null;
    PreparedStatement sttm = null;
        public TacGia  findTacGiaById (int MaTacGia)
    {
        ResultSet rs = null;
        Statement sttm =null;
        try {
            String sSQL ="select *from TacGia where MaTacGia="+MaTacGia;
            
            conn = DatabaseConnect.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while(rs.next())
            {
                 TacGia tacgia = new TacGia();
                 tacgia.setMaTacGia(rs.getInt(1));
                 tacgia.setTenTacGia(rs.getString(2));
                 tacgia.setGhiChuTG(rs.getString(3));
                   System.out.println("Nhaxuatban1");
                return tacgia;
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