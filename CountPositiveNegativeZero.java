
import java.util.Scanner;

public class CountPositiveNegativeZero {

	public static void main(String[] args){

	
	Scanner bravo = new Scanner(System.in);

	int theNum = 99;
	int isCounter = 0;
	int isPositive = 0;
	int isNegative = 0;
	int isZero = 0;

	System.out.print("Enter the numbers continuously except 99 till you want to stop: ");
	int getNum = bravo.nextInt();
	
	int isNum = getNum;

	while(isNum != 99){
		++isCounter;
	System.out.print("Enter the numbers continuously except 99 till you want to stop: ");
	    getNum = bravo.nextInt();
	
	if(getNum == 0){
		isZero = isZero+1;
	}else
	if(getNum < 0){
		isNegative = isNegative+1;
	}else
	if(getNum > 0){
		isPositive = isPositive+1;
	}
	
	if(getNum == theNum){
		
	System.out.printf("Total numbers you have entered equals: %d%n", +isCounter);
	System.out.printf("Number of the Positives entered equals: %d%n", +isPositive);
	System.out.printf("Number of the Negatives entered equals: %d%n", +isNegative);
	System.out.printf("Number of the Zeros entered equals: %d%n", +isZero);
	}

	}

	
	

   }

}




