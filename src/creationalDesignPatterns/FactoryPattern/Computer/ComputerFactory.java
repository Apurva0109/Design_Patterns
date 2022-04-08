package creationalDesignPatterns.FactoryPattern.Computer;

public class ComputerFactory {
    public Computer getComputer(String str){
        if(str.equalsIgnoreCase("Laptop")){
            return new Laptop();
        }
        else if(str.equalsIgnoreCase("Phone")){
            return new Phone();
        }
        else if(str.equalsIgnoreCase("SmartTv")){
            return new SmartTv();
        }
        return null;
    }
}
