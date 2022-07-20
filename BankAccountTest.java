public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        System.out.println(account1.getAccountNumber());

        account1.deposit(4000, "checking balance");
        System.out.println(account1.getCheckingBalance());

        System.out.println(account1.withdraw(1500, "checking balance"));

        account1.withdraw(5000, "checking balance");
        System.out.println(account1.withdraw(5000, "checking balance"));

        System.out.println(account1.totalMoney());
    }
}
