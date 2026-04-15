package JavGenericsAndWrapperClass;

public class GenericsClassConcept {

    static void main(String[] args) {

        Dog<Integer,String> obj1 = new Dog<>(1,"German Shepherd");
        Dog<Long,String> obj2 = new Dog<>(2L,"Labra");
        Dog<Integer,Character> obj3 = new Dog<>(3,'C');
        System.out.println(obj1.getId());
        System.out.println(obj2.getId());
        System.out.println(obj3.getId());
    }
}

class Dog<ID,NAME> {
    ID id;
    NAME name;
    public Dog (ID id, NAME name){
        this.id=id;
        this.name=name;
    }
    ID getId(){
        return id;
    }
}
/*
Generics provide compile-time type safety, eliminate explicit casting,
and make code reusable and flexible.
However, they should be designed carefully to reflect real-world constraints.
 */
