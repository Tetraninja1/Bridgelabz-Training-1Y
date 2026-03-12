import java.util.Scanner;
public class FactorialUsingWhile {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int number = sc.nextInt();

            if (number <= 0) {
                System.out.println("Please enter a positive integer");
                return;
            }

            System.out.println("Factors of " + number + ":");

            int counter = 1;

            while (counter < number) {
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter++;
            }
        }
    }