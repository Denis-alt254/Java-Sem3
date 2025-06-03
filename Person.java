
import java.util.Scanner;

public class Person{
        protected String name = "Denis";
        private int age;

        //getter
        public int getAge(){
            return age;
        }

        //setter
        public void setAge(int a){
            this.age = a;
        }

    }

    class Student extends Person{
        protected int roll_Number = 123;
        protected String course = "Software Engineering";

        void display(){
            setAge(21);
            getAge();
        }
        
    public static void main(String[] args){
        //object
        Student s1 = new Student();
        s1.display();
    }
    }

