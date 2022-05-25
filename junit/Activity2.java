import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Activity2 {

    @Test
    public void notEnoughFunds()
    {
        BankAccount account=new BankAccount(900);
        assertThrows(NotEnoughFundsException.class, () -> account.withdraw(1000),
        "Balance must be greater than amount of withdrawal");
    }

    @Test
    public void enoughFunds()
    {
        BankAccount account = new BankAccount(100);
        // Assertion for no exceptions
        assertDoesNotThrow(() -> account.withdraw(100));
     }}

