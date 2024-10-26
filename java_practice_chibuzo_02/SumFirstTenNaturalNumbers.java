
import java.util.Scanner;

public class SumFirstTenNaturalNumbers {

	public static void main(String[] args){

	int naturalNum = 10;

	int sumNumber = 0;
	for(int isNumber = 1; isNumber <= naturalNum; isNumber++){
	sumNumber = sumNumber + isNumber;

	System.out.println("when we have number = " +isNumber+ " The sum is " +sumNumber);
	}
	
	System.out.println("The total sum is: " +sumNumber);


    }

}