package string;

public class stringsexp {
    public static void main(String args[]){
        String a="asif";
        String b="byudek";
        // System.out.println(a);//Simple declaration and print the string value

        System.out.println(a.charAt(1));//print the character at index 1
        System.out.println(a.length());//print the length of the string
        System.out.println(a.codePointAt(2));//sky code point
        System.out.println(a.codePointBefore(2));//sky code point before 2
        System.out.println(a.codePointCount(0, 2));//sky code point count
        System.out.println(b.compareTo(a));//compare two string

    }
}
