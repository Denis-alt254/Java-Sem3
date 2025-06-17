package Overriding;

public class Main {
    public static void main(String[] args){
        First Fobj = new First();
        Second obj = new Second();
        System.out.println("First class");
        Fobj.myFunction();
        Fobj.Verify();
        System.out.println("******************************");
        System.out.println("Second class");
        obj.myFunction();
        obj.Verify();
    }
}
