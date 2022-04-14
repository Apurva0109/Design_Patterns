package structuralDesignPatterns.DecoratePattern;

public class Navigation extends CarDecorator{
    public Navigation(Machine machine) {
        super(machine);
    }
    public String doOperation(){
        return machine.doOperation()+addNavigation();
    }

    private String addNavigation() {
        return "+ Navigation ";
    }
}
