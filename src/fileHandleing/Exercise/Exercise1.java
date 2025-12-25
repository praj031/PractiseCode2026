package fileHandleing.Exercise;

public class Exercise1 {
    public static void main(String[] args) {
        // Read two integers from args
        // Perform division and handle division by zero
        Integer a,b;
        a=Integer.parseInt(args[0]);
        b=Integer.parseInt(args[1]);




        try {
            if(a==0 || b==0){
                throw new ArithmeticException("Cannot divide by zero");
            }
            else {
                System.out.println(a/b);
            }
        }
        catch (ArithmeticException e){
            throw new ArithmeticException("Cannot divide by zero");
        }

    }
}
