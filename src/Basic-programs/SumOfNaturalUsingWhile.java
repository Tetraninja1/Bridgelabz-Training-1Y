import java.util.Scanner;
public class SumOfNaturalUsingWhile {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            int sumLoop = 0;

            // Sum using for loop
            for (int i = 1; i <= n; i++) {
                sumLoop += i;
            }

            // Sum using formula
            int sumFormula = n * (n + 1) / 2;

            System.out.println("Sum using for loop  = " + sumLoop);
            System.out.println("Sum using formula   = " + sumFormula);

            if (sumLoop == sumFormula)
                System.out.println("Both computations are correct");
            else
                System.out.println("Results do not match");
        }
    }