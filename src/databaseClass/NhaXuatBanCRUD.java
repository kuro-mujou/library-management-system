package databaseClass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;

public class NhaXuatBanCRUD
{
    SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-mm-dd");
    Connection conn = null;
    PreparedStatement sttm = null;

    public NhaXuatBan findNhaXuatBanById(int MaNXB)
    {
        ResultSet rs = null;
        Statement sttm = null;
        try
        {
            String sSQL = "select *from NhaXuatBan where MaNXB=" + MaNXB;

            conn = DatabaseConnect.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next())
            {
                NhaXuatBan NXB = new NhaXuatBan();
                NXB.setMaNXB(rs.getInt(1));
                NXB.setTenNXB(rs.getString(2));
                NXB.setDiaChiNXB(rs.getString(3));
                NXB.setEmail(rs.getString(4));
                NXB.setThongTinNDD(rs.getString(5));
                System.out.println("Nhaxuatban");
                return NXB;
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

    public NhaXuatBan findNhaXuatBanByName(String TenNXB)
    {
        ResultSet rs = null;
        Statement sttm = null;
        try
        {
            String sSQL = "select *from NhaXuatBan where TenNXB='" + TenNXB + "'";

            conn = DatabaseConnect.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next())
            {
                NhaXuatBan NXB = new NhaXuatBan();
                NXB.setMaNXB(rs.getInt(1));
                NXB.setTenNXB(rs.getString(2));
                NXB.setDiaChiNXB(rs.getString(3));
                NXB.setEmail(rs.getString(4));
                NXB.setThongTinNDD(rs.getString(5));
                System.out.println("Nhaxuatban");
                return NXB;
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
