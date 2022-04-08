package creationalDesignPatterns.AbstractFactoryPattern.Shape;

public abstract class AbstractFactory {
    abstract Shape getShape(String shapeType);
}
