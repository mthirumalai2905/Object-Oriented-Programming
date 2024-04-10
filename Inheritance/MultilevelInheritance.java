package Inheritance;

class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking");
    }
}

class Labrador extends Dog{
    void run(){
        System.out.println("Labrador is running");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
         Labrador labrador = new Labrador();
         labrador.eat(); // Animal is eating
         labrador.bark(); // Dog is barking
         labrador.run();  // Labrador is running
    }
}
