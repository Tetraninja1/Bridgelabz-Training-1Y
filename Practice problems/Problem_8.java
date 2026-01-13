import java.util.Scanner;
public class Problem_8{
	public static void main(String[] args){
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter the numbers");
	double i = in.nextDouble();
	
	double m = i * 0.621371;
	System.out.println("The total number of given km" + i);
	System.out.println("Number of miles are :"+ m);
	}
	}