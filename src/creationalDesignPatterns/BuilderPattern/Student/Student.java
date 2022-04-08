package creationalDesignPatterns.BuilderPattern.Student;

public class Student {
    private Long id;
    private String name;
    private String address;

    public Student(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public static class Builder{
        private Long id;
        private String name;
        private String address;

        public Builder(Long id) {
            this.id = id;
        }

        public Builder withId(Long id) {
            this.id = id;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withAddress(String address) {
            this.address = address;
            return this;
        }

        public Student build(){
            Student student=new Student();
            student.id=this.id;
            student.name=this.name;
            student.address=this.address;
            return student;
        }
    }

    private Student() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
