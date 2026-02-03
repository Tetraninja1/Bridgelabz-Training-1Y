import java.util.Scanner;
public class VotingArray {
    public static void main(String[] args){
     Scanner in = new Scanner(System.in);

     int[] arr = new int[10];
        System.out.println("Enter the ages of students");
        for(int i=0; i<10; i++){
            arr[i] = in.nextInt();
        }

        for(int i =0; i<10; i++) {
            if (arr[i] >= 18) {
                System.out.println("you are eligible to vote");
            } else {
                System.out.println("you are not eligible to vote");
            }
        }
    }
}
