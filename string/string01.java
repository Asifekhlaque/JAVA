package string;
public class string01 {
    public static void main(String[] args){
        String s1="Apple is Blue";
        int ctn=0 , asd=0;
        for(int i=0;i<s1.length();i++){
            if(i=='a'||i=='u'||i=='o'||i=='i'||i=='e'){
            ctn=+i;
            }
            else{
                asd=+i;
            }
        }
        System.out.println("Vobal"+ctn);
            System.out.println(asd);
    }
}

