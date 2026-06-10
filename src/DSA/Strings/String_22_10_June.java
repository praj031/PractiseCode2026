package DSA.Strings;

public class String_22_10_June {
    //Find the freq of each character in string
    public static void main(String[] args) {

        String str = "BBNAAUJH";  // OP = 'a'
        String input = str.toLowerCase();
        char[] arr = input.toCharArray();
        for(char ch = 'a' ; ch <= 'z'; ch ++){
            int freq = 0;
            for(int i=0;i<arr.length;i++){
                if(ch == arr[i]){
                    freq ++;
                }
            }
            if(freq > 0){
                System.out.println(ch + " = "+ freq);
                //break;
            }
        }
    }
}
