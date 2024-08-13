import java.util.Scanner;

public class PizzaOrder{

	public static void main(String...args){


		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of people for pizza: ");
		int numOfPeople = input.nextInt();
		System.out.print("Enter pizza type: ");
		String pizzaType = input.nextString();

		if(pizzaType == "Odogwu"){
			int odogwuSlizes = 12;
			int odogwuPrizePerBox = 4200;
				//int numOfBoxesForOdogwu = numOfPeople  / odogwuSlizes;
				int numOfBoxesForOdogwu = numOfPeople  % odogwuSlizes;
					if(numOfBoxesForOdogwu != 0){
					getNumOfBoxesForOdogwu = numOfPeople  / odogwuSlizes;
					}

		}
		if(pizzaType == "Big Boys"){
			int bigBoysSlizes = 8;
			int bigBoysPrizePerBox = 3000;
		}
		if(pizzaType == "Small Money"){
			int smallMoneySlizes = 6;
			int smallMoneyPrizePerBox = 4200;
		}
		if(pizzaType == "Sapa Size"){
			int sapaSizeSlizes = 6;
			int sapaSizePrizePerBox = 4200;
		}


		




System.out.printf(" Student %d    %s    %s    %s  %n ", averageScoreStud1, positionForStudent1);


   }

}