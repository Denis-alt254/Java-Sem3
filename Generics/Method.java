public class Method {
    public static <T> void printArray(T[] array){
        for (T item: array){
            System.out.println(item);
        }
    }
    public static void main(String[] args) {
        String[] names = {"Doku", "Haaland", "Omar"};
        Integer[] marks = {56, 78, 65};

        printArray(names);
        printArray(marks);
    }
}