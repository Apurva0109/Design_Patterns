package structuralDesignPatterns.CompositePattern;

public class Robot implements Worker{
    private String name;
    private String department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    @Override
    public void performTask() {
        System.out.println(getClass().getSimpleName()+" is performing task");
    }
}

