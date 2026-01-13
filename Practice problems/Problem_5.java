public class Problem_5{
    public static void main(String[] args) {
        int tp = 14;
        int students = 3;

        int perstudent = tp / students;
        int remainingpens = tp % students;

        System.out.println("The Pen Per Student is "+ perstudent);
		System.out.println("and the remaining pen not distributed is "+ remainingpens);
    }
}