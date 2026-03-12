import java.util.Scanner;

public class Problem_21{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter unit price: ");
        double price = in.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = in.nextInt();

        double total = price * quantity;

        System.out.println("The total purchase price is INR " + total);
        System.out.println("if the quantity " + quantity);
        System.out.println("and unit price is INR " + price);
    }
}