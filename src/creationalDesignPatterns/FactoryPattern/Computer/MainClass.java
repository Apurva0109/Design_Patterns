package creationalDesignPatterns.FactoryPattern.Computer;

import java.awt.color.CMMException;

public class MainClass {
    public static void main(String[] args){
        ComputerFactory computerFactory = new ComputerFactory();
        Computer computer1 = computerFactory.getComputer("Phone");
        computer1.compute();

        Computer computer2= computerFactory.getComputer("Laptop");
        computer2.compute();

        Computer computer3=computerFactory.getComputer("SmartTv");
        computer3.compute();
    }
}
