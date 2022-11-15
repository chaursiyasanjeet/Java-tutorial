package bank;

class Account {
    public String name;
    protected String email;

    private String password;

    // getters
    public String getPassword() {
        return this.password;
    }

    // setters
    public void setPassword(String something) {
        this.password = something;
    }

}

public class Bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "sanjeet";
        account1.email = "skc0845@gmail.com";
        account1.setPassword("abcd");
        System.out.println(account1.getPassword());

    }
}