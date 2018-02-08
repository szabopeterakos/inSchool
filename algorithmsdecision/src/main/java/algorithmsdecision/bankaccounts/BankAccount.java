package algorithmsdecision.bankaccounts;

public class BankAccount {

    private String nameOfOwner;
    private String accountNumber;
    private int balance;

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public BankAccount(String nameOfOwner, String accountNumber, int balance) {
        this.nameOfOwner = nameOfOwner;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public boolean withdraw(int num){
        if(num <= this.balance){
            balance = balance - num;
            return true;
        }

        return false;
    }

    public boolean deposit(int num){
        balance = balance + num;
        return true;
    }

}
