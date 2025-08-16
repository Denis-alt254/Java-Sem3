public class EvenOROdd {
    int num = 4;

    void checkIfEven(){
        int result = num % 2;
        if (result == 0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
    }

    public static void main(String [] args){
        EvenOROdd checker = new EvenOROdd();
        checker.checkIfEven();
    }
}
