package oops;
//inherientance ma ek child ek parent ko call kar sukta hai and multple nhi call kar sukta hai
import java.util.Scanner;
class a{
    static Scanner sc = new Scanner(System.in);
    int x,y;
    void sum(){
        
        System.out.println("Enter two number");
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println("Sum"+(x+y));
    }
}
class b extends a{
    void sub(){
        
        System.out.println("Enter two number");
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println("Sub"+(x-y));
    }
}
class c extends b{
    void mult(){
        
        System.out.println("Enter two number");
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println("Mult"+(x*y));
    }
}
class d extends b{
    void div(){
        
        System.out.println("Enter two number");
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.println("Div"+(x/y));
    }
}
public class inheritance{
    public static void main(String args[]){
        d u1 = new d();
        u1.sum();
        u1.sub();
        
        u1.div();
    }   
}
