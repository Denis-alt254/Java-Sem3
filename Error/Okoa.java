import java.util.Scanner;

class Jahazi extends Exception{
    Jahazi(String comment){
        super(comment);
    }

    static double balance;
    static void Check() throws Jahazi{
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your balance = ");
        balance = scanner.nextDouble();
        scanner.close();
    }
        public static void main(String[]args){
        try {
            Check();
            Jahazi okoa = new Jahazi("Not Eligible For Service");
            if(balance>5)
            throw okoa;
            else
            System.out.println("Eligible for Okoa Jahazi");
        } catch (Jahazi e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }
}
