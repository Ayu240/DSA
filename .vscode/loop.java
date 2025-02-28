import java.util.*;
import java.util.Scanner;/**
 * loop
 */
public class loop {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("enter name :)");
            String name = sc.nextLine();
            System.out.println("the lenght of name is :" + name.length());
            //   System.out.println("charAt :"+name.charAt(name.length()-1));
            for (int i = 0; i < name.length(); i++) {
                System.out.print("[ " + name.charAt(i) + "-> " + i + " ]");
            }
            System.out.println("\n");
            for (int i = name.length() - 1; i >= 0; i--) {
                System.out.print("[ " + name.charAt(i) + "-> " + i + " ]");
            }   
        }catch(ArithmeticException e){
            System.out.println("u are entered arithmtic sign:"+e);
        }
    }
}
