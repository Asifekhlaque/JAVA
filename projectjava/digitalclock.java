package projectjava;

import java.time.LocalTime;

public class digitalclock {
    public static void main(String[] args){
        System.out.println("Digital Clock");
        while(true){
        LocalTime obj = LocalTime.now();
        System.out.println(obj);
    }
}
}