public class MyThread implements Runnable{
    private int i;

    MyThread(){

    }

    public void run(){
        for (i = 0; i <= 5; i++){
            for(int j= 0; j<=3; j++){
            System.out.println(j + " In Thread " + i);
        }
        }
    }

    public static void main(String[] args){
        MyThread obj = new MyThread();
        obj.run();

        
    }
}
