import java.util.Scanner;
public class Power_Calculation{
	public static void main(String[] args){
	
	Scanner in = new Scanner(System.in);
	System.out.println("Enter base"); 
	double b = in.nextDouble();
	
	System.out.println("Enter exponent"); 
	double e = in.nextDouble();
	
	
	double p = Math.pow(b , e);
	System.out.println(+ p);
	}
	}