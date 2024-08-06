import java.util.Scanner;

public class TheTwelveDaysOfChristmasSong {

	public static void main(String[] args){

	
	Scanner input = new Scanner(System.in);

	int isStopper = 99;
	
	System.out.print("Enter any day of Christmas form 1 to 12 to get the songs for each day: ");
	int isDays = input.nextInt();

	int getDays = isDays;


	while(isDays != 99){
	switch(isDays){
		case 1:
		System.out.println(" On the first day of Christmas, my true love sent to me");
		System.out.println(" A partridge in a pear tree");
	System.out.print("Enter any day of Christmas form 1 to 12 to get the songs for each day: ");
	isDays = input.nextInt();
		break;
	
		case 2:
		System.out.println(" On the second day of Christmas, my true love sent to me");
		System.out.println(" Two turtle doves and A partridge in a pear tree");
	System.out.print("Enter any day of Christmas form 1 to 12 to get the songs for each day: ");
	isDays = input.nextInt();
		break;
		
		case 3:
		System.out.println(" On the third day of Christmas, my true love sent to me");
		System.out.println(" Three french hens Two turtle doves and A partridge in a pear tree");
	System.out.print("Enter any day of Christmas form 1 to 12 to get the songs for each day: ");
	isDays = input.nextInt();
		break;

		case 4:
		System.out.println(" On the fouth day of Christmas, my true love sent to me");
		System.out.println(" Four calling birds Three french hens Two turtle doves and A partridge in a pear tree");
	System.out.print("Enter any day of Christmas form 1 to 12 to get the songs for each day: ");
	isDays = input.nextInt();
		break;

		case 5:
		System.out.println("On the fifth day of Christmas, my true love sent to me");
		System.out.println("Five golden rings Four calling birds Three french hens Two turtle doves and A partridge in a pear tree");
	System.out.print("Enter any day of Christmas form 1 to 12 to get the songs for each day: ");
	isDays = input.nextInt();
		break;

		case 6:
		System.out.println(" On the sixth day of Christmas, my true love sent to me");
		System.out.println(" Six geese a-laying Five golden rings Four calling birds Three french hens Two turtle doves and A partridge in a pear tree");
	System.out.print("Enter any day of Christmas form 1 to 12 to get the songs for each day: ");
	isDays = input.nextInt();
		break;

		case 7:
		System.out.println(" On the seventh day of Christmas, my true love sent to me");
		System.out.println(" A partridge in a pear treeSeven swans a-swimming Six geese a-laying Five golden rings Four calling birds three french hens Two turtle doves and A partridge in a pear tree");
	System.out.print("Enter any day of Christmas form 1 to 12 to get the songs for each day: ");
	isDays = input.nextInt();
		break;

		case 8:
		System.out.println(" On the eight day of Christmas, my true love sent to me");
		System.out.println(" Eight maids a-milking Seven swans a-swimming Six geese a-laying Five golden rings Four calling birds Three french hens Two turtle doves and A partridge in a pear tree");
	System.out.print("Enter any day of Christmas form 1 to 12 to get the songs for each day: ");
	isDays = input.nextInt();
		break;

		case 9:
		System.out.println(" On the ninth day of Christmas, my true love sent to me");
		System.out.println(" Nine ladies dancing Eight maids a-milking Seven swans a-swimming Six geese a-laying Five golden rings Four calling birds Three french hens Two turtle doves and A partridge in a pear tree");
	System.out.print("Enter any day of Christmas form 1 to 12 to get the songs for each day: ");
	isDays = input.nextInt();
		break;

		case 10:
		System.out.println(" On the tenth day of Christmas, my true love sent to me");
		System.out.println(" Ten lords a-leaping Nine ladies dancing Eight maids a-milking Seven swans a-swimming Six geese a-laying Five golden rings Four calling birds Three french hens Two turtle doves and A partridge in a pear tree");
	System.out.print("Enter any day of Christmas form 1 to 12 to get the songs for each day: ");
	isDays = input.nextInt();
		break;

		case 11:
		System.out.println(" On the eleventh day of Christmas, my true love sent to me");
		System.out.println(" Eleven pipers piping Ten lords a-leaping Nine ladies dancing Eight maids a-milking Seven swans a-swimming Six geese a-laying Five golden rings Four calling birds Three french hens Two turtle doves and A partridge in a pear tree");
	System.out.print("Enter any day of Christmas form 1 to 12 to get the songs for each day: ");
	isDays = input.nextInt();
		break;

		case 12:
		System.out.println(" On the first day of Christmas, my true love sent to me");
		System.out.println(" Twelve drummers drumming Eleven pipers piping Ten lords a-leaping Nine ladies dancing Eight maids a-milking Seven swans a-swimming Six geese a-laying Five golden rings Four calling birds Three french hens Two turtle doves and A partridge in a pear tree");
	System.out.print("Enter any day of Christmas form 1 to 12 to get the songs for each day: ");
	isDays = input.nextInt();
		break;

		default:
		System.out.println("Sorry, you have entered a wrong score");
	
	
	
		
		
	if(getDays == isStopper || isDays != 1 || isDays != 2 || isDays != 3 || isDays != 4 || isDays != 5 || isDays != 6 || isDays != 7 || isDays != 8 || isDays != 9 || isDays != 10 || isDays != 11 || isDays != 12 ) {
	System.out.print("Sorry, you have entered a wrong score");
	}
	
	}
	}
	

    }

}