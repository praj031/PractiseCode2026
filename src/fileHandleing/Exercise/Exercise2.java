package fileHandleing.Exercise;

public class Exercise2 {

    public static void main(String[] args) throws Exception {

        int number;
        number = -1;

        NegativeNumberException(number);

    }

    static void NegativeNumberException(int number) throws Exception{
        try{
            if(number < 0 ){
                throw new Exception("Negative number not allowed");
            }
            else {
                System.out.println(number);
            }

            }catch (Exception e){
            throw new Exception();
        }


    }

}
