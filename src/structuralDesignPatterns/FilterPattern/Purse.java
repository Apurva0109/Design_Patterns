package structuralDesignPatterns.FilterPattern;

public class Purse extends Store {
    private Colour colour;

    public Purse(Colour colour){
        this.colour=colour;
    }

    @Override
    public Colour getColour() {
        //System.out.println("Colour of the Purse is "+colour);
        return colour;
    }
}
