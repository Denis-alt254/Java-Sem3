
import java.util.Scanner;

public class Code {
    public static void main(String[] args){
        Scanner BSE = new Scanner(System.in);
        System.out.println("Enter code = ");
        
        char code = BSE.next().charAt(0);

        switch (code) {
            case 'K':
            case 'k':System.out.println("Kenya-Highly Taleted Sportsmen");
                
                break;
            
            case 'U':
            case 'u':System.out.println("United-States good in short races");
                
                break;

            case 'I':
            case 'i':System.out.println("India-Sporting affected by their culture");
                
                break;

            case 'N':
            case 'n':System.out.println("Nigeria-Give a good attempt in short races");
                
                break;
        
            default:System.out.println("All other countries general performance is low.");
                break;
        }

        BSE.close();

    }
}
