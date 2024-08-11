import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class BankApp{

	public static void main(String[] args){
		Bank bank = new Bank();
	
		System.out.println();
		System.out.println("<<<<WELCOME TO GTB ATM APP>>>>");
		
		String signUpOption = """
				1. Create an account
				2. Login to your account
				3. Close acoount
				""";
			System.out.println(signUpOption);
		offSessionOptionsMethod(gtbBank);
    }


	public static void offSessionOptionsMethod(Bank bank){
		
		Scanner input = new Scanner(System.in);
		Random random = new Random();

			String offSessionNum = input.nextLine();
			if(!offSessionNum.equals("1") && !offSessionNum.equals("2") && !offSessionNum.equals("3") ){
			System.out.println("Wrong number input");
			}

			switch(offSessionNum){
				case "1":
					System.out.print("Enter your first name:");
					String firstName = input.nextLine();
					System.out.print("Enter your last name:");
					String lastName = input.nextLine();
					System.out.print("Enter your PIN:");
					String getPin = input.nextLine();
					Long acsNumber = 1000000000 + random.nextLong(9000000);
					break;

				case "2":
					System.out.print("Enter your account number:");
					acsNumber = input.nextLong();
					break;

				case "3":
					System.out.println("Close account to end application:");
					System.exit(0);
			
	Account myAccount = new Account(firstName, lastName, 0);  // Assuming balance starts at 0
	bank.addAccount(myAccount);  // Add the account to the bank

        	System.out.println("Account created successfully!");
        	inSessionOptionsMethod(input, myAccount);
		}
   }


 private static void loginAccount(Bank bank) {
	Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();

        Account account = bank.findAccountByName(firstName, lastName);
        if (account != null) {
            inSessionOptionsMethod(input, account);
        } else {
            System.out.println("Account not found. Please try again.");
        }
    }


private static void inSessionOptionsMethod(Account myAccount) {
        	System.out.println("ENTER ANY NUMBER LISTED TO NAVIGATE THE MENU");
		String selectOption = """
		1. Deposit Money
		2. Withdraw Money
		3. Transfer Money
		4. Check Account Balance
		5. Exit to Main Menu
		""";
		System.out.println(selectOption);
		
		String number = input.next();
		switch (number) {
			case "1":
				System.out.print("Deposit an amount: ");
				double depositAmount = input.nextDouble();
				myAccount.deposit(depositAmount);
				System.out.printf("Current balance is: $%.2f%n", myAccount.getBalance());
				inSessionOptionsMethod(input, myAccount);  // Recursively call with the same account
				break;
/*
            case "2":
                System.out.print("Withdraw an amount: ");
                double withdrawAmount = input.nextDouble();
                myAccount.withdraw(withdrawAmount);
                if (withdrawAmount > myAccount.getBalance()) {
                    System.out.println("Withdrawal failed. Insufficient funds.");
                } else {
                    System.out.println("Transaction done successfully");
                }
                optionsMethod(input, myAccount);  // Recursively call with the same account
                break;

            case "3":
                System.out.print("Enter the first name of the recipient: ");
                String recipientFirstName = input.next();
                System.out.print("Enter the last name of the recipient: ");
                String recipientLastName = input.next();

                Account recipientAccount = bank.findAccountByName(recipientFirstName, recipientLastName);
                if (recipientAccount != null) {
                    System.out.print("Enter the amount to transfer: ");
                    double transferAmount = input.nextDouble();
                    bank.transferFunds(myAccount, recipientAccount, transferAmount);
                } else {
                    System.out.println("Recipient account not found.");
                }
                optionsMethod(input, myAccount);  // Recursively call with the same account
                break;

            case "4":
                System.out.printf("Your balance is: $%.2f%n", myAccount.getBalance());
                optionsMethod(input, myAccount);  // Recursively call with the same account
                break;

            case "5":
                // Exit to main menu
                break;

            default:
                System.out.println("Invalid choice. Please try again.");
                optionsMethod(input, myAccount);
*/
        }
    }

}



class Bank{
	private ArrayList<Account> accounts;

	public Bank(){
		accounts = new ArrayList<>();
	}

	public void addAccount(Account account){
		accounts.add(account);	
	}

	public Account findAccountByname(String firstName, String lastName){
		for(Account account : accounts){
		if(account.getFirstName().equals(firstName) && account.getLastName().equals(lastName)){
			return account;
			}
		}
		return null;
	}

	public void transferMoney(Account fromAccount, Account toAccount, double amount){
		if(fromAccount.getBalance() >= amount){
		fromAccount.withdraw(amount);
		toAccount.deposit(amount);
		System.out.printf("You have transfered $%.2f from %s %s to %s %s %n", amount, fromAccount.getFirstName(), fromAccount.getLastName, toAccount.getFirstName, toAccount.getLastName());
		}
		else{
		System.out.println("Insufficient funds");
		}
	}
}





class Account{
	private String firstName;
	private String lastName;
	private String getPin;
	private Long accountNum;
	private double balance;
	private double insufficient;
	
	public Account(){
	}

	public Account(String firstName, String lastName, double balance){
		this.firstName = firstName;
		this.lastName = lastName;
			if(balance > 0.0){
			this.balance = balance;
			}
	}

	public void deposit(double depositAmount){
		if(depositAmount > 0.0){
		balance = balance + depositAmount;
		}
	}

	public void withdraw(double withdrawAmount){
		if(withdrawAmount <= banlance){
		balance = balance - withdrawAmount;
		}
		else{
		insufficient = balance;
		System.out.println("Insufficient funds. Your current balance iss $" +balance);
		}
	}

	public void ssetNames(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName(){
		return firstName;
	}

	public String getLastName(){
		return lastName;
	}

	public double getBalance(){
		return balance;
	}
	
	public double getInsufficient(){
		return insufficient;
	}

}

