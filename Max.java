public class Max {
    int [] numbers = {23, 32, 12, 45, 26, 78};

    void max(){
        try {
            int maxi = numbers[0];

            //Arrange them first in ascendimg order
            for(int k = 0; k < numbers.length; k++){
                for(int m = 0; m < numbers.length; m++){
                    if(numbers[k]>numbers[m]){
                        int let = numbers[m];
                        numbers[m] = numbers[k];
                        numbers[k] = let;
                        
                        //Find maximum number
                        for(int l = 0; l < numbers.length; l++){
                            if(numbers[l] > maxi){
                                maxi = numbers[l];
                            }
                        }
                    }                    
                }
            }
            System.out.println("Maximum number: " + maxi);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Something went wrong: " + e.getMessage());
        }finally{
            System.out.println("Program completed.");
        }
    }

    public static void main(String [] args){
        Max checker = new Max();
        checker.max();
    }
}