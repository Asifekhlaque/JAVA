package projectjava;

import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
class creatfile {
    void create(){
        try{
            File as = new File("D:\\java\\asif.txt");
            as.createNewFile();
        }catch(IOException s){
            System.out.println("An error occurred while creating the file.");
            s.printStackTrace();
        }
    }
}
class writefile {
    void write(){
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the name of the text");
            String name = scanner.nextLine();
            FileWriter as = new FileWriter("D:\\java\\asif.txt");
            as.write(name+"\n");
            as.close();
        }catch(IOException s){
            System.out.println("An error occurred while creating the file.");
            s.printStackTrace();
        }
        }
        }
class readfilefd{        
    void read(){
        try{
        File as = new File("D:\\java\\asif.txt");
        Scanner sc=new Scanner(as);
        while(sc.hasNextLine()){
            String data = sc.nextLine();
            System.out.println(data);
        }
        }
        catch(IOException s){
            System.out.println("Not Found");
            s.printStackTrace();
        }
    }  
} 
class deletefile{
    void delete(){
        try{
            File as = new File("D:\\java\\asif.txt");
            as.delete();
        }catch(Exception s){
            System.out.println("An error occurred while creating the file.");
            s.printStackTrace();
        }
    }
} 

public class readfile {
    public static void main(String[] args) {
        System.out.println("1. Create");
        System.out.println("2. Write");
        System.out.println("3. Read");
        System.out.println("4. Delete");
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch(button){
        case 1:
            creatfile a = new creatfile();   
            a.create(); 
            break;
        case 2:
            writefile as = new writefile();
            as.write();
            break;
        case 3:
            readfilefd ad = new readfilefd();
            ad.read();
            break;
        case 4:
            deletefile ae = new deletefile();
            ae.delete();
            break;
        default:
            System.out.println("Invalid");
            break;   
        }
    }
}