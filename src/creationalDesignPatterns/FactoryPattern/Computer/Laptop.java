package creationalDesignPatterns.FactoryPattern.Computer;

public class Laptop implements Computer{
    @Override
    public void compute() {
        System.out.println("Laptop compute");
    }
}
