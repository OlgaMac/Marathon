package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;
    Random random = new Random();

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate( Student student) {
        int mark = random.nextInt(4) + 2;
        String note = "";
        if (mark == 2) {
            note = "Неудовлетворительнео";
        }
        if (mark == 3) {
            note = "Удовлетворительнео";
        }
        if (mark == 4) {
            note = "Хорошо";
        }
        if (mark == 5) {
            note = "Отлично";
        }
        System.out.println("Преподаватель " + this.name + " оценил студента с именем " + student.getName() +
                " по предмету " + this.subject + " на оценку " + note);
    }
}
