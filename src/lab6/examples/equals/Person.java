package lab6.examples.equals;

import java.util.Objects;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o){
        if( this == o ) return true;
        if(o==null || getClass() != o.getClass()) return false;
        Person p = (Person)o;
        return Objects.equals(name, p.name);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Ion");
        Student s1 = new Student("U1", "Ion");

        System.out.println(p1.equals(s1));
        System.out.println(s1.equals(p1));
    }
}