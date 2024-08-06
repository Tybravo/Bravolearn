import java.util.Scanner;

public class NokiaMenu {
	
	public static void main(String[] args){
 
	
	Scanner input = new Scanner(System.in);


System.out.print(" Enter 0 to drop list of NOKIA MENU Options: ");
	int isMenuList = input.nextInt();

	
		String selectOption = """
		 Enter 1 to list Phonebook options
		 Enter 2 to list Messages options
		 Enter 3 to list Chat options
		 Enter 4 to list Call Register options
		 Enter 5 to list Tones options
		 Enter 6 to list Settings options
		 Enter 7 to list Call Divert options
		 Enter 8 to list Games options
		 Enter 9 to list Calculator options
		 Enter 10 to list Reminders options
		 Enter 11 to list Clock options
		 Enter 12 to list Profiles options
		 Enter 13 to list SIM Services options""";
		 	
switch(isMenuList){
	case 0:
	System.out.printf("%s%n", selectOption);

	System.out.println(" Enter 1 to get menu for PHONE BOOK or any number above to list there Menu Options: ");
	int isNumber1 = input.nextInt();
switch(isNumber1){
	case 1:
	System.out.println(" PHONE BOOK");
	System.out.println(" 1 Search");
	System.out.println(" 2 Service Nos.");
	System.out.println(" 3 Add Name");
	System.out.println(" 4 Erase");
	System.out.println(" 5 Edit");
	System.out.println(" 6 Assign Tone");
	System.out.println(" 7 Send b'card");
	System.out.println(" 8 Options");
	System.out.println(" 9 Speed dials");
	System.out.println(" 10 Voice tags");
	}
	
while(isNumber1 != 8){
	System.out.println(" Enter 8 to get option for Options: ");
	isNumber1 = input.nextInt();	
switch(isNumber1){
	case 8:
	System.out.println(" 1.Type of View");
	System.out.println(" 2.Memory Status");
	break;
	default:
	System.out.println(" Invalid input");
	}
	}
	}




while(isMenuList != 22){
	System.out.println(" Enter 22 to go back to MAIN MENU: ");
	isMenuList = input.nextInt();
		 selectOption = """
		 Enter 1 to list Phonebook options
		 Enter 2 to list Messages options
		 Enter 3 to list Chat options
		 Enter 4 to list Call Register options
		 Enter 5 to list Tones options
		 Enter 6 to list Settings options
		 Enter 7 to list Call Divert options
		 Enter 8 to list Games options
		 Enter 9 to list Calculator options
		 Enter 10 to list Reminders options
		 Enter 11 to list Clock options
		 Enter 12 to list Profiles options
		 Enter 13 to list SIM Services options""";

switch(isMenuList){
	case 22:
	System.out.printf("%s%n", selectOption);
	default:
	System.out.println(" Invalid input");
	}

	System.out.println(" Enter 1 to get menu for PHONE BOOK or any number above to list there Menu Options: ");
	int isNumber1 = input.nextInt();
switch(isNumber1){
	case 1:
	System.out.println(" PHONE BOOK");
	System.out.println(" 1 Search");
	System.out.println(" 2 Service Nos.");
	System.out.println(" 3 Add Name");
	System.out.println(" 4 Erase");
	System.out.println(" 5 Edit");
	System.out.println(" 6 Assign Tone");
	System.out.println(" 7 Send b'card");
	System.out.println(" 8 Options");
	System.out.println(" 9 Speed dials");
	System.out.println(" 10 Voice tags");
	}
while(isNumber1 != 8){
	System.out.println(" Enter 8 to get option for Options: ");
	isNumber1 = input.nextInt();	
switch(isNumber1){
	case 8:
	System.out.println(" 1.Type of View");
	System.out.println(" 2.Memory Status");
	break;
	default:
	System.out.println(" Invalid input");
	}
	}
	
	}

//}
//}
//}









/*
	System.out.println(" Enter 0 to go back to MAIN MENU: ");
	isMenuList = input.nextInt();
while(isMenuList != 0){
	System.out.println(" Enter 0 to go back to MAIN MENU: ");
	isMenuList = input.nextInt();
switch(isMenuList){
	case 1:
	System.out.printf("%s%n", selectOption);
	}

	

	
	System.out.println(" Enter 2 to get menu for MESSAGES: ");
	isNumber1 = input.nextInt();
	case 2:
	System.out.println(" MESSAGES");
	System.out.println(" 1 Write messages");
	System.out.println(" 2 Inbox.");
	System.out.println(" 3 Outbox");
	System.out.println(" 4 Picture Messages");
	System.out.println(" 5 Templates");
	System.out.println(" 6 Smileys");
	System.out.println(" 7 Message settings");
	System.out.println(" 8 Info service");
	System.out.println(" 9 Voice mailbox number");
	System.out.println(" 10 Service Command editor");
	
	System.out.println(" Enter 7 to get options for Message settings: ");
	isNumber1 = input.nextInt();
switch(isNumber1){
	case 7:
	System.out.println(" 1 Set 1");
	System.out.println(" 2 Common");
	}

	System.out.println(" Enter 1 to get options for Set 1: ");
	isNumber1 = input.nextInt();
switch(isNumber1){
	case 1:
	System.out.println(" 1.Message centre number");
	System.out.println(" 2.Message sent as");
	System.out.println(" 3.Message validity");
	}
	
	System.out.println(" Enter 2 to get options for Common: ");
	isNumber1 = input.nextInt();
switch(isNumber1){
	case 2:
	System.out.println(" 1.Delivery reports");
	System.out.println(" 2.Reply via same center");
	System.out.println(" 3.Character support");
	}

	
	System.out.println(" Enter 3 to get menu for CHAT: ");
	isNumber1 = input.nextInt();
	case 3:
	System.out.println(" CHAT");
	
	
	System.out.println(" Enter 4 to get menu for CALL REGISTER: ");
	isNumber1 = input.nextInt();
	case 4:
	System.out.println(" CALL REGISTER");
	System.out.println(" 1 Missed calls");
	System.out.println(" 2 Received calls.");
	System.out.println(" 3 dialed numbers");
	System.out.println(" 4 Erased recent call lists");
	System.out.println(" 5 Show call duration");
	System.out.println(" 6 Show call cost");
	System.out.println(" 7 Call cost settings");
	System.out.println(" 8 Prepaid credit");

	System.out.println(" Enter 5 to get options for Show Call Duration: ");
	isNumber1 = input.nextInt();
switch(isNumber1){
	case 5:
	System.out.println(" 1 Last call duration");
	System.out.println(" 2 All call's duration");
	System.out.println(" 3 Received call's duration");
	System.out.println(" 4 Dialled call's duration");
	System.out.println(" 5 Clear timers");
	}

	System.out.println(" Enter 6 to get options for Show Call Cost: ");
	isNumber1 = input.nextInt();
switch(isNumber1){
	case 6:
	System.out.println(" 1 Last call cost");
	System.out.println(" 2 All call's cost");
	System.out.println(" 3 Clear counter");
	}
	
	System.out.println(" Enter 7 to get options for Call Cost: Settings ");
	isNumber1 = input.nextInt();
switch(isNumber1){
	case 7:
	System.out.println(" 1 call cost limit");
	System.out.println(" 2 Show costs in");
	}
	
	
	System.out.println(" Enter 5 to get menu for TONES: ");
	isNumber1 = input.nextInt();
	case 5:
	System.out.println(" TONES");
	System.out.println(" 1 Ringing tone");
	System.out.println(" 2 Ringing volume.");
	System.out.println(" 3 Incoming call alert");
	System.out.println(" 4 Composer");
	System.out.println(" 5 Message alert tone");
	System.out.println(" 6 Keypad tones");
	System.out.println(" 7 Warning and game tones");
	System.out.println(" 8 Vibrating alert");
	System.out.println(" 8 Screen Saver");
	

	System.out.println(" Enter 6 to get menu for SETTINGS: ");
	isNumber1 = input.nextInt();
	case 6:
	System.out.println(" SETTINGS");
	System.out.println(" 1 Call settings");
	System.out.println(" 2 Phone settings.");
	System.out.println(" 3 Security settings");
	System.out.println(" 4 Restore factory settings");
	
	System.out.println(" Enter 1 to get options for Call Settings: ");
	isNumber1 = input.nextInt();
switch(isNumber1){
	case 1:
	System.out.println(" 1 Automatic redial");
	System.out.println(" 2 Speed dialing");
	System.out.println(" 3 Call waiting options");
	System.out.println(" 4 Own number sending");
	System.out.println(" 5 Phone line in use");
	System.out.println(" 6 Automatic Answer");
	}

	System.out.println(" Enter 2 to get options for Phone settings: ");
	isNumber1 = input.nextInt();
switch(isNumber1){
	case 2:
	System.out.println(" 1 Language");
	System.out.println(" 2 Cell info display");
	System.out.println(" 3 Welcome note");
	System.out.println(" 4 Network selection");
	System.out.println(" 5 Lights");
	System.out.println(" 6 Confirm SIM service action");
	}
	
	System.out.println(" Enter 3 to get options for Security settings: ");
	isNumber1 = input.nextInt();
switch(isNumber1){
	case 3:
	System.out.println(" 1 Pin code request");
	System.out.println(" 2 Call baring service");
	System.out.println(" 3 Fixed dialling");
	System.out.println(" 4 Closed user group");
	System.out.println(" 5 Phone security");
	System.out.println(" 6 Change access codsn");
	}


	System.out.println(" Enter 7 to get menu for CALL DIVERT: ");
	isNumber1 = input.nextInt();
	case 7:
	System.out.println(" CALL DIVERT");
	

	System.out.println(" Enter 8 to get menu for GAMES: ");
	isNumber1 = input.nextInt();
	case 8:
	System.out.println(" GAMES");
	

	System.out.println(" Enter 9 to get menu for CALCULATOR: ");
	isNumber1 = input.nextInt();
	case 9:
	System.out.println(" CALCULATOR");

	
	System.out.println(" Enter 10 to get menu for REMINDER: ");
	isNumber1 = input.nextInt();
	case 10:
	System.out.println(" REMINDER");

	
	System.out.println(" Enter 11 to get menu for CLOCK: ");
	int isNumber11 = input.nextInt();
	case 11:
	System.out.println(" CLOCK");
	System.out.println(" 1 Alarm clock");
	System.out.println(" 2 clock settings.");
	System.out.println(" 3 Date settings");
	System.out.println(" 4 Stopwatch");
	System.out.println(" 5 Countdown timer");
	System.out.println(" 6 Auto update of date and time");
	
	
	System.out.println(" Enter 12 to get menu PROFILES: ");
	int isNumber12 = input.nextInt();
	case 12:
	System.out.println(" PROFILES");


	System.out.println(" Enter 13 to get menu SIM SERVICES: ");
	int isNumber13 = input.nextInt();
	case 13:
	System.out.println(" SIM SERVICES");
	
	default:
	System.out.print(" You have Ended the App");
	}
	break;


*/


	//}
	//}
	




    }

}


	
