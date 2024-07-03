import java.util.Scanner;

public class MainKata{

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Integer to know if its true or false: ");
        int isInteger = scanner.nextInt();
        
        Kata kata = new Kata();
        boolean getResult = kata.isEven(isInteger);
        
        System.out.println("The integer is: " + getResult);
        

        
	System.out.print("Collect Integer to check if its prime or not: ");
        int checkPrime = scanner.nextInt();
        
        boolean getPrime = kata.isPrime(checkPrime);
        if(getPrime == true){
	System.out.println("Yes! The number is a prime number");
	}else
        if(getPrime == false){
	System.out.println("Noway! The number is not a prime number");
	}
           


	System.out.print("Input first integer to get difference : ");
        int largestNum = scanner.nextInt();
        
	System.out.print("Input second integer to get difference  : ");
        int smallestNum = scanner.nextInt();
        
        int getDifference = kata.isSubtract(largestNum, smallestNum);
        System.out.printf("The positive difference is %d%n", +getDifference);
	


	System.out.print("Input first integer to get quotient : ");
        float CollectNumOne = scanner.nextFloat();
        
	System.out.print("Input second integer to get quotient  : ");
        float CollectNumTwo = scanner.nextFloat();
        
        float getQuotient = kata.isDivision(CollectNumOne, CollectNumTwo);
        System.out.printf("The quotient is %.2f%n", getQuotient);
	


	System.out.print("Enter any number to count their multiples: ");
	int isNumber = scanner.nextInt();

        int getFactor = kata.isFactorOf(isNumber);
        System.out.printf("The number of factor is %d%n", getFactor);
	

    }
}

