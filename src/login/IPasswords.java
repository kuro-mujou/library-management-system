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
public class IPasswords {
    HashMap<String,String> logininfo = new HashMap <String,String>();
    IPasswords()
    {
       logininfo.put("User","123456");
       logininfo.put("tho","abc");
       logininfo.put("xuantho","123456a");
    }
    protected HashMap getLoginInfo()
    {
        return logininfo;
    }
}
