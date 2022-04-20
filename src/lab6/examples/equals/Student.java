package lab6.examples.equals;

import java.util.Objects;

public class Student extends Person{
    private String university;

    public Student(String university, String name) {
        super(name);
        this.university = university;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        System.out.println(getClass() + "  " + o.getClass());
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return university.equals(student.university);
    }

}
