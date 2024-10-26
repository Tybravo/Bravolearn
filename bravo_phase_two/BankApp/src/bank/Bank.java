package bank;

import java.util.ArrayList;

public class Bank {

    private int accountNum;
    private ArrayList<Account> accounts = new ArrayList<>();

    public Account createAccount(String firstName, String lastName, String pin) {
       Account newAccount = new Account(accounts.size() + 2, firstName, pin);
        accounts.add(newAccount);
        return newAccount;
    }

    public int countAccounts(Account account) {
        return accounts.size();
    }

    public int countAccounts2() {
        return accounts.size() + 1;
    }

    public void deposit(int accountNum, int amount) {
        accounts.get(accountNum - 1).deposit(amount);
    }

    public int getBalance(int accountNum, String pin) {
        return accounts.get(accountNum - 1).getBalance(pin);
    }

    public void withdraw(int accountNum, int amount) {
        accounts.get(accountNum -1).withdraw(amount);
    }

    public void transfer(int fromAccountNum, String fromPin, int toAccountNum, int amount) {
        Account fromAccount = accounts.get(fromAccountNum - 1);
        Account toAccount = accounts.get(toAccountNum - 1);
        if (fromAccount.getBalance(fromPin) >= amount && fromAccount.verifyPin(fromPin)) {
            fromAccount.withdraw(amount);
            toAccount.deposit(amount);
           // System.out.printf("You have transferred $%.2f from %s %s to %s %s%n",
                   // amount, fromAccount.getFirstName(), fromAccount.getLastName(), toAccount.getFirstName(), toAccount.getLastName());
        } else {
            System.out.println("Insufficient funds or incorrect PIN");
        }
    }
}


