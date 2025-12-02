1) Program to Add Two Numbers
public class Add {
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println("Sum: " + (a + b));
    }
}

2) Program to Check if a Number is Even or Odd
import java.util.Scanner;
public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) System.out.println(number + " is even.");
        else System.out.println(number + " is odd.");
        scanner.close();
    }
}

3) Program to Find the Largest of Three Numbers
import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();
        int largest = (num1 > num2) ? ((num1 > num3) ? num1 : num3) :
                                      ((num2 > num3) ? num2 : num3);
        System.out.println("Largest number is: " + largest);
        scanner.close();
    }
}

4) Program to Print a Multiplication Table
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        for (int i = 1; i <= 10; i++)
            System.out.println(num + " x " + i + " = " + (num * i));
        scanner.close();
    }
}

5) Program to Reverse a Number
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        System.out.println("Reversed number: " + reversed);
        scanner.close();
    }
}

6) Program to Find the Factorial of a Number
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        long factorial = 1;
        for (int i = 1; i <= number; i++)
            factorial *= i;
        System.out.println("Factorial of " + number + " is: " + factorial);
        scanner.close();
    }
}

7) Program to Count Vowels in a String
public class CountVowels {
    public static void main(String[] args) {
        String str = "Java Programming";
        int count = 0;
        for (char ch : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(ch) != -1)
                count++;
        }
        System.out.println("Number of vowels: " + count);
    }
}

8) Program to Check if String is Palindrome
import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        String reversed = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(reversed))
            System.out.println("\"" + str + "\" is a palindrome.");
        else
            System.out.println("\"" + str + "\" is not a palindrome.");
        scanner.close();
    }
}

9) Program to Print Array Elements & Sum
import java.util.Scanner;
import java.util.Arrays;
public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++)
            numbers[i] = scanner.nextInt();
        System.out.println("Entered array elements: " + Arrays.toString(numbers));
        int sum = 0;
        for (int num : numbers) sum += num;
        System.out.println("Sum of array elements: " + sum);
        scanner.close();
    }
}

10) Find Maximum and Minimum Element
public class ArrayMaxMin {
    public static void main(String[] args) {
        int[] arr = {10, 5, 25, 7, 3};
        int max = arr[0], min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}

11) Read and Print Matrix
import java.util.Scanner;
public class MatrixPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = sc.nextInt();
        System.out.println("Matrix is:");
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
        sc.close();
    }
}

12) Matrix Addition & Multiplication
public class MatrixAddition {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
        int[][] sum = new int[2][2];
        int[][] product = new int[2][2];

        // Addition
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                sum[i][j] = a[i][j] + b[i][j];

        // Multiplication
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++) {
                product[i][j] = 0;
                for (int k = 0; k < 2; k++)
                    product[i][j] += a[i][k] * b[k][j];
            }

        System.out.println("Sum of matrices:");
        for (int[] row : sum) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }

        System.out.println("Product of matrices:");
        for (int[] row : product) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
}
