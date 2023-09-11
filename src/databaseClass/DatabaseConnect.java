/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databaseClass;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.*;
/**
 *
 * @author ADMIN
 */
public class DatabaseConnect {
    public static Connection getDBConnect()
    {
        var server = "DESKTOP-IPDB6V8\\THER";
        var user = "sa";
        var password ="123456";
        var db = "quanlythuvien";
        var port = 1433;
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser(user);
        ds.setPassword(password);
        ds.setDatabaseName(db);
        ds.setServerName(server);
        ds.setPortNumber(port);
        ds.setEncrypt(false);
        Connection conn =null;
         try {
            conn = ds.getConnection();
            System.out.println("okilaconde");
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
        }
         return null;
    }
}
