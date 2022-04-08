package creationalDesignPatterns.BuilderPattern.Employee;

public class EmployeeApplication {
    public static void main(String[] args){
        Employee employee = new Employee()
                .setId(1)
                .withName("Apurva")
                .setAddress("Navi Mumbai")
                .setSalary(600000)
                .build();
        System.out.println(employee);

        Employee employee1 = new Employee()
                .setId(2)
                .withName("Apurva")
                .build();
        System.out.println(employee1);
    }
}
