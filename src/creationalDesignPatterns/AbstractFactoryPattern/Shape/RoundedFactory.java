package creationalDesignPatterns.AbstractFactoryPattern.Shape;

public class RoundedFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("RoundedRectangle"))
            return new RoundedRectangle();
        else if(shapeType.equalsIgnoreCase("RoundedCircle"))
            return new RoundedCircle();
        return null;
    }
}
