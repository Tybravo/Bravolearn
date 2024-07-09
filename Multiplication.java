

public class Multiplication{

	
	public int alternatemultiply(int numberOne, int numberTwo){
	
	int sum = 0;
	
	int toIncrease;
	for(toIncrease = 1; toIncrease <= numberOne;){
	
	sum = sum + numberTwo;

	toIncrease++;
	}


	return sum;
		
	}

}