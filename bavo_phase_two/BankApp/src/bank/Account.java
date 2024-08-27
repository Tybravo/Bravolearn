package bank;

public class Account {
    private int balance;
    private String pin;
    private String accountName;

public Account(String defaultPin, String accountNum) {
    this.pin = defaultPin;
    this.accountName = accountNum;
    }

    public int getBalance(String correctPin){
        return balance;
    }

    public void deposit(int amount){
        boolean amountIsGreaterThanZero = amount > 0;
        if(amountIsGreaterThanZero){
            balance += amount;
        }
    }

    public void withdraw(int amount) {
       boolean amountIsPositive = amount > 0;
       boolean fundsIsSufficient = amount <= balance;
       if(amountIsPositive && fundsIsSufficient) {
           balance -= amount;
       }
    }

    public void updatePin(String oldPin, String newPin) {
        if(this.pin.equals(oldPin))
            this.pin = newPin;
        //throw new IllegalArgumentException("You have entered wrong pin");
    }
}
