//Question 5.15


public class TrianglePrintingProgram {

	public static void main(String[] args){


	 for (int isLine = 1; isLine <= 10; isLine++) {
    	   for (int isAsterisk = 1; isAsterisk <= 10; isAsterisk++) {
             if (isAsterisk <= isLine) {
             System.out.print("*");
          } else {
            System.out.print(" ");
          }
    }
    System.out.println();
}    

	System.out.println();


	 for (int isLine = 1; isLine <= 10; isLine++) {
    	   for (int isAsterisk = 1; isAsterisk <= 10; isAsterisk++) {
             if (isAsterisk <= isLine) {
             System.out.print("*");
         } else {
             System.out.print(" ");
         }
    }
    System.out.println();
}    

	System.out.println();


 	for (int isLine = 1; isLine <= 10; isLine++) {
    	   for (int isAsterisk = 1; isAsterisk <= 10; isAsterisk++) {
             if (isAsterisk >= isLine) {
             System.out.print("*");
         } else {
             System.out.print(" ");
         }
    }
    System.out.println();
}   

	System.out.println();


 	for (int isLine = 1; isLine <= 10; isLine++) {
    	   for (int isAsterisk = 1; isAsterisk <= 10; isAsterisk++) {
             if (isAsterisk >= isLine) {
              System.out.print("*");
         } //else {
             //System.out.print(" ");
         //}
    }
    System.out.println();
}   




    }

}


