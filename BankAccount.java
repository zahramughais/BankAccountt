import java.util.Random;

public class BankAccount{

    // The class should have the following attributes: (double) checking balance, (double) savings balance.
    private double checkingBalance;
    private double savingsBalance;
    // Create a class member (static) that has the number of accounts created thus far.
    public static int numberOfAccounts;
    // Create a class member (static) that tracks the total amount of money stored in every account created.
    public static double totalMoney;
    // NINJA BONUS: Add the following class attribute: account number.
    // The type is up to you, can be a String or a Long or another type.
    private long accountNumber;
    // In the constructor, be sure to increment the account count.
    // NINJA BONUS: In the constructor, call the private method from above so that each user has a random ten digit account.
    public BankAccount(){
        numberOfAccounts++;
        accountNumber = setAccountNumber();
    }
    // Create a getter method for the user's checking account balance.
    public double getCheckingBalance() {
        return checkingBalance;
    }
    // Create a getter method for the user's saving account balance.
    public double getsavingsBalance(){
        return savingsBalance;
    }
    public long getAccountNumber(){
        return accountNumber;
    }
    // Create a method that will allow a user to deposit money into either the checking or saving,
    // be sure to add to total amount stored.
    public void deposit(double amount, String accountType){
        if (accountType == "checkingBalance"){
            checkingBalance += amount;
        } else if (accountType == "savingsBalance"){
            savingsBalance += amount;
        }
    }
    // Create a method to withdraw money from one balance. Do not allow them to withdraw money if there are insufficient funds.
    public String withdraw(double amount){
        if (amount < checkingBalance){
            checkingBalance -= amount;
            return "your Balance now is: " + checkingBalance;
        } else {
            return "you don't have enough balance";
        }
    }
    // Create a method to see the total money from the checking and saving.
    public double totalMoney(){
        return checkingBalance + savingsBalance;
    }
    // Users should not be able to set any of the attributes from the class.

    // NINJA BONUS: Create a private method that returns a random ten digit account number.
    private long setAccountNumber(){
        long min = 1000000000;
        long max = 2000000000;
        long randomNumber= (long)Math.floor(Math.random()*(max-min+1)+min);
        return randomNumber;
    } 
}