package JavGenericsAndWrapperClass;

public class WrapperClass {
    static void main(String[] args) {

        Integer value = 12;
        int value2 = value;
        System.out.println(value);
        System.out.println(value2);
        System.out.println(value + value2);

        Integer a = 100;
        Integer b = 120;
        System.out.println(a==b);
        System.out.println(a.equals(b));
        int result = checkValue(12);
        System.out.println(result);
        System.out.println(checkValue(null));

    }

    static Integer checkValue(Integer integerValue){
        if(integerValue == null){
            return 0;
        }
        return integerValue*2;
    }
}
/*
Output
12
12

Concept of wrapper class is like, wrapper is used when we need object of the datatype.
in above example you can see tha use of Integer wrapper class.
mostly if the ask is to need to point the value of a data we can use it
----------------------------------------------

Output:
12
12
24

Wrapper classes are used when we need primitive data types in object form.
In this example, Integer is a wrapper class for int.

Autoboxing converts a primitive int into an Integer object.
Unboxing converts an Integer object back into a primitive int.

Wrapper classes are commonly used in collections, frameworks, and APIs
where object types are required instead of primitives.


----------------------------------------------
Your understanding of the wrapper class concept in Java is solid, but let’s enhance it to make it more comprehensive for an interview setting. Here’s a refined version that emphasizes key points, adds technical depth, and showcases your knowledge effectively:

---

### Enhanced Understanding of Wrapper Classes in Java

In Java, a **wrapper class** is a class that encapsulates a primitive data type in an object. This is part of the Java Collections Framework, where objects are required, as collections cannot store primitive types directly. The wrapper classes correspond to each primitive data type:

- `int` → `Integer`
- `char` → `Character`
- `double` → `Double`
- `boolean` → `Boolean`
- `byte` → `Byte`
- `short` → `Short`
- `long` → `Long`
- `float` → `Float`

Here’s how the code works:

```java
package JavGenericsAndWrapperClass;

public class WrapperClass {
    public static void main(String[] args) {
        Integer value = 12; // Auto-boxing: converting int primitive to Integer object
        int value2 = value; // Unboxing: converting Integer object back to int primitive
        System.out.println(value); // Outputs: 12
        System.out.println(value2); // Outputs: 12
        System.out.println(value + value2); // Outputs: 24 (auto-unboxing occurs)
    }
}
```

### Key Points:

1. **Auto-Boxing and Unboxing**:
   - **Auto-boxing** is the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes. In this example, the integer `12` is automatically converted to an `Integer` object.
   - **Unboxing** occurs when an object of a wrapper class is converted back to its corresponding primitive type. Java handles this automatically, allowing you to work seamlessly with both types.

2. **Utility of Wrapper Classes**:
   - **Nullability**: Unlike primitive types, wrapper classes can hold a null value. This is useful for situations where you need to represent the absence of a value (e.g., in database operations).
   - **Collections**: Wrapper classes are essential when working with Java Collections like `ArrayList`, `HashMap`, etc., as these collections can only hold objects.
   - **Methods**: Wrapper classes come with utility methods that can be helpful for parsing and converting types. For example, `Integer.parseInt(String)` can convert a string to an integer.

3. **Performance Considerations**:
   - While wrapper classes provide flexibility and utility, they can introduce overhead due to the creation of objects and the auto-boxing/unboxing process. In performance-sensitive applications, it is important to be aware of this overhead.

### Conclusion:
In summary, wrapper classes in Java serve as a bridge between primitive types and the object-oriented nature of Java. They provide essential functionalities and flexibility, especially when working with collections or needing to represent null values. Understanding the nuances of auto-boxing and unboxing, as well as the implications for performance, is crucial for any developer.

By articulating your understanding in this way, you demonstrate not only your knowledge of the topic but also your ability to communicate it clearly—an essential skill in technical interviews. Good luck! If you have any more topics you want to explore or further questions, feel free to ask!

 */