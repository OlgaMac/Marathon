package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Anna", "Physik");
        Student student = new Student("Ivan", "Rose");
        teacher.printInfo();
        student.printInfo();
    }
}
