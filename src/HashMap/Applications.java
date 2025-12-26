package HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Applications {

    public static void main(String[] args) {


        //Treemap, Hashmap, LinkedHashMap, keyMap can't have duplicate anytime.

        //HashMap<Key,Value> -- provided here.
        HashMap<String, String>  dictionary = new HashMap<>();
        //each below line is called entry set
        dictionary.put("Brave"," Can do anything ");
        dictionary.put("Confident"," Can do anything OP");
        dictionary.put("Computer"," Can do anything is brain ");
        dictionary.put("Engineering"," Can do anything in job");

        for(String word : dictionary.keySet()){
            System.out.println(word);
        }

        System.out.println("@@@@@@@@@@");

        //LinkedHashMap<Key,Value> -- provided here. -- Just will give us the sorted data
        LinkedHashMap<String, String> dictionaries = new LinkedHashMap<>();
        //each below line is called linked entry set
        dictionaries.put("Brave"," Can do anything ");
        dictionaries.put("Confident"," Can do anything OP");
        dictionaries.put("Computer"," Can do anything is brain ");
        dictionaries.put("Engineering"," Can do anything in job");

        for(String word2 : dictionaries.keySet()){
            System.out.println(word2);
        }

        //Tree map set
        TreeMap<String, String> diction = new TreeMap<>();
        diction.put("Brave"," Can do anything ");
        diction.put("Confident"," Can do anything OP");
        diction.put("Computer"," Can do anything is brain ");
        diction.put("Engineering"," Can do anything in job");

        for(String word3 : diction.keySet()){
            System.out.println(word3);
        }

        for(Map.Entry<String,String> entry : diction.entrySet()){
            System.out.println(entry.getKey()+ "  :  " + entry.getValue());
        }


    }

}
