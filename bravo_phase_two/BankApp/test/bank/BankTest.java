package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BankTest {
    Bank gtbBank;
    private Account account;

    @BeforeEach
    public void setUp() {
        gtbBank = new Bank();
    }

    @Test
    public void create_Account_NumOfAcc_IsOne_Test() {
        gtbBank.createAccount("John", "Bravo", "correctPin");
        assertEquals(1, gtbBank.countAccounts(account));
    }

    @Test
    public void deposit1k3k_BalanceIs4k_Test() {
            gtbBank.createAccount("John", "Bravo", "correctPin");
            assertEquals(1, gtbBank.countAccounts(account));
            gtbBank.deposit(1, 1000);
            assertEquals(1, gtbBank.countAccounts(account));
            gtbBank.deposit(1, 3000);
            assertEquals(4000, gtbBank.getBalance(1, "correctPin"));
    }

    @Test
    public void withdraw1k_From3k_BalanceIs2k_Test() {
        gtbBank.createAccount("John", "Bravo", "correctPin");
        assertEquals(1, gtbBank.countAccounts(account));
        gtbBank.deposit(1, 3000);
        assertEquals(3000, gtbBank.getBalance(1, "correctPin"));
        gtbBank.withdraw(1,1000);
        assertEquals(2000, gtbBank.getBalance(1, "correctPin"));
    }

    @Test
    public void create_Account_NumOfAcc_IsTwo_Test() {
        gtbBank.createAccount("Dan", "Mike", "correctPin");
        assertEquals(2, gtbBank.countAccounts2());
    }

    @Test
    public void deposit_Negative2k_BalanceIs2k_Test() {
        gtbBank.createAccount("Dan", "Mike", "correctPin");
        assertEquals(2, gtbBank.countAccounts2());
        gtbBank.deposit(1, 4000);
        assertEquals(2, gtbBank.countAccounts2());
        gtbBank.deposit(1, -2000);
        assertEquals(4000, gtbBank.getBalance(1, "correctPin"));
    }

    @Test
    public void withdraw_Above500k_BalanceIs500k_Test() {
        gtbBank.createAccount("Dan", "Mike", "correctPin");
        assertEquals(2, gtbBank.countAccounts2());
        gtbBank.deposit(1, 800_000);
        assertEquals(800_000, gtbBank.getBalance(1, "correctPin"));
        gtbBank.withdraw(1, 650_000);
        assertEquals(800_000, gtbBank.getBalance(1, "correctPin"));
    }

    @Test
    public void Transfer4k_From_Account1_To_account2_Test() {
        gtbBank.createAccount("John", "Bravo", "correctPin");
        gtbBank.createAccount("Dan", "Mike", "correctPin");
        assertEquals(2, gtbBank.countAccounts(account));
        gtbBank.deposit(2, 6000);
        gtbBank.withdraw(2, 4000);
        assertEquals(2000, gtbBank.getBalance(2, "correctPin"));
        gtbBank.deposit(1, 4000);
        assertEquals(4000, gtbBank.getBalance(1, "correctPin"));
        gtbBank.transfer(1, "correctPin", 2, 3000);
        assertEquals(1000, gtbBank.getBalance(1, "correctPin"));
        assertEquals(5000, gtbBank.getBalance(2, "correctPin"));

    }

}

