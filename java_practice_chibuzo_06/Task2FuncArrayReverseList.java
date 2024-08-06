import java.util.Arrays;
import java.util.Scanner;

public class Task2FuncArrayReverseList{

	public static void main(String...args){

		int[] setOfNumbers = {6, 7, 8, 9};
		int[] getReversal = isReversal(setOfNumbers);

		System.out.println(Arrays.toString(setOfNumbers));
		System.out.printf("The reversal number is %s %n %n", Arrays.toString(getReversal));

   }




	public static int[] isReversal(int[] isLists){

		int[] isReversed = new int[isLists.length];
		int numbers = 0;

		for(int index = 0; index < isLists.length; index++){
		numbers = (isLists.length - 1) - index;
		isReversed[index] = isLists[numbers];
		}
		return isReversed;
     }


}

