package condtition_statement;

import java.util.Scanner;

public class condition4 {
     public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a numbers");
    int button = sc.nextInt();
    switch(button){
        case 1:
            System.out.println("Hello");
            break;
        case 2:
            System.out.println("Good luck");
            break;
        default:
            System.out.println("Invalid");
    }
}
}