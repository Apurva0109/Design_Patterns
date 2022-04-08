package creationalDesignPatterns.AbstractFactoryPattern.Computer;

public class Phone implements Computer {
    @Override
    public void compute() {
        System.out.println("Phone compute");
    }
}
