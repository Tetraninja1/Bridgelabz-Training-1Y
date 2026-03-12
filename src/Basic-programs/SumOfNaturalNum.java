import java.util.Scanner;
public class SumOfNaturalNum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size : ");
        int n = in.nextInt();
        int[] arr;
        int sum=0;
        arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        for(int i=0; i<n;i++){
            sum = sum + arr[i];
        }
        System.out.println("The sum is : "+ sum);
    }
}
