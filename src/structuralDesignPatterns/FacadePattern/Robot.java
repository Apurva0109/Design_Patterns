package structuralDesignPatterns.FacadePattern;

public class Robot implements Machine{
    @Override
    public void performOperation() {
        System.out.println("Robot performing operation");
    }
}
