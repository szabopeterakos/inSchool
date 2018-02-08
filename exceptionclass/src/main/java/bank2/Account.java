package bank2;

import bank.InvalidBankOperationException;

public class Account {

    private String accountNumber;
    private double balance;
    private double maxSubtract = 100000;

    public Account(String accountNumber, double balance) {
        if(accountNumber == null){
            throw new IllegalArgumentException();
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double subtract(double amount){
        if(amount < 0){
            throw new InvalidAmountBankOperationException();
        }
        if(amount > this.balance){
            throw new LowBalanceBankOperationException();
        }

        return balance -= amount;
    }

    public double deposit(double amount){
        if(amount < 0){
            throw new InvalidAmountBankOperationException();
        }

        return balance += amount;
    }

    public void setMaxSubtract(double maxSubtract) {
        if(maxSubtract < 0){
            throw new InvalidAmountBankOperationException();
        }

        this.maxSubtract = maxSubtract;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getMaxSubtract() {
        return maxSubtract;
    }

}
