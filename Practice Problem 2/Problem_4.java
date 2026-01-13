import java.util.Scanner;

public class Problem_4{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter distance in feet: ");
        double feet = in.nextDouble();


        double yards = feet / 3;
        double miles = yards / 1760;

        
        System.out.println("Distance in feet is " + feet);
        System.out.println("Distance in yards is " + yards);
        System.out.println("Distance in miles is " + miles);
    }
    
}