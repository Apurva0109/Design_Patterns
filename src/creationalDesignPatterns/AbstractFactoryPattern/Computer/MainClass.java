package creationalDesignPatterns.AbstractFactoryPattern.Computer;

public class MainClass {
    public static void main(String[] args){
        AbstractFactory abstractFactory = FactoryProducer.getFactory(false);
        Computer computer = abstractFactory.getComputer("SmartTv");
        computer.compute();

        AbstractFactory abstractFactory1 =FactoryProducer.getFactory(true);
        Computer computer1=abstractFactory1.getComputer("Laptop");
        computer1.compute();
    }
}
