/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

import java.util.HashMap;

/**
 *
 * @author ADMIN
 */
public class LoginPage {
    HashMap<String,String> logininfo = new HashMap<String,String>();
    LoginPage(HashMap<String,String> loginInforOriginal)
    {
        logininfo =loginInforOriginal;
    }
}
