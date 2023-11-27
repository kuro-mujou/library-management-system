/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databaseClass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LENOVO
 */
public class transactionsCRUD {

    static SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-mm-dd");
    static Connection conn = null;
    static PreparedStatement sttm = null;

    public List<transactions> getAllTransactions() {
        ResultSet rs = null;
        Statement sttm = null;
        List<transactions> transactions = new ArrayList();
        try {
            String sSQL = "SELECT * FROM transactions";
            
            conn = DatabaseConnect.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                transactions trans = new transactions();
                trans.setTransactionId(rs.getInt("transactionId"));
                trans.setStartDay(rs.getInt("startDay"));
                trans.setEndDay(rs.getInt("endDay"));
                trans.setQuantity(rs.getInt("quantity"));
                trans.setBookid(rs.getInt("bookid"));
                trans.setUserID(rs.getInt("userID"));
                transactions.add(trans);
            }
            return transactions;
        } catch (Exception e) {
            return transactions;
        } finally {

            try {
                rs.close();
                sttm.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(transactionsCRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public transactions getTransactionsByID(int id) {
        ResultSet rs = null;
        Statement sttm = null;
        transactions trans = new transactions();
        try {
            String sSQL = "SELECT * FROM transactions WHERE transactionId = " + id;

            conn = DatabaseConnect.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                trans.setTransactionId(rs.getInt("transactionId"));
                trans.setStartDay(rs.getInt("startDay"));
                trans.setEndDay(rs.getInt("endDay"));
                trans.setQuantity(rs.getInt("quantity"));
                trans.setBookid(rs.getInt("bookid"));
                trans.setUserID(rs.getInt("userID"));
            }
            return trans;
        } catch (Exception e) {
            return trans;
        } finally {

            try {
                rs.close();
                sttm.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(transactionsCRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public int getIdTransactions() {

        ResultSet rs = null;
        Statement sttm = null;
        try {
            String sSQL = "SELECT MAX(transactionId) as 'maxID' FROM transactions";

            conn = DatabaseConnect.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            int id = 0;
            while (rs.next()) {
                id = rs.getInt("maxID");
            }
            return id;
        } catch (Exception e) {
            return -1;
        } finally {

            try {
                rs.close();
                sttm.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(transactionsCRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public int CreateTransactions(transactions transactions) {
        try {
            String sSQL = "INSERT INTO transactions VALUES(?,?,?,?,?,?)";

            conn = DatabaseConnect.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, transactions.getTransactionId());
            sttm.setInt(2, transactions.getStartDay());
            sttm.setInt(3, transactions.getEndDay());
            sttm.setInt(4, transactions.getQuantity());
            sttm.setInt(5, transactions.getBookid());
            sttm.setInt(6, transactions.getUserID());

            if (sttm.executeUpdate() > 0) {
                return 1;
            }

        } catch (Exception e) {
        }
        return -1;
    }

    
    
  
    
}
