package Inheritance;

class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}

interface Pet{
    void play();
}

class Dog extends Animal implements Pet{
    void bark(){
        System.out.println("Dog is barking");
    }
    public void play(){
        System.out.println("Dog is playing");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
        dog.play();
    }
}
