import java.util.Scanner;

public class Problem_2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double base = in.nextDouble();
        double height = in.nextDouble();

        double area = 0.5 * base * height;

        double areaCm = area * 6.4516;

        System.out.println("The area of the triangle in square inches is " + area );
        System.out.println("and the area of the triangle in square centimeters is " + areaCm);
    }
    
}