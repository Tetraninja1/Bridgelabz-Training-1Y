import java.util.Scanner;
public class SumOfNaturalNumber {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            int sumLoop = 0;
            int i = 1;

            // Sum using while loop
            while (i <= n) {
                sumLoop += i;
                i++;
            }

            // Sum using formula
            int sumFormula = n * (n + 1) / 2;

            // Display results
            System.out.println("Sum using while loop = " + sumLoop);
            System.out.println("Sum using formula   = " + sumFormula);

            // Compare results
            if (sumLoop == sumFormula)
                System.out.println("Both computations are correct");
            else
                System.out.println("Results do not match");
        }
    }