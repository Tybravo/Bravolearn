
public class BackToSenderLogistics {


	public static double riderPayment(double collectionRate){

	double riderPayment = 0;

	if(collectionRate < 50 && collectionRate >= 1){
	riderPayment = collectionRate * 160 + 5000;
	}
	if(collectionRate < 60 && collectionRate >= 50){
	riderPayment = collectionRate * 200 + 5000;
	}
	if(collectionRate < 70 && collectionRate >= 60){
	riderPayment = collectionRate * 250 + 5000;
	}
	if(collectionRate <= 100 && collectionRate >= 70){
	riderPayment = collectionRate * 500 + 5000;
	}
	if(collectionRate > 100 || collectionRate < 1){
	riderPayment = 0;
	}
	return riderPayment;
		
	}
	


}