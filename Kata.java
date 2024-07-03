
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
	int toatlMultiples = 0;
	for(toIncrease = 2; toIncrease <= factorNum; toIncrease++){

	if(factorNum % toIncrease == 0){
	totalMultiples = totallMultiples + 1;
	}
	}
	return totalMultiples;
	
      
      }





}


