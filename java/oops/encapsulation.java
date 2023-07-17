package oops;
class bank{
    private int bal=500;
    void deposit(int x){
        bal=bal+x;
    }
    void showbal(){
        System.out.println("Your amount in bank is:"+bal);
    }
}
public class encapsulation {
    public static void main(String[] args) {
        bank obj=new bank();
        obj.deposit(600);
        // obj.bal=100;
        obj.showbal();
    }
}
