import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Intro to String!");
//        What is String?
//        String is a collection and sequence of multiple characters and ends with null character.
//        How to initiate a string.
//        Strings are immutable and cannot be changed
        String name = "Abhi";
        System.out.println(name);
//        Different ways to use print in java
//       1. System.out.println();
//       2.System.out.print();
//       3.System.out.printf(); --> This is used for using format specifier in strings.
//        Let see an example:
        int a = 6;
        float b = 0.6f;
        System.out.printf("The value of a is %d and value of b is %f.", a , b);

//       4.System.out.format(); -->
//        Let see an example:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String st = sc.nextLine();
        System.out.println(st);



   }
}