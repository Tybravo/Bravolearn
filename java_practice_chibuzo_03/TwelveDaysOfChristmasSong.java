
import java.util.Scanner;

public class TwelveDaysOfChristmasSong {

	public static void main(String[] args){
 
	
	Scanner input = new Scanner(System.in);



	int theDays = 1;

	for(theDays = 1; theDays <= 12; theDays++){
	System.out.print("On the " + theDays + " Days of Christmas");

	switch(theDays) {
	case 12:
	System.out.println(" Twelve drummers drumming Eleven pipers piping Ten lords a-leaping Nine ladies dancing Eight maids a-milking Seven swans a-swimming Six geese a-laying Five golden rings Four calling birds Three french hens Two turtle doves and A partridge in a pear tree");
	
	case 11:
	System.out.println(" Eleven pipers piping Ten lords a-leaping Nine ladies dancing Eight maids a-milking Seven swans a-swimming Six geese a-laying Five golden rings Four calling birds Three french hens Two turtle doves and A partridge in a pear tree");

	case 10:
	System.out.println(" Ten lords a-leaping Nine ladies dancing Eight maids a-milking Seven swans a-swimming Six geese a-laying Five golden rings Four calling birds Three french hens Two turtle doves and A partridge in a pear tree");
		
	case 9:
	System.out.println(" Nine ladies dancing Eight maids a-milking Seven swans a-swimming Six geese a-laying Five golden rings Four calling birds Three french hens Two turtle doves and A partridge in a pear tree");
	
	case 8:
	System.out.println(" Eight maids a-milking Seven swans a-swimming Six geese a-laying Five golden rings Four calling birds Three french hens Two turtle doves and A partridge in a pear tree");	
	
	case 7:
	System.out.println(" A partridge in a pear treeSeven swans a-swimming Six geese a-laying Five golden rings Four calling birds three french hens Two turtle doves and A partridge in a pear tree");
		
	case 6:
	System.out.println(" Six geese a-laying Five golden rings Four calling birds Three french hens Two turtle doves");
	
	case 5:
	System.out.println("Five golden rings Four calling birds Three french hens Two turtle doves");
	
	case 4:
	System.out.println(" Four calling birds Three french hens Two turtle doves");
		
	case 3:
	System.out.println(" Three french hens Two turtle doves");
	
	case 2:
	System.out.println(" Two turtle doves and A partridge in a pear tree");
	
 	case 1:
	System.out.println(" A partridge in a pear tree");

	}

	}




    }

}