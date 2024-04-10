package Polymorphism;

class Parent{
    int parentData;
    //Constructor of the Parent class
    public Parent(int data){
        this.parentData = data;
    }

    public void displayParentData(){
        System.out.println("Parent Data: " + parentData);
    }
}

class Child extends Parent{
    int childData;

    public Child(int parentData, int childData){
        super(parentData);
        this.childData = childData;
    }

    public void displayChildData(){
        System.out.println("Child Data: " + childData);
    }
}

public class SuperKeyword{
    public static void main(String[] args) {
        Child childObject = new Child(10, 20);

        childObject.displayParentData();
        childObject.displayChildData();
    }
}













