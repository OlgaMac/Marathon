package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Elena", "Math");
        Student student = new Student("David");
        String mark = teacher.evaluate("David");
        System.out.println("Преподаватель " + teacher.getName() + " оценил студента с именем " + student.getName() +
                " по предмету " + teacher.getSubject() + " на оценку " + mark);
    }
}
