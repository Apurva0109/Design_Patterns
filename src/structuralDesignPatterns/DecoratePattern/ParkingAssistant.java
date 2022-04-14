package structuralDesignPatterns.DecoratePattern;

public class ParkingAssistant extends CarDecorator{
    public ParkingAssistant(Machine machine) {
        super(machine);
    }
    public String doOperation(){
        return machine.doOperation()+ addParkingAssistant();
    }

    private String addParkingAssistant() {
        return "+ Parking assistant ";
    }
}
