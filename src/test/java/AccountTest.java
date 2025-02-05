import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    private Account account;

    @BeforeEach
    public void setUp() {
        account = new Account();
    }
    @Test
    public void testGetBalance()
    {
        assertEquals(0, account.getBalance());
    }
    @Test
    public void testDepositValid()
    {
        account.deposit(100);
        assertEquals(100,account.getBalance());
    }
    @Test
    public void testDepositInvalidAmount()
    {
        account.deposit(-100);
        assertEquals(0,account.getBalance());
    }
    @Test
    public void testWithdrawValid()
    {
        account.deposit(200);
        assertEquals(100,account.withdraw(100));
        assertEquals(100,account.getBalance());
    }
    @Test
    public void testWithdrawInvalidAmount()
    {
        account.deposit(200);
        assertEquals(0,account.withdraw(300));
        assertEquals(200,account.getBalance());
    }

}
