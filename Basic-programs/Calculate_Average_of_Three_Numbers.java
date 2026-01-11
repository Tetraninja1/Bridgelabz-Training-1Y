import java.util.Scanner;
public class Calculate_Average_of_Three_Numbers{
	public static void main(String[] args){
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter the numbers");
	int i = in.nextInt();
	int j = in.nextInt();
	int k = in.nextInt();
	
	float avg = (i + j + k)/2;
	System.out.println("Average is "+ avg );
	}
	}