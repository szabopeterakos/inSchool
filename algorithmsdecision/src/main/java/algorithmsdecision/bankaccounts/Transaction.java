package algorithmsdecision.bankaccounts;

import java.time.LocalDateTime;

public class Transaction {

    private String accountNumber;
    private TransactionOperation creditOrDebit;
    private int amount;
    private LocalDateTime dateOfTransaction;
    private Status status;

    public Transaction(String accountNumber, TransactionOperation creditOrDebit, int amount, LocalDateTime dateOfTransaction) {
        this.accountNumber = accountNumber;
        this.creditOrDebit = creditOrDebit;
        this.amount = amount;
        this.dateOfTransaction = dateOfTransaction;
    }

    public int getAmount() {
        return amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public LocalDateTime getDateOfTransaction() {

        return dateOfTransaction;
    }

    public boolean isCredit(){
        if(creditOrDebit.toString() == "CREDIT"){
            return true;
        }
        return false;
    }
    public boolean isDebit(){
        if(creditOrDebit.toString() == "DEBIT"){
            return true;
        }
        return false;
    }
}
