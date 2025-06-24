package Polymorphism;

import java.util.Scanner;

public class Main implements Library{
    public void addBook(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the title of the book:");
        String book = scanner.nextLine();
        scanner.close();
        System.out.println("Book Title is "+book);
    }
    public void viewBooks(){
        addBook();
    }
    public static void main(String[] args){
        Main obj = new Main();
        obj.viewBooks();
    }
}
