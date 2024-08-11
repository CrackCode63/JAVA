public class Main {
    public static void main(String[] args) {
        System.out.println("Associativity of Operators in java");
//        Associativity of Operators in java
//        1. Precedence
//         determines the order in which operators are evaluated in an expression with multiple operators. Operators with higher precedence are evaluated before those with lower precedence.
//
//        2. Associativity
//         determines the order in which operators of the same precedence level are evaluated. Associativity can be either left-to-right or right-to-left.

        int result = 2 + 3 * 4;  // result = 14, not 20
        System.out.println(result);

        int result1 = 10 - 5 - 2; // result = 3, not 7
        System.out.println(result1);




    }
}