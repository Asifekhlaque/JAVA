package loopingstatement;
public class recuration {
    static void print(int n){
        if(n>0){
            print(n-1);
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args){
        print(300);
    }
}
