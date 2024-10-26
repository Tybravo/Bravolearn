import java.util.Scanner;

public class CountMultiplesOfAnyNumber{

	public static void main(String[] args){


	Scanner input = new Scanner(System.in);

	int toIncrease = 0;

	int toatlMultiples = 0;
	System.out.print("Enter any number to count their multiples: ");
	int isNumber = input.nextInt();

	for(toIncrease = 2; toIncrease <= isNumber; toIncrease++){

	if(isNumber % toIncrease == 0){
	toatlMultiples = toatlMultiples + 1;
	}
	}
	System.out.print(" "+toatlMultiples);
	

    }

}

