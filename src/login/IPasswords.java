
package login;

import java.util.HashMap;

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
