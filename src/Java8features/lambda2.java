package Java8features;


interface A2{
    void show(int i);
}

public class lambda2 {

    public static void main(String[] args) {
        //We can create a object of interface
        A2 obj = ( int i) -> System.out.println("Show printing of obj "+i);
        A2 obj2 = ( i) -> System.out.println("Show printing of obj "+i);
        obj2.show(5);
        obj.show(6);
    }
}
