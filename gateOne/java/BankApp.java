import java.util.Scanner;

public class BankApp{

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);

		System.out.println();
		System.out.println("<<<<WELCOME TO GTB ATM APP>>>>");
		System.out.print("Enter your first name:");
		String firstName = input.nextLine();
		System.out.print("Enter your last name:");
		String lastName = input.nextLine();
		System.out.print("Enter your PIN:");
		String getPin = input.nextLine();
					
	//Account myAccount = new Account(getFirstName, getLastName, getBalance);
		System.out.printf("%s %s %s %n, ", firstName, lastName, getPin);	
	
		System.out.println(">>>>>>>>>>>>>>>>>");
		System.out.println("Saved successfuly");
		System.out.println();

		optionsMethod();

		}


	
	public static void optionsMethod(){
		
		Scanner input = new Scanner(System.in);

		System.out.println("ENTER ANY NUMBER LISTED TO NAVIGATE THE MENU");
		String selectOption = """
			1. Deposit Money
			2. Withdraw Money
			3. Transfer Money
			4. Check Account Balance
			5. Change Pin
			6. Close Account
			""";
		System.out.println(selectOption);

		
		double getBalance = 0;
		String getFirstName = "";
		String getLastName = "";
		//String getLastName = "firstName" + "lastName";
		double currentBalance = 0;
		double withdrawal = 0;
		String number = input.next();
		
	Account myAccount = new Account(getFirstName, getLastName, getBalance);

				if(!number.equals("1") && !number.equals("2") && !number.equals("3") && !number.equals("4") &&!number.equals("5") &&!number.equals("6") ){
		System.out.println("Wrong number input");
		optionsMethod();
		}

		switch(number){
			case "1":
				System.out.print("Deposit an amount: ");
				double depositAmount = input.nextDouble();
				myAccount.deposit(depositAmount);
					System.out.println(">>>>>>>>>>>>>>>>>");
					System.out.println("Saved successfuly");					
					System.out.printf("%s %s Current balance is: $%.2f %n%n", myAccount.getFirstName(), myAccount.getLastName(), myAccount.getBalance());
				optionsMethod();

			case "2":
				System.out.print("Withdraw an amount: ");
				double withdrawAmount = input.nextDouble();
				myAccount.withdraw(withdrawAmount);
					if(withdrawAmount == 0.00){
					System.out.println("Insufficient fund");
					}
					System.out.println(">>>>>>>>>>>>>>>>>");
					System.out.println("Transaction done successfuly");
					System.out.printf("%s %s Current balance: $%.2f %n%n", myAccount.getFirstName(), myAccount.getLastName(), myAccount.getBalance());
				optionsMethod();
				
			case "3":

			case "4":
				System.out.print("Check account balance: ");
				System.out.printf("%s %s Your balance is: $%.2f %n", myAccount.getFirstName(), myAccount.getLastName(), myAccount.getBalance());	
				optionsMethod();

			}


	}

}



class Account{

		private String firstName;
		private String lastName;
		private String getPin;
		private double insufficient;
		private double balance;

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
			if(withdrawAmount < balance){
			balance = balance - withdrawAmount;
			}
			if(withdrawAmount > balance){
			insufficient = 0.00;
			}
		}

		public void setNames(String firstName, String lastName){
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
	


