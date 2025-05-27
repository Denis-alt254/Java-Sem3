
import java.util.Scanner;

public class Competence_Test {
    public static void main(String[] args){
        Scanner Test = new Scanner(System.in);
        System.out.println("Enter Outcome = ");

        char Outcome = Test.next().charAt(0);

        switch (Outcome) {
            case 'E':
            case 'e':
                System.out.println("Exceed Expecation");
                
                break;

            case 'M':
            case 'm':
                System.out.println("Meet Expectation");
                
                break;

            case 'A':
            case 'a':
                System.out.println("Aproaching Expecation");
                
                break;

            case 'B':
            case 'b':
                System.out.println("Below Expectation");
                
                break;
        
            default:System.out.println("Enter Valid Outcome!");
                break;
        }
        Test.close();
    }
}
