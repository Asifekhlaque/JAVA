//Doing multiple task within the system at one time
package oops;
class textt extends Thread{
    public void run(){
        for(int i=1;i<=6;i++){
            System.out.println("Ankit");
            try{Thread.sleep(1000);}catch(Exception a){}
        }
    }
}

class tex extends Thread{
    public void run(){
        for(int i=1;i<=6;i++){
            System.out.println("Asif");
            try{Thread.sleep(1000);}catch(Exception a){}
        }
    }
}
public class threadhandling {
    public static void main(String[] args){
        textt obj=new textt();
        tex ob = new tex();
        obj.start();
        try{Thread.sleep(1000);}catch(Exception a){}
        ob.start();
    }
}
