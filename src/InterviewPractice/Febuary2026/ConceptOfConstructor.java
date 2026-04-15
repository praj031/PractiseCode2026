package InterviewPractice.Febuary2026;

public class ConceptOfConstructor {

    static void main(String[] args) {
        //Main class where the constructor will be called in.
        CheckConstructor obj = new CheckConstructor();
        System.out.println(obj);
        obj.Print();
        CheckConstructor obj2 = new CheckConstructor("Omega",33);
        obj2.Print();
        System.out.println(obj2);
    }

}

class CheckConstructor{


    private String name;
    private int age;
    private String password;

    public CheckConstructor() {
        this.name = "Pritish";
        this.age = 12;
        this.password = "password";
    }
    public CheckConstructor(String name, int age) {
        this.name = name;
        this.age = age;
        this.password = "password";
    }

    void Print(){
        System.out.println("Values of name = "+name+" age = "+age+" password = "+password);
    }

}
