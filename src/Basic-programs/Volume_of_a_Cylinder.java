import java.util.Scanner;
public class Volume_of_a_Cylinder{
	public static void main(String[] args){
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter the radius");
		int r = scan.nextInt();
	
	System.out.println("Enter the height");
		int h = scan.nextInt();
	
	float v = (22.0f/7.0f) * (r*r)*h;
	
	System.out.println("Volume is :"+ v);
	}
}