import java.util.Scanner;
public class DivisibleBy5{
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter the number");
	int a = in.nextInt();
	
	int b = a % 5;
	if(b == 0){
		System.out.println("It is divisible by 5");
		}else{
		System.out.println("It is not divisible by 5 ");
		}
		}
	}