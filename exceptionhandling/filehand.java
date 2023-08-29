package exceptionhandling;

import java.io.*;
public class filehand {
    public static void main(String[] args) throws Exception {//Exception handling hai
        File f = new File("D:\\java\\f.txt"); //file path and name
        // if(f.createNewFile()){ //create new file
        //     System.out.println("File created");
        // }
        if(f.exists()){
            System.out.println("File Name :"+f.getName());
            System.out.println("File Path :"+f.getPath());
            System.out.println("File Location :"+f.getAbsolutePath());
            System.out.println("File Write :"+f.canWrite());
            System.out.println("File Read :"+f.canRead());
            // System.out.println("File Read :"+f.hasNextLine());
            System.out.println("File Size :"+f.length());
            System.out.println("File Last Modified :"+f.lastModified());
        //     System.out.println("File Last Modified :"+f.delete());
        }
        else{
            System.out.println("File already exist");
        }
    }
}