import java.util.Scanner;
public class Perimeter_of_a_Rectangle{
	public static void main(String[] args){
	
	Scanner in = new Scanner(System.in);
	System.out.println("Enter length");
		int l = in.nextInt();
	System.out.println("Enter width");
		int w = in.nextInt();	
	int p = 2*(l+w);
	System.out.println("perimetr is :"+ p);
	}
}