package bank2;

import bank.InvalidBankOperationException;

import java.util.List;

public class Bank {

    private List<Account> accounts;

    public Bank(List<Account> accounts) {
        if(accounts == null){
            throw new IllegalArgumentException();
        }
        this.accounts = accounts;
    }

    public boolean isValidAcc(String accNum){
        for(Account c:accounts){
            if(c.getAccountNumber().equals(accNum)) { return true;}
        }
        return false;
    }

    public void payment(String accNumber, double amount) {
        if(!isValidAcc(accNumber)){
            throw new InvalidAccountNumberBankOperationException();
        }
        for (Account c : accounts) {
            if(c.getAccountNumber().equals(accNumber)){
                c.subtract(amount);

            }
        }

    }

    public void deposit(String accNumber, double amount) {
        if(!isValidAcc(accNumber)){
            throw new InvalidAccountNumberBankOperationException();
        }

        for (Account c : accounts) {
            if(c.getAccountNumber().equals(accNumber)){
                c.deposit(amount);
            }
        }
    }

}
