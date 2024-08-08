public class Main {
    public static void main(String[] args) {
        System.out.println("We are going to learn about operators.");
//        What is operators?
//        Operators are used to perform operation on the operands.
//        There are  types of operators.
//        1. Arithmetics Operators (+, -, *, /)
//        2. Assignment Operators (=, +=)
//        3. Comparison Operators (==, >=, =<)
//        4. Logical Operators (&&, ||, !)
//        5. Bitwise Operators (&, !)

        // 1. Arithmetic Operators (+, -, *, /)
        int a = 10;
        int b = 5;

        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println();

        // 2. Assignment Operators (=, +=)
        int c = 20;
        System.out.println("Assignment Operators:");
        System.out.println("c = " + c); // Simple assignment
        c += 10; // Add and assign
        System.out.println("c += 10 -> c = " + c);
        System.out.println();

        // 3. Comparison Operators (==, >=, <=)
        System.out.println("Comparison Operators:");
        System.out.println("a == b -> " + (a == b)); // Equal to
        System.out.println("a >= b -> " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b -> " + (a <= b)); // Less than or equal to
        System.out.println();

        // 4. Logical Operators (&&, ||, !)
        boolean x = true;
        boolean y = false;

        System.out.println("Logical Operators:");
        System.out.println("x && y -> " + (x && y)); // Logical AND
        System.out.println("x || y -> " + (x || y)); // Logical OR
        System.out.println("!x -> " + (!x));         // Logical NOT
        System.out.println();

        // 5. Bitwise Operators (&, ^)
        int d = 6;  // In binary: 110
        int e = 4;  // In binary: 100

        System.out.println("Bitwise Operators:");
        System.out.println("d & e -> " + (d & e)); // Bitwise AND
        System.out.println("d ^ e -> " + (d ^ e)); // Bitwise XOR
        System.out.println();


//        Here’s a table to help you better understand the operator precedence and associativity in Java:

//| **Precedence Level** | **Operator**                                        | **Description**                       | **Associativity**       |
//|----------------------|----------------------------------------------------|---------------------------------------|-------------------------|
//| 1 (Highest)          | `expr++`, `expr--`                                  | Postfix increment, decrement          | Left-to-Right           |
//| 2                    | `++expr`, `--expr`, `+expr`, `-expr`, `~`, `!`      | Unary increment, decrement, positive, negative, bitwise NOT, logical NOT | Right-to-Left           |
//| 3                    | `*`, `/`, `%`                                       | Multiplication, division, modulus     | Left-to-Right           |
//| 4                    | `+`, `-`                                            | Addition, subtraction                 | Left-to-Right           |
//| 5                    | `<<`, `>>`, `>>>`                                   | Bitwise shift left, right, unsigned right | Left-to-Right       |
//| 6                    | `<`, `>`, `<=`, `>=`, `instanceof`                  | Relational operators, type comparison | Left-to-Right           |
//| 7                    | `==`, `!=`                                          | Equality operators                    | Left-to-Right           |
//| 8                    | `&`                                                 | Bitwise AND                           | Left-to-Right           |
//| 9                    | `^`                                                 | Bitwise XOR                           | Left-to-Right           |
//| 10                   | `|`                                                 | Bitwise OR                            | Left-to-Right           |
//| 11                   | `&&`                                                | Logical AND                           | Left-to-Right           |
//| 12                   | `||`                                                | Logical OR                            | Left-to-Right           |
//| 13                   | `? :`                                               | Ternary conditional                   | Right-to-Left           |
//| 14                   | `=`, `+=`, `-=`, `*=`, `/=`, `%=`, `<<=`, `>>=`, `>>>=`, `&=`, `^=`, `|=` | Assignment operators | Right-to-Left |
//| 15 (Lowest)          | `,`                                                 | Comma operator                        | Left-to-Right           |

//                This table organizes the operators based on their precedence level, associativity, and type. Higher precedence operators are listed first, meaning they will be evaluated before lower precedence operators in an expression.

    }

}