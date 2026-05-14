package DSA.Strings;

public class String_7_13_May {
    //4. Find frequency of each character in a string.
    public static void main(String[] args) {

        String str = "A man a plan a canal Panama";
        str = str.toLowerCase();
        str = str.replace(" ", "");
        System.out.println(str);
        for(char ch = 'a'; ch <= 'z'; ch++){
            int count = 0;
            for(int i = 0; i < str.length() ; i++){
                if(ch == str.charAt(i)){
                    count++;
                }
            }
            if(count > 0){
                System.out.println(ch + "-" + count );
            }
        }
    }
}
