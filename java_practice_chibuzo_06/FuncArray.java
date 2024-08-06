
public class FuncArray{
	
	public static int isLargest(int[] isNumbers){

	int largest = isNumbers [0];

	for(int index = 0; index < isNumbers.length; index++){
	if(isNumbers [index] > largest){
	largest = isNumbers [index];
	}
	}
	return largest;
  }



	public static int[] isReversal(int[] isLists){

	int[] isReversed = new int[isLists.length];
	int numbers = 0;

	for(int index = 0; index < isLists.length; index++){
	numbers = (isLists.length - 1) - index;
	isReversed[index] = isLists[numbers];
	}
	return isReversed;
   }





}