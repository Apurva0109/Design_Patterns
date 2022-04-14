package structuralDesignPatterns.FacadePattern;

public class Computer implements Machine{
    @Override
    public void performOperation() {
        System.out.println("Computer performing operation");
    }
}
