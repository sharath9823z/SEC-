1. Simple Class and Object Creation

public class Student {
    String name;
    int age;
    
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Kishan";
        s1.age = 21;
        s1.display();
    }
}

2. Constructors

public class Student {
    String name;
    int age;

    // Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }
    
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    
    public static void main(String[] args) {
        Student s1 = new Student("Rakesh", 23);
        s1.display();
    }
}

3. Constructor Overloading

class Rectangle {
    int length, width;

    // Constructor for rectangle
    Rectangle(int l, int w) {
        length = l;
        width = w;
    }
    
    // Constructor for square
    Rectangle(int side) {
        length = side;
        width = side;
    }
    
    int area() {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5);
        Rectangle r2 = new Rectangle(7);
        System.out.println("Area of Rectangle: " + r1.area());
        System.out.println("Area of Square: " + r2.area());
    }
}

4. Methods in Classes

class Calculator {
    int a, b;

    Calculator(int x, int y) {
        a = x;
        b = y;
    }

    int add() {
        return a + b;
    }

    int multiply() {
        return a * b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator(10, 20);
        System.out.println("Addition: " + calc.add());
        System.out.println("Multiplication: " + calc.multiply());
    }
}

5. Real-world Class Implementation (Bank Account)
class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String name, double amount) {
        this.accountHolder = name;
        this.balance = amount;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    public void display() {
        System.out.println("Account Holder: " + accountHolder + ", Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Ravi", 5000);
        acc1.deposit(2000);
        acc1.withdraw(1000);
        acc1.display();
    }
}

6. this Keyword and Constructor Chaining

public class Student {
    private String name;
    private int age;
    private String course;

    public Student() {
        this("Unknown", 0, "Not Assigned");
        System.out.println("Default constructor called");
    }
    
    public Student(String name, int age) {
        this(name, age, "General");
        System.out.println("Two-parameter constructor called");
    }
    
    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
        System.out.println("Three-parameter constructor called");
    }
    
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
    }
    
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
        
        Student s2 = new Student("Aman", 21);
        s2.display();
        
        Student s3 = new Student("Neha", 22, "Computer Science");
        s3.display();
    }
}

7. Garbage Collection and finalize() Method

class FinalizeExample {
    private int num;
    
    public FinalizeExample(int n) {
        num = n;
        System.out.println("Object " + num + " created");
    }
    
    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize() called for object " + num);
        super.finalize();
    }
    
    public static void main(String[] args) {
        System.out.println("Creating objects...");
        FinalizeExample obj1 = new FinalizeExample(1);
        FinalizeExample obj2 = new FinalizeExample(2);

        System.out.println("Making objects eligible for GC...");
        obj1 = null;
        obj2 = null;

        // Request garbage collection
        System.gc();
        
        // Add small delay to allow GC to run
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("End of main method");
    }
}

8. Method Overloading

public class MathUtils {
    public int add(int a, int b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
    
    public String add(String a, String b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        MathUtils mu = new MathUtils();
        System.out.println("add(2, 3) = " + mu.add(2, 3));
        System.out.println("add(1, 2, 3) = " + mu.add(1, 2, 3));
        System.out.println("add(2.5, 3.2) = " + mu.add(2.5, 3.2));
        System.out.println("add(\"Hello\", \" World\") = " + mu.add("Hello", " World"));
    }
}

9. Objects as Method Parameters

public class ObjectParameterDemo {
    public static void main(String[] args) {
        Rectangle box = new Rectangle(5, 8);
        AreaCalculator calc = new AreaCalculator();
        int area = calc.calculateArea(box);
        System.out.println("Area of rectangle (5x8): " + area);
    }
}

class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    
    public int getLength() { return length; }
    public int getWidth() { return width; }
}

class AreaCalculator {
    public int calculateArea(Rectangle rect) {
        return rect.getLength() * rect.getWidth();
    }
}

10. Passing and Returning Objects

class Student {
    String name;
    int marks;
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

class Example {
    static void updateMarks(Student s, int extra) {
        s.marks += extra;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Jit", 80);
        updateMarks(s1, 10);
        System.out.println(s1.name + " " + s1.marks);
    }
}
class Circle {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    Area getArea() {
        double a = Math.PI * radius * radius;
        return new Area(a);
    }
}

class Area {
    double value;
    Area(double value) {
        this.value = value;
    }
}

class Main {
    public static void main(String[] args) {
        Circle c = new Circle(3.0);
        Area areaObj = c.getArea();
        System.out.println("Area: " + areaObj.value);
    }
}

11. Recursion

class RecursionExample {
    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int res = factorial(5);
        System.out.println("5! " + res);
    }
}

12. Static Members

class Student {
    static int count = 0;
    Student() { count++; }
}

class MathUtils {
    static int square(int x) {
        return x * x;
    }
}

class Demo {
    static int data;
    static {
        data = 100;
        System.out.println("Static block: data set to " + data);
    }
}

public class Main {
    public static void main(String[] args) {
        new Student();
        new Student();
        System.out.println(Student.count);
        int s = MathUtils.square(5);
        System.out.println("s = " + s);
        // To trigger static block
        int d = Demo.data;
    }
}
