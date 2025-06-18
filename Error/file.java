import java.io.FileReader;

public class file{
    public static void main(String[] args){
        try {
           // file myFile = new file();
            FileReader fileReader = new FileReader("Error.txt");
            System.out.println("File opened successfully");
            fileReader.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("File not found "+e.getMessage());
        }finally{
            System.out.println("try catch is finished");
        }
    }
}