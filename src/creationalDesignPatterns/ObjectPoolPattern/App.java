package creationalDesignPatterns.ObjectPoolPattern;

public class App {
    public static void main(String[] args){
        ObjectPool robotPool = new RobotsPool();
        Robot firstRobot = (Robot) robotPool.create();
        Robot secondRobot =(Robot) robotPool.create();

        robotPool.checkOut(firstRobot);

        Robot thirdRobot = (Robot) robotPool.checkIn();
    }
}
