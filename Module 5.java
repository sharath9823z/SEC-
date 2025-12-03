Dynamic Array

import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        try {
            int[] arr = new int[size];
            System.out.println("Array of size " + size + " created successfully.");
        } catch (NegativeArraySizeException e) {
            System.out.println("Error: Array size cannot be negative!");
        }

        sc.close();
    }
}


Email validation
import java.util.Scanner;

// Custom Exception (inside same file)
class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

public class EmailValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        try {
            validateEmail(email);
            System.out.println("Valid email!");
        } catch (InvalidEmailException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }

    // Method to validate email
    public static void validateEmail(String email) throws InvalidEmailException {
        if (!email.contains("@")) {
            throw new InvalidEmailException("Email must contain '@' symbol!");
        }
    }
}

File Read Example
import java.io.*;

public class FileReadExample {
    public static void main(String[] args) {
        File file = new File("sample.txt");

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            System.out.println("First line: " + br.readLine());
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        } catch (IOException e) {
            System.out.println("Error: Unable to read the file!");
        }
    }

Modules Operation
import java.util.Scanner;

public class ModulusOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        try {
            int result = num1 % num2;
            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }

        sc.close();
    }
}

String Toint

import java.util.Scanner;

public class StringToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        try {
            String sub = name.substring(0, 3);
            int num = Integer.parseInt(sub);
            System.out.println("Converted number: " + num);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: Name must have at least 3 characters!");
        } catch (NumberFormatException e) {
            System.out.println("Error: First three characters are not a number!");
        }

        sc.close();
    }
}
