import java.util.Scanner;
public class MultiDimensionalArray {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][3];

        for (int i =0; i<3; i++){
            for(int j =0; j<3; j++){
                arr[i][j]= in.nextInt();
            }
        }
        int len = 0;
        for(int i=0; i<3;i++){
            for(int j=0; j<3; j++){
                len++;
            }
        }
        int[] lineaerarr = new int[len];
        int index =0;
        for(int i=0; i<3; i++){
            for(int j=0; j<3;j++){
                lineaerarr[index] = arr[i][j];
                index++;
            }
        }
            for (int i=0;i<index;i++){
                System.out.print(lineaerarr[i]+" ");
            }


    }
}
