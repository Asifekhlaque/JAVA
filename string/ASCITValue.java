package string;
public class ASCITValue {
    public static void main(String[] args){
        // for(char i=65;i<=90;i++){
        //     System.out.println(i);// }
        String s1= new String("Apple");
        String s="Aman";
        // s1=s1.concat("Hello");
        s1=s1.concat(s);
        System.out.println(s1);
        s=s.concat("Hello");
        System.out.println(s);
    }
}