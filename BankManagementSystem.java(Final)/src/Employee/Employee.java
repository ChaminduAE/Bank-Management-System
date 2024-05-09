//Declaration of Employee package
package Employee;

//Import essential packages
import java.util.ArrayList;
import java.util.Scanner;

//Declaration of Employee class
public class Employee {
    private String E_name;
    private String E_address;
    private long E_id;
    private int E_phoneNo;

    //Declaration of Employee class constructor
    public Employee () {
    }

    //Initialize variables in Employee class
    public Employee(long E_id, String E_name, String E_address,int E_phoneNo) {
        this.E_id = E_id;
        this.E_name = E_name;
        this.E_address = E_address;
        this.E_phoneNo= E_phoneNo;
    }

    //Declaration of get and set methods
    public long gete_id() {
        return E_id;
    }

    public void sete_id(long E_id) {
        this.E_id = E_id;
    }

    public String gete_name() {
        return E_name;
    }

    public void sete_name(String E_name) {
        this.E_name = E_name;
    }

    public String gete_address() {
        return E_address;
    }

    public void sete_address(String E_address) {
        this.E_address = E_address;
    }

    public int gete_phoneNo() {
        return E_phoneNo;
    }

    public void sete_phoneNo(int E_phoneNo) {
        this.E_phoneNo = E_phoneNo;
    }





    //Add Employee information
    public static void addEmployee(ArrayList<Employee> array) {

        Scanner sc=new Scanner(System.in);
        String E_name;
        while (true) {
            System. out. println ("Please enter employee name");
            E_name=sc.nextLine();

            boolean flag=isUsed(array,E_name);
            if (flag) {
                System. out. println ("---The employee name you entered has been occupied, please re-enter---");
            } else {
                break;
            }
        }

        System. out. println ("please enter employee ID");
        long E_id=sc.nextLong();
        System. out. println ("please enter employee address");
        String E_address=sc.next();
        System.out.println("please enter employee phone number");
        int E_phoneNo=sc.nextInt();

        Employee s=new Employee();
        s.sete_id(E_id);
        s.sete_name(E_name);
        s.sete_address(E_address);
        s.sete_phoneNo(E_phoneNo);
        //Add the employee object to the collection
        array.add(s);

        System. out. println ("---Employee added successfully---");
    }

    //Define a method to judge whether the employee number is used
    public static boolean isUsed(ArrayList<Employee> array,String E_name) {
        //If it is same as an employee name in the set, return true, otherwise false
        boolean flag=false;
        for (int i=0;i< array.size();i++) {
            Employee s=array.get(i);
            if (s.gete_name().equals(E_name)) {
                flag=true;
                break;
            }
        }
        return flag;
    }
    //View all employee information
    public static void FindallEmployee(ArrayList<Employee> array) {

        if (array.size()==0){
            System. out. println ("---No information, please add information first in the query---");

            return;
        }

        for (int i=0;i< array.size();i++) {
            Employee s= array.get(i);
            System. out. println ("\nemployee id number: "+s.gete_id());
            System. out. println ("employee name: " +s.gete_name() );
            System. out. println ("employee address: "+s.gete_address());
            System. out. println ("employee  phone number:"+s.gete_phoneNo());
        }
    }

    //Define a method for deleting employee
    public  static void deleteEmployee(ArrayList<Employee> array) {
        //Enter the employee number to be deleted on the keyboard and display the prompt information
        Scanner sc=new Scanner(System.in);

        System. out. println ("please enter the name of the employee you want to delete: ");
        String E_name=sc.nextLine();

        //Display employee information if present
        //If it does not exist, delete it
        int index=-1;
        for (int i=0;i< array.size();i++) {
            Employee s=array.get(i);
            if (s.gete_name().equals(E_name)) {
                index=i;
                break;
            }
        }
        if (index==-1) {
            System. out. println ("---The information does not exist, please re-enter---");
        } else {
            array.remove(index);

            System. out. println ("---Delete employee succeeded---");
        }
    }

    //Define a method for modifying employee
    public  static void updateEmployee(ArrayList<Employee> array) {
        Scanner sc=new Scanner(System.in);
        System. out. println ("please enter the name of the employee you want to modify:");
        String E_name= sc.next();

        System. out. println ("please enter new employee id:");
        long E_id= sc.nextLong();
        System. out. println ("please enter the new address of the employee:");
        String E_address= sc.next();
        System. out. println ("please enter the  phone number of the employee:");
        int E_phoneNo= sc.nextInt();

        //Create employee object
        Employee s=new Employee();
        s.sete_id(E_id);
        s.sete_name(E_name);
        s.sete_address(E_address);
        s.sete_phoneNo(E_phoneNo);

        //Traverse the set and modify the corresponding employee information
        for (int i=0;i< array.size();i++) {
            Employee Employee=array.get(i);
            if (Employee.gete_name().equals(E_name)) {
                array.set(i,s);
                break;
            }
        }
        System. out. println ("---Employee modification succeeded---");
    }


}
