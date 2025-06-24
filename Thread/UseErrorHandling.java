public class UseErrorHandling extends Thread{
    static String task;

    UseErrorHandling(String t){
        task = t;
    }
    public void run(){
        System.out.println(task+" Is Running....");
    }

    public static void main(String[] args){
        UseErrorHandling bse = new UseErrorHandling("Task 1");

        try {
            bse.run();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Something went wrong while executing "+task);
        }finally{
            System.out.println("Process completed.");
        }
    }
}
