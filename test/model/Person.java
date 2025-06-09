package model;

import java.util.List;;

public abstract class Person {
    
    private String _name;
    private String _membership = "Bronze";

    public static List<Person> admins;
    private boolean _verified = false;

    public static void get_admins(){
        for (Person p1 : admins){
            System.out.println(p1.get_name()+ " " + p1.get_membership());
        }
    }

    public void set_verified(boolean verified){
        _verified = verified;
    }

    public boolean get_verified(){
        return _verified;
    }

    public void verify(){
        System.out.println("Verifying...");
        set_verified(true);
    }   

    public String toString(){
        return get_name()+ " " + get_membership();
    }

    public boolean equals(Person per2){
        if(get_name() == per2.get_name() && get_membership() == per2.get_membership()){
            return true;
        }else{
            return false;
        }
    }

    public Person(){

    }

    public Person(String name){
        set_name(name);
        get_name();
    }

    public Person(String name, String membership){
        set_name(name);
        get_name();
        set_membership(membership);
        get_membership();
    }

    public void set_name(String name){
        _name = name;
    }

    public String get_name(){
        return _name;
    }

    public void set_membership(String membership){
        _membership = membership;
    }

    public void set_membership(Membership membership){
        _membership = membership.name();
    }

    public enum Membership{
        Bronze, Silver, Gold;
    }

    public String get_membership(){
        return _membership;
    }

    public void sayHello(){
        System.out.println("Hello, my name is "+ _name);
    }
}
