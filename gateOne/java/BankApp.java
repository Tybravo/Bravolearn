import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class BankApp {

	public static void main(String[] args) {
		Bank bank = new Bank();

		System.out.println();
		System.out.println("<<<<WELCOME TO GTB ATM APP>>>>");

		String signUpOption = """
                1. Create an account
                2. Login to your account
                3. Close account
                """;
		System.out.println(signUpOption);
		offSessionOptionsMethod(bank);
		}

	public static void offSessionOptionsMethod(Bank bank) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();

		String offSessionNum = input.nextLine();
			if (!offSessionNum.equals("1") && !offSessionNum.equals("2") && !offSessionNum.equals("3")) {
		System.out.println("Wrong number input");
		//main();
		}
		switch (offSessionNum) {
			case "1":
				System.out.print("Enter your first name: ");
				String firstName = input.nextLine();
				System.out.print("Enter your last name: ");
				String lastName = input.nextLine();
				System.out.print("Enter your PIN: ");
				String myPin = input.nextLine();
				long acsNumber = 1000000000L + random.nextLong(900000000L);

		Account account = new Account(firstName, lastName,myPin, 0);
		bank.addAccount(account);

		System.out.println("Account created successfully!");
		System.out.printf(" First name:%s %n ", firstName);
		System.out.printf("Last name:%s %n ", lastName);
		System.out.printf("Account no.:%d %n%n ", acsNumber);
		inSessionOptionsMethod(bank, account);
		break;

			case "2":
				loginAccount(bank);
			break;

			case "3":
				System.out.println("Ending Application.");
				System.exit(0);
				break;

				default:
				System.out.println("Invalid option. Please enter a valid number.");
		offSessionOptionsMethod(bank);
        }
    }

	
	private static void loginAccount(Bank bank) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your pin: ");
		String myPin = input.nextLine();

		Account account = bank.findAccountByPin(myPin);
			if (account != null) {
		inSessionOptionsMethod(bank, account);
		}
		else{
		System.out.println("Account can not be found. Please try again.");
		offSessionOptionsMethod(bank);
		}
	}

  
	private static void inSessionOptionsMethod(Bank bank, Account account) {
		Scanner input = new Scanner(System.in);
		System.out.println("ENTER ANY NUMBER LISTED TO NAVIGATE THE MENU");
		String selectOption = """
			1. Deposit Money
			2. Withdraw Money
			3. Transfer Money
			4. Check Account Balance
			5. Go to Main Menu
			""";
		System.out.println(selectOption);

		String number = input.next();
			switch (number) {
				case "1":
					System.out.print("Deposit an amount: ");
					double depositAmount = 0;
					try{
					depositAmount = input.nextDouble();
					}catch (Exception e) {
					System.out.print("Invalid input. Please enter a valid number:");
					input.nextLine();
					}
					account.deposit(depositAmount);
					System.out.printf("Current balance is: $%.2f%n", account.getBalance());
		inSessionOptionsMethod(bank, account);
                break;

				case "2":
					System.out.print("Withdraw an amount: ");
					double withdrawAmount = 0;
					try{
					withdrawAmount = input.nextDouble();
					}catch (Exception e){
					System.out.print("Invalid input. Please enter a valid number: ");
					input.nextLine();
					}
					account.withdraw(withdrawAmount);
					System.out.printf("Current balance is: $%.2f%n", account.getBalance());
		inSessionOptionsMethod(bank, account);
                break;


			   case "3":
/*
					System.out.print("Enter the first name of the recipient: ");
					String recipientFirstName = input.next();
					System.out.print("Enter the last name of the recipient: ");
					String recipientLastName = input.next();
*/
					System.out.print("Enter account number of the recipient: ");
					Long recipientAccNum = input.nextLong();

                Account recipientAccount = bank.findAccountByAccNum(recipientAccNum);
                if (recipientAccount != null) {
					System.out.print("Enter the amount to transfer: ");
					double transferAmount = input.nextDouble();
					bank.transferMoney(account, recipientAccount, transferAmount);
					} else {
					System.out.println("Recipient account not found.");
		}
                inSessionOptionsMethod(bank, account);
                break;


				case "4":
					System.out.printf("Your balance is: $%.2f%n", account.getBalance());
		inSessionOptionsMethod(bank, account);
                break;

				case "5":
					System.out.println("Going back to main menu.");
		offSessionOptionsMethod(bank);
		break;

				default:
					System.out.println("Invalid selection. Please try again to select valid number.");
		inSessionOptionsMethod(bank, account);
        }
    }
}




class Bank {
	private ArrayList<Account> accounts;

	public Bank() {
		accounts = new ArrayList<>();
	}

	public void addAccount(Account account) {
		accounts.add(account);
	}

	public Account findAccountByPin(String myPin) {
		for (Account account : accounts) {
			if (account.getMyPin().equals(myPin)) {
			return account;
			}
		}
		return null;
	}
	
	public Account findAccountByAccNum(Long accountNum){
		for(Account account : accounts){
			if(account.getAccountNum().equals(accountNum) {
			return account
			}
		}
		return null;
	}

	public Account findAccountByName(String firstName, String lastName) {
		for (Account account : accounts) {
			if (account.getFirstName().equalsIgnoreCase(firstName) && account.getLastName().equalsIgnoreCase(lastName)) {
			return account;
			}
		}
		return null;
	}

	public void transferMoney(Account fromAccount, Account toAccount, double amount) {
		if (fromAccount.getBalance() >= amount) {
			fromAccount.withdraw(amount);
			toAccount.deposit(amount);
		System.out.printf("You have transferred $%.2f from %s %s to %s %s%n",
		amount, fromAccount.getFirstName(), fromAccount.getLastName(), toAccount.getFirstName(), toAccount.getLastName());
		} else {
		System.out.println("Insufficient funds");
		}
	    }
	}




class Account {
	private String firstName;
	private String lastName;
	private String myPin;
	private Long accountNum;
	private double balance;
	private double insufficient;

	public Account() {
	}

	public Account(String firstName, String lastName, String myPin, Long accountNum, double balance) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.myPin = myPin;
		this.accountNum = accountNum;
			if (balance > 0.0) {
			this.balance = balance;
		}
	}

	public void deposit(double depositAmount) {
		if (depositAmount > 0.0) {
			balance += depositAmount;
		} else if (depositAmount < 0.0) {
			System.out.println("Wrong input. Your current balance is $" + balance);
		}
	}

	public void withdraw(double withdrawAmount) {
		if (withdrawAmount <= balance && withdrawAmount > 0.0) {
			balance -= withdrawAmount;
		} else if (withdrawAmount < 0.0) {
			System.out.println("Wrong input. Your current balance is $" + balance);
		} else {
		insufficient = balance;
			System.out.println("Insufficient funds. Your current balance is $" + balance);
		}
	}

	public void setNames(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public double getBalance() {
		return balance;
	}

	public String getMyPin() {
		return myPin;
	}

	public Long getAccountNum() {
		return accountNum;
	}

	public double getInsufficient() {
        return insufficient;
	}

}


