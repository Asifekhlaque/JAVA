package condtition_statement;
import java.util.*;
public class condition2 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first numbers");
    int a = sc.nextInt();
    System.out.println("Enter two numbers");
    int b = sc.nextInt();
    if(a>b){
        System.out.println("a is greater"+a);
    }
    else{
        if(a==b){
            System.out.println("a and b are equal"+a+b);
        }
        else{
            System.out.println("b is greater"+b);
        }
    }
}
}