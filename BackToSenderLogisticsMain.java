
import java.util.Scanner;


public class BackToSenderLogisticsMain{

	public static void main(String... args){

	logisticsMethod();

	}

	
	public static void logisticsMethod(){

	BackToSenderLogistics logistics = new BackToSenderLogistics();
	
	Scanner input = new Scanner(System.in);
	System.out.print(" \n Enter number of successful delivery: ");
	double collectDelivery = input.nextDouble();

	double getRiderPayOne = logistics.riderPayment(collectDelivery);
	if(getRiderPayOne != 0){
	System.out.printf("Riders payment for number of delivery is %.2f %n", +getRiderPayOne);
	}
	if(getRiderPayOne == 0){
	System.out.println("Sorry, you have entered a wrong number of delivery!");
	}
	logisticsMethod();

	}







}