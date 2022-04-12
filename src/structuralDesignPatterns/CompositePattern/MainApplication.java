package structuralDesignPatterns.CompositePattern;

public class MainApplication {
    public static void main(String[] args){
        Human human = new Human();
        human.setName("Apurva");
        human.setDepartment("Development");

        Robot robot = new Robot();
        robot.setName("Murthi");
        robot.setDepartment("ML and AI");

        WorkManager workManager=new WorkManager();
        workManager.addWorker(human);
        workManager.addWorker(robot);

        System.out.println(workManager);

        System.out.println("\nAfter removing robot");
        workManager.removeWorker(robot);

        System.out.println(workManager);
    }
}
