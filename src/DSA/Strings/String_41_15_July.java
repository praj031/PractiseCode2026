package DSA.Strings;

public class String_41_15_July {
    //Info Company Question
    public static void main(String[] args) {
        String str = "Apple_3,Mango_6,Banana_9,Orange_7";
        String[] arr = str.split(",");
        int max = Integer.MIN_VALUE;
        String maxFruit = "";
        for(int i=0;i< arr.length;i++){
            String[] data = arr[i].split("_");
            String fruit = data[0];
            int value = Integer.parseInt(data[1]);
            if (value > max) {
                max = value;
                maxFruit = fruit;
            }
        }
        System.out.println(maxFruit + " -> " + max);
    }
}
