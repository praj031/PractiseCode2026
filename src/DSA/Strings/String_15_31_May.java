package DSA.Strings;

public class String_15_31_May {
    public static void main(String[] args) {

        //Find frequency of each character of string
        String str = "aabacbebebe";
        char[] arr = str.toCharArray();
        for(char ch = 'a'; ch <= 'z'; ch++){
            int count = 0;
            for(int i=0;i<arr.length;i++){
                if(arr[i] == ch ){
                    count++;
                }
            }
            if(count > 0){
                System.out.println(ch + "=" + count);
            }
        }
    }
}
