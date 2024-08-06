import java.util.Arrays;
import java.util.Scanner;

public class Task4FuncArrayPrintElementOddPosition{

	public static void main(String...args){

		Scanner input = new Scanner(System.in);
		
		int[] setOfNumbers = {20, 5, 18, 7, 13, 4, 12, 23};
		int[] getOddNumbers= oddPosition(setOfNumbers);
		System.out.printf("The set of odd numbers are %s %n %n", Arrays.toString(getOddNumbers));
		}
   



public static int[] oddPosition(int[] elements){
		int oddIndex = 0;
		int[] oddNumbers = new int[elements.length];
		
		for(int index = 0; index < elements.length; index++){
		if(elements[index] % 2 != 0){
		oddNumbers[oddIndex] = elements[index];
		}
		oddIndex++;	
    	}
		return oddNumbers;
		
    }



}



