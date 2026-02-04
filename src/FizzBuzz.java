import javax.management.StringValueExp;
import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to check");
        int n;
        n = in.nextInt();
        if(n>=0){
            System.out.println("Enter +ve number");
        }
        String[] result = new String[n];
        for(int i=1;i<=n;i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result[i-1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                result[i-1] = "Fizz";
            } else if (i % 5 == 0) {
                result[i-1] = "Buzz";
            }else{
                result[i-1] = String.valueOf(i);
            }
        }
            for (int i = 0; i< result.length; i++){
                System.out.println(result[i]);
            }
    }
}
