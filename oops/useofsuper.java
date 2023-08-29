package oops;
//Polymorphism Overriding 
// Use of super keyword
class A{
        int a=5,b=10;
        int s=a+b;
}
class B extends A{
        int c=5,d=10;
        int s=c-d;
    void show(){
            System.out.println(s);
            System.out.println(super.s);
            // using super  method which is A class
        }
    }

public class useofsuper {
    public static void main(String args[]){
        B obj = new B();
        obj.show();
    }
}
