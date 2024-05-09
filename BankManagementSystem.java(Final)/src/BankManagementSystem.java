//import essential packages
import java.util.Scanner;
import Permission.Permission;
import Employee.Employee;
import SavingAccount.SavingAccount;
import LoanAccount.LoanAccount;
import FdAccount.FdAccount;
import Customer_VIP.Customer_VIP;
import CurrentAccount.CurrentAccount;
import java.lang.String;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.ArrayList;

//Declaration of class BankManagementSystem and main method
public class BankManagementSystem {
    public static void main(String[] args) {
        System.out.println("\n******************************************************");
        System.out.println("*--*Welcome to the Citizens Bank Management System*--*");
        System.out.println("******************************************************\n");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd   HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        //Display time and date
        System.out.println("             " + dtf.format(now) + "              ");

        //Create scanner object
        Scanner sc = new Scanner(System.in);

        //create saving,loan,current and fd accounts objects
        SavingAccount S[] = new SavingAccount[1000000];
        LoanAccount L[] = new LoanAccount[1000000];
        FdAccount F[] = new FdAccount[1000000];
        CurrentAccount C[] = new CurrentAccount[1000000];

        //Create permission object
        Permission p = new Permission();

        //Declare and initialize variables that are used for do-while loops
        int s = 0;
        int f = 0;
        int c = 0;
        int l = 0;
        int check;

        //This section is used to enter the program by entering factory permission id = "1234" and factory password = "admin"
        System.out.println("\n*-*-*-*Welcome to the Permission Section*-*-*-*\n");
        do{
            System.out.println("Please enter default permission id ");
            int pid = sc.nextInt();
            System.out.println("Please enter default password ");
            String pp = sc.next();

                //Checking whether input permission id and password are correct or not
                if ((pid == 1234) && (pp.equals("admin"))) {
                    System.out.println("\n*-*-*You are authorized to access this system*-*-*\n");

                    //Set new permission id,role id,and password for this program
                    System.out.println("Please enter your new permission id ");
                    int pidn = sc.nextInt();
                    System.out.println("Please enter your new role id ");
                    int pridn = sc.nextInt();
                    System.out.println("Please enter your new password ");
                    String ppn = sc.next();
                    p = new Permission(pidn, pridn, ppn);
                    System.out.println("\n---Your permission details have been updated---\n");
                    check = 0;
                } else {
                    System.out.println("\n---Your credentials are wrong, please re-enter---\n");
                    check = 1;
                }
            } while (check == 1);

           //Checking whether input permission id and password are correct or not
            System.out.println("\n*-*-*-*-*-*Please log in to the system*-*-*-*-*-*\n");
            do {
                System.out.println("Please enter permission id ");
                int pidn = sc.nextInt();
                System.out.println("Please enter password ");
                String ppn = sc.next();
                System.out.println("Please enter role id ");
                int prid = sc.nextInt();
                check = p.search_Permission(pidn, prid, ppn);
            } while (check == 1);
            int o;

            //Main menu
            do {
                System.out.println("\n*-*-*-*-*-*-*-*-*-*Main Menu-*-*-*-*-*-*-*-*-*-*-*-*\n");
                System.out.println("*-*-*-*-*-*-Choose an option below-*-*-*-*-*-*-*-*-*\n");
                System.out.println("1.Employee\n2.Account\n3.Transaction\n4.Customer\n5.Exit Bank Management System");
                o = 0;
                int x = sc.nextInt();

                //Switch statement for Main menu
                switch (x) {
                    case 1: //Employee section
                        outer:
                        do {
                            ArrayList<Employee> array = new ArrayList<Employee>();
                            while (true) {

                                //1. Write the main interface with the output statements
                                System.out.println("\n*-*-*-*Welcome to the Employees Section of Citizens Bank*-*-*-*\n");
                                System.out.println("*-*-*-*-*-*-*-*-*-*Employee Accounts Main Menu*-*-*-*-*-*-*-*-*\n");
                                System.out.println("Choose an option below:\n");
                                System.out.println("1. Add Employees");
                                System.out.println("2. Delete Employees");
                                System.out.println("3. Modify Employees");
                                System.out.println("4. View all Employees");
                                System.out.println("5. Exit\n");
                                System.out.println("please enter your choice");

                                // 2. Use scanner to enter data with keyboard
                                String line = sc.next();
                                switch (line) {
                                    case "1":
                                        System.out.println("*--Add Employee Accounts--*");
                                        Employee.addEmployee(array);
                                        break;
                                    case "2":
                                        System.out.println("*--Delete Employee Accounts--*");
                                        Employee.deleteEmployee(array);
                                        break;
                                    case "3":
                                        System.out.println("*--Update Employee Accounts--*");
                                        Employee.updateEmployee(array);
                                        break;
                                    case "4":
                                        System.out.println("*--View Employee Accounts--*");
                                        Employee.FindallEmployee(array);
                                        break;
                                    case "5":
                                        o = 3;
                                        break outer;



                                }

                            }
                        } while (o == 0); //do-while loop for employee main menu
                        break;

                    case 2: //Account section
                        do {
                            System.out.println("\n*-*-*-*Welcome to the Account Section of Citizens Bank*-*-*-*-*\n");
                            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*Accounts Main Menu*-*-*-*-*-*-*-*-*-*-*\n");
                            System.out.println("Choose an option below:\n");
                            System.out.println("1.Saving Account\n2.Loan Account\n3.Fixed Deposit\n4.Current Account\n5.Main menu");
                            int a = sc.nextInt();

                            //Switch statement for accounts main menu
                            switch (a) {
                                case 1: //Saving account
                                    do {
                                        System.out.println("\n*-*-*Welcome to the Savings Account Section of Citizens Bank*-*-*\n");
                                        System.out.println("*-*-*-*-*-*-*-*-*-*Saving Accounts Main Menu*-*-*-*-*-*-*-*-*-*\n");
                                        System.out.println("Choose an option below:\n");
                                        System.out.println("1.Add Savings Accounts\n2.Search Savings Account\n3.View all Savings Accounts\n4.Update Savings Accounts\n5.Account Main Menu");
                                        int b = sc.nextInt();

                                        switch (b) {
                                            case 1:
                                                System.out.println("*--Add Savings Accounts--*");
                                                do {

                                                    for (int i = s; i < S.length; ++i) {
                                                        S[i] = new SavingAccount();
                                                        S[i].add_saving_account();
                                                        System.out.println("---Account added successfully---");
                                                        ++s;
                                                        break;

                                                    }
                                                    System.out.println("\n");
                                                    System.out.println("Do you want add another account");
                                                    System.out.println("1.Yes\n2.No");
                                                    o = sc.nextInt();
                                                }
                                                while (o == 1);
                                                break;

                                            case 2:
                                                System.out.println("*--Search Savings Account--*");
                                                do {
                                                    System.out.println("Please enter account id");
                                                    int q = sc.nextInt();
                                                    for (int i = 0; i < s; ++i) {
                                                        S[i].search_saving_account(q);
                                                    }
                                                    System.out.println("\n");
                                                    System.out.println("Do you want to search another account");
                                                    System.out.println("1.Yes\n2.No");
                                                    o = sc.nextInt();
                                                } while (o == 1);
                                                break;


                                            case 3:
                                                System.out.println("*--View Savings Accounts--*");
                                                o = 2;
                                                for (int i = 0; i < s; ++i) {
                                                    S[i].view_saving_account();
                                                    System.out.println("\n");
                                                }
                                                break;

                                            case 4:
                                                System.out.println("*--Update Savings Accounts--*");
                                                do {
                                                    System.out.println("Please enter account id");
                                                    int q = sc.nextInt();
                                                    for (int i = 0; i < s; ++i) {
                                                        S[i].update_saving_account(q);
                                                    }
                                                    System.out.println("\n");
                                                    System.out.println("Do you want to update another account");
                                                    System.out.println("1.Yes\n2.No");
                                                    o = sc.nextInt();
                                                } while (o == 1);
                                                break;

                                            case 5:
                                                o = 1;
                                                break;

                                        }

                                    } while (o == 2); //do-while loop for saving account section main menu
                                    break;


                                case 2: //Loan account
                                    do {
                                        System.out.println("\n*-*-*-*Welcome to the Loan Account Section of Citizens Bank*-*-*-*\n");
                                        System.out.println("*-*-*-*-*-*-*-*-*-*Loan Accounts Main Menu*-*-*-*-*-*-*-*-*-*\n");
                                        System.out.println("Choose an option below:\n");
                                        System.out.println("1.Add Loan Account\n2.Search Loan Account\n3.View all Loan Accounts\n4.Repay Loan\n5.Account Main Menu");
                                        int b = sc.nextInt();

                                        switch (b) {
                                            case 1:
                                                System.out.println("*--Add Loan Accounts--*");
                                                do {
                                                    for (int i = l; i < L.length; ++i) {
                                                        L[i] = new LoanAccount();
                                                        L[i].add_loan_account();
                                                        ++l;
                                                        break;

                                                    }
                                                    System.out.println("\n");
                                                    System.out.println("Do you want to add another loan account");
                                                    System.out.println("1.Yes\n2.No");
                                                    o = sc.nextInt();
                                                }
                                                while (o == 1);
                                                break;

                                            case 2:
                                                System.out.println("*--Search Loan Account--*");
                                                do {
                                                    System.out.print("Please enter the loan account ID: ");
                                                    int q = sc.nextInt();
                                                    for (int i = 0; i < l; ++i) {
                                                        L[i].search_loan_account(q);

                                                    }
                                                    System.out.println("\n");
                                                    System.out.println("Do you want to search another loan account");
                                                    System.out.println("\t1.Yes\n\t2.No");
                                                    o = sc.nextInt();
                                                } while (o == 1);
                                                break;


                                            case 3:
                                                System.out.println("*--View all Loan Accounts--*\n");
                                                o = 2;
                                                for (int i = 0; i < l; ++i) {
                                                    L[i].view_loan_account();
                                                    System.out.println("\n");
                                                }
                                                break;

                                            case 4:
                                                System.out.println("*--Repay Loan--*");
                                                do {
                                                    System.out.print("Please enter the loan account ID: ");
                                                    int q = sc.nextInt();
                                                    for (int i = 0; i < l; ++i) {
                                                        L[i].repay_loan_account(q);

                                                    }
                                                    System.out.println("\n");
                                                    System.out.println("Do you want to repay another loan account?");
                                                    System.out.println("\t1.Yes\n\t2.No");
                                                    o = sc.nextInt();
                                                } while (o == 1);
                                                break;

                                            case 5:
                                                o = 1;
                                                break;

                                        }


                                    } while (o == 2);  //do-while loop for loan account section main menu
                                    break;

                                case 3: //FD account
                                    do {
                                        System.out.println("\n*-*-*-*-*Welcome to the FD Account Section of Citizens Bank*-*-*-*-*\n");
                                        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*FD Accounts Main Menu*-*-*-*-*-*-*-*-*-*-*-*\n");
                                        System.out.println("Choose an option below:\n");
                                        System.out.println("1.Add FD Accounts\n2.Search FD Account\n3.View all FD Accounts\n4.Update FD Account\n5.Account Main Menu ");
                                        int b = sc.nextInt();

                                        switch (b) {
                                            case 1:
                                                System.out.println("*--Add FD Accounts--*");
                                                do {
                                                    for (int i = f; i < F.length; ++i) {
                                                        F[i] = new FdAccount();
                                                        F[i].add_FdAccount();
                                                        System.out.println("---Account added successfully---");
                                                        ++f;
                                                        break;

                                                    }
                                                    System.out.println("\n");
                                                    System.out.println("Do you want add another account");
                                                    System.out.println("1.Yes\n2.No");
                                                    o = sc.nextInt();
                                                }
                                                while (o == 1);
                                                break;

                                            case 2:
                                                System.out.println("*--Search FD Account--*");
                                                do {
                                                    System.out.println("Please enter account id");
                                                    int q = sc.nextInt();
                                                    for (int i = 0; i < f; ++i) {
                                                        F[i].search_fd_account(q);
                                                    }
                                                    System.out.println("\n");
                                                    System.out.println("Do you want to search another account");
                                                    System.out.println("1.Yes\n2.No");
                                                    o = sc.nextInt();
                                                } while (o == 1);
                                                break;


                                            case 3:
                                                System.out.println("*--View FD Accounts--*");
                                                o = 2;
                                                for (int i = 0; i < f; ++i) {
                                                    F[i].view_fd_account();
                                                    System.out.println("\n");

                                                }
                                                break;
                                            case 4:
                                                System.out.println("*--Update FD Accounts--*");
                                                do {
                                                    System.out.println("Please enter account id");
                                                    int q = sc.nextInt();
                                                    for (int i = 0; i < f; ++i) {
                                                        F[i].update_fd_account(q);
                                                    }
                                                    System.out.println("\n");
                                                    System.out.println("Do you want to update another account");
                                                    System.out.println("1.Yes\n2.No");
                                                    o = sc.nextInt();
                                                } while (o == 1);
                                                break;

                                            case 5:
                                                o = 1;
                                                break;

                                        }

                                    } while (o == 2);  //do-while loop for FD account section main menu
                                    break;


                                case 4: //Current account
                                    do {
                                        System.out.println("\n*-*-*Welcome to the Current Account Section of Citizens Bank*-*-*\n");
                                        System.out.println("*-*-*-*-*-*-*-*-*-*Current Accounts Main Menu*-*-*-*-*-*-*-*-*-*\n");
                                        System.out.println("Choose an option below:\n");
                                        System.out.println("1.Add Current Accounts\n2.Search Current Account\n3.View all Current Accounts\n4.Update Current Account\n5.Account Main Menu ");
                                        int b = sc.nextInt();

                                        switch (b) {
                                            case 1:
                                                System.out.println("*--Add Current Accounts--*");
                                                do {
                                                    for (int i = c; i < C.length; ++i) {
                                                        C[i] = new CurrentAccount();
                                                        C[i].add_current_account();
                                                        System.out.println("---Account added successfully---");
                                                        ++c;
                                                        break;

                                                    }
                                                    System.out.println("\n");
                                                    System.out.println("Do you want add another account");
                                                    System.out.println("1.Yes\n2.No");
                                                    o = sc.nextInt();
                                                }
                                                while (o == 1);
                                                break;

                                            case 2:
                                                System.out.println("*--Search Current Account--*");
                                                do {
                                                    System.out.println("Please enter account id");
                                                    int q = sc.nextInt();
                                                    for (int i = 0; i < c; ++i) {
                                                        C[i].search_current_account(q);
                                                    }
                                                    System.out.println("\n");
                                                    System.out.println("Do you want to search another account");
                                                    System.out.println("1.Yes\n2.No");
                                                    o = sc.nextInt();
                                                } while (o == 1);
                                                break;

                                            case 3:
                                                System.out.println("*--View Current Accounts--*");
                                                o = 2;
                                                for (int i = 0; i < c; ++i) {
                                                    C[i].view_current_account();
                                                    System.out.println("\n");

                                                }
                                                break;
                                            case 4:
                                                System.out.println("*--Update Current Accounts--*");
                                                do {
                                                    System.out.println("Please enter account id");
                                                    int q = sc.nextInt();
                                                    for (int i = 0; i < c; ++i) {
                                                        C[i].update_current_account(q);
                                                    }
                                                    System.out.println("\n");
                                                    System.out.println("Do you want to update another account");
                                                    System.out.println("1.Yes\n2.No");
                                                    o = sc.nextInt();
                                                } while (o == 1);
                                                break;
                                            case 5:
                                                o = 1;
                                                break;
                                        }


                                    } while (o == 2); //do-while loop for current account section main menu
                                    break;

                                case 5:
                                    o = 3;
                                    break;


                            }

                        } while (o == 1); //do-while loop for account section main menu
                        break;

                    case 3: //Transaction
                        do {
                            System.out.println("\n*-*-*Welcome to the Transaction Section of Citizens Bank*-*-*\n");
                            System.out.println("*-*-*-*-*-*-*-*-*-*-*-*Transaction Main Menu*-*-*-*-*-*-*-*-*-*-*-*\n");
                            System.out.println("Choose an option below:\n");
                            System.out.println("\t1.Check Balance\n\t2.Withdraw\n\t3.Deposit\n\t4.Internal Funds Transfer\n\t5.Main menu");
                            int a = sc.nextInt();
                            switch (a) {
                                case 1:     //Check Balance
                                    System.out.println("*--Check Balance--*");
                                    do {
                                        System.out.println("Choose the account type: ");
                                        System.out.println("\t1.Savings Account\n\t2.Current Account\n\t3.Fixed Deposit\n\t4.Loan Account\n\t5.Transaction Main Menu");
                                        int b = sc.nextInt();

                                        switch (b) {
                                            case 1:     //Savings Account
                                                System.out.println("*--Check Saving Account Balance--*");
                                                do {
                                                    System.out.print("Please enter the savings account ID: ");
                                                    int q = sc.nextInt();
                                                    for (int i = 0; i < s; ++i) {
                                                        S[i].savings_account_checkBalance(q);
                                                    }
                                                    System.out.println("\n");
                                                    System.out.println("Do you want to check balance of another savings account?");
                                                    System.out.println("\t1.Yes\n\t2.No");
                                                    o = sc.nextInt();
                                                }
                                                while (o == 1);
                                                break;

                                            case 2:   //Current Account
                                                System.out.println("*--Check Current Account Balance--*");
                                                do {
                                                    System.out.print("Please enter the current account ID: ");
                                                    int q = sc.nextInt();
                                                    for (int i = 0; i < c; ++i) {
                                                        C[i].current_account_checkBalance(q);
                                                    }
                                                    System.out.println("\n");
                                                    System.out.println("Do you want to check balance of another current account?");
                                                    System.out.println("\t1.Yes\n\t2.No");
                                                    o = sc.nextInt();
                                                } while (o == 1);
                                                break;

                                            case 3:   //Fixed Deposit
                                                System.out.println("*--Check Fixed Deposit Account Balance--*");
                                                do {
                                                    System.out.print("Please enter the fixed deposit account ID: ");
                                                    int q = sc.nextInt();
                                                    for (int i = 0; i < f; ++i) {
                                                        F[i].fd_account_checkBalance(q);
                                                    }
                                                    System.out.println("\n");
                                                    System.out.println("Do you want to check balance of another fixed deposit account?");
                                                    System.out.println("\t1.Yes\n\t2.No");
                                                    o = sc.nextInt();
                                                } while (o == 1);
                                                break;

                                            case 4:   //Loan Account
                                                System.out.println("*--Check Loan Account Balance--*");
                                                do {
                                                    System.out.print("Please enter the loan account ID: ");
                                                    int q = sc.nextInt();
                                                    for (int i = 0; i < l; ++i) {
                                                        L[i].checkDebtBalance(q);

                                                    }
                                                    System.out.println("\n");
                                                    System.out.println("Do you want to check balance of another loan account?");
                                                    System.out.println("\t1.Yes\n\t2.No");
                                                    o = sc.nextInt();
                                                } while (o == 1);
                                                break;

                                            case 5:   //Transaction Main Menu
                                                o = 1;
                                                break;

                                        }

                                    } while (o == 2); //do-while loop for check balance main menu
                                    break;

                                case 2:   //Withdraw
                                    do {
                                        System.out.println("*--Withdraw--*");
                                        System.out.println("Choose the account type: ");
                                        System.out.println("\t1.Savings Account\n\t2.Current Account\n\t3.Fixed Deposit\n\t4.Transaction Main Menu");
                                        int b = sc.nextInt();

                                        switch (b) {
                                            case 1:   //Savings Account
                                                System.out.println("*--Withdraw from Saving Account--*");
                                                do {
                                                    System.out.print("Enter the ID of savings account to be withdrawn: ");
                                                    int q = sc.nextInt();
                                                    for (int i = 0; i < s; ++i) {
                                                        S[i].saving_account_withdraw(q);
                                                    }
                                                    System.out.println("\n");
                                                    System.out.println("Do you want to withdraw from another savings account?");
                                                    System.out.println("\t1.Yes\n\t2.No");
                                                    o = sc.nextInt();
                                                }
                                                while (o == 1);
                                                break;

                                            case 2:     //Current Account
                                                System.out.println("*--Withdraw from Current Account--*");
                                                do {
                                                    System.out.print("Enter the ID of current account to be withdrawn: ");
                                                    int q = sc.nextInt();
                                                    for (int i = 0; i < c; ++i) {
                                                        C[i].current_account_withdraw(q);
                                                    }
                                                    System.out.println("\n");
                                                    System.out.println("Do you want to withdraw from another current account?");
                                                    System.out.println("\t1.Yes\n\t2.No");
                                                    o = sc.nextInt();
                                                }
                                                while (o == 1);
                                                break;

                                            case 3:       //FD Account
                                                System.out.println("*--Withdraw from Fixed Deposit Account--*");
                                                do {
                                                    System.out.print("Enter the ID of fixed deposit account to be withdrawn: ");
                                                    int q = sc.nextInt();
                                                    for (int i = 0; i < c; ++i) {
                                                        F[i].fd_account_withdraw(q);
                                                    }
                                                    System.out.println("\n");
                                                    System.out.println("Do you want to withdraw from another fixed deposit account?");
                                                    System.out.println("\t1.Yes\n\t2.No");
                                                    o = sc.nextInt();
                                                }
                                                while (o == 1);
                                                break;

                                            case 4:       //Transaction Main Menu
                                                o = 1;
                                                break;

                                        }

                                    } while (o == 2); //do-while loop for withdraw main menu
                                    break;

                                case 3:       //Deposit
                                    do {
                                        System.out.println("*--Deposit--*");
                                        System.out.println("Choose the account type: ");
                                        System.out.println("\t1.Savings Account\n\t2.Current Account\n\t3.Fixed Deposit\n\t4.Loan Account\n\t5.Transaction Main Menu");
                                        int b = sc.nextInt();
                                        switch (b) {
                                            case 1:   //Savings Account
                                                System.out.println("*--Deposit to Savings Account--*");
                                                do {
                                                    System.out.print("Enter the ID of savings account to be deposited: ");
                                                    int q = sc.nextInt();
                                                    for (int i = 0; i < s; ++i) {
                                                        S[i].saving_account_deposit(q);
                                                    }
                                                    System.out.println("\n");
                                                    System.out.println("Do you want to deposit in another savings account?");
                                                    System.out.println("\t1.Yes\n\t2.No");
                                                    o = sc.nextInt();
                                                }
                                                while (o == 1);
                                                break;

                                            case 2:     //Current Account
                                                System.out.println("*--Deposit to Current Account--*");
                                                do {
                                                    System.out.print("Enter the ID of current account to be deposited: ");
                                                    int q = sc.nextInt();
                                                    for (int i = 0; i < c; ++i) {
                                                        C[i].current_account_deposit(q);
                                                    }
                                                    System.out.println("\n");
                                                    System.out.println("Do you want to deposit in another current account?");
                                                    System.out.println("\t1.Yes\n\t2.No");
                                                    o = sc.nextInt();
                                                }
                                                while (o == 1);
                                                break;

                                            case 3:       //FD Account
                                                System.out.println("*--Deposit to Fixed Deposit Account--*");
                                                do {
                                                    System.out.println("*--Create New Fixed Deposit Account--*");
                                                    for (int i = f; i < F.length; ++i) {
                                                        F[i] = new FdAccount();
                                                        F[i].add_FdAccount();
                                                        System.out.println("Account added successfully");
                                                        ++f;
                                                        break;
                                                    }
                                                    System.out.println("\n");
                                                    System.out.println("Do you want add another fixed deposit account?");
                                                    System.out.println("\t1.Yes\n\t2.No");
                                                    o = sc.nextInt();
                                                }
                                                while (o == 1);
                                                break;

                                            case 4:     //Loan Account
                                                System.out.println("*--Repay Loan--*");
                                                do {
                                                    System.out.println("Please enter the loan account ID:");
                                                    int q = sc.nextInt();
                                                    for (int i = 0; i < l; ++i) {
                                                        L[i].repay_loan_account(q);
                                                    }
                                                    System.out.println("\n");
                                                    System.out.println("Do you want to repay another loan account");
                                                    System.out.println("\t1.Yes\n\t2.No");
                                                    o = sc.nextInt();
                                                }
                                                while (o == 1);
                                                break;

                                            case 5:     //Transaction Main Menu
                                                o = 1;
                                                break;
                                        }

                                    } while (o == 2); //do-while loop for deposit main menu
                                    break;

                                case 4:       //Internal Funds Transfer
                                    System.out.println("*--Internal Funds Transfer--*");
                                    do {
                                        System.out.println("Please choose the payer account type");
                                        System.out.println("\t1.Savings Account\n\t2.Current Account\n\t3.Fixed Deposit Account\n\t4.Transaction Main Menu");
                                        int b = sc.nextInt();

                                        switch (b) {
                                            case 1:   //Savings Account
                                                System.out.println("Please choose the beneficiary account type");
                                                System.out.println("\t1.Savings Account\n\t2.Current Account\n\t3.Loan Account\n\t4.Transaction Main Menu");
                                                int z = sc.nextInt();

                                                switch (z) {
                                                    case 1: //Savings to Savings
                                                        System.out.println("*--Fund Transfer from Saving to Saving Accounts--*");
                                                        do {
                                                            System.out.print("Please enter the payer savings account ID: ");
                                                            int sacid = sc.nextInt();
                                                            System.out.print("Please enter the beneficiary savings account ID: ");
                                                            int bsacid = sc.nextInt();
                                                            for (int i = 0; i < s; i++) {
                                                                S[i].saving_account_transferFrom(sacid);
                                                                S[i].saving_account_transferTo(bsacid);
                                                            }
                                                            System.out.println("\n");
                                                            System.out.println("Do you want to transfer funds to another savings account?");
                                                            System.out.println("1.Yes\n2.No");
                                                            o = sc.nextInt();

                                                        } while (o == 1);
                                                        break;

                                                    case 2: //Savings to Current
                                                        System.out.println("*--Fund Transfer from Saving to Current Accounts--*");
                                                        do {
                                                            System.out.print("Please enter the payer savings account ID: ");
                                                            int sacid = sc.nextInt();
                                                            System.out.print("Please enter the beneficiary current account ID: ");
                                                            int bsacid = sc.nextInt();
                                                            for (int i = 0; i < s; i++) {
                                                                S[i].saving_account_transferFrom(sacid);
                                                                C[i].current_account_transferTo(bsacid);
                                                            }
                                                            System.out.println("\n");
                                                            System.out.println("Do you want to transfer funds to another current account?");
                                                            System.out.println("1.Yes\n2.No");
                                                            o = sc.nextInt();
                                                        } while (o == 1);
                                                        break;

                                                    case 3: //Savings to Loan
                                                        System.out.println("*--Fund Transfer from Saving to Loan Accounts--*");
                                                        do {
                                                            System.out.print("Please enter the payer savings account ID: ");
                                                            int sacid = sc.nextInt();
                                                            System.out.print("Please enter the beneficiary loan account ID: ");
                                                            int bsacid = sc.nextInt();
                                                            for (int i = 0; i < s; i++) {
                                                                S[i].saving_account_transferFrom(sacid);
                                                                L[i].loan_account_transferTo(bsacid);
                                                            }
                                                            System.out.println("\n");
                                                            System.out.println("Do you want to transfer funds to another loan account?");
                                                            System.out.println("1.Yes\n2.No");
                                                            o = sc.nextInt();
                                                        } while (o == 1);
                                                        break;

                                                    case 4:     //Transaction Main Menu
                                                        o = 1;
                                                        break;
                                                }
                                                break;


                                            case 2:       //Current Account
                                                System.out.println("Please chose the beneficiary account type");
                                                System.out.println("\t1.Savings Account\n\t2.Current Account\n\t3.Loan Account\n\t4.Transaction Main Menu");
                                                int t = sc.nextInt();

                                                switch (t) {
                                                    case 1: //Current to Savings
                                                        System.out.println("*--Fund transfer from Current to Saving Accounts--*");
                                                        do {
                                                            System.out.print("Please enter the payer current account ID: ");
                                                            int sacid = sc.nextInt();
                                                            System.out.print("Please enter the beneficiary savings account ID: ");
                                                            int bsacid = sc.nextInt();
                                                            for (int i = 0; i < s; i++) {
                                                                C[i].current_account_transferFrom(sacid);
                                                                S[i].saving_account_transferTo(bsacid);
                                                            }
                                                            System.out.println("\n");
                                                            System.out.println("Do you want to transfer funds to another savings account?");
                                                            System.out.println("1.Yes\n2.No");
                                                            o = sc.nextInt();
                                                        } while (o == 1);
                                                        break;

                                                    case 2: //Current to Current
                                                        System.out.println("*--Fund Transfer from Current to Current Accounts--*");
                                                        do {
                                                            System.out.print("Please enter the payer current account ID: ");
                                                            int sacid = sc.nextInt();
                                                            System.out.print("Please enter the beneficiary current account ID: ");
                                                            int bsacid = sc.nextInt();
                                                            for (int i = 0; i < s; i++) {
                                                                C[i].current_account_transferFrom(sacid);
                                                                C[i].current_account_transferTo(bsacid);
                                                            }
                                                            System.out.println("\n");
                                                            System.out.println("Do you want to transfer funds to another current account?");
                                                            System.out.println("1.Yes\n2.No");
                                                            o = sc.nextInt();
                                                        } while (o == 1);
                                                        break;

                                                    case 3: //current to Loan
                                                        System.out.println("*--Fund transfer from Current to Loan Accounts--*");
                                                        do {
                                                            System.out.print("Please enter the payer current account ID: ");
                                                            int sacid = sc.nextInt();
                                                            System.out.print("Please enter the beneficiary loan account ID: ");
                                                            int bsacid = sc.nextInt();
                                                            for (int i = 0; i < s; i++) {
                                                                C[i].current_account_transferFrom(sacid);
                                                                L[i].loan_account_transferTo(bsacid);
                                                            }
                                                            System.out.println("\n");
                                                            System.out.println("Do you want to transfer funds to another loan account?");
                                                            System.out.println("1.Yes\n2.No");
                                                            o = sc.nextInt();

                                                        } while (o == 1);
                                                        break;

                                                    case 4:     //Transaction Main Menu
                                                        o = 1;
                                                        break;
                                                }
                                                break;

                                            case 3:       //FD Account
                                                System.out.println("Please chose the beneficiary account type");
                                                System.out.println("\t1.Savings Account\n\t2.Current Account\n\t3.Loan Account\n\t4.Fixed Deposit\n\t5.Transaction Main Menu");
                                                int r = sc.nextInt();

                                                switch (r) {
                                                    case 1: //FD to Savings
                                                        System.out.println("*--Fund Transfer from FD to Saving Accounts--*");
                                                        do {
                                                            System.out.print("Please enter the payer FD account ID: ");
                                                            int sacid = sc.nextInt();
                                                            System.out.print("Please enter the beneficiary savings account ID: ");
                                                            int bsacid = sc.nextInt();
                                                            for (int i = 0; i < s; i++) {
                                                                F[i].fd_account_transferFrom(sacid);
                                                                S[i].saving_account_transferTo(bsacid);
                                                            }
                                                            System.out.println("\n");
                                                            System.out.println("Do you want to transfer funds to another savings account?");
                                                            System.out.println("1.Yes\n2.No");
                                                            o = sc.nextInt();
                                                        } while (o == 1);
                                                        break;

                                                    case 2: //FD to Current
                                                        System.out.println("*--Fund Transfer from FD to Current Accounts--*");
                                                        do {
                                                            System.out.print("Please enter the payer FD account ID: ");
                                                            int sacid = sc.nextInt();
                                                            System.out.print("Please enter the beneficiary current account ID: ");
                                                            int bsacid = sc.nextInt();
                                                            for (int i = 0; i < s; i++) {
                                                                F[i].fd_account_transferFrom(sacid);
                                                                C[i].current_account_transferTo(bsacid);
                                                            }
                                                            System.out.println("\n");
                                                            System.out.println("Do you want to transfer funds to another current account?");
                                                            System.out.println("1.Yes\n2.No");
                                                            o = sc.nextInt();
                                                        } while (o == 1);
                                                        break;

                                                    case 3: //FD to Loan
                                                        System.out.println("*--Fund Transfer from FD to Loan Accounts--*");
                                                        do {
                                                            System.out.print("Please enter the payer FD account ID: ");
                                                            int sacid = sc.nextInt();
                                                            System.out.print("Please enter the beneficiary loan account ID: ");
                                                            int bsacid = sc.nextInt();
                                                            for (int i = 0; i < s; i++) {
                                                                F[i].fd_account_transferFrom(sacid);
                                                                L[i].loan_account_transferTo(bsacid);
                                                            }
                                                            System.out.println("\n");
                                                            System.out.println("Do you want to transfer funds to another loan account?");
                                                            System.out.println("1.Yes\n2.No");
                                                            o = sc.nextInt();

                                                        } while (o == 1);
                                                        break;

                                                    case 4:     //FD to FD
                                                        System.out.println("*--Fund Transfer from FD to FD Accounts--*");
                                                        do {
                                                            System.out.print("Please enter the payer FD account ID: ");
                                                            int sacid = sc.nextInt();
                                                            System.out.print("Please enter the beneficiary FD account ID: ");
                                                            int bsacid = sc.nextInt();
                                                            for (int i = 0; i < s; i++) {
                                                                F[i].fd_account_transferFrom(sacid);
                                                                F[i].fd_account_transferTo(bsacid);
                                                            }
                                                            System.out.println("\n");
                                                            System.out.println("Do you want to transfer funds to another FD account?");
                                                            System.out.println("1.Yes\n2.No");
                                                            o = sc.nextInt();

                                                        } while (o == 1);
                                                        break;

                                                    case 5:     //Transaction Main Menu
                                                        o = 1;
                                                        break;
                                                }
                                                break;

                                            case 4:       //Transaction Main Menu
                                                o = 1;
                                                break;
                                        }


                                    } while (o == 2);
                                    break;

                                case 5:   //Main Menu
                                    o = 3;
                                    break;


                            }

                        } while (o == 1); ////do-while loop for transaction main menu
                        break;

                    case 4: //VIP-customer account section
                        o = 3;
                        outer:
                        do {
                            ArrayList<Customer_VIP> array1 = new ArrayList<Customer_VIP>();
                            while (true) {

                                //1. Write the main interface with the output statement
                                System.out.println("\n*-*-*Welcome to the VIP_Customer Account Section of Citizens Bank*-*-*\n");
                                System.out.println("*-*-*-*-*-*-*-*-*-*VIP_Customer Accounts Main Menu*-*-*-*-*-*-*-*-*-*\n");
                                System.out.println("Choose an option below:\n");
                                System.out.println("1. Add VIP_Customer");
                                System.out.println("2. Delete VIP_Customer");
                                System.out.println("3. Modify VIP_Customer");
                                System.out.println("4. View all VIP_Customers");
                                System.out.println("5. Main menu\n");
                                System.out.println("Please enter your choice");

                                // 2. Use scanner to enter data with keyboard
                                String line = sc.next();
                                switch (line) {
                                    case "1":
                                        System.out.println("*--Add VIP Customer Accounts--*");
                                        Customer_VIP.addCustomer(array1);
                                        break;
                                    case "2":
                                        System.out.println("*--Delete VIP Customer Accounts--*");
                                        Customer_VIP.deleteCustomer(array1);
                                        break;
                                    case "3":
                                        System.out.println("*--Modify VIP Customer Accounts--*");
                                        Customer_VIP.updateCustomer(array1);
                                        break;
                                    case "4":
                                        System.out.println("*--View all VIP Customer Accounts--*");
                                        Customer_VIP.FindallCustomer(array1);
                                        break;
                                    case "5":

                                        o = 1;
                                        break outer;

                                }
                            }
                        } while (o == 3); //do-while loop for VIP-customer account section main menu

                        o = 3;
                        break;

                    case 5:
                        System.exit(0);
                }


            } while (o == 3); //do-while loop for main menu


        }
    }

