public class Main extends Thread{
    public String _task;

    Main(String task){
        this._task = task;
    }

    public void run(){
        System.out.println(_task + " Is running.....");
    }

    public static void main(String[] args){
        Main bse = new Main("Process 1");

        bse.run();
    }
}