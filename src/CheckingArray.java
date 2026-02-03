import java.util.Scanner;
public class CheckingArray {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

       int[] arr = new int[5];
       int a = arr.length;
       System.out.println("Enter the nums");
       for (int i = 0; i < 5; i++) {
           arr[i] = in.nextInt();
       }
       for(int i=0;i<5;i++){
           if(arr[i]>0){
               System.out.print(arr[i] +" is +ve");
               if(arr[i]%2==0){
                   System.out.println(" and an even number");
               }else{
                   System.out.println(" and odd number");
               }
           }else if(arr[i]<0){
               System.out.print(arr[i] +" is -ve");
           }else{
               System.out.println(arr[i] +" is 0");
               if(arr[i]%2==0){
                   System.out.println(" and an even number");
               }else{
                   System.out.println(" and odd number");
               }
           }
       }
       if(arr[0] == arr[a-1]){
           System.out.println("First and Last number of array are equal");
       }else if(arr[0] > arr[a-1]){
           System.out.println("First number is greater than Last number ");
       }else{
           System.out.println("Last number is greater than First number");
       }
   }
}
