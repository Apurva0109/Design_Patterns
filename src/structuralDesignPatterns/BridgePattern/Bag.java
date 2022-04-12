package structuralDesignPatterns.BridgePattern;

public class Bag extends Store{

    private Colour colour;

    public Bag(Colour colour){
        this.colour=colour;
    }
    @Override
    public Colour getColour() {
        System.out.println("Colour of the Bag is "+colour);
        return colour;
    }
}
