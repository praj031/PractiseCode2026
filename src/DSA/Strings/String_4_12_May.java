package DSA.Strings;

public class String_4_12_May {   //Capgemini question
    //Highest quantity fruit : Apple_3,Mango_6,Banana_9,Orange_7
    public static void main(String[] args) {

        String str = "Apple_3,Mango_6,Banana_9,Orange_7";
        //Question asked in infos
        //1. We need to split
        String[] fruits = str.split(",");
        int maxQty = 0;
        String maxFruits = "";

        for(int i=0;i<fruits.length;i++){
        //2. We will extract the string and integer value from each of the strings.
            String[] data = fruits[i].split("_");
            String fruitName = data[0];
            int qty = Integer.parseInt(data[1]);
            //3. Compare each of the strings and get the max value
            if(qty > maxQty){
                maxQty = qty;
                maxFruits = fruitName;
            }
        }

        System.out.println("Max fruit = "+maxFruits);
    }

}
