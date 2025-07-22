import java.util.ArrayList;

class Animal{
    void makeSound(){
        System.out.println("Make Sound");
    }
}

class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Woof! Woof!");
    }
}

public class Main{
    static void oldMethod(){
        System.out.println("The method is outdated.");
    }
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound();
        oldMethod();

        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        System.out.println(cars);
    }
}