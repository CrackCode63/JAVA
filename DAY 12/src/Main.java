import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Practice set!");
//        Question No:1
//        What is the result of following exp:
//        float a = 7/4*9/2
        float a = 7/4*9/2;
        System.out.println("The result is:"+a);

//        Question No:2
//        Write a java program to encrypt a grade by adding 8 to it and decrypt is by showing original correct grade
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);
//        Decrypting the grade
        grade = (char)(grade - 8);
        System.out.println(grade);

//        Question No:3
//        Write a pg to check the given no is greater than the no input by the user
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        System.out.println(no>8);
        System.out.println("Enter the no:");

//       Write the following Exp in java code
        int v = 2;
        int u = 4;
        int s = 2;
        float exp = (v*v-u*u)/(2*a*s);
        System.out.println(exp);


    }

}