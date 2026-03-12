import java.util.Scanner;

public class Problem_14{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        System.out.print("Enter distance in ft");
        double Feet = in.nextDouble();

        double Yards = Feet / 3;
        double Miles = Yards / 1760;

        
        System.out.println("Distance in feet is " + Feet);
        System.out.println("Distance in yards is " + Yards);
        System.out.println("Distance in miles is " + Miles);
    }
}