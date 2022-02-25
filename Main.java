package ro.ItSchool.incapsulation.account;

public class Main {
    public static void main(String[] args) {

       /// Account account = new Account();
        Account account2 = new Account(1010, 3000.0, 3.5);
        account2.withdraw(2000);
        account2.deposit(5000);
        java.util.Date dateCreated = new java.util.Date();

        System.out.println("Date when account was created: " + dateCreated );
        System.out.println("Account ID: " + account2.getId());
        System.out.println("Account balance: "  + account2.getBalance());
        System.out.printf("Monthly Interest Rate: %.2f ", account2.getMonthlyInterestRate());
        System.out.println();
        System.out.println("Annual Interest Rate: " + account2.getAnnualInterestRate());
        System.out.println("Balance after withdraw of 2000: " + account2.getBalance());
        System.out.println("Balance after deposit of 5000: " + account2.getBalance());


    }
}
