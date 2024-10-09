package Abstract;

abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
 @Override
    void sound() {
        System.out.println("barks");
    }
}

public class Abs {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
       
    }
}

