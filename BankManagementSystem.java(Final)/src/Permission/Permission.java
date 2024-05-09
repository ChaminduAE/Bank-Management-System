//Declaration of permission class package
package Permission;

//Declaration of permission class
public class Permission {
    private int permission_id;
    private int permission_role_id;
    private String permission_password;

    //Declaration of permission class constructor
    public Permission() {
    }

    //Initialize variables in permission class
    public Permission(int x, int y, String z) {
        this.permission_id = x;
        this.permission_role_id = y;
        this.permission_password = z;

    }

    //Check whether user input are correct or not
    public int search_Permission(int x, int y, String z) {
        int check;
            if ((permission_id == x) && (permission_password.equals(z)) && (permission_role_id == y)) {
                System.out.println("                                                ");
                System.out.println("\n*-*-*You are authorized to access this system*-*-*\n");
                return 0;
            } else {
                System.out.println("\n---Your credentials are wrong, please re-enter---\n");
                return  1;
            }

    }


}
