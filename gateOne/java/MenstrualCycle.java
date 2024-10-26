import java.util.Scanner;

public class MenstrualCycle{

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your mentrual period length cycle (in days): ");
		int lengthCycle = scanner.nextInt();

		System.out.print("Enter the day of the month you got your last period started: ");
		int lastPeriodDayStarted = scanner.nextInt();

		int dayOfOvulation = (lastPeriodDayStarted + lengthCycle - 14) % 30;
			if (dayOfOvulation <= 0){
			dayOfOvulation = dayOfOvulation + 30;
			}

		int nextPeriodDayStart = (lastPeriodDayStarted + lengthCycle) % 30;
			if (nextPeriodDayStart <= 0){
			nextPeriodDayStart = nextPeriodDayStart + 30;
			}


			System.out.println();
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println("Your Cycle Information:");
			System.out.printf("Your next period start date: Day %d by counting forward %n ", nextPeriodDayStart);
			System.out.printf("Your ovulation date: Day %d by counting foward %n ", dayOfOvulation);

			System.out.println();
			System.out.println("Take note that the information above may vary for individuals \n as the app ensures that the cycle-day stays within 30 days");
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			
		}

}
