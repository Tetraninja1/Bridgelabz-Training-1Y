import java.util.Scanner;
public class Calculate_Simple_Interest{
	public static void main (String[] args){
	
	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter Principal");
		float p = in.nextFloat();
	System.out.println("Enter rate");
		float r = in.nextFloat();
	System.out.println("Enter time");
		float t = in.nextFloat();
	
	float i = (p*r*t)/100;
	System.out.println("The interest is :"+ i);
	}
}		