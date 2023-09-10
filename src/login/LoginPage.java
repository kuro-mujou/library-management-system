
package login;

import java.util.HashMap;

public class LoginPage {
    HashMap<String,String> logininfo = new HashMap<String,String>();
    LoginPage(HashMap<String,String> loginInforOriginal)
    {
        logininfo =loginInforOriginal;
    }
}
