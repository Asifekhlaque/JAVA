//Enter 3 numbers form user & make a function to print their average
package Functionquestion;

import java.util.Scanner;

public class funcq1 {
    public static void avg(float a,float b,float c){
    System.out.println((a+b+c)/3);
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers form user & make a function to print their average");
        avg(sc.nextFloat(),sc.nextFloat(),sc.nextFloat());
    }
}
