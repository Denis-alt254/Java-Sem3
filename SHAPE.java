import java.util.Scanner;
public class SHAPE
{
Scanner bse=new Scanner (System.in);
int base,height;
void compute()
{
System.out.println("Enter Base=");
base= bse.nextInt();
System.out.println("Enter Height=");
height= bse.nextInt();
}
}
class TRIANGLE extends SHAPE
{
double tri_area;
void AREA_TRIANGLE()
{
compute();
tri_area=0.5*base*height;
System.out.printf("Area Triangle=%.2f \n",tri_area);
}
}
class RECTANGLE extends SHAPE
{
double rectangle_area;
void AREA_RECTANGLE()
{
compute();
rectangle_area=base*height;
System.out.printf("Area Rectangle=%.2f \n",rectangle_area);
}
public static void main(String[] args)
{
TRIANGLE shape1=new TRIANGLE();
shape1.AREA_TRIANGLE();
RECTANGLE shape2=new RECTANGLE();
shape2.AREA_RECTANGLE();
}
}