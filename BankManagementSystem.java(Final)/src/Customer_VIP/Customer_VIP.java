//Declaration of Customer_VIP package
package Customer_VIP;

//import essential packages//Declaration of Customer_VIP constructor
import Account.Account;
import java.util.ArrayList;
import java.util.Scanner;

//Declaration of Customer_VIP class which extends account
public class Customer_VIP extends Account {
        private String C_name;
        private String C_address;
        private long C_id;
        private int C_phoneNo;
        private static int C_accNo;

        //Declaration of Customer_VIP constructor
        public Customer_VIP () {
        }

        //Initialize variables in Customer_VIP class
        public Customer_VIP(long C_id, String C_name, String C_address,int C_phoneNo,int C_accNo) {
            this.C_id = C_id;
            this.C_name = C_name;
            this.C_address = C_address;
            this.C_phoneNo= C_phoneNo;
            this.C_accNo= C_accNo;
        }

        //Declaration of get and set methods
        public long getc_id() {return C_id;}

        public void setc_id(long C_id) {
            this.C_id = C_id;
        }

        public String getc_name() {
            return C_name;
        }

        public void setc_name(String C_name) {
            this.C_name = C_name;
        }

        public String getc_address() {
            return C_address;
        }

        public void setc_address(String C_address) {
            this.C_address = C_address;
        }

        public int getc_phoneNo() {
            return C_phoneNo;
        }

        public void setc_phoneNo(int C_phoneNo) {
            this.C_phoneNo = C_phoneNo;
        }

        public int getc_accNo() {
            return C_accNo;
        }

        public void setc_accNo(int C_accNo) {
            this.C_accNo = C_accNo;
        }

    //Define a method for adding Customer information
    public static void addCustomer(ArrayList<Customer_VIP>array) {

        Scanner sc=new Scanner(System.in);
        String C_name;
        while (true) {
            System. out. println ("please enter VIP_Customer name");
            C_name=sc.nextLine();

            boolean flag=isUsed(array,C_name);
            if (flag) {
                System. out. println ("---The VIP_Customer name you entered has been occupied, please re-enter---");
            } else {
                break;
            }
        }

        System. out. println ("please enter VIP_Customer ID");
        long C_id=sc.nextLong();
        System. out. println ("please enter VIP_Customer address");
        String C_address=sc.next();
        System.out.println("please enter VIP_Customer phone number");
        int C_phoneNo=sc.nextInt();
        System.out.println("please enter VIP_Customer account number");
        int C_accNo=sc.nextInt();

        Customer_VIP s=new Customer_VIP();
        s.setc_id(C_id);
        s.setc_name(C_name);
        s.setc_address(C_address);
        s.setc_phoneNo(C_phoneNo);
        s.setc_accNo(C_accNo);

        array.add(s);

        System. out. println ("---VIP_Customer added successfully---");
    }

    //Define a method to judge whether the Vip_customer name is used
    public static boolean isUsed(ArrayList<Customer_VIP> array, String C_name) {

        boolean flag=false;
        for (int i=0;i< array.size();i++) {
            Customer_VIP s=array.get(i);
            if (s.getc_name().equals(C_name)) {
                flag=true;
                break;
            }
        }
        return flag;
    }

    //Find all VIP customer accounts
    public static void FindallCustomer(ArrayList<Customer_VIP> array) {

        if (array.size()==0){
            System. out. println ("---No information, please add information first in the query---");

            return;
        }

        for (int i=0;i< array.size();i++) {
            Customer_VIP s= array.get(i);
            System. out. println ("VIP_Customer id number: "+s.getc_id());
            System. out. println ("VIP_Customer name: " +s.getc_name() );
            System. out. println ("VIP_Customer address: "+s.getc_address());
            System. out. println ("VIP_Customer phone number:"+s.getc_phoneNo());
            System. out. println ("VIP_Customer account number:"+s.getc_accNo());
            System.out.println("\n");
        }
    }

    //Delete VIP customer details
    public  static void deleteCustomer(ArrayList<Customer_VIP> array) {

        Scanner sc=new Scanner(System.in);

        System. out. println ("Please enter the VIP_Customer name of the customer you want to delete");
        String C_name=sc.nextLine();

        //Display Customer information if present
        //If it does not exist, delete it
        int index=-1;
        for (int i=0;i< array.size();i++) {
            Customer_VIP s=array.get(i);
            if (s.getc_name().equals(C_name)) {
                index=i;
                break;
            }
        }
        if (index==-1) {
            System. out. println ("---The information does not exist, please re-enter---");
        } else {
            array.remove(index);

            System. out. println ("---Delete VIP_Customer succeeded---");
        }
    }

    //Define a method for modifying VIP customer details
    public static void updateCustomer(ArrayList<Customer_VIP> array) {
        Scanner sc=new Scanner(System.in);
        System. out. println ("Please enter the name of the VIP customer you want to modify:");
        String C_name= sc.next();

        System. out. println ("Please enter new VIP_Customer id:");
        long C_id= sc.nextLong();
        System. out. println ("Please enter the new address of the VIP_Customer:");
        String C_address= sc.next();
        System. out. println ("Please enter the  phone number of the VIP_Customer:");
        int C_phoneNo= sc.nextInt();
        System. out. println ("Please enter the  account number of the VIP_Customer:");
        int C_accNo= sc.nextInt();

        //Create customer object
        Customer_VIP s=new Customer_VIP();
        s.setc_id(C_id);
        s.setc_name(C_name);
        s.setc_address(C_address);
        s.setc_phoneNo(C_phoneNo);
        s.setc_accNo(C_accNo);

        //Traverse the set and modify the corresponding Customer information
        for (int i=0;i< array.size();i++) {
            Customer_VIP Customer=array.get(i);
            if (Customer.getc_name().equals(C_name)) {
                array.set(i,s);
                break;
            }
        }
        System. out. println ("---VIP_Customer modification succeeded---");
    }



}


