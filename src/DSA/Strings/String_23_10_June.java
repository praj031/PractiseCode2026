package DSA.Strings;

public class String_23_10_June {
    //First non-repeating character in array
    public static void main(String[] args) {

        String str = "Apple";
        String input = str.toLowerCase();
        char[] arr = input.toCharArray();
        for(int i=0;i<arr.length;i++){
            int count = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count ++;
                }
            }
            if(count == 1){
                System.out.println(arr[i]);
                break;
            }
        }

    }
}
