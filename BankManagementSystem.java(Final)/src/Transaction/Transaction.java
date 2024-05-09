//Declaration of transction package
package Transaction;

//Import essential packages
import Customer_VIP.Customer_VIP;
import java.util.Scanner;

//Declaration of transaction class which extends VIP customer class
public class Transaction extends Customer_VIP {

    //Declaration of scanner class object
    Scanner sc = new Scanner(System.in);
    protected double withdrawal_amount;
    protected double deposit_amount;
    static protected double transfer_amount;

    //Check balance of the accounts
    public void checkBalance(int acid){
        int acids = acid;
        if(account_id == acids){
            System.out.println("Account Balance: Rs. "+account_balance);

        }

    }

    //Withdraw from accounts
    public void withdraw(int acid){
        int acids = acid;
        if(account_id == acids){
            System.out.print("Enter the withdrawal amount: ");
            this.withdrawal_amount = sc.nextDouble();
            if(withdrawal_amount>account_balance){
                System.out.println("The account do not have enough money to withdraw "+withdrawal_amount);
                System.out.println("Please check the account balance");
            }
            else{
                System.out.println("Account Withdrawn Successfully!");
                System.out.println("The account has been debited by "+withdrawal_amount);
                account_balance -= withdrawal_amount;
                System.out.println("The available account balance is: "+account_balance);
            }
        }


    }

    //Deposit to accounts
    public void deposit(int acid){
        int acids = acid;
        if(account_id == acids){
            System.out.print("Enter the deposit amount: ");
            this.deposit_amount = sc.nextDouble();

            System.out.println("Account Deposited Successfully!");
            System.out.println("The account has been credited by "+deposit_amount);
            account_balance += deposit_amount;
            System.out.println("The available account balance is: "+account_balance);
        }

    }

    //Coding for money transfer
    public void moneyTransferFrom(int acid){
        int acids = acid;

        if(account_id == acids){
            System.out.print("Enter the transfer amount: ");
            this.transfer_amount = sc.nextDouble();
            if(account_balance >= transfer_amount) {
                account_balance -= transfer_amount;
                System.out.println("Fund Transfer Successful!");
                System.out.println("The account " + acid + " is debited by Rs." + transfer_amount);
                System.out.println("Available account balance of account "+ acid +" is Rs."+account_balance);
            }
            else{
                System.out.println("Payer account balance is insufficient to transfer Rs."+transfer_amount);
            }
        }

    }

    public void moneyTransferTo(int bacid){
        int bacids = bacid;
        if(account_id == bacids){
            account_balance += transfer_amount;
            System.out.println("The account " + bacid + " is credited by Rs." + transfer_amount);
            System.out.println("Available account balance of account "+ bacid +" is Rs."+account_balance);
        }

    }
}
