package structuralDesignPatterns.FacadePattern;

public class FacadeClass {
    private Robot robot;
    private Computer computer;
    FacadeClass(){
        robot=new Robot();
        computer=new Computer();
    }

    public void robotPerformOperation(){
        robot.performOperation();
    }

    public void computerPerformOperation(){
        computer.performOperation();
    }
}
