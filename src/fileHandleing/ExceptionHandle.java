package fileHandleing;

public class ExceptionHandle {

    public static void checkException(int number) throws Exception{
        if(number > 10){
            throw new RuntimeException("The number is greater then 10 "+number);
        }
        else{
            System.out.println("number = "+number);
        }
    }

}
