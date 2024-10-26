package bank;

import java.util.Scanner;

import static java.lang.System.exit;
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

                        Account account = new Account(firstName, lastName, myPin);
                        bank.countAccounts(account);
/*
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
                        exit(0);
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
                        /*
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


                         */
                }

    }
}
