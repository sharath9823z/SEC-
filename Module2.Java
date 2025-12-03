1)ARITHMETIC OPERATORS 
 public class ArithmeticOperators {
  public static void main(String[] args) {
  int a = 15, b = 4;
 
  System.out.println("a + b = " + (a + b)); // Addition
  System.out.println("a - b = " + (a - b)); // Subtraction
  System.out.println("a * b = " + (a * b)); // Multiplication
  System.out.println("a / b = " + (a / b)); // Division (integer)
  System.out.println("a % b = " + (a % b)); // Modulus
  }
  }

2)BITWISE OPERATORS
  public class BitwiseOperators {
  public static void main(String[] args) {
  int a = 5, b = 3;  // 5 = 0101, 3 = 0011
  System.out.println("a & b = " + (a & b)); // AND
  System.out.println("a | b = " + (a | b)); // OR
  System.out.println("a ^ b = " + (a ^ b)); // XOR
  System.out.println("~a = " + (~a));    
   // NOT
  System.out.println("a << 1 = " + (a << 1)); // Left Shift
  System.out.println("a >> 1 = " + (a >> 1)); // Right Shift
  }
  }

3)RELATIONAL OPERATORS
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
4)BOOLEAN LOGICAL OPERATORS
 public class BooleanLogicalOperators {
    public static void main(String[] args) {
        boolean p = true, q = false;  // Added space after "boolean"
        System.out.println("p && q = " + (p && q)); // Logical AND
        System.out.println("p || q = " + (p || q)); // Logical OR
        System.out.println("!p = " + (!p));         // Logical NOT
    }
}

5)THE ? : (TERNARY) OPERATOR
  public class TernaryOperator {
  public static void main(String[] args) {
  int a = 10, b = 20;
  int max = (a > b) ? a : b;  // If a > b then max = a, else max = b
  System.out.println("Maximum is: " + max);
  }
  }

6)OPERATOR PRECEDENCE USING PARENTHESES
  public class OperatorPrecedence {
  public static void main(String[] args) {
  int result = 10 + 5 * 2;    // Multiplication has higher precedence than addition
  System.out.println("10 + 5 * 2 = " + result);
  int result2 = (10 + 5) * 2; // Parentheses override precedence
  System.out.println("(10 + 5) * 2 = " + result2);
  }
  }

7)CONTROL STATEMENTS: JAVA’S SELECTION / 
CONDITIONAL STATEMENTS
  public class IfElseDemo {
  public static void main(String[] args) {
  int num= 10;
  if (num% 2 == 0) {
 
System.out.println(num + " is Even");
  } else {
  System.out.println(num + " is Odd");
  }
  }
  }
8)MULTIPLE IF-ELSE (NORMAL WAY)
 public class MultipleIfElse {
 public static void main(String[] args) {
 int marks = 72;
 if (marks >= 90) {
 System.out.println("Grade: A");
 } else if (marks >= 75) {
 System.out.println("Grade: B");
 } else if (marks >= 50) {
 System.out.println("Grade: C");
 } else {
 System.out.println("Grade: Fail");
 }
 }
 }

9)MULTIPLE IF-ELSE (SINGLE LINE USING TERNARY 
OPERATOR)
  public class MultipleIfElseTernary {
  public static void main(String[] args) {
  int marks = 72;
  String grade = (marks >= 90) ? "A" :
 (marks >= 75) ? "B" :
 (marks >= 50) ? "C" : "Fail";
  System.out.println("Grade: " + grade);
  }
  }
10)ITERATION (LOOPING) STATEMENTS
 (a) for loop
  public class ForLoopDemo {
  public static void main(String[] args) {
  for (int i= 1; i <= 5; i++) {
  }
  }
  }
 System.out.println("Count: " + i);
(b) while loop
  public class WhileLoopDemo {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println("While loop count: " + i);
            i++;
        }
    }
}
(c) do-while loop
  public class DoWhileDemo {
  public static void main(String[] args) {
  int i= 1;
  do {

 System.out.println("Do-While count: " + i);
 i++;
  } while (i<= 5);
  }
  }
11)JUMP STATEMENTS
 (a) break
  public class BreakDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // exits loop when i equals 5
            }
            System.out.println("i = " + i);
        }
    }
}
(b) continue
  public class ContinueDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // skips iteration when i equals 3
            }
            System.out.println("i = " + i);
        }
    }
}
(c) return
 public class ReturnDemo {
    public static void main(String[] args) {
        System.out.println("Before return");
