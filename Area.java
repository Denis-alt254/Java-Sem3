import java.util.Scanner; // Import the Scanner class

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter the radius of the circle: ");
            double radius = input.nextDouble();
            double area = Math.PI * Math.pow(radius, 2);
            System.out.println("The area of the circle is: " + area);
        } finally {
            input.close();
        }
    }
}