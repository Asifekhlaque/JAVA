package oops;

class M{
    String Name;
    int Age;
    void info(int a,String b){
        Name=b;
        this.Age=a;
    }
    void show(){
        System.out.println("Name is"+Name);
        System.out.println("Age is"+Age);
    }
}
public class useofthis {
    public static void main(String[] args){
        M obj = new M();
        obj.info(27,"Ankit");
        obj.show();
    }
}
