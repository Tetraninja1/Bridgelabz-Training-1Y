import java.util.Scanner;
public class Celsius_to_Fahrenheit_Conversion{
	public static void main(String[] args){
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter the temprature in C");
	
	int C = scan.nextInt();
	int F = (C * 9/5) + 32;
	
	System.out.println("Temprature in F : "+ F);
	
	//Scanner.close();
	}
}