package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionPrg {

    public static void main(String[] args) {
//        ArrayList words = new ArrayList();
//
//        words.add("hello");
//        words.add("My");
//        words.add("World");
//        words.remove(0);
        //Here, there is no predefined length; the loop continues until the user chooses to stop.

        Scanner sc = new Scanner(System.in);

        /*
        ArrayList<String> animal = new ArrayList<>();
        while (true) {
            System.out.print("Enter animal (or 'exit' to stop): ");
            String name = sc.nextLine();

            if (name.equalsIgnoreCase("exit")) {
                break;
            }
            animal.add(name);          // list grows automatically
        }
        for(int i=0;i<animal.size();i++){
            String a = animal.get(i);
            System.out.println(a);
        }
        */

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        while (true){

            System.out.print("Enter name of vehicle = ");
            String name = sc.nextLine();
            if(name.equalsIgnoreCase("exit")){
                break;
            }

            System.out.print("Enter the model = ");
            String model = sc.nextLine();

            System.out.print("Enter the color = ");
            String color = sc.nextLine();

            System.out.print("Enter the availability (true/false) = ");
            boolean available = Boolean.parseBoolean(sc.nextLine());

            System.out.println();
            System.out.println();




            vehicles.add(new Vehicle(name,model,color,available));

        }

        for(int i=0;i<vehicles.size();i++){
            System.out.println((vehicles.get(i)));

        }





    }

}
