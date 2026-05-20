package DSA.Strings;

import java.util.Scanner;

public class String_14_20_May {

    //first non-repeating character in string
    public static void main(String[] args) {

        String str = "aabbcdde";
        char[] arrStr = str.toCharArray();

        for(char ch = 'a' ; ch <= 'z'; ch ++){
            int count = 0;
            for(int i=0;i<arrStr.length;i++){
                if(ch == arrStr[i]){
                    count++;
                }
            }
            if(count == 1){
                System.out.println(ch);
                break;
            }
        }
    }
}
