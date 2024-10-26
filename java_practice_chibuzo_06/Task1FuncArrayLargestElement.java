import java.util.Arrays;
import java.util.Scanner;

public class Task1FuncArrayLargestElement{

	public static void main(String...args){

		int[] listOfNumbers = {50, 30, 70, 20, 15};
		int largestNum = isLargest(listOfNumbers);

		System.out.println(Arrays.toString(listOfNumbers));
		System.out.printf("The largest number is %d %n%n", largestNum);
}



	public static int isLargest(int[] isNumbers){

		int largest = isNumbers [0];

		for(int index = 0; index < isNumbers.length; index++){
		if(isNumbers [index] > largest){
		largest = isNumbers [index];
		}
	}
	return largest;
  }


}


