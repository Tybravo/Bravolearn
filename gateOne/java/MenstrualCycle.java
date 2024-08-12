import java.util.Scanner;

public class MenstrualCycle{

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your mentrual period length cycle (in days): ");
		int lengthCycle = scanner.nextInt();

		System.out.print("Enter the day of the month you got your last period started: ");
		int lastPeriodDayStarted = scanner.nextInt();

		int dayOfOvulation = (lastPeriodDayStarted + lengthCycle - 14) % 30;
			if (dayOfOvulation <= 0) {
			dayOfOvulation += 30;
			}

		}

}
