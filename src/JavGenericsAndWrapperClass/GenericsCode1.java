package JavGenericsAndWrapperClass;

public class GenericsCode1 {
    static void main(String[] args) {

        Box<String> obj = new Box<>("Pritish");
        Box<Integer> obj2 = new Box<>(12);
        obj.setValue("Pritish");
        obj2.setValue(99);
        System.out.println(obj2.getValue());

        // Passing String array
        acceptsArrayOfAnyType(new String[]{"Java", "Spring", "Generics"});
        // Passing Integer array
        acceptsArrayOfAnyType(new Integer[]{1, 2, 3});

        acceptsArrayOfAnyType(new Integer[]{});

    }

    static <AR> void acceptsArrayOfAnyType(AR[] array){
        if(array.length == 0){
            System.out.println("Array length is 0");
        }
        else {
            for(int i=0;i<array.length;i++){
                System.out.print("{ "+array[i]+" }");
            }
        }
     }
}

class Box<T>{

    T value;

    public Box(T value){
        this.value = value;
    }

    T getValue(){
        System.out.println("Get value passed");
        return value;
    }

    void setValue(T value){
       this.value=value;
        System.out.println("Set the value");
    }

}