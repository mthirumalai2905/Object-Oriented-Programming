package Polymorphism;

    class Animal{
        public void makeSound(){
            System.out.println("Animal makes a sound");
        }
    }

    class Dog extends Animal{
        @Override
        public void makeSound(){
            System.out.println("Dog Barks");
        }
    }

     class Cat extends Animal{
        @Override
        public void makeSound(){
            System.out.println("Cat meows");
        }
    }

    public class Main {
        public static void main(String[] args){
            //Polymorphism
            Animal myDog = new Dog();
            Animal myCat = new Cat();

            myCat.makeSound();
            myDog.makeSound();
        }
    
        
    }
