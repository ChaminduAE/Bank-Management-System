//Declaration of saving account package
package SavingAccount;

//Import essential packages
import Transaction.Transaction;
import java.util.Scanner;

//Declaration of saving account class which extends transaction class
public class SavingAccount extends Transaction {
    protected float saving_account_interest_rate;

    //Add saving accounts to the bank management system
    public void add_saving_account(){
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
        this.saving_account_interest_rate = g;

    }

    //Search saving account using account id
    public void search_saving_account(int a){
        super.search_account(a);

    }

    //Display all saving accounts
    public void view_saving_account(){
        super.view_account();

    }
    public void savings_account_checkBalance(int a){
        super.checkBalance(a);
    } //Check balance of the saving account

    public void saving_account_withdraw(int a){
        super.withdraw(a);
    } //Withdraw from the saving account

    public void saving_account_deposit(int a){
        super.deposit(a);
    } //Deposit to the saving account

    public void saving_account_transferFrom(int a){
        super.moneyTransferFrom(a);
    } //Transfer money from saving account

    public void saving_account_transferTo(int a){
        super.moneyTransferTo(a);
    } //Transfer money to saving account

    //Update saving account
    public void update_saving_account(int acid){
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
            this.saving_account_interest_rate = g;
            System.out.println("---Account updated successfully---");
        }

    }

    }


