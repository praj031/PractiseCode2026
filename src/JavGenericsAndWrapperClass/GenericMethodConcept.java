package JavGenericsAndWrapperClass;

public class GenericMethodConcept {

    static void main(String[] args) {
        genericMethod("Pritish");
        genericMethod(2);
        System.out.println(getValue("Pritish","Pritish"));
        //TO call non static method we need to do it
        GenericMethodConcept obj = new GenericMethodConcept();
        obj.nonStaticGenericMethod("Hello World");
        obj.nonStaticGenericMethod(23);
    }

    static <P> void genericMethod(P value){
        System.out.println(value);
    }
    static <P1,P2> Boolean getValue(P1 value1,P2 value2){

        Boolean store = value1.equals(value2);
        return store;
    }
    <NGM> void nonStaticGenericMethod(NGM value){
        System.out.println(value);
    }

}


/*
By using the concept of java generics method,  we can remove the constraint of specific datatype
like in above example, we can pass anything, like any data-type.
------------------
Using Java generic methods allows us to write methods that work with
any data type while maintaining compile-time type safety.

In this example:
- genericMethod() accepts any type and prints it.
- getValue() compares two values of possibly different types using equals().

Generic methods remove the need for method overloading
and eliminate explicit type casting.

Common interview questions from this example ⚡
Q1: How is a generic method different from a generic class?
Generic method: type parameter defined at method level

Generic class: type parameter defined at class level

Q2: When does type checking happen in generics?
        ✔ At compile time

Q3: Can we overload generic methods?
        ✔ Yes, as long as method signatures differ after type erasure
 */
