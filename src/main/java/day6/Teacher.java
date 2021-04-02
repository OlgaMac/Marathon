package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String  subject;
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
    public String evaluate(String nameOfStudent){
        int mark;
       do {
           mark = random.nextInt(5);
           if (mark == 2) {
               return "неудовлетворительно";
           }
           if (mark == 3) {
               return "удовлетворительно";
           }
           if (mark == 4) {
               return "хорошо";
           }
           if (mark == 5) {
               return "отлично";
           }
       }while(mark < 2);
       return "nothing";
    }
}
