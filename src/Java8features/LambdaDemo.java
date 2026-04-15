package Java8features;

interface A{
    void show();
}
/*
Here we have a scenario where the class are being used only once. Why to even use it once.
class implementation implements A{

    @Override
    public void show() {
        System.out.println("Show printing");
    }
}
*/


public class LambdaDemo {

    public static void main(String[] args) {
        //We can create a object of interface
        A obj = () -> System.out.println("Show printing of obj");
        obj.show();


    }
}
