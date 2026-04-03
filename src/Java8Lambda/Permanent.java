package Java8Lambda;

public class Permanent implements classthree,classtwo {
    public static void main(String[] args) {

        new Permanent().Run();

    }

    //So here we run like a overwrite method that will superimpose it to run both the classes.
    @Override
    public void Run() {
        classthree.super.Run();
        classtwo.super.Run();
    }
}
