package Excercise3;
import static org.junit.Assert.*;
import org.junit.Test;

public class BankAccountTest {
    
    @Test
    public void testNewAccountHasZeroBalance() {
        BankAccount account = new BankAccount();
        assertEquals(0.0, account.getBalance(), 0.001);
    }

}
