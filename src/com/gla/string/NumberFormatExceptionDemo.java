package com.gla.string;
import java.util.Scanner;

public class NumberFormatExceptionDemo {

        public static void generateException(String text) {
            int number = Integer.parseInt(text);
            System.out.println("Number: " + number);
        }

        public static void handleException(String text) {

            try {
                int number = Integer.parseInt(text); // risky code
                System.out.println("Number: " + number);
            }
            catch (NumberFormatException e) {
                System.out.println("NumberFormatException caught!");
                System.out.println("Input is not a valid integer.");
            }
            catch (RuntimeException e) {
                System.out.println("RuntimeException caught!");
            }
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a value: ");
            String text = sc.next();

             generateException(text);

            handleException(text);

            System.out.println("Program continues after exception handling.");

            sc.close();
        }
    }