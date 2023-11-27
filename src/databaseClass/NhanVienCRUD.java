package databaseClass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class NhanVienCRUD
{
    Connection conn = null;
    PreparedStatement sttm = null;

    public int update(NhanVien user)
    {
        try
        {
            String sSQL = "update dbo.Users \n"
                    + "set libID=?,name=?,phone=?,address=?,email=?,password=?,gender=?\n"
                    + "where libID=?";
            conn = DatabaseConnect.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, user.getTen());
            sttm.setString(2, user.getSoDienThoai());
            sttm.setString(3, user.getDiaChi());
            sttm.setString(4, user.getEmail());
            sttm.setString(5, user.getPassword());
            sttm.setString(6,user.getGioiTinh());
            sttm.setInt(7, user.getMaNhanVien());
            if (sttm.executeUpdate() > 0)
            {

                return 1;
            }

        } catch (Exception e)
        {
        }
        return -1;
    }
    public NhanVien findReaderById(int UserID)
    {
        ResultSet rs = null;
        Statement sttm = null;
        try
        {
            String sSQL = "select libID,name,phone,address,email,password,gender from Users where userID=" + UserID;

            conn = DatabaseConnect.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next())
            {
                NhanVien user = new NhanVien();
                user.setMaNhanVien(rs.getInt(1));
                user.setTen(rs.getString(2));
                user.setSoDienThoai(rs.getString(3));
                user.setDiaChi(rs.getString(4));
                user.setEmail(rs.getString(5));
                user.setPassword(rs.getString(6));
                user.setGioiTinh(rs.getString(7));
                return user;
            }

        } catch (Exception e)
        {
        } finally
        {
            try
            {
                rs.close();
                sttm.close();
                conn.close();
            } catch (Exception e)
            {
            }
        }
        return null;
    }
}
