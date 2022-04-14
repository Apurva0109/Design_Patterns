package structuralDesignPatterns.DecoratePattern;

public class Application {
    public static void main(String[] args){
        Machine machine=new ParkingAssistant(new Navigation(new Car()));
        System.out.println("First car features: "+machine.doOperation());

        Machine machine1=new Navigation(new Car());
        System.out.println("Second car features: "+machine1.doOperation());
    }
}
