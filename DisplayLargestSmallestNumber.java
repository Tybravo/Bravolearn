import java.util.Scanner;

public class DisplayLargestSmallestNumber {

	public static void main(String[] args){

	
	Scanner bravo = new Scanner(System.in);

	int theStopper = -999;
	int isCounter = 0;
	int largestNum = Integer.MIN_VALUE;
   	int smallestNum = Integer.MAX_VALUE;


	System.out.print("Enter the numbers continuously except -999 till you want to stop in order to get the largest and the smallest number: ");
	int isNum = bravo.nextInt();
	int getNum = isNum;

	while(getNum != -999){
	    ++isCounter;
	System.out.print("Enter the numbers continuously except -999 till you want to stop in order to get the largest and the smallest number: ");
	    isNum = bravo.nextInt();
	    int currentNum = isNum;
	
	if(currentNum > largestNum){
	largestNum = currentNum;
	}
	if(currentNum < smallestNum && currentNum != -999){
	smallestNum = currentNum;
	}

	if(isNum  == theStopper){
	System.out.printf("Total numbers you have entered equals: %d%n", +isCounter);
	System.out.printf("The Largest number is: %d%n", largestNum);
	System.out.printf("The smallest number is: %d%n", smallestNum);
	}
	
	}
	

    }

}
