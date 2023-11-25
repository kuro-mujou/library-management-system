/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databaseClass;

/**
 *
 * @author LENOVO
 */
public class transactions {

    int transactionId;
    int startDay;
    int endDay;
    int quantity;
    int bookid;
    int userID;

    public transactions() {

    }
    public transactions(int transactionId, int startDay, int endDay, int quantity, int bookid, int userID) {
        this.transactionId = transactionId;
        this.startDay = startDay;
        this.endDay = endDay;
        this.quantity = quantity;
        this.bookid = bookid;
        this.userID = userID;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public int getStartDay() {
        return startDay;
    }

    public void setStartDay(int startDay) {
        this.startDay = startDay;
    }

    public int getEndDay() {
        return endDay;
    }

    public void setEndDay(int endDay) {
        this.endDay = endDay;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
