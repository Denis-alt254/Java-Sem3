import java.util.Scanner;

public class Implements implements Runnable{
    static String task;

    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your task");
        task = scanner.nextLine();

        System.out.println(task + " Is Running....");
        scanner.close();
    }

    public static void main(String[] args){
        Implements bse = new Implements();
        bse.run();
    }
}
