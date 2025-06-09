package app;

import java.util.ArrayList;

import model.Person;
import model.Student;
import model.Teacher;

public class Main {
    public static void main(String[] args){
        Student s = new Student();
        s.set_name("Denis");
        Teacher t = new Teacher();
        t.set_name("Paul");
        Person.admins = new ArrayList<Person>();
        Person.admins.add(s);
        Person.admins.add(t);

        for (Person p: Person.admins){
            p.verify();
            System.out.println(p.get_verified());
        }
    }
    
}