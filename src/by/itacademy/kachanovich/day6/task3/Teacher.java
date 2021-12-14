package by.itacademy.kachanovich.day6.task3;

import java.util.Objects;
import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student) {
        Random ran = new Random();
        int num = 2 + ran.nextInt(4);
        String numString = "";
        switch (num) {
            case 2: {
                numString = "неудовлетворительно";
                break;
            }
            case 3: {
                numString = "удовлетворительно";
                break;
            }
            case 4: {
                numString = "хорошо";
                break;
            }
            case 5: {
                numString = "отлично";
                break;
            }
        }
        System.out.printf("Преподаватель %s оценил студента с именем %s\n" +
                "по предмету %s на оценку %s.", this.getName(), student.getName(), this.getSubject(),numString);


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(name, teacher.name) && Objects.equals(subject, teacher.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subject);
    }
}
