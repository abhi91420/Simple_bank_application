import java.util.*;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {

        loginpage();// bank login page
        // homepage
        // checkings
        // savings
        // withdraw
    }
    public static void loginpage() {
        out.println("___________ WELCOME TO APPLE BANK______________");
        printDouble();
        out.println("SELECT THE FOLLOWING");
        printSingle();
        out.println("1.LOGIN");
        out.println("2.SIGNUP");
        printDouble();
        out.println("ENTER CHOICE : ");
        Scanner sc = new Scanner(in);
        boolean flag = false;
        while (!flag) {
            int input =0;
            try {
                input = Integer.parseInt(sc.nextLine());
            }catch(Exception e){
                out.println("Check your input");
            }
            if (input == 1) {
                printSingle();
                out.println("login page");//login
                flag = true;
            } else if (input == 2) {
                printSingle();
                out.println("Sign up page");//signin
                flag = true;
            } else {
                out.println("Invalid input");
                flag = false;
            }
        }
    }
    public static void printDouble(){
        out.println("===========================================");
    }
    public static void printSingle(){
        out.println("--------------------------------------------");
    }
}
