package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Elena", "Math");
        Student student = new Student("David");
        teacher.evaluate(student);
    }
}
