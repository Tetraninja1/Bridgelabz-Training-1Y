import java.util.Scanner;
public class LC283{
    public static void main(String[] args) {
        int c = 0;
		int[] arr = new int[5];
		Scanner in = new Scanner(System.in);
        
		for(int i=0;i<arr.length;i++){
			arr[i]=in.nextInt();
    }
		
		for(int i=0; i<arr.length-1; i++){
            for(int j=0;j<arr.length-1; j++){
            if(arr[j] == 0){
                c=arr[j+1];
                arr[j+1] = arr[j];
                arr[j]=c;
                }
            }
        }for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");
    }
	}
}