package array;
import java.util.*;
public class singlearray {
    public static void main(String args[]){
       int n[]= new int[4];
       Scanner sc = new Scanner(System.in);
       for(int i=0;i<4;i++){
           System.out.println("Enter numbers");
           n[i]=sc.nextInt();
       }
       System.out.println("Enter number you want to search");
       int x=sc.nextInt();
       for(int i=0;i<n.length;i++){
        if(n[i]==x)
           System.out.println("The numbers is"+i);
       }
    }
}
