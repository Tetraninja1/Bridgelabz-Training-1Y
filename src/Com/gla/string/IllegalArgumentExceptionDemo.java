package Com.gla.string;
import java.util.Scanner;

public class IllegalArgumentExceptionDemo {


        public static void generateException(String text) {
            System.out.println(text.substring(4, 2));
        }

        public static void handleException(String text) {

            try {
                System.out.println(text.substring(4, 2));
            }
            catch (IllegalArgumentException e) {
                System.out.println("IllegalArgumentException caught!");
                System.out.println("Start index cannot be greater than end index.");
            }
            catch (RuntimeException e) {
                System.out.println("RuntimeException caught!");
                System.out.println("Invalid substring arguments.");
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String text = sc.next();

             generateException(text);
            handleException(text);
            System.out.println("Program continues after exception handling.");

        }
    }
