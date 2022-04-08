package creationalDesignPatterns.AbstractFactoryPattern.Computer;

public abstract class AbstractFactory {
    abstract Computer getComputer(String computerType);
}
