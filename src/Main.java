import java.util.*;
import static java.lang.System.*;

public class Main {

    public static Scanner sc = new Scanner(in);
    public static Draw d = new Draw();

    public static void main(String[] args) {
        loginpage(); // bank login page
        var abhi = new BankAccount(); // homepage
        setAccountDetails(abhi); // Set details
        boolean exit = false;
        while(!exit) {
            mainMenu(abhi);
            out.println("PRESS 1 to exit or 2 to go back");
            if(sc.nextInt()==1){
                exit = true;
            }
        }
    }

    private static void mainMenu(BankAccount a) {
        d.doubleLine("SELECT OPTIONS");
        out.println("1.WITHDRAW");
        d.singleLine();
        out.println("2.DEPOSIT");
        d.singleLine();
        out.println("3.DETAILS");
        d.singleLine();
        var options = sc.nextInt();
        switch (options) {
            case 1:
                d.singleLine();
                out.println("WITHDRAW AMOUNT");
                d.singleLine();
                a.withdraw(sc.nextLong());// withdraw
                break;
            case 2:
                d.singleLine();
                out.println("DEPOSIT AMOUNT");
                d.singleLine();
                a.deposit(sc.nextLong());// deposit
                break;
            case 3:
                displayAccountDetails(a); // Account details
                break;
            default:
                out.println("Invalid option");
                break;
        }
    }

    private static void loginpage() {

        out.println("___________ WELCOME TO APPLE BANK______________");
        d.doubleLine();
        out.println("SELECT THE FOLLOWING");
        d.singleLine();
        out.println("1.LOGIN");
        out.println("2.SIGNUP");
        d.doubleLine();
        out.println("ENTER CHOICE : ");
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
    private static void setAccountDetails(BankAccount a) {
        out.println("Name :");
        a.setAccountHolder(sc.nextLine());
        out.println("Account no :");
        a.setAccountNo(sc.nextLine());
        out.println("Balance :");
        a.setAccountBalance(sc.nextLong());
    }

    private static void displayAccountDetails(BankAccount a) {
        d.doubleLine("Account Holder ");
        out.println(a.getAccountHolder());
        d.singleLine();
        d.doubleLine("Account no");
        out.println(a.getAccountNo());
        d.singleLine();
        d.doubleLine("Balance" );
        out.println(a.getAccountBalance());
        d.singleLine();
    }

}
