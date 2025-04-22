import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 51. Print only even numbers using continue
        System.out.println("Even numbers from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) continue;
            System.out.print(i + " ");
        }
        System.out.println();

        // 52. Fibonacci series using recursion
        System.out.print("Enter number of Fibonacci terms: ");
        int n = sc.nextInt();
        System.out.print("Fibonacci series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
        System.out.println();

        // 53. Class Car with brand and model
        Car myCar = new Car("Toyota", "Supra");
        myCar.display();

        // 54. Class Student with constructor
        Student s1 = new Student("Shyam", 21);
        s1.display();

        // 55. Inheritance: Animal and Dog
        Animal a = new Animal();
        a.makeSound();

        Dog d = new Dog();
        d.makeSound();
    }

    // 52. Recursive Fibonacci
    static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }
}

// 53. Car class
class Car {
    String brand;
    String model;

    Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    void display() {
        System.out.println("Car Brand: " + brand + ", Model: " + model);
    }
}

// 54. Student class with constructor
class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Student Name: " + name + ", Age: " + age);
    }
}

// 55. Animal and Dog with inheritance
class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark!");
    }
}
// Q51: Uses continue to skip odd numbers and prints only even numbers from 1 to 10.

// Q52: Recursive method fib(n) generates Fibonacci numbers.

// Q53: Car class holds brand and model; constructor assigns values, and display() prints details.

// Q54: Student class with constructor initialization and a method to display student details.

// Q55: Demonstrates inheritance where Dog overrides the makeSound() method from Animal.