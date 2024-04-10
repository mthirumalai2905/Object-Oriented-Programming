package Abstraction;

abstract class Shape{
    //Abstract method to calculate area(to be implemented by subclasses)
    public abstract double calculateArea();

    public void display(){
        System.out.println("This is a shape");
    }
}

class Rectangle extends Shape{
    private double length;
    private double width;

    //Constructor
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    //Implementaion of abstract method
    @Override
    public double calculateArea(){
        return length * width;
    }
}


class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return Math.PI * radius * radius;
    }
}

public class Abstraction {
    public static void main(String[] args) {
        
        Rectangle rectangle = new Rectangle(5, 4);
        Circle circle = new Circle(3);

        rectangle.display();
        System.out.println("Area of rectangle: " + rectangle.calculateArea());

        circle.display();
        System.out.println("Area of circle: " + circle.calculateArea());
    }
}
