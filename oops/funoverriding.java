package oops;
class sbi{
    //void is a function in the class
    void rate(){
        System.out.println("2.6 Interst rate SBI");
    }
}
class bb{
    //void is a function in the class
    void rate(){
        System.out.println("6.8 Interst rate BB");
    }
}
class icici{
    //void is a function in the class
    void rate(){
        System.out.println("5.8 Interst rate ICICI");
    }
}
class inbank{
    //void is a function in the class
    void rate(){
        System.out.println("7.9 Interst rate INDIAN BANK");
    }
}            
public class funoverriding {
    public static void main(String args[]){
    sbi o = new sbi();
    o.rate();
    bb m = new bb();
    m.rate();
    inbank j = new inbank();
    j.rate();
}
}