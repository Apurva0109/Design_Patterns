package structuralDesignPatterns.FacadePattern;

public class ApplicationMain {
    public static void main(String[] args){
        FacadeClass facadeClass=new FacadeClass();
        facadeClass.robotPerformOperation();
        facadeClass.computerPerformOperation();
    }
}
