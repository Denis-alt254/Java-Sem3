import java.util.Scanner;
public class Rank {
    public static void main(String[] args){
        Scanner Olympic = new Scanner(System.in);
        System.out.println("Enter rank = ");
        int rank;
        rank = Olympic.nextInt();

        switch (rank) {
            case 1:System.out.println("Amount = Ksh 1000000");
                
                break;
            case 2:System.out.println("Amount = Ksh 1000000");
                
                break;
            case 3:System.out.println("Amount = Ksh 1000000");
                
                break;
        
            default:System.out.println("Amount = Ksh 0");
                break;
        }
        Olympic.close();
    }
}
