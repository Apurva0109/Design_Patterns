package creationalDesignPatterns.BuilderPattern.Employee;

public class Employee {
    private int id;
    private String name;
    private String address;
    private double salary;

    public Employee(){
    }

    public Employee setId(int id) {
        this.id = id;
        return this;
    }

    public Employee withName(String name) {
        this.name = name;
        return this;
    }

    public Employee setAddress(String address) {
        this.address = address;
        return this;
    }

    public Employee setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    public Employee build(){
        return this;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}
