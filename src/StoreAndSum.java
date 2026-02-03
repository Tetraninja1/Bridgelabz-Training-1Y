import java.util.Scanner;
public class StoreAndSum {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);

        int[] num = new int[10];
        int count = 0;
        int sum = 0;

        System.out.println("Enter numbers (0 or negative number to stop):");

        while(count < 10){
            int input = in.nextInt();

            if(input <= 0){
                break;
            }else {
                num[count] = input;
                sum += input;
                count++;
            }
        }
        System.out.println("\nStored numbers:");
        for (int i = 0; i < count; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println("\nSum of numbers: " + sum);
    }
}
