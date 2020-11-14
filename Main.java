import java.util.Scanner;

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
}

public class Main {
    public static void main(String[] argv) {

    }
}