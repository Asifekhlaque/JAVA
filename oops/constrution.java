//User for adding update without calling the function
package oops;
class C{
    C(){ // Void nhi dana hai Construtor
        System.out.println("Your output will be construtor");
    }
    void Add(){
        System.out.println("Your output will be Add"+(2+3));
    }
    void Sub(){
        System.out.println("Your output will be SUb"+(2-3));
    }
    void Mult(){
        System.out.println("Your output will be Mult"+(2*3));
    }
    void Div(){
        System.out.println("Your output will be Div"+(2/3));
    }
    
}
public class constrution {
    public static void main(String[] args) {
        C obj= new C();
        obj.Add();
        obj.Sub();
        obj.Mult();
        obj.Div();
    }
}