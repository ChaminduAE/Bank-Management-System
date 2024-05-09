//Declaration of FD account package
package FdAccount;

//Import essential packages
import Transaction.Transaction;
import java.util.Scanner;

//Declaration of FD account class which extends transaction class
public class FdAccount extends Transaction {
    protected float fd_account_interest_rate;

    //Add FD accounts to the bank management system
    public void add_FdAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the account id");
        int ab = sc.nextInt();
        System.out.println("Please enter the account holder id");
        long bc = sc.nextLong();
        System.out.println("Please enter the account type");
        String cd = sc.next();
        System.out.println("Please enter the account balance");
        double de = sc.nextDouble();
        System.out.println("Please enter the account holder name");
        String ef = sc.next();
        System.out.println("Please enter the date of opening");
        String fg = sc.next();
        System.out.println("Please enter the account interest rate ");
        float  gh = sc.nextFloat();
        super.add_account(ab, bc, cd, de, ef, fg);
        this.fd_account_interest_rate = gh;
    }

    //Search FD account using FD account id
    public void search_fd_account(int ab) {
        super.search_account(ab);
    }

    //Display all FD accounts
    public void view_fd_account() {
        super.view_account();
    }

    public void fd_account_checkBalance(int ab){
        super.checkBalance(ab);
    }  //Check balance of the FD account

    public void fd_account_withdraw(int ab) {
        super.withdraw(ab);
    } //Withdraw from the FD account

    public void fd_account_transferFrom(int ab){
        super.moneyTransferFrom(ab);
    } //Transfer money from FD account

    public void fd_account_transferTo(int ab){
        super.moneyTransferTo(ab);
    } //Transfer money to FD account

    //Update FD account
    public void update_fd_account(int acid){
        int acids = acid;
        int p = 0;
        if(account_id == acids) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter the updated account id");
            int a = sc.nextInt();
            System.out.println("Please enter the updated account holder id");
            long b = sc.nextLong();
            System.out.println("Please enter the updated account type");
            String c = sc.next();
            System.out.println("Please enter the updated account balance");
            double d = sc.nextDouble();
            System.out.println("Please enter the updated account holder name");
            String e = sc.next();
            System.out.println("Please enter the updated date of opening");
            String f = sc.next();
            System.out.println("Please enter the updated account interest rate ");
            float g = sc.nextFloat();
            super.add_account(a, b, c, d, e, f);
            this.fd_account_interest_rate = g;
            System.out.println("---Account updated successfully---");
        }

    }

}



