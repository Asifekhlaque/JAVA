package loopingstatement;
public class evendigitsum {
    public static void main(String[] args) {
        int x= 48764,s=0,t=0;
        while(x!=0){
            t=x%10;
            if(t%2==0){
                s=s+t;
            }
            x=x/10;
        }
        System.out.println(s);
}
}