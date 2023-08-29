package projectjava;
import java.util.*;
public class userid {
    public static void main(String[] args){
        System.out.println("Enter your id");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        System.out.println("Your id is"+id);
        id=id.toLowerCase();
        id= id.trim();
        if(id=="1234abc"){
            System.out.println("Valid id");
        }
        else{
            System.out.println("Invalid id");
        }
    }
}
