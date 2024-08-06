
import java.util.Scanner;

public class NumberRaisedPowerOfAnother {

	public static void main(String[] args){


	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number and enter another number to find the value of first number raised to power of the second: ");
	int firstNum = input.nextInt();
	System.out.print("Enter the second number to find the value of first number raised to power of the second: ");
	int secondNum = input.nextInt();

	int isNumber = 1;
	int getResult = 1;
	for(isNumber = 1; isNumber <= secondNum; isNumber++){
	
	   getResult = getResult * firstNum;

	}

	System.out.printf(" The value is %d%n", +getResult);


    }

}