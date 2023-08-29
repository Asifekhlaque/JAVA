// Write a function that takes in the radius as input and returns the circumference of a circle.
package Functionquestion;
import java.util.Scanner;
public class funcq4 {
    public static void circle(float r){
        System.out.println("Circumference :"+2*3.14*r);
        return;
    }
    public static void main(String[] args){
        System.out.println("Enter radius");
        Scanner sc = new Scanner(System.in);
        circle(sc.nextFloat());
    }
}
