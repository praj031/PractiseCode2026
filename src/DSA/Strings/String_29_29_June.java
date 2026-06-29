    package DSA.Strings;

    import java.util.HashMap;

    public class String_29_29_June {
        //Find the first non-repeating character in String

        public static void main(String[] args) {
            String string = "loveleetocde";
            char bruteForce = bruteforce(string);
            System.out.println("Brute Force Output = "+bruteForce);
            char optimalApproach1 = optimalApproach1(string);
            System.out.println("Optimal Approach 1 Output = "+optimalApproach1);
            char optimalApproach2 = optimalApproach2(string);
            System.out.println("Optimal Approach 2 Output = "+optimalApproach2);
        }

        public static char bruteforce(String string){
            //In this case we are using the old way of creating 2 array and comparing it.
            char[] ch = string.toCharArray();
            for(int i = 0; i < ch.length; i++){
                int count = 0;
                for(int j = 0; j < ch.length; j++){
                    if(ch[j] == ch[i]){
                        count++;
                    }
                }
                if(count == 1){
                    return ch[i];
                }
            }
            return ' ';
        }

        public static char optimalApproach1(String string){
            //This approach we are using the frequency array to tackle the problem
            String checkString = string.toLowerCase();
            int[] freq = new int[256];
            for(int i=0;i<checkString.length();i++){
                freq[checkString.charAt(i)]++;
            }
            for(int i=0;i<checkString.length();i++){
                if(freq[checkString.charAt(i)] == 1){
                    return checkString.charAt(i);
                }
            }

            return ' ';
        }

        public static char optimalApproach2(String string){

            int n = string.length();
            HashMap<Character, Integer> freq = new HashMap<>();
            for(int i=0;i<n;i++){
                char ch = string.charAt(i);
                freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            }
            for(int i=0;i<n;i++){
                if(freq.get(string.charAt(i)) == 1){
                    System.out.println("Index = "+i);
                    return string.charAt(i);
                }
            }
            return ' ';
        }

    }
