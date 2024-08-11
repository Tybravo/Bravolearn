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

		Account myAccount = new Account(firstName, lastName,myPin, 0);
		bank.addAccount(myAccount);

		System.out.println("Account created successfully!");
		System.out.printf("First name:%s %n ", firstName);
		System.out.printf("Last name:%s %n ", lastName);
		System.out.printf("Account no.:%d %n%n ", acsNumber);
		inSessionOptionsMethod(bank, myAccount);
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

  
	private static void inSessionOptionsMethod(Bank bank, Account myAccount) {
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
					double depositAmount = input.nextDouble();
					myAccount.deposit(depositAmount);
					System.out.printf("Current balance is: $%.2f%n", myAccount.getBalance());
		inSessionOptionsMethod(bank, myAccount);
                break;

				case "2":
					System.out.print("Withdraw an amount: ");
					double withdrawAmount = input.nextDouble();
					myAccount.withdraw(withdrawAmount);
					System.out.printf("Current balance is: $%.2f%n", myAccount.getBalance());
		inSessionOptionsMethod(bank, myAccount);
                break;

				case "3":
					System.out.print("Enter the account no. of beneficiary: ");
					String recipientAccountNumber = input.next();
					System.out.print("Enter the first name of beneficiary: ");
					String recipientFirstName = input.next();
					System.out.print("Enter the last name of the benficiary: ");
					String recipientLastName = input.next();

				case "4":
					System.out.printf("Your balance is: $%.2f%n", myAccount.getBalance());
		inSessionOptionsMethod(bank, myAccount);
                break;

				case "5":
					System.out.println("Going back to main menu.");
		offSessionOptionsMethod(bank);
		break;

				default:
					System.out.println("Invalid choice. Please try again.");
		inSessionOptionsMethod(bank, myAccount);
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

	public Account findAccountByPin(String myPin){
		for(Account account : accounts){
			if(account.getMyPin().equals(myPin)){
		return account;
		}
	}
	return null;
	}

	public Account findAccountByName(String firstName, String lastName) {
		for (Account account : accounts) {
			if (account.getFirstName().equals(firstName) && account.getLastName().equals(lastName)) {
                return account;
		}
	}
	return null;
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

	public Account(String firstName, String lastName, String myPin, double balance) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.myPin = myPin;
		if (balance > 0.0) {
		this.balance = balance;
		}
	}

	public void deposit(double depositAmount) {
		if (depositAmount > 0.0) {
		balance = balance + depositAmount;
		}
	}

	public void withdraw(double withdrawAmount) {
		if (withdrawAmount <= balance) {
		balance = balance - withdrawAmount;
		}
		else {
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

	public double getInsufficient() {
        return insufficient;
	}
}

