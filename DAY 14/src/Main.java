import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("Strings Methods!");
//        String Methods --> Strings Methods operate on java Strings.
//        They can be used to find length of the strings, convert it
//        to lowercase etc.
        String a = "Abhi";
        System.out.println(a);
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(a.startsWith("A"));
        System.out.println(a.endsWith("A"));
        System.out.println(a.getBytes());
        System.out.println(a.indexOf("i"));
        System.out.println(a.length());
        System.out.println(a.substring(2));
        System.out.println(a.substring(1,3));
//        It include start index but not ending index.
        System.out.println(a.replace("A","k"));
        System.out.println(a.replace("Abhi", "Abhisek"));
        String non_trim_str = " Abhi ";
        System.out.println(non_trim_str);
        System.out.println(non_trim_str.trim());


    }
}