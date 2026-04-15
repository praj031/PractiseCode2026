package OOPS.Inheritance;

public class Animal {

    public static void main(String[] args) {
        //This is the main class where are all animals will be called

        Dog dog = new Dog();
        //Now we can inherit some features of animal via this....
        dog.featuresOfDog();
        dog.bite();
        dog.eatMeat();
        dog.live();
        dog.petCategory();

        System.out.println(" ");
        Elephant elephant = new Elephant();
        elephant.elephantMain();
        elephant.live();
        elephant.bite();
        elephant.wildCategory();


    }




}
