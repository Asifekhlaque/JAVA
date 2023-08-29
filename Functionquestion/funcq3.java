// Write a function which take in 2 numbers and return the greatest number
package Functionquestion;
import java.util.Scanner;
public class funcq3 {
    public static void G(int a,int b){
    if(a>b){
        System.out.println(a+"is greater");
    }
    else{
        System.out.println(b+"is greater");
    }
        
    }
    public static void main(String[] args){
        System.out.println("Greatest number");
        Scanner sc = new Scanner(System.in);
        G(sc.nextInt(),sc.nextInt());
    }
}
