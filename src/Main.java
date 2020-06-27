import java.util.*;
import static java.lang.System.*;

public class Main {
    public static Draw d = new Draw();
    public static void main(String[] args) {
        loginpage();// bank login page
        var abhi = new BankAccount();// homepage
        // checkings
        // savings
        // withdraw
    }
    public static void loginpage() {

        out.println("___________ WELCOME TO APPLE BANK______________");
        d.doubleLine();
        out.println("SELECT THE FOLLOWING");
        d.singleLine();
        out.println("1.LOGIN");
        out.println("2.SIGNUP");
        d.doubleLine();
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
                var loginPage = new login(); //login
                flag = true;
            } else if (input == 2) {
                var signup = new login(true); //signup
                flag = true;
            } else {
                out.println("Invalid input");
                flag = false;
            }
        }
    }
}
