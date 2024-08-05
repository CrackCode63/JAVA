import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        We are going to learn how to take User Input from the user
        System.out.println("Taking User Input");
//      Reading data from the keyboard
//        By using Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any no 1 :");
        int a = sc.nextInt();
        System.out.println("Enter any no 2 :");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of a and b is: "+sum);


    }
}