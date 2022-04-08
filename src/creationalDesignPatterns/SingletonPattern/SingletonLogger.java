package creationalDesignPatterns.SingletonPattern;

public class SingletonLogger {
    //Eager initialization -> Object is preloaded
    //It is not Memory Efficient
    /*
    Way to create Eager initialization
    private static SingletonLogger instance = new SingletonLogger();
    */
    //Lazy Implementation -> Object is created when asked for
    private static SingletonLogger instance=null;

    private SingletonLogger(){}

    public static SingletonLogger getInstance(){
        if(instance==null){
            instance=new SingletonLogger();
        }
        return instance;
    }

    public void logMessageStart(){
        System.out.println("Start message Logged");
    }

    public void logMessageStop(){
        System.out.println("Stop message Logged");
    }
}
