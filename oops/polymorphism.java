//The word “poly” means many and “morphs” means forms. It mean same object but different behavior.
//
package oops;
class x{
    //void is a function in the class
    void xyz(int x){
        System.out.println("Square is :"+(x*x));
    }
    void xyz(String x){
        System.out.println("String is :"+x);
    }
    void xyz(int x, String y){
        System.out.println("I is polymorphism"+"_"+x+y);
    }
}
public class polymorphism {
    public static void main(String args[]){
    x o = new x();
    o.xyz(1,"asif");
}
}