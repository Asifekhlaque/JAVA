// Write an infinite loop using do while condition
package Functionquestion;
import java.util.Scanner;
public class funcq6 {
    public static void loop(){
        do{
            System.out.println("Enter your age");
        }while(true);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to start loop"); 
        int n = sc.nextInt();
        if(n==1){
            loop();
        }
        
    }
}
