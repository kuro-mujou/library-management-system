
package login;

import java.util.HashMap;

public class IPasswords {
    HashMap<String,String> logininfo = new HashMap <String,String>();
    public IPasswords()
    {
       logininfo.put("user","123456");
       logininfo.put("tho","abc");
       logininfo.put("xuantho","123456a");
    }
    public HashMap getLoginInfo()
    {
        return logininfo;
    }
}
