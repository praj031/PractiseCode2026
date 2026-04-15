package InterviewPractice.March;

public class Phase8SheetAll {

    //This method will have all the program related to pattern only.
    public static void main(String[] args) {
        pattern4();
        System.out.println(" ");
        pattern5();
        System.out.println(" ");
        pattern6();
        System.out.println(" ");
        pattern7();
        System.out.println(" ");
        pattern8();
        System.out.println(" ");
        pattern9();
        System.out.println(" ");
        pattern10();
        System.out.println(" ");
        pattern24();
        System.out.println(" ");
        pattern22_23();
        System.out.println(" ");
        pattern11();
    }


    static void pattern4(){
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern5(){
        int n=5;
        for (int i=0;i<=n;i++){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern6(){
        int n=5;
        for(int i=0;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern7(){
        int n=5;
        for (int i=0;i<=n;i++){
            if(i%2==0){
            for (int j=0;j<i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }

    static void pattern8(){
        int n=5;
        for (int i=0;i<=n;i++){
            if(i%2!=0){
                for (int j=0;j<i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }

        }
    }

    static void pattern9(){
        int n=5;
        for(int i=0;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                System.out.print("*");
            }
            for(int k=1;k<i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern10(){
        int n=5;
        for(int i=0;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern24(){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //Reversing the loops
        for(int i=n-1;i>=1;i--){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern22_23(){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    private static void pattern11() {



    }





}
