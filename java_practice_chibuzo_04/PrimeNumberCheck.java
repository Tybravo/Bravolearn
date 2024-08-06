import java.util.Scanner;

public class PrimeNumberCheck {
	
	public static void main(String[] args){
 

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number to check if it is a Prime Number or not: ");
	int isNum = input.nextInt();

	//getNum = isNum;

	int getNum = 0;
	int checker;

	for(checker = 2; checker <= isNum / 2;  checker++){
	getNum = isNum % checker;
	}

	if(getNum == 0){
	System.out.printf("Noway! The number %d is not a prime number", isNum);
	}
	else
	System.out.printf("Yes! The number %d is a prime number", isNum);
		


    }

}
