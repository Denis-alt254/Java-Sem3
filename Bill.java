// //By Constructor
// import java.util.Scanner;

// public class Bill {
//     double units, standingCharge, total;
//     public Bill(double units, double standingCharge){
//         this.units = units;
//         this.standingCharge = standingCharge;
//     }
//     void compute(){
//         total = units*55 + standingCharge;
//         System.out.printf("Total Payable = %.2f", total);
//     }
//     public static void main(String[] args){
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter the units consumed = ");
//         double units = scanner.nextDouble();
//         System.out.println("Enter Standing Charge = ");
//         double standingCharge = scanner.nextDouble();
//         Bill obj = new Bill(units, standingCharge);
//         obj.compute();
//         scanner.close();
//     }
// }

//By Method
import java.util.Scanner;

public class Bill {
    double units, standingCharge, total;
    void compute(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the units consumed = ");
        double units = scanner.nextDouble();
        System.out.println("Enter Standing Charge = ");
        double standingCharge = scanner.nextDouble();
        total = units*55 + standingCharge;
        System.out.printf("Total Payable = %.2f", total);
        scanner.close();
    }
    public static void main(String[] args){
        Bill obj = new Bill();
        obj.compute();
        
    }
}

