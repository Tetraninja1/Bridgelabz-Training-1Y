package Com.gla.string;
import java.util.Scanner;

public class CharArrayCompare {

        public static char[] getCharsUsingCharAt(String text) {

            char[] chars = new char[text.length()];

            for (int i = 0; i < text.length(); i++) {
                chars[i] = text.charAt(i);
            }

            return chars;
        }

        public static boolean compareCharArrays(char[] a, char[] b) {

            if (a.length != b.length) {
                return false;
            }

            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    return false;
                }
            }

            return true;
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String text = sc.next();

            char[] manualChars = getCharsUsingCharAt(text);

            char[] builtInChars = text.toCharArray();

            boolean result = compareCharArrays(manualChars, builtInChars);
            System.out.print("Characters using charAt(): ");
            for (char c : manualChars) {
                System.out.print(c + " ");
            }

            System.out.print("\nCharacters using toCharArray(): ");
            for (char c : builtInChars) {
                System.out.print(c + " ");
            }

            System.out.println("\nAre both character arrays equal? " + result);

        }
    }

