package transactions;

public class Transaction {

    private String accountNumber;
    private TransactionOperation transactionOperation;
    private int amount;

    public Transaction(String accountNumber, TransactionOperation transactionOperation, int amount) {
        this.accountNumber = accountNumber;
        this.transactionOperation = transactionOperation;
        this.amount = amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public boolean isCredit() {
        if(transactionOperation.toString() == "CREDIT"){
            return true;
        }
        return false;
    }

    public boolean isDebit() {
        if(transactionOperation.toString() == "DEBIT"){
            return true;
        }
        return false;
    }

    public int getAmount() {
        return amount;
    }
}
