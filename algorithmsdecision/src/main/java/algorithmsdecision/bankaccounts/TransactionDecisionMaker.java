package algorithmsdecision.bankaccounts;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TransactionDecisionMaker {

    public boolean containsCreditEntryGreaterThan(List<Transaction> transactions, LocalDateTime startTime, LocalDateTime endTime, int greaterThan) {

        for (Transaction c : transactions) {
            boolean isafter = c.getDateOfTransaction().isAfter(startTime);
            boolean isbefore = c.getDateOfTransaction().isBefore(endTime);

            if ((isafter && isbefore) && c.isDebit() && c.getAmount() > greaterThan) {
                return true;
            }
        }

        return false;
    }

}
