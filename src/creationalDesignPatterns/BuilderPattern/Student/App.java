package creationalDesignPatterns.BuilderPattern.Student;

public class App {
    public static void main(String[] args){
        Student apurva=new Student(1L,"Apurva","Navi Mumbai");
        Student apurvaKhude = new Student.Builder(2L)
                .withName("Apurva Khude")
                .withAddress("Kharghar")
                .build();
    }
}
