package condtition_statement;
import java.util.Scanner;

public class condtion3 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int button = sc.nextInt();
    if(button==1){
        System.out.println("Hello");
    } else if(button==2){
        System.out.println("Nameste");
    } else{
        System.out.println("Invalid");
    }
}
}