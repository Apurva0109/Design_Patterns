package creationalDesignPatterns.SingletonPattern;

public class AppMain {
    public static void main(String[] args){
        SingletonLogger singletonLogger = SingletonLogger.getInstance();
        singletonLogger.logMessageStart();
        singletonLogger.logMessageStop();
    }
}
