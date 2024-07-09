import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class MultiplicationTest{

	@Test 
	public void testResultWithoutUsingMultiples(){

	//given
	Multiplication multiplication = new Multiplication();

	//when	
	int numberOne = 4;
	int numberTwo = -6;
	int result = multiplication.alternatemultiply(numberOne, numberTwo);

	//assert
	assertEquals(-24, result);


	}


}
