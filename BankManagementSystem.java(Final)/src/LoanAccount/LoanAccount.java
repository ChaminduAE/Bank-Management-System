//Declaration of loan account package
package LoanAccount;

//Import essential packages
import Transaction.Transaction;
import java.util.Scanner;

//Declaration of loan account class which extends transaction class
public class LoanAccount extends Transaction {
    protected float loan_account_interest_rate;
    protected int loan_duration;
    protected double total_interest_pay;
    protected double total_pay;
    protected double repaid_amount;
    protected double total_repaid_amount;
    protected double debt_balance;

    //Add loan accounts to the bank management system
    public void add_loan_account(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the loan account ID");
        int a = sc.nextInt();
        System.out.println("Please enter the account holder ID");
        long b = sc.nextLong();
        System.out.println("Please enter the loan account type");
        String c = sc.next();
        System.out.println("Please enter the loan amount");
        double d = sc.nextDouble();
        System.out.println("Please enter the account holder name");
        String e = sc.next();
        System.out.println("Please enter the date of opening");
        String f = sc.next();
        System.out.println("Please enter the monthly interest rate");
        float g = sc.nextFloat();
        System.out.println("Enter the loan term in months");
        int h = sc.nextInt();

        super.add_account(a,b,c,d,e,f);
        System.out.println("Account Added Successfully");
        System.out.print("\n");
        this.loan_account_interest_rate = g;
        this.loan_duration = h;
        this.total_interest_pay = d*(g/100.0)*h;
        System.out.println("Total interest to be paid to repay the loan: Rs."+total_interest_pay);
        this.total_pay = (d+total_interest_pay);
        System.out.println("Total amount to be paid to repay the loan: Rs."+total_pay);
    }

    //Search loan account using loan account id
    public void search_loan_account(int a){
        super.search_account(a);
        int acids = a;
        if(account_id == acids){
            System.out.println("Total interest to be paid to repay the loan: Rs."+total_interest_pay);
            System.out.println("Total amount to be paid to repay the loan: Rs."+total_pay);
            System.out.println("Total amount repaid: Rs."+total_repaid_amount);
            this.debt_balance = total_pay - total_repaid_amount;
            System.out.println("Debt Balance = Rs."+debt_balance);
        }

    }

    //Display all loan accounts
    public void view_loan_account(){
        super.view_account();
        System.out.println("Total interest to be paid to repay the loan: Rs."+this.total_interest_pay);
        System.out.println("Total amount to be paid to repay the loan: Rs."+this.total_pay);
        System.out.println("Total amount repaid: Rs."+this.total_repaid_amount);
        this.debt_balance = total_pay - total_repaid_amount;
        System.out.println("Debt Balance = "+this.debt_balance);
    }

    //Repay loan
    public void repay_loan_account(int a){
        int acids = a;
        if(account_id == acids) {
            System.out.println("Total amount to be paid to repay the loan: Rs." + total_pay);
            System.out.println("Total amount repaid: Rs." + total_repaid_amount);
            this.debt_balance = total_pay - total_repaid_amount;
            System.out.println("Debt Balance = " + debt_balance);
            System.out.print("Enter the repaying amount: ");
            Scanner sc = new Scanner(System.in);
            double j = sc.nextDouble();
            this.repaid_amount = j;
            this.total_repaid_amount = total_repaid_amount + repaid_amount;
            debt_balance = debt_balance - repaid_amount;
            System.out.println("Repayment Successful!");
            System.out.println("Remaining debt balance: Rs." + debt_balance);
        }

    }

    //Check debt balance
    public void checkDebtBalance(int a){
        int acids = a;
        if(account_id == acids) {
            this.debt_balance = total_pay - total_repaid_amount;
            System.out.println("Debt Balance = Rs."+debt_balance);
        }
    }

    //Repay loan
    public void loan_account_transferTo(int a){
        int bacids = a;
        if(account_id == bacids) {
            debt_balance -= transfer_amount;
            System.out.println("The loan account " + a + " is debited by Rs." + transfer_amount);
            System.out.println("Available debt balance of account " + a + " is Rs." + debt_balance);
        }
    }

}