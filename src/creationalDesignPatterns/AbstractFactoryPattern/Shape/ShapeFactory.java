package creationalDesignPatterns.AbstractFactoryPattern.Shape;

public class ShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("Rectangle"))
            return new Rectangle();
        else if(shapeType.equalsIgnoreCase("Circle"))
            return new Circle();
        return null;
    }
}