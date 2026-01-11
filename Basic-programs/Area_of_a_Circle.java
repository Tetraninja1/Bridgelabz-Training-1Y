import java.util.Scanner;
public class Area_of_a_Circle{
	public static void main(String[] aegs){
	
 	Scanner scan = new Scanner(System.in);	
	System.out.println("Input the radius");
	
	int r = scan.nextInt();
	float A = (22.0f/7.0f) * (r*r);
	 System.out.println("Area of a circle is :"+ A);
	}
} 