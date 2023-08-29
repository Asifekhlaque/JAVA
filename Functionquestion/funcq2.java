// Write a Function to print the sum of all odd numbers from 1 to n.
package Functionquestion;
import java.util.Scanner;
public class funcq2 {
    public static void odd(int n){
        int sum = 0;
        for(int i=1;i<=n;i++){
            
            if(i%2!=0){
                sum+=i;
            }

        }
        System.out.println(sum);
        return;
    }
    public static void main(String[] args){
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        odd(sc.nextInt());
    }
}
