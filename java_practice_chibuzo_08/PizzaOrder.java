import java.util.Scanner;
import java.util.Currency;
import java.util.Locale;

public class PizzaOrder{

	public static void main(String...args){

		Scanner input = new Scanner(System.in);

		//Currency ngn = Currency.getInstance(new Locale("en", "NG"));

		while(true){
		System.out.println();
		System.out.print("Enter number of people for pizza: ");
		int numOfPeople;
		try{
		numOfPeople = input.nextInt();
		}catch(Exception e){
		System.out.print("Invalid input. Please enter a valid number: ");
		input.nextLine();
		continue;
		}

		input.nextLine();

		System.out.print("Enter pizza type: ");
		String pizzaType = input.nextLine().trim();

		int divNumOfBoxes = 0;
		int payForBoxes = 0;
		int getNumOfBoxes = 0;
		int getNumOfSlizes = 0;
		int getNumOfSlicesRemain = 0;
		int pricePerBox = 0;

		if(pizzaType.equalsIgnoreCase("Odogwu")){
			int odogwuSlizes = 12;
			int odogwuPrizePerBox = 4200;
			int numOfBoxes = numOfPeople % odogwuSlizes;
				if(numOfBoxes != 0){
				divNumOfBoxes = numOfPeople  / odogwuSlizes;
				getNumOfBoxes = divNumOfBoxes + 1;

				getNumOfSlizes = getNumOfBoxes * odogwuSlizes;
				getNumOfSlicesRemain = getNumOfSlizes - numOfPeople;
				payForBoxes = getNumOfBoxes * odogwuPrizePerBox;
				pricePerBox = odogwuPrizePerBox;
				}else {
					getNumOfBoxes = numOfPeople  / odogwuSlizes;
					getNumOfSlicesRemain = numOfPeople % odogwuSlizes;
					payForBoxes = getNumOfBoxes * odogwuPrizePerBox;
					pricePerBox = odogwuPrizePerBox;
					}


		}else if(pizzaType.equalsIgnoreCase("Big Boys")){
			int bigBoysSlizes = 8;
			int bigBoysPrizePerBox = 3000;
			int numOfBoxes = numOfPeople % bigBoysSlizes;
				if(numOfBoxes != 0){
				divNumOfBoxes = numOfPeople  / bigBoysSlizes;
				getNumOfBoxes = divNumOfBoxes + 1;

				getNumOfSlizes = getNumOfBoxes * bigBoysSlizes;
				getNumOfSlicesRemain = getNumOfSlizes - numOfPeople;
				payForBoxes = getNumOfBoxes * bigBoysPrizePerBox;
				pricePerBox = bigBoysPrizePerBox;
				}else {
					getNumOfBoxes = numOfPeople  / bigBoysSlizes;
					getNumOfSlicesRemain = numOfPeople % bigBoysSlizes;
					payForBoxes = getNumOfBoxes * bigBoysPrizePerBox;
					pricePerBox = bigBoysPrizePerBox;
					}


		}else if(pizzaType.equalsIgnoreCase("Small Money")){
			int smallMoneySlizes = 6;
			int smallMoneyPrizePerBox = 2400;
			int numOfBoxes = numOfPeople % smallMoneySlizes;
				if(numOfBoxes != 0){
				divNumOfBoxes = numOfPeople  / smallMoneySlizes;
				getNumOfBoxes = divNumOfBoxes + 1;

				getNumOfSlizes = getNumOfBoxes * smallMoneySlizes;
				getNumOfSlicesRemain = getNumOfSlizes - numOfPeople;
				payForBoxes = getNumOfBoxes * smallMoneyPrizePerBox;
				pricePerBox = smallMoneyPrizePerBox;
				}else {
					getNumOfBoxes = numOfPeople  / smallMoneySlizes;
					getNumOfSlicesRemain = numOfPeople % smallMoneySlizes;
					payForBoxes = getNumOfBoxes * smallMoneyPrizePerBox;
					pricePerBox = smallMoneyPrizePerBox;
					}


		}else if(pizzaType.equalsIgnoreCase("Sapa Size")){
			int sapaSizeSlizes = 4;
			int sapaSizePrizePerBox = 2000;
			int numOfBoxes = numOfPeople % sapaSizeSlizes;
				if(numOfBoxes != 0){
				divNumOfBoxes = numOfPeople  / sapaSizeSlizes;
				getNumOfBoxes = divNumOfBoxes + 1;

				getNumOfSlizes = getNumOfBoxes * sapaSizeSlizes;
				getNumOfSlicesRemain = getNumOfSlizes - numOfPeople;
				payForBoxes = getNumOfBoxes * sapaSizePrizePerBox;
				pricePerBox = sapaSizePrizePerBox;
				}else {
					getNumOfBoxes = numOfPeople  / sapaSizeSlizes;
					getNumOfSlicesRemain = numOfPeople % sapaSizeSlizes;
					payForBoxes = getNumOfBoxes * sapaSizePrizePerBox;
					pricePerBox = sapaSizePrizePerBox;
					}
			}
			else {
				System.out.print("You have entered an invalid pizza type, kindly try again");
				System.out.println();
				continue;
				}

				System.out.print("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
				System.out.printf("%n Number of boxes of pizza to buy =  %d boxes %n ", getNumOfBoxes);
				System.out.printf("Number of left over slices after serving =  %d slices %n ", getNumOfSlicesRemain);
				System.out.printf("Price per box = NGN%d %n ", pricePerBox);
				System.out.printf("Price in total = NGN%d %n ", payForBoxes);
				System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			}





   }

}

