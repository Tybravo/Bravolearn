
public class Kata {
       

public static boolean isEven(int number){

	if(number % 2 == 0){
	return true;
	}
	else{
	return false;
	}	
    }


public static boolean isPrime(int primeNumber){
	
	int getNum = 0;
	int checker;
	for(checker = 2; checker <= primeNumber / 2;  checker++){
	getNum = primeNumber % checker;
	}
	if(getNum == 0){
	return false;
	}
	else{
	return true;
	}	
    
    }


public static int isSubtract(int firstNum, int secondNum){
	int largestNum = 0;
	int smallestNum = 0;
	for(int number = 1; number <= 2; number++){

	if(firstNum > secondNum){
	largestNum = firstNum;
	}
	if(secondNum > firstNum){
	largestNum = secondNum;
	}
	if(firstNum < secondNum){
	smallestNum = firstNum;
	}
	if(secondNum < firstNum){
	smallestNum = secondNum;
	}
	}

	int isDifference = largestNum - smallestNum;
	return isDifference;
      
      }


public static float isDivision(float firstNum, float secondNum){
	
	for(int number = 1; number <= 2; number++){
	}

	float isQuotient = firstNum / secondNum;
	return isQuotient;
      
      }


public static int isFactorOf(int factorNum){
	
	int toIncrease = 0;
	int totalMultiples = 0;
	for(toIncrease = 2; toIncrease <= factorNum; toIncrease++){

	if(factorNum % toIncrease == 0){
	totalMultiples = totalMultiples + 1;
	}
	}
	return totalMultiples;
	
      }


public static boolean isSquare(int squareNum){
	
	int toIncrease = 0;
	for(toIncrease = 1; toIncrease <= squareNum; toIncrease++){
	if(toIncrease * toIncrease == squareNum) {
	return true;
	}
	}
	return false;
    }

/*
public static boolean isPalindrome(int fiveDigits){

	int countFiveDigits = 5;
	
	int lengthOfDigits = String.valueOf(fiveDigits).length();

	if(lengthOfDigits == countFiveDigits){
	
	long getFifthNum = fiveDigits % 10;
	long getFirstNum = fiveDigits / 10000;

	long toGetFourthNum = fiveDigits / 10;
	long getFourthNum = toGetFourthNum % 10;

	long toGetThirdNum = fiveDigits / 100;
	long getThirdNum = toGetThirdNum % 10;
	
	long toGetSecondNum = fiveDigits / 1000;
	long getSecondNum = toGetSecondNum % 10;
	
	if(getFirstNum == getFifthNum && getSecondNum == getFourthNum){
	return true;
	//System.out.println("Yes! The digits you entered is a Palindrome");
	
	if(getFirstNum != getFifthNum && getSecondNum != getFourthNum){
	return false;
	//System.out.println("Noway! The digits you entered is not a Palindrome");
	}
	}

	}
*/







}