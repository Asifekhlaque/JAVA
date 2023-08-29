package oops;

interface z{
    int o();
}
class x implements z{
    public int o(){
        return 5;
    }
}
public class inferfacekeyword {
    public static void main(String[] args){
        z u1 = new x();
        System.out.println(u1.o());
    }
}
