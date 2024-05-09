//Declaration of Current account package
package CurrentAccount;

//Import essential packages
import Transaction.Transaction;
import java.util.Scanner;

//Declaration of current account class which extends transaction class
public class CurrentAccount extends Transaction {
    protected float current_account_interest_rate;

    //Add current accounts to the bank management system
    public void add_current_account(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the account id");
        int a = sc.nextInt();
        System.out.println("Please enter the account holder id");
        long b  = sc.nextLong();
        System.out.println("Please enter the account type");
        String c = sc.next();
        System.out.println("Please enter the account balance");
        double d = sc.nextDouble();
        System.out.println("Please enter the account holder name");
        String e = sc.next();
        System.out.println("Please enter the date of opening");
        String f = sc.next();
        System.out.println("Please enter the account interest rate ");
        float g = sc.nextFloat();
        super.add_account(a,b,c,d,e,f);
        this.current_account_interest_rate = g;

    }

   //Search current account using current account id
    public void search_current_account(int a){
        super.search_account(a);

    }

    //Display all current accounts
    public void view_current_account(){
        super.view_account();

    }


    public void current_account_checkBalance(int a){
        super.checkBalance(a);
    }  //Check balance of the current account

    public void current_account_withdraw(int a){
        super.withdraw(a);
    } //Withdraw from the current account

    public void current_account_deposit(int a){
        super.deposit(a);
    } //Deposit to the current account

    public void current_account_transferFrom(int a){super.moneyTransferFrom(a);} //Transfer money from current account

    public void current_account_transferTo(int a){
        super.moneyTransferTo(a);
    } //Transfer money to current account

    //Update current account
    public void update_current_account(int acid){
        int acids = acid;
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
            this.current_account_interest_rate = g;
            System.out.println("---Account updated successfully---");
        }

    }
}
