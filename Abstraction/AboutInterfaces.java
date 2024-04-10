package Abstraction;

interface Animal{
    void makeSound();
}

class Dog implements Animal{
    @Override
    public void makeSound(){
        System.out.println("Woof!");
    }

}

class Cat implements Animal{
    @Override
    public void makeSound(){
        System.out.println("Meow !");
    }
}


public class AboutInterfaces {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        cat.makeSound();
    }
    
}
