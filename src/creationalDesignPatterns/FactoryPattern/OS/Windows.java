package creationalDesignPatterns.FactoryPattern.OS;

public class Windows implements OS{
    @Override
    public void specs() {
        System.out.println("Windows");
    }
}
