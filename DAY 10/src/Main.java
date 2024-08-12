public class Main {
    public static void main(String[] args) {
        System.out.println("Types of Expression & Increment and Decrement!");
        // Integer and Integer
        int intA = 10;
        int intB = 5;
        int intResult = intA + intB;
        System.out.println("int + int = " + intResult + " (Type: int)");

        // Integer and Float
        float floatA = 10.5f;
        float floatResult = intA + floatA;
        System.out.println("int + float = " + floatResult + " (Type: float)");

        // Integer and Double
        double doubleA = 15.7;
        double doubleResult = intA + doubleA;
        System.out.println("int + double = " + doubleResult + " (Type: double)");

        // Float and Double
        doubleResult = floatA + doubleA;
        System.out.println("float + double = " + doubleResult + " (Type: double)");

        // String and Integer
        String strA = "Hello";
        String strResult = strA + intA;
        System.out.println("String + int = " + strResult + " (Type: String)");

        // Boolean AND operation
        boolean boolA = true;
        boolean boolB = false;
        boolean boolResult = boolA && boolB;
        System.out.println("boolean && boolean = " + boolResult + " (Type: boolean)");

        // Character and Integer (Addition of char and int)
        char charA = 'A';
        int charResult = charA + intA;
        System.out.println("char + int = " + charResult + " (Type: int)");

        // Integer and Boolean (Cannot perform arithmetic operation, so we'll just print the type)
        System.out.println("Cannot perform arithmetic operation on int and boolean.");

        // Implicit casting: Integer to Double
        double implicitCastResult = intA; // int is implicitly cast to double
        System.out.println("int implicitly cast to double: " + implicitCastResult + " (Type: double)");

        // Explicit casting: Double to Integer
        int explicitCastResult = (int) doubleA; // double is explicitly cast to int
        System.out.println("double explicitly cast to int: " + explicitCastResult + " (Type: int)");

//      Discuss about increment and decrement operators
        int a = 2;
        int b = 3;
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++b);
        System.out.println(b);
//       decrement operators
        System.out.println(a--);
        System.out.println(a);
        System.out.println(--b);
        System.out.println(b);
    }
}