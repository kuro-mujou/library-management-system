package databaseClass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class DocGiaCRUD
{
    SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-mm-dd");
    Connection conn = null;
    PreparedStatement sttm = null;
    
    
    public int add(DocGia user)
    {
        try
        {
            String sSQL = "insert into dbo.Users(userID,name,phone,address,email,gender)\n" +
                          "values (?,?,?,?,?,?);";

            conn = DatabaseConnect.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, user.getUserID());
            sttm.setString(2, user.getName());
            sttm.setString(3, user.getPhone());
            sttm.setString(4, user.getAdrress());
            sttm.setString(5, user.getEmail());
            sttm.setString(6, user.getGender());
            if (sttm.executeUpdate() > 0)
            {
               
                return 1;
            }

        } catch (Exception e)
        {
        }
        return -1;
    }
    
   public int update(DocGia user)
    {
        try
        {
            String sSQL = "update dbo.Users \n" +
            "set name=?,phone=?,address=?,email=?,gender=?\n" +
             "where userID,=?";
            conn = DatabaseConnect.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, user.getUserID());
            sttm.setString(2, user.getName());
            sttm.setString(3, user.getPhone());
            sttm.setString(4, user.getAdrress());
            sttm.setString(5, user.getEmail());
            sttm.setString(6, user.getGender());
            if (sttm.executeUpdate() > 0)
            {
            
                return 1;
            }

        } catch (Exception e)
        {
        }
        return -1;
    }

    public int delete(DocGia user)
    {
        try
        {
            String sSQL = "delete book where bookid=? ";

            conn = DatabaseConnect.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, user.getUserID());

            if (sttm.executeUpdate() > 0)
            {
                return 1;
            }

        } catch (Exception e)
        {
        }
        return -1;
    }

    public List<DocGia> getAll()
    {

        List<DocGia> ls = new ArrayList<>();
        ResultSet rs = null;
        Statement sttm = null;
        try
        {
     
            String sSQL = "select userID,name,phone,address,email,gender from Users ";
            conn = DatabaseConnect.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next())
            {
                DocGia user = new DocGia();
                user.setUserID(rs.getInt(1));
                user.setName(rs.getString(2));
                user.setPhone(rs.getString(3));
                user.setAdrress(rs.getString(4));
                user.setEmail(rs.getString(5));
                user.setGender(rs.getString(6));
                
                ls.add(user);

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
        return ls;
    }

    public DocGia findSachById(String UserID)
    {
        ResultSet rs = null;
        Statement sttm = null;
        try
        {
            String sSQL = "select userID,name,phone,address,email,gender from Users where userID=" + UserID;

            conn = DatabaseConnect.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next())
            {
                DocGia user = new DocGia();
                user.setUserID(rs.getInt(1));
                user.setName(rs.getString(2));
                user.setPhone(rs.getString(3));
                user.setAdrress(rs.getString(4));
                user.setEmail(rs.getString(5));
                user.setGender(rs.getString(6));
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
