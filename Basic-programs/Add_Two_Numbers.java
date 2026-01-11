import java.util.Scanner;
public class Add_Two_Numbers{

	public static void main(String[] args){
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("enter the number ");
	int a = scanner.nextInt();
	int b = scanner.nextInt();
	int c = a + b;
	System.out.println("sum is " + c);
	
	scanner.close();
	}
}
	
	