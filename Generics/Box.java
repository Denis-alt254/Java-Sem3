class MyClass<T>{
    T value;

    void set(T value){
        this.value = value;
    }

    T get(){
        return value;
    }
}

public class Box{
    public static void main(String[] args) {
        MyClass<String> mySring = new MyClass <>();
        mySring.set("Okay");
        System.out.println("My String: "+mySring.get());

        MyClass<Integer> myInt = new MyClass <>();
        myInt.set(23);
        System.out.println("My Integer: "+myInt.get());
    }
}