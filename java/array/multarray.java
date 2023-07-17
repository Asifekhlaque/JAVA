package array;
import java.util.*;
public class multarray {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n[][]= new int[3][3];
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            
            n[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            System.out.print(n[i][j]+" ");
        }
        System.out.println();
    }
    System.out.println("Enter number you want to search");
    int x=sc.nextInt();
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            if(n[i][j]==x)
            System.out.print("Number is found at \n"+i+","+j);
        }
        System.out.println();
    }
        
    }
}
