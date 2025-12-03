1. Single Inheritance
public class SingleInheritanceExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}

class Animal {
    void eat() {
        System.out.println("Animals can eat");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog can bark");
    }
}
2. Multilevel Inheritance
public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();
    }
}

class Animal {
    void eat() {
        System.out.println("Animals can eat");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog can bark");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy can weep");
    }
}
3. Hierarchical Inheritance
public class HierarchicalInheritanceExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
        System.out.println();
        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}

class Animal {
    void eat() {
        System.out.println("Animals can eat");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog can bark");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat can meow");
    }
}
4. Multiple Inheritance (Through Interfaces)
public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.play();
        d.bark();
    }
}

interface Animal {
    void eat();
}

interface Pet {
    void play();
}

class Dog implements Animal, Pet {
    public void eat() {
        System.out.println("Dog can eat");
    }

    public void play() {
        System.out.println("Dog loves to play");
    }

    void bark() {
        System.out.println("Dog can bark");
    }
}
5. Manager-Employee Exercise
public class Company {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "Ankita";
        m.salary = 75000;
        m.department = "Human Resources";
        m.displayInfo();
    }
}

class Employee {
    String name;
    double salary;
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;
    @Override
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
}
6. Shape Exercise
public class ShapeExample {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        c.displayShape();
        c.area();
        r.displayShape();
        r.area();
    }
}

class Shape {
    void displayShape() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    void area() {
        double radius = 5;
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

class Rectangle extends Shape {
    void area() {
        double length = 6;
        double width = 4;
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}
7. Transport Exercise
public class TransportExample {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.move();
        bus.carryPassengers();
        System.out.println();
        Truck truck = new Truck();
        truck.move();
        truck.carryGoods();
    }
}

class Transport {
    void move() {
        System.out.println("Transport is moving");
    }
}

class Bus extends Transport {
    void carryPassengers() {
        System.out.println("Bus is carrying passengers");
    }
}

class Truck extends Transport {
    void carryGoods() {
        System.out.println("Truck is carrying goods");
    }
}
8. Method Overriding
public class Overrides {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();
        Dog d = new Dog();
        d.sound();
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
9. Hospital Exercise
public class Hospital {
    public static void main(String[] args) {
        Doctor d1 = new Doctor();
        Doctor d2 = new Dentist();
        Doctor d3 = new Cardiologist();
        Doctor d4 = new Surgeon();
        d1.consultationFee();
        d2.consultationFee();
        d3.consultationFee();
        d4.consultationFee();
    }
}

class Doctor {
    void consultationFee() {
        System.out.println("General Doctor fee: ₹300");
    }
}

class Dentist extends Doctor {
    @Override
    void consultationFee() {
        System.out.println("Dentist consultation fee: ₹500");
    }
}

class Cardiologist extends Doctor {
    @Override
    void consultationFee() {
        System.out.println("Cardiologist consultation fee: ₹800");
    }
}

class Surgeon extends Doctor {
    @Override
    void consultationFee() {
        System.out.println("Surgeon consultation fee: ₹1000");
    }
}
10. Dynamic Method Dispatch
public class Dynamic {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();
        a = new Dog();
        a.sound();
        a = new Cat();
        a.sound();
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }
}
11. Payment System Exercise
public class PaymentSystem {
    public static void main(String[] args) {
        Payment p;
        p = new CreditCardPayment();
        p.pay();
        p = new UPIPayment();
        p.pay();
        p = new NetBankingPayment();
        p.pay();
        p = new CryptocurrencyPayment();
        p.pay();
    }
}

class Payment {
    void pay() {
        System.out.println("Processing payment...");
    }
}

class CreditCardPayment extends Payment {
    void pay() {
        System.out.println("Paying using Credit Card");
    }
}

class UPIPayment extends Payment {
    void pay() {
        System.out.println("Paying using UPI");
    }
}

class NetBankingPayment extends Payment {
    void pay() {
        System.out.println("Paying using Net Banking");
    }
}

class CryptocurrencyPayment extends Payment {
    void pay() {
        System.out.println("Paying using Cryptocurrency");
    }
}
12. Logistics App Exercise
public class LogisticsApp {
    public static void main(String[] args) {
        Transport t;
        t = new Truck();
        t.deliver();
        t = new Ship();
        t.deliver();
        t = new Airplane();
        t.deliver();
    }
}

class Transport {
    void deliver() {
        System.out.println("Transport is delivering goods");
    }
}

class Truck extends Transport {
    void deliver() {
        System.out.println("Truck is delivering goods");
    }
}

class Ship extends Transport {
    void deliver() {
        System.out.println("Ship is delivering goods");
    }
}

class Airplane extends Transport {
    void deliver() {
        System.out.println("Airplane is delivering goods");
    }
}
