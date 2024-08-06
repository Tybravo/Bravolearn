import java.util.Arrays;
import java.util.Scanner;

public class Task5FuncArrayPrintElementEvenPosition{

	public static void main(String...args){

		Scanner input = new Scanner(System.in);
		
		int[] setOfNumbers = {17, 6, 18, 3, 19, 4, 12, 37, 24, 7, 8};
		int[] getEvenNumbers= evenPosition(setOfNumbers);
		System.out.printf("The set of even numbers are %s %n %n", Arrays.toString(getEvenNumbers));
		}
   



public static int[] evenPosition(int[] elements){
		int evenIndex = 0;
		int[] evenNumbers = new int[elements.length];
		
		for(int index = 0; index < elements.length; index++){
		if(elements[index] % 2 == 0){
		evenNumbers[evenIndex] = elements[index];
		}
		evenIndex++;	
    	}
		return evenNumbers;
		
    }



}



