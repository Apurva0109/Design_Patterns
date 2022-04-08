package creationalDesignPatterns.FactoryPattern.OS;

public class ApplicationMain {
    public static void main(String[] args){
        OSFactory osFactory=new OSFactory();
        OS os1=osFactory.getOs("Android");
        os1.specs();

        OS os2=osFactory.getOs("IOS");
        os2.specs();

        OS os3=osFactory.getOs("windows");
        os3.specs();
    }
}
