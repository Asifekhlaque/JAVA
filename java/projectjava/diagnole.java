package projectjava;
import java.util.*;
public class diagnole {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n[][] = new int[3][3];
        System.out.println("Enter numbers");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                n[i][j] = sc.nextInt();
            }
        }
        System.out.println("Output");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(n[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("primary diagonal");
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // primary diagonal
                if(i==j){
                    System.out.print(n[i][j]+" ");
                }
                
            }
        }
        System.out.println("");
            System.out.println("Secondary diagonal");
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // secondary diagonal
                if((i+j)==(3-1)){
                    System.out.print(n[i][j]+" ");
                }
            }
    }
}
}
