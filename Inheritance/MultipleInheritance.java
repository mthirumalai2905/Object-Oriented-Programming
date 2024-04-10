package Inheritance;

interface A{
    void methodA();
}

interface B{
    void methodB();
}

class MyClass implements A,B{
    public void methodA(){
        System.out.println("Method A");
    }

    public void methodB(){
        System.out.println("Method B");
    }
}
public class MultipleInheritance {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.methodA();
        obj.methodB();
    }
}
