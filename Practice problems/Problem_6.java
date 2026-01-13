public class Problem_6{
    public static void main(String[] args) {
        int fee = 125000;
        int dispercent = 10;

        double discount = (fee * dispercent) / 100.0;
        double Final = fee - discount;

        System.out.println("The discount amount is INR " + discount);
        System.out.println("and final discounted fee is INR " + Final);
    }
}