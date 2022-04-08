package creationalDesignPatterns.AbstractFactoryPattern.Shape;


public class ShapeFactoryPatternMain {
    public static void main(String[] args){
        AbstractFactory factory = FactoryProducer.getFactory(false);
        Shape rectangle= factory.getShape("Rectangle");
        rectangle.draw();
        Shape circle=factory.getShape("Circle");
        circle.draw();

        AbstractFactory factory1 = FactoryProducer.getFactory(true);
        Shape roundedRectangle= factory1.getShape("RoundedRectangle");
        roundedRectangle.draw();
        Shape roundedCircle= factory1.getShape("RoundedCircle");
        roundedCircle.draw();
    }
}

