package creationalDesignPatterns.AbstractFactoryPattern.Shape;

public class RoundedCircle implements Shape{
    @Override
    public void draw() {
        System.out.println("Rounded Circle drawn");
    }
}
