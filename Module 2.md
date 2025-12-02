1) ARITHMETIC OPERATORS
public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 15, b = 4;
        System.out.println("a + b = " + (a + b)); 
        System.out.println("a - b = " + (a - b)); 
        System.out.println("a * b = " + (a * b)); 
        System.out.println("a / b = " + (a / b)); 
        System.out.println("a % b = " + (a % b)); 
    }
}

2) BITWISE OPERATORS
public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 5, b = 3;
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + (~a));
        System.out.println("a << 1 = " + (a << 1));
        System.out.println("a >> 1 = " + (a >> 1));
    }
}

3) RELATIONAL OPERATORS
public class RelationalOperators {
    public static void main(String[] args) {
        int x = 10, y = 20;
        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x > y : " + (x > y));
        System.out.println("x < y : " + (x < y));
        System.out.println("x >= y: " + (x >= y));
        System.out.println("x <= y: " + (x <= y));
    }
}

4) BOOLEAN LOGICAL OPERATORS
public class BooleanLogicalOperators {
    public static void main(String[] args) {
        boolean p = true, q = false;
        System.out.println("p && q = " + (p && q));
        System.out.println("p || q = " + (p || q));
        System.out.println("!p = " + (!p));
    }
}

5) TERNARY OPERATOR
public class TernaryOperator {
    public static void main(String[] args) {
        int a = 10, b = 20;
        int max = (a > b) ? a : b;
        System.out.println("Maximum is: " + max);
    }
}

6) OPERATOR PRECEDENCE
public class OperatorPrecedence {
    public static void main(String[] args) {
        int result = 10 + 5 * 2;
        System.out.println("10 + 5 * 2 = " + result);
        int result2 = (10 + 5) * 2;
        System.out.println("(10 + 5) * 2 = " + result2);
    }
}

7) IF-ELSE STATEMENT
public class IfElseDemo {
    public static void main(String[] args) {
        int num = 10;
        if (num % 2 == 0)
            System.out.println(num + " is Even");
        else
            System.out.println(num + " is Odd");
    }
}

8) MULTIPLE IF-ELSE (NORMAL WAY)
public class MultipleIfElse {
    public static void main(String[] args) {
        int marks = 72;
        if (marks >= 90)
            System.out.println("Grade: A");
        else if (marks >= 75)
            System.out.println("Grade: B");
        else if (marks >= 50)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: Fail");
    }
}

9) MULTIPLE IF-ELSE USING TERNARY
public class MultipleIfElseTernary {
    public static void main(String[] args) {
        int marks = 72;
        String grade = (marks >= 90) ? "A" :
                       (marks >= 75) ? "B" :
                       (marks >= 50) ? "C" : "Fail";
        System.out.println("Grade: " + grade);
    }
}

10) ITERATION / LOOPS

// (a) FOR LOOP
public class ForLoopDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++)
            System.out.println("Count: " + i);
    }
}

// (b) WHILE LOOP
public class WhileLoopDemo {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println("While loop count: " + i);
            i++;
        }
    }
}

// (c) DO-WHILE LOOP
public class DoWhileDemo {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("Do-While count: " + i);
            i++;
        } while (i <= 5);
    }
}

11) JUMP STATEMENTS

// (a) BREAK
public class BreakDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5)
                break;
            System.out.println("i = " + i);
        }
    }
}

// (b) CONTINUE
public class ContinueDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3)
                continue;
            System.out.println("i = " + i);
        }
    }
}

// (c) RETURN
public class ReturnDemo {
    public static void main(String[] args) {
        System.out.println("Before return");
        return;
        // System.out.println("This will not execute");
    }
}


MODULE 2

1) Arithmetic Operators

![WhatsApp Image 2025-11-16 at 00 08 23_657999f7](https://github.com/user-attachments/assets/d1b77ea4-4e3a-4702-a13c-260d8ff76063)

2) Bitwise Operators

![WhatsApp Image 2025-11-16 at 00 08 45_bcef860d](https://github.com/user-attachments/assets/e3d683aa-2cd3-44b1-b20e-2f848c74a8bc)

3) Relational Operators

![WhatsApp Image 2025-11-16 at 00 09 14_f076cc2f](https://github.com/user-attachments/assets/4c518c9c-8242-4d87-8c4c-1a96249d04e3)

4) Boolean Logical Operators

![WhatsApp Image 2025-11-16 at 00 09 29_d1d075c6](https://github.com/user-attachments/assets/c4668eb0-92e2-4663-9b72-a4cde6ca7bf1)

5) Ternary Operator

<img width="415" height="150" alt="image" src="https://github.com/user-attachments/assets/825ca3d5-bd63-489e-b286-058641358913" />

6) Operator Precedence

![WhatsApp Image 2025-11-16 at 00 48 13_832c80d8](https://github.com/user-attachments/assets/cddfd332-0b45-4140-bfaf-f41d092b49df)

7) If-Else Statements

![WhatsApp Image 2025-11-16 at 00 49 26_6eaf9077](https://github.com/user-attachments/assets/98983aa1-854e-4ec8-85e3-ee13629e83fc)

8) Multiple If-Else


![WhatsApp Image 2025-11-16 at 00 11 01_2e0af7b9](https://github.com/user-attachments/assets/a5368aed-08d1-4623-b34d-cbddd2784402)

9) Multiple If-Else with Ternary


![WhatsApp Image 2025-11-16 at 00 11 17_c09b2056](https://github.com/user-attachments/assets/8917aa29-c4ca-4395-b19c-dbe551a6510b)

10) Loops

    - for loop

     ![WhatsApp Image 2025-11-16 at 00 11 30_5126b5ab](https://github.com/user-attachments/assets/6eaaf7af-597c-4a2c-bbc4-f3774334be02)

    - while loop

    ![WhatsApp Image 2025-11-16 at 00 11 43_e1f438e7](https://github.com/user-attachments/assets/8890fdad-975c-45bf-9150-a24b18a0a89d)

    - do-while loop

     ![WhatsApp Image 2025-11-16 at 00 11 54_8fc3acaa](https://github.com/user-attachments/assets/4b4b1a12-af7e-4972-b1a0-d27ed43129e7)

12) Jump Statements

    - break

    ![WhatsApp Image 2025-11-16 at 00 12 10_dc612f8c](https://github.com/user-attachments/assets/46f3be89-f65a-42df-a8da-d01d5236150f)

    - continue

     ![WhatsApp Image 2025-11-16 at 00 12 29_793305fa](https://github.com/user-attachments/assets/4392beec-ecc8-47b9-bb83-bde5fd8f3a57)

    - return

      ![WhatsApp Image 2025-11-16 at 00 12 47_03de5ea7](https://github.com/user-attachments/assets/dd55404a-3d50-4897-9186-0d6706939450
