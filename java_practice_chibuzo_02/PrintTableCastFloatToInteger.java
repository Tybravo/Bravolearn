
import java.util.Scanner;

public class PrintTableCastFloatToInteger {

	public static void main(String[] args){

	char isNumber = 'a';
	char isPower = 'b';
	String isResult = "pow(a, b)";
	
	int isOne = 1;
	int isTwo = 2;
	int isThree = 3;
	int isFour = 4;
	int isFive = 5;
	int isSix = 6;
	
	double resultOne = Math.pow(isOne, isTwo);
	double resulTwo = Math.pow(isTwo, isThree);
	double resultThree = Math.pow(isThree, isFour);
	double resultFour = Math.pow(isFour, isFive);
	double resultFive = Math.pow(isFive, isSix);

	int isResultOne = (int)resultOne;
	int isResulTwo = (int)resulTwo;
	int isResultThree = (int)resultThree;
	int isResultFour = (int)resultFour;
	int isResultFive = (int)resultFive;
	

	System.out.printf(" %c   %c   %s%n", isNumber, isPower, isResult);
	System.out.printf(" %d   %d   %d%n", isOne, isTwo, isResultOne);
	System.out.printf(" %d   %d   %d%n", isTwo, isThree, isResulTwo);
	System.out.printf(" %d   %d   %d%n", isThree, isFour, isResultThree);
	System.out.printf(" %d   %d   %d%n", isFour, isFive, isResultFour);
	System.out.printf(" %d   %d   %d%n", isFive, isSix, isResultFive);
	
    }

}

