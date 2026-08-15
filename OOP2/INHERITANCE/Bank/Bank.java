package INHERITANCE.Bank;


// Account class
class Account {

    // public → can be accessed from anywhere
    public String name;

    // protected → accessible in the same package
    // and also by child classes
    protected String email;

    // private → cannot be accessed directly outside Account
    private String password;


    // GETTER
    // Used to READ/GET the private password.
    public String getPassword() {
        return this.password;
    }


    // SETTER
    // Used to SET/CHANGE the private password.
    public void setPassword(String pass) {
        this.password = pass;
    }
}


// Bank class
public class Bank {

    public static void main(String args[]) {

        // Creating Account object
        Account account1 = new Account();


        // name is public, so we can directly access it.
        account1.name = "Shubham Barkale";


        // email is protected.
        // Since Bank and Account are in the same package,
        // we can access it here.
        account1.email = "shubham@gmail.com";


        // ❌ password is private.
        // We cannot directly access it.
        //
        // account1.password = "abcd";


        // ✅ Instead, use the setter.
        account1.setPassword("abcd");


        // ✅ Use getter to get/read the private password.
        System.out.println(account1.getPassword());
    }
}