import java.util.Scanner;

public class MainKata{


	public static void main(String[] args) {

	extraMethod();

	}


		public static void extraMethod(){

              	Scanner scanner = new Scanner(System.in);

	//System.out.print(" Enter 0 to drop list of Maths Functions: ");
	//int isMenuList = scanner.nextInt();

	
		String selectOption = """ 
	         \nEnter 1 to get Even Integer
		 Enter 2 to get Prime Number
		 Enter 3 to get Difference of Integer
		 Enter 4 to get Quotient of Integer
		 Enter 5 to get factor of Integer
		 Enter 6 to get sqaure of Integer
		 Enter 7 to Paliandrome of Integer
		 Enter 8 to get Factorial of Integer 
		 """;
		 	
	System.out.println(selectOption);

	System.out.print("Enter selection: ");
	String isOption = scanner.next();



 Kata kata = new Kata();
       
switch(isOption){
	case "1":
	System.out.print("Enter Integer to know if its true or false: ");
        int isInteger = scanner.nextInt();
        
        boolean getResult = kata.isEven(isInteger);
        System.out.println("The integer is: " + getResult);
	extraMethod();
        


	case "2":
	System.out.print("Collect Integer to check if its prime or not: ");
        int checkPrime = scanner.nextInt();
        
        boolean getPrime = kata.isPrime(checkPrime);
        if(getPrime == true){
	System.out.println("Yes! The number is a prime number");
	}else
        if(getPrime == false){
	System.out.println("Noway! The number is not a prime number");
	};
	extraMethod();



	case "3":
	System.out.print("Input first integer to get difference : ");
        int largestNum = scanner.nextInt();
	System.out.print("Input second integer to get difference  : ");
        int smallestNum = scanner.nextInt();
        
        int getDifference = kata.isSubtract(largestNum, smallestNum);
        System.out.printf("The positive difference is %d%n", +getDifference);
	extraMethod();



	case "4":
	System.out.print("Input first integer to get quotient : ");
        float CollectNumOne = scanner.nextFloat();
	System.out.print("Input second integer to get quotient  : ");
        float CollectNumTwo = scanner.nextFloat();
       
        float getQuotient = kata.isDivision(CollectNumOne, CollectNumTwo);
        System.out.printf("The quotient is %.2f%n", getQuotient);
	extraMethod();



	case "5":
	System.out.print("Enter any number to count their multiples: ");
	int isNumber = scanner.nextInt();

        int getFactor = kata.isFactorOf(isNumber);
        System.out.printf("The number of factor is %d%n", getFactor);
	extraMethod();



	case "6":
	System.out.print("Collect Integer to check if its square is true or false: ");
        int checkSquare = scanner.nextInt();
        boolean getSquare = kata.isSquare(checkSquare);
        System.out.println("Is the number a sqaure? " +getSquare);
	extraMethod();

     }



   }

}





	
