package creationalDesignPatterns.AbstractFactoryPattern.Computer;

public class Laptop implements Computer {
    @Override
    public void compute() {
        System.out.println("Laptop compute");
    }
}
