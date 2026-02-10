package Com.gla.string;

public class NullPointerDemo {
        public static void generateException() {
            String text = null;
            System.out.println(text.length());
        }

        public static void handleException() {
            String text = null;

            try {
                System.out.println(text.length());
            } catch (NullPointerException e) {
                System.out.println("NullPointerException caught!");
                System.out.println("Reason: Trying to access a method on a null object.");
            }
        }

        public static void main(String[] args) {

            generateException();

            handleException();

            System.out.println("Program continues normally...");
        }
    }


