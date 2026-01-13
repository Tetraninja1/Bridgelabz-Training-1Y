import java.util.Scanner;
public class Problem_3{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = in.nextDouble();

        double side = perimeter / 4;

        System.out.println("The length of the side is " + side);
        System.out.println("whose perimeter is " + perimeter);
		}
    }