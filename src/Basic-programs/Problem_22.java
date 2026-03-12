import java.util.Scanner;

public class Problem_22{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = in.nextInt();

        System.out.print("Enter value of b: ");
        int b = in.nextInt();

        System.out.print("Enter value of c: ");
        int c = in.nextInt();        
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;


        System.out.println("The results of Int Operations are:");
        System.out.println(result1 + ", " + result2 + ", " + result3 + ", and " + result4);
		}
}