package model;

public class Student extends Person {
    public void verify(){
        System.out.println(get_name()+" "+"Verifying through email");
        set_verified(true);
    }    
}
