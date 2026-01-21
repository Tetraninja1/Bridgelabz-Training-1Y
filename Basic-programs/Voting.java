import java.util.Scanner;

public class Voting {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int age;
        System.out.println("Enter the age ");
        age = in.nextInt();

        if (age >= 18){
            System.out.println("You are eligible to vote");
        }else if(age == 0){
            System.out.println("You are not born yet");
        }else{
            System.out.println("You are a kid");
        }


    }
}
