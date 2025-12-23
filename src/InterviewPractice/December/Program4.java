package InterviewPractice.December;

public class Program4 {

    public static void main(String[] args) {
        // Step 1: Declare an array of guest names
        // Step 2: Create an integer variable for the current hour (e.g., 14)
        // Step 3: Call a method that returns the appropriate greeting based on the hour
        // Step 4: Loop through each guest and print the personalized message

        String[] guests = {"Alice", "Bob", "Charlie", "Dana"};

       //getGreeting(14);

        String greeting = getGreeting(14);  // Step 3
        for(String guest : guests) {  // Step 4
            System.out.println(greeting + ", " + guest + "!");
        }


    }

    // Step 5: Define the getGreeting(int hour) method below

    public static String getGreeting(int hour) {
        // code

        if(hour>5 && hour<=11){
            return "Good morning";
        }
        else if (hour > 12 && hour <=17){
            return "Good afternoon";
        }
        else{
            return "Good evening";
        }


    }

}
