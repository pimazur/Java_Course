package academy.learnprogramming;

public class BankAccount {

    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private long phoneNumber;

   public BankAccount(){
       this(883,9929,"pdfd", "geds", 99322);
   }

    public BankAccount(int accountNumber, int balance, String customerName, String email, long phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int depositFunds(int deposit){
        if(deposit<0){
            return -1;
        }
        return balance += deposit;
    }

    public int withdrawalFunds(int withdrawal){
        if(withdrawal<0 || withdrawal>balance){
            return -1;
        }
        return balance - withdrawal;
    }
}
