import java.util.Scanner;

public class Triangle {
    double base, height, ans;

        public Triangle(double base, double height){
            this.base = base;
            this.height = height;
        }

    void calculate(){
        ans = 0.5 * base * height;
        System.out.printf("Answer = %.2f",ans);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base = ");
        double base = scanner.nextDouble();
        System.out.println("Enter height = ");
        double height = scanner.nextDouble();

        Triangle obj = new Triangle(base, height);
        obj.calculate();

        scanner.close();

    }

}
