package algorithmssum.transactions;


import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
<<<<<<< HEAD
<<<<<<< HEAD
import transactions.Transaction;
import transactions.TransactionOperation;

import static org.junit.Assert.*;

public class TransactionTest {

    @Test
    public void testCreateTransaction() {
        Transaction transaction = new Transaction("1234-2345-1231", TransactionOperation.CREDIT, 100000);

=======
=======
>>>>>>> master
import static org.junit.Assert.*;

public class TransactionTest {
    
    @Test
    public void testCreateTransaction() {
        Transaction transaction = new Transaction("1234-2345-1231", TransactionOperation.CREDIT, 100000);
        
<<<<<<< HEAD
>>>>>>> master
=======
>>>>>>> master
        assertThat(transaction.getAmount(),is(100000));
        assertThat(transaction.isCredit(),is(true));
        assertThat(transaction.isDebit(),is(false));
    }
}
