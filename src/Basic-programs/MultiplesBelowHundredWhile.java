import java.util.Scanner;
public class MultiplesBelowHundredWhile {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int number = sc.nextInt();

            System.out.println("Multiples of " + number + " below 100:");

            int counter = 100;

            while (counter >= 1) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        }
    }
