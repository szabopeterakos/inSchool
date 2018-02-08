package bank;

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
            throw new InvalidBankOperationException(InvalidBankOperationException.ErrorCode.INVALID_AMOUNT);
        }
        if(amount > this.balance){
            throw new InvalidBankOperationException(InvalidBankOperationException.ErrorCode.LOW_BALANCE);
        }

        return balance -= amount;
    }

    public double deposit(double amount){
        if(amount < 0){
            throw new InvalidBankOperationException(InvalidBankOperationException.ErrorCode.INVALID_AMOUNT);
        }

        return balance += amount;
    }

    public void setMaxSubtract(double maxSubtract) {
        if(maxSubtract < 0){
            throw new InvalidBankOperationException(InvalidBankOperationException.ErrorCode.INVALID_AMOUNT);
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
