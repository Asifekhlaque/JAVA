package projectjava;
import java.util.Scanner;

public class calculater {
     public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number");
    int a = sc.nextInt();
    System.out.println("Enter second number");
    int b = sc.nextInt();
    System.out.println("For add press 1\nFor subtract press 2\nFor multiply press 3\nFor divide press 4");
    int c=sc.nextInt();
    switch(c){
        case 1: System.out.println(a+b);
        break;
        case 2: System.out.println(a-b);
        break;
        case 3: System.out.println(a*b);
        break;
        case 4: System.out.println(a/b);
        break;
        default:System.out.println("Invalid");
    }

}
}