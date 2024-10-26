
import java.util.Scanner;

public class DoWhileTwoNumbersSumDIsplay {

	public static void main(String[] args){


	Scanner input = new Scanner(System.in);
	String isDecision = "yes";
	
	do{
	System.out.print("Enter a number to display the sum of the number and the second number: ");
	int firstNum = input.nextInt();
	System.out.print("Enter second number to display the sum of the first and the second number: ");
	int secondNum = input.nextInt();

	int getSum = firstNum + secondNum;
	System.out.printf("The sum is: %d%n", getSum);

	System.out.print("Enter Yes to perform the operation again or No to quit? ");
	isDecision = input.next();
	
	if (isDecision.equals("no") || isDecision.equals("No")) {
	System.out.printf("You just quitted performing the operation");
	}
	
	}	
	while(isDecision.equals("yes") || isDecision.equals("Yes"));
	

    }

}
