//Security of Information form end user
package oops;
abstract class emp{
    abstract void s();
    void info(){
        System.out.println("Sum 1:"+(4+9));
    }
}
class empx extends emp{
    void s(){
        System.out.println("Sum 2:"+(2+3));
    }
}
public class abstractionkey {
    public static void main(String[] args) {
        emp obj=new empx();
        obj.s();
        obj.info();
        
    }
}