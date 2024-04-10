package Polymorphism;

class MathOperations{
    public int add(int a, int b){
        return a + b;
    }
    public int add(int a, int b, int c){
        return a + b + c;
    }
    public double add(double a, double b){
        return a + b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        System.out.println("sum of  5 and 10: " + math.add(5,10));
        System.out.println("sum of 5,10 and 15" + math.add(5,10,15));
        System.out.println("sum pf 5.5 and 10.5" + math.add(5.5, 10.5));

        
    }
}
