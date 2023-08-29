package oops;
class Sup{
    static int c =0; // VVI if the same folder have the same name then it is not exiquitable
    Sup(){ // static aysa variable jo change na kara appna value jispar ussko lode kyia gyia hai
        c++;// update ka kaam aata hai
        System.out.println(c);
    }
}
public class staickeyword {
    public static void main(String[] args){
        Sup obj= new Sup();
        Sup obj1= new Sup();
        Sup obj2= new Sup();
    }
}
