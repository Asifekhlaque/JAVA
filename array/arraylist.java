package array;
import java.util.*;
public class arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<Integer>();
        int p=0;
        int m =Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++) {
            a.add(sc.nextInt());
            if( p<a.get(i)){
                p=a.get(i);
            }
        }
        for (int i = 0; i < 3; i++) {
            if(m>a.get(i)){
                p=a.get(i);
            }
        }
        System.out.println("Max: "+p);
        System.out.println("Min: "+m);
        System.out.println(a);
        a.add(45);
        System.out.println(a);
        a.remove(2);
        System.out.println(a);
    }
}
