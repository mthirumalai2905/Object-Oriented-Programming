package Encapsulation;

public class Person {
    private String name;
    private int age;
    private String address;

    // Getter and setter methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter methods for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    // Getter and setter methods for address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

 class Main {
    public static void main(String[] args) {
        // Creating an instance of the Person class
        Person person = new Person();

        // Setting values using setter methods
        person.setName("John");
        person.setAge(30);
        person.setAddress("123 Main St");

        // Getting values using getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Address: " + person.getAddress());
    }
}
