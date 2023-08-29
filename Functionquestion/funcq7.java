// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
package Functionquestion;
import java.util.Scanner;

public class funcq7 {

    public static void count(int num, int[] counts) {
        if (num > 0) {
            System.out.println("Positive");
            counts[0]++; // Increment positive count
        } else if (num < 0) {
            System.out.println("Negative");
            counts[1]++; // Increment negative count
        } else {
            System.out.println("Zero");
            counts[2]++; // Increment zero count
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered");
        Scanner sc = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        int[] counts = {positiveCount, negativeCount, zeroCount};

        while (true) {
            int num = sc.nextInt();
            if (num == 0) {
                break; // Exit the loop when the user enters 0
            }
            count(num, counts);
        }

        System.out.println("Count of positive numbers: " + counts[0]);
        System.out.println("Count of negative numbers: " + counts[1]);
        System.out.println("Count of zeros: " + counts[2]);
    }
}
