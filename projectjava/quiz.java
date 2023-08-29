package projectjava;
import java.util.Scanner;
public class quiz {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);//its a object for Scanner
    long start = System.currentTimeMillis();//Function for calculating time
    //addin score
    int score=0;
    
    System.out.println("What is the value of 4+6=?");
    int ans = sc.nextInt();//for scanning ans
        if(ans ==10){
        System.out.println("Correct answer");
        score=score+1;
        }
        else{
            System.out.println("Wrong Answer");
            
        }



    System.out.println("What is the value of 4^2=?");
    int an = sc.nextInt();
    if(an ==16){
        System.out.println("Correct answer");
        score=score+1;
    }
    else{
        System.out.println("Wrong Answer");
        
    }


    System.out.println("What is the value of 6x3=?");
    int a = sc.nextInt();
    if(a ==18){
        System.out.println("Correct answer");
        score=score+1;
    }
    else{
        System.out.println("Wrong Answer");
        
    }

    long end = System.currentTimeMillis();//Function for calculating time
    float sec =(end-start)/1000F;
    System.out.println(sec+"Second you have taken to solved a problem");
    System.out.println("Your score is "+score);
    }
}
