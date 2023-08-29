// Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another
package Functionquestion;
import java.lang.Math;
import java.util.Scanner;
public class funcq8 {
    public static void power(int x, int y){
        System.out.println(Math.pow(x, y));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number"); 
        int n = sc.nextInt();
        System.out.println("Enter the Power"); 
        int m = sc.nextInt();
        power(n, m);
    }
}
