import java.util.Scanner;
import java.util.ArrayList;

class Account {
    String fName, lName, output;
    float sBalance, cBalance, total;

    public Account(String fName, String lName, float sBalance, float cBalance) {
        this.fName = fName;
        this.lName = lName;
        this.sBalance = sBalance;
        this.cBalance = cBalance;
        this.total = this.sBalance + this.cBalance;
        this.output = "";
    }

    public String toString() {
        this.output = "The balance of " + this.fName + "'s account is as follows:\n"
        + "Savings Account: " + String.format("%.2f", this.sBalance)
        + "\nChecking Account: " + String.format("%.2f", this.cBalance);
        return this.output;
    }
}




public class Main {

    public static ArrayList<Account> populateList() {
        ArrayList<Account> bankList = new ArrayList<Account>();
        bankList.add(new Account("Drake", "Bell", 4.20f, 69f));
        bankList.add(new Account("Josh", "Peck", 66.6f, 20.40f));
        bankList.add(new Account("Jamie", "Fox", 44f, 3456f));
        return bankList;
    }

    public static int displayNames(ArrayList<Account> bankList) {
        System.out.println("We have accounts for the following individuals. Which account would you like to view? (Please input an integer)");
        int y = 1;
        for (Account x : bankList) {
            System.out.println(y + ". " + x.fName + " " + x.lName);
            y++;
        }
        return y;
    }
    public static void main(String[] argv) {
        ArrayList<Account> bankList = populateList();
        int listSize = displayNames(bankList);
        Scanner myObj = new Scanner(System.in);
        System.out.print("> ");
        int promptInput = myObj.nextInt();
        if (promptInput > 0 && promptInput < listSize) {
            System.out.println(bankList.get(promptInput - 1));
        }
        System.out.print("Would you like to create a new account? (Y/N)");
        myObj.nextLine();
        String createAccount = myObj.nextLine();
        if (createAccount.equals("Y") || createAccount.equals("y") || createAccount.equals("yes")
            || createAccount.equals("YES") || createAccount.equals("Yes")) {
            System.out.print("First Name: ");
            String fName = myObj.nextLine();
            System.out.print("Last Name: ");
            String lName = myObj.nextLine();
            System.out.print("Amount of money in your savings account: ");
            float sBalance = myObj.nextFloat();
            System.out.print("Amount of money in your checking account: ");
            float cBalance = myObj.nextFloat();
            Account myAccount = new Account(fName, lName, sBalance, cBalance);
            System.out.println(myAccount.toString());
        }
        myObj.close();
    }
}