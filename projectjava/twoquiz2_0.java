package projectjava;
import java.util.Scanner;

public class twoquiz2_0{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("2+2=?");
        System.out.println("a:2");
        System.out.println("b:4");
        System.out.println("c:6");
        System.out.println("d:8");
        String ans1 = scanner.nextLine();
        if(ans1.equals("b:4")){//equals function to compare
            System.out.println("Correct answer");
        }
        else{
            System.out.println("Wrong Answer");
        }
        
    }
}
