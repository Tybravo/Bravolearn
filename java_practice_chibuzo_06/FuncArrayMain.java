import java.util.Arrays;
import java.util.Scanner;

public class FuncArrayMain{

	public static void main(String...args){


	FuncArray funcArray = new FuncArray();
	
	int[] listOfNumbers = {50, 30, 70, 20, 15};
	int largestNum = funcArray.isLargest(listOfNumbers);

	System.out.println(Arrays.toString(listOfNumbers));
	System.out.printf("The largest number is %d %n%n", largestNum);



	int[] setOfNumbers = {6, 7, 8, 9};
	int[] getReversal = funcArray.isReversal(setOfNumbers);

	System.out.println(Arrays.toString(setOfNumbers));
	System.out.printf("The reversal number is %s %n %n", Arrays.toString(getReversal));

   }

}

