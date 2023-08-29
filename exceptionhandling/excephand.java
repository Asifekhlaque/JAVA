package exceptionhandling;

public class excephand {
    public static void main(String[] args){
        int d;
        try{
            d=5/0;
        System.out.println(d);
        }
        catch(Exception e){//Unknown exception
            d=6;
            System.out.println(d+""+"Asif");
            // e.printStackTrace(); // show the exception
        }
        finally{
            System.out.println("Hello exception");
        }
    }
}