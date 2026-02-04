import java.util.Scanner;
public class SalaryArr {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int emp = 10;
        int[] yr = new int[emp];
        double[] salary = new double[emp];
        double[] bonus = new double[emp];
        double[] newsal = new double[emp];

        for (int i=0; i<emp; i++){
            System.out.println("Enter the years of service and salary "+ i);
            yr[i] = in.nextInt();
            salary[i] = in.nextDouble();
        }

        for(int i=0;i<emp; i++){
            if(yr[i]<5){
                bonus[i] = salary[i]*(2/100);
            } else {
                bonus[i] = salary[i]*(5/100);
            }
        }
        for (int i=0; i<emp; i++){
            newsal[i] = salary[i]+bonus[i];
        }
        for (int i=0; i<emp; i++){
            System.out.println("Old salary "+ salary[i] );
            System.out.println("New salary "+ newsal[i] );
        }
    }
}
