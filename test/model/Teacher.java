package model;

public class Teacher extends Person {
    public void verify(){
        System.out.println(get_name()+ " " + "Verifying through phone");
        set_verified(true);
    }   
}
