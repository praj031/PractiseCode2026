package OOPS.Polymorphisam;

public class Skills {

    public static void main(String[] args) {
        sum(1,2);
        sum(1,2, 3);
    }

    static void sum(int a, int b){
        int solution = a+b;
        System.out.println("Solution = "+solution);
    }

    static void sum(int a,int b, int c){
        int solution = a+b+c;
        System.out.println("Solution = "+solution);
    }

}

/*

Polymorphism, is the concept where in we use same method name multiple times &
to distinguish between each of them, we pass different parameters.

 */