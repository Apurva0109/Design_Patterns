package creationalDesignPatterns.AbstractFactoryPattern.Computer;

public class PortableFactory extends AbstractFactory{
    @Override
    Computer getComputer(String computerType) {
        if(computerType.equalsIgnoreCase("Phone"))
            return new Phone();
        else if(computerType.equalsIgnoreCase("Laptop"))
            return new Phone();
        return null;
    }
}
