//Declaration of Account package
package Account;

//Declaration of abstract class account
public abstract class  Account {
    protected int account_id;
    protected long account_customer_id;
    protected String account_type;
    protected double account_balance;
    protected String account_holder_name;
    protected String account_date_of_opening;

    //Add accounts to the bank management system
    public void add_account(int a,long b, String c,double d,String e,String f){
        this.account_id = a;
        this.account_customer_id = b;
        this.account_type = c;
        this.account_balance = d;
        this.account_holder_name = e;
        this.account_date_of_opening = f;
    }


    //Search account using account id
    public void search_account(int acid){
        int acids = acid;
        if(account_id == acids){
            System.out.println("Account id = "+account_id);
            System.out.println("Account holder id = " + account_customer_id);
            System.out.println("Account type = " + account_type);
            System.out.println("Account balance = " + account_balance);
            System.out.println("Account holder name = " + account_holder_name);
            System.out.println("Account date of opening = " + account_date_of_opening);
        }

        }

    //Display all accounts
   public void view_account(){
       System.out.println("Account id = "+account_id);
       System.out.println("Account holder id = " + account_customer_id);
       System.out.println("Account type = " + account_type);
       System.out.println("Account balance = " + account_balance);
       System.out.println("Account holder name = " + account_holder_name);
       System.out.println("Account date of opening = " + account_date_of_opening);
   }

    //Declaration of get and set methods
    public abstract long getc_id();

    public abstract void setc_id(long C_id);

    public abstract String getc_name();

    public abstract void setc_name(String C_name);

    public abstract String getc_address();

    public abstract void setc_address(String C_address);

    public abstract int getc_phoneNo();

    public abstract void setc_phoneNo(int C_accNo);

    public abstract int getc_accNo();

    public abstract void setc_accNo(int C_accNo);


    }





