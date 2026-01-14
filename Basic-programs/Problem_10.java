import java.util.Scanner;

public class Problem_10{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double h = input.nextDouble();

        double totalInches = h / 2.54;

        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        System.out.println("Your Height in cm is " + h);
        System.out.println(" while in feet is " + feet);
        System.out.println(" and inches is " + inches);
    }
    
}