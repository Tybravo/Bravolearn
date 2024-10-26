
public class DisplayFourPatternsUsingLoops {

	public static void main(String[] args){

	int isPatternA = 0;
	int thePatternA = 0;

	for(isPatternA = 1; isPatternA <= 6; isPatternA++){
	    for(thePatternA = 1; thePatternA <= isPatternA; thePatternA++){
		System.out.print(thePatternA+ " ");
	   }
		System.out.println();
	}
		System.out.println();
	


	int isPatternB = 0;
	int thePatternB = 0;

	for(isPatternB = 6; isPatternB >= 1; isPatternB--){
	    for(thePatternB = 1; thePatternB <= isPatternB; thePatternB++){
		System.out.print(thePatternB+ " ");
	   }
		System.out.println();
	}
		System.out.println();
	


	int isPatternC = 0;
	int thePatternC = 0;

	for(isPatternC = 1; isPatternC <= 6; isPatternC++){
	    for(thePatternC = 1; thePatternC <= isPatternC; thePatternC++){
		System.out.print(" " +thePatternC);
	   }
		System.out.println();
	}
		System.out.println();
	



/*
	  int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(k + 1);
            }
            for (int l = i - 1; l >= 0; l--) {
                System.out.print(l + 1);
            }
            System.out.println();
        }
*/


	int totalNumOfRows = 6;
	for(int rowNum = 1; (rowNum <= totalNumOfRows); rowNum++){

	  for(int theSpace = 1; theSpace <= (totalNumOfRows - rowNum); theSpace++){
		System.out.print("  ");
	}
 	    for(int theNum = 1; theNum <= rowNum; theNum++){
		System.out.printf("%d ", +theNum);
	} 
		System.out.print("\n");
	}	








    }

}