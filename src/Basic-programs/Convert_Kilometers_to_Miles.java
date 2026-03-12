import java.util.Scanner;
public class Convert_Kilometers_to_Miles{
	public static void main(String[] args){
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter the numbers");
	double i = in.nextDouble();
	
	double m = i * 0.621371;
	System.out.println("Number of miles are :"+ m);
	}
	}