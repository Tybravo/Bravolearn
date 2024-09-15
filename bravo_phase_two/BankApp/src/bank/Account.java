package bank;

public class Account {
    private int balance;
    private String pin;
    private int accountNum;
    private String firstName;
    private String lastName;

public Account(String firstName, String lastName, String defaultPin) {
    this.pin = defaultPin;
    this.accountNum = accountNum;
    this.firstName = String.valueOf(firstName);
    this.lastName = lastName;
    }

    public Account(int noumofaccount, String firstName, String pin) {
    this.accountNum = noumofaccount;
    }


    public int getBalance(String correctPin){
        if (verifyPin(correctPin)) {
            return balance;
        }
        throw new IllegalArgumentException("Incorrect PIN");
    }

    public boolean verifyPin(String inputPin) {
        return this.pin.equals(inputPin);
    }

    public void deposit(int amount){
        boolean amountIsGreaterThanZero = amount > 0;
        boolean amountIsLessThanZero = amount < 0;
        if(amountIsGreaterThanZero){
            balance += amount;
        }
        else if(amountIsLessThanZero){
            balance = balance;
        }
    }

    public void withdraw(int amount) {
       boolean amountIsPositive = amount > 0;
        boolean amountIsGreaterThan500k = amount >= 500_000;
        boolean fundsIsSufficient = amount <= balance;
        if(amountIsGreaterThan500k){
            balance = balance;
        }
        else if(amountIsPositive && fundsIsSufficient) {
           balance -= amount;
       }
    }

    public void updatePin(String oldPin, String newPin) {
        if (verifyPin(oldPin)) {
            this.pin = newPin;
        } else {
            throw new IllegalArgumentException("Incorrect PIN");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

}
