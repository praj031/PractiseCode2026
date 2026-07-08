package DSA.LeetCode;

public class DSA_56_08_July {
    //3754. Concatenate Non-Zero Digits and Multiply by Sum I
    public static void main(String[] args) {
        int n = 10203004;
        long Output = sumAndMultiply(n);
        System.out.println("Output = "+Output);
    }
    public static long sumAndMultiply(int n) {
        //To get an integer value without 0.
        String str = Integer.toString(n);
        str = str.replace("0", "");
        int finalValue = Integer.parseInt(str);
        return finalValue * sum(finalValue);
    }

    public static long sum(int value){
        //Now to get the sum of each number;
        int sum = 0;
        while (value != 0){
            sum = sum + value % 10;
            value = value/10;
        }
        return sum;
    }
}
