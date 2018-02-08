package inheritancemethods.bankaccount;

public class CreditAccount extends DebitAccount {

    long overdraftLimit;

    public CreditAccount(String accountNumber, long balance, long overdraftLimit){
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean transaction(long amount) { //
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount - costOfTransaction(amount));
            return true;
        }
        if(amount <= getBalance()+getOverdraftLimit()){
            setOverdraftLimit(getOverdraftLimit()-(amount-getBalance())-costOfTransaction(amount));
            setBalance(0);
            return true;
        }
        return false;
    }

    public long getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(long overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
}
