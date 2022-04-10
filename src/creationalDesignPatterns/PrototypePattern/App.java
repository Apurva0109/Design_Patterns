package creationalDesignPatterns.PrototypePattern;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args){
        List<String> features = new ArrayList<>();
        features.add("Start up");
        features.add("Perform action");
        features.add("Shut down");

        Component component= new Component();
        component.setName("Infrared Googles");
        component.setFunctionality("Read temperature temperature of an object");

        Robot robot = new Robot(1,features,component);
        Robot anotherRobot = robot.clone();

        System.out.println(robot.getID());
        System.out.println(robot.getFeatures());
        System.out.println(robot.getComponent());

        System.out.println(anotherRobot.getID());
        System.out.println(anotherRobot.getFeatures());
        System.out.println(anotherRobot.getComponent());
    }
}
