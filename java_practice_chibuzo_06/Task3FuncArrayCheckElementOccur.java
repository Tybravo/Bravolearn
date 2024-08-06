import java.util.Arrays;
import java.util.Scanner;

public class Task3FuncArrayCheckElementOccur{

	public static void main(String...args){
		Scanner input = new Scanner(System.in);
		
		int[] setOfNumbers = {20, 5, 18, 4, 12};
		//int yesChecker = 18;
	
		System.out.print("Enter a number to check if element occurs: ");
		int yesChecker = input.nextInt();
		
		if(checkElement(setOfNumbers, yesChecker)){
		System.out.printf("Yes, number is available %s %n %n", Arrays.toString(setOfNumbers));
		}
		else{
		System.out.println("No, number is not available");
		}
   }



public static boolean checkElement(int[] isElements, int isChecker){

		for(int index = 0; index < isElements.length; index++){
		if(isElements[index] == isChecker){
		return true;
		}
    			
    	}
	return false;

    }



}



