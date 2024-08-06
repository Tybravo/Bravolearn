
import java.util.Scanner;

public class CollectOneToTenPrintWords{

	public static void main(String[] args){


	Scanner input = new Scanner(System.in);

	int increase = 0;
	for(increase = 1; increase <= 10; increase++){
	
	System.out.print("Enter number One to Ten and view in words: ");
	int isFigure = input.nextInt();

	if(isFigure == 1){
	System.out.println("Number One");
	}
	if(isFigure == 2){
	System.out.println("Number Two");
	}
	if(isFigure == 3){
	System.out.println("Number Three");
	}
	if(isFigure == 4){
	System.out.println("Number Four");
	}
	if(isFigure == 5){
	System.out.println("Number Five");
	}
	if(isFigure == 6){
	System.out.println("Number Six");
	}
	if(isFigure == 7){
	System.out.println("Number Seven");
	}
	if(isFigure == 8){
	System.out.println("Number Eight");
	}
	if(isFigure == 9){
	System.out.println("Number Nine");
	}
	if(isFigure == 10){
	System.out.println("Number Ten");
	}

	}


   }

}