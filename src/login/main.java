/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

/**
 *
 * @author ADMIN
 */
public class main {

    public static void main(String args[]) {
        
       IPasswords  idandPasswords = new IPasswords();
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPages( idandPasswords.getLoginInfo()).setVisible(true);
            }
        });
    }
}
