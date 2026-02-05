package Excercise3;
import static org.junit.Assert.*;
import org.junit.Test;

public class BankAccountTest {
    
    @Test
    public void testNewAccountHasZeroBalance() {
        BankAccount account = new BankAccount();
        assertEquals(0.0, account.getBalance(), 0.001);
    }
    
    @Test
    public void testDepositIncreasesBalance() {
        BankAccount account = new BankAccount();
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdrawDecreasesBalance() {
        BankAccount account = new BankAccount(50.0);
        account.withdraw(30.0);
        assertEquals(20.0, account.getBalance(), 0.001);
    }

    @Test
    public void testPreventOverdraft() {
        BankAccount account = new BankAccount(30.0);
        
        try{
            account.withdraw(50.0);
            fail("Expected an error for overdraft");
        } catch (IllegalArgumentException e) {
        }
        assertEquals(30.0, account.getBalance(), 0.001);
    }

}
