package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {

    public Account account;
    @BeforeEach
    public void getStartedWithThis() {
        account = new Account("", "", "correctPin");
    }

    @Test
    public void newAccount_balanceIsZeroTest(){
        assertEquals(0, account.getBalance("correctPin"));
    }

    @Test
    public void deposit2k1k_BalanceIs3kTest() {
        account.deposit(2000);
        assertEquals(2_000, account.getBalance("correctPin"));
        account.deposit(1_000);
        assertEquals(3_000, account.getBalance("correctPin"));
    }

    @Test
    public void withdraw1k_BalanceIs3kTest() {
        account.deposit(4_000);
        assertEquals(4_000, account.getBalance("correctPin"));
        account.withdraw(1_000);
        assertEquals(3_000, account.getBalance("correctPin"));
    }

    @Test
    public void withdraw5k_CannotWithdrawBalanceIs2kTest() {
        assertEquals(0, account.getBalance("correctPin"));
        account.deposit(3_000);
        account.withdraw(5_000);
        assertEquals(3_000, account.getBalance("correctPin"));

    }

    @Test
    public void depositNegative3k_CannotDeposit_BalanceIs7kTest() {
        assertEquals(0, account.getBalance("correctPin"));
        account.deposit(7_000);
        assertEquals(7_000, account.getBalance("correctPin"));
        account.deposit(-3_000);
        assertEquals(7_000, account.getBalance("correctPin"));

    }

    @Test
    public void updatePin() {
        account.deposit(2000);
        assertEquals(2000, account.getBalance("correctPin"));
        account.updatePin("correctPin", "newPin");
        assertEquals(2000, account.getBalance("newPin"));

    }
}
