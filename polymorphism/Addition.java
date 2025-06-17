public class Addition
{
    void sum(int a, int b)
    {
            int c = a+b;
            System.out.print("Sum of two integers = "+c);
    }

    void sum(double a, double b)
    {
            double c = a+b;
            System.out.println("Sum of two double = "+c);
    }

    public static void main(String[] args)
    {
        Addition obj = new Addition();
        obj.sum(2.5, 3.5);
        obj.sum(3,4);

}
}

