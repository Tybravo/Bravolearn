

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        showMainMenu();
    }

            public static void showMainMenu() {
                String menu = """
                Select User Type
                1 -> Customer
                2 -> Seller
                3 -> Admin
                4 -> Exit
                """;
                print(menu);
                char userInput = input("homePrompt").charAt(0);


                switch(userInput) {
                    case '1':
                        customer();
                    case '2':
                        seller();
                    case '3':
                        admin();
                    case '4':
                        exit();
                }
            }

/*
            private static void transfer() {
                int accountNumber = input("Enter your account number: ").length();
                int accountNumberTo  = input("Enter your sender account number: ").length();
                int amount = input("Enter your amount to transfer: ").length();
                String pin  = (String) input("Enter your pin: ");
                bank.transfer(accountNumber, accountNumberTo,amount, pin);
            }

//    private static void updatePin() {
//        int accountNumber = input("Enter your account number: ").length();
//        String pin  = (String) input("Enter your pin: ");
//        bank.updatePin(accountNumber,oldPin, newPin)
//        showMainMenu();
//    }

            private static void checkBalance() {
                int accountNumber = input("Enter your account number: ").length();
                String pin  = (String) input("Enter your pin: ");
                bank.checkBalance(accountNumber, pin);
                showMainMenu();
            }

            private static void withdraw(){
                int accountNumber = input("Enter your account number: ").length();
                int amount = input("Enter your amount to deposit: ").length();
                String pin  = (String) input("Enter your pin: ");
                int accountNumberTo = input("Enter receivers account number: ").length();
                bank.transfer(accountNumber, accountNumberTo, amount, pin);
                showMainMenu();
            }

            private static void deposit() {
                int accountNumber = input("Enter your account number").length();
                int amount = input("Enter your amount to deposit").length();
                bank.deposit(accountNumber, amount);
                showMainMenu();
            }

            private static void openAccount() {
                String firstName = (String) input("Enter your first name: ");
                String lastName = (String) input("Enter your last name: ");
                String pin  = (String) input("Enter your pin: ");
                bank.createAccountFor(firstName, lastName, pin);
                showMainMenu();
            }

            private static void exit(){
                System.exit(1);
                showMainMenu();
            }
*/
            private static CharSequence input(String inputString) {
                Scanner input = new Scanner(System.in);
                return new Scanner(System.in).nextLine();
            }

            private static void print(String prompt){
                System.out.println(prompt);
            }
        }














    }
}