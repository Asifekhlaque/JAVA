package projectjava;
import java.util.*;
public class passwordcheak {
    public static void main(String[] args) {
        System.out.println("Enter password");
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        if(password.length() >= 8){
                System.out.println("Valid password having atleast 8 characters");
                    if(password.matches(".*[A-Z].*")){
                        System.out.println("Valid password having Uppercase");
                            if(password.matches(".*[a-z].*")){
                                System.out.println("Valid password having Lowercase");
                                    if(password.matches(".*[0-9].*")){
                                        System.out.println("Valid password having Numeric");
                                            if(password.matches(".*[@$!%*#?&].*")){
                                                System.out.println("Valid password having Special Character");
                                                System.out.println("Valid password");
                                            }
                                    }
                            }
                    }
                }
        else{
            System.out.println("Invalid password please try again");
        }
    }
}

// Make it with ASCIT Value again