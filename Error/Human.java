import java.util.Scanner;

public class Human {
    int age,iob,currentyear;
    public class InnerHuman {
        int retirement;
    }
    public static void main(String[] args){
        Human human = new Human();
        Human.InnerHuman innerHuman = human.new InnerHuman();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year of birth = ");
        human.iob = scanner.nextInt();
        System.out.println("Enter current year = ");
        human.currentyear = scanner.nextInt();
        human.age = human.currentyear-human.iob;
        System.out.println("Your age is = "+ human.age);
        innerHuman.retirement = human.iob+60;
        System.out.println("Retirement is = "+ innerHuman.retirement);
        scanner.close();
    }
}
