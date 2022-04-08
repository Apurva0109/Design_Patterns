package creationalDesignPatterns.FactoryPattern.OS;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

public class OSFactory {
    public OS getOs(String str){
        if(str.equalsIgnoreCase("Android"))
            return new Andriod();
        else if(str.equalsIgnoreCase("IOS"))
            return new IOS();
        else if(str.equalsIgnoreCase("Windows"))
            return new Windows();
        return null;
    }
}
