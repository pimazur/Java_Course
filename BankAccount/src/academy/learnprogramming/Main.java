package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	BankAccount account1 = new BankAccount();
        account1.setAccountNumber(89654);
        account1.setBalance(700);
        account1.setCustomerName("Piotr");
        account1.setEmail("maziking@mazi.pl");
        account1.setPhoneNumber(829420);
        System.out.println("Balance: " + account1.getBalance());
        System.out.println(account1.getCustomerName());
        System.out.println("Balance after deposit: " + account1.depositFunds(100));
        System.out.println("Balance after withdrawal: " + account1.withdrawalFunds(200));
    }
}
