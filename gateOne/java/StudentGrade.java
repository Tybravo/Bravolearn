
import java.util.Arrays;
import java.util.Scanner;

public class StudentGrade{

	public static void main(String...args){


		Scanner input = new Scanner(System.in);

		System.out.print("How many students do you have? ");
		int numStudents = input.nextInt();
		System.out.print("How many subjects do they offer? ");
		int numSubjects = input.nextInt();
		
		int[] students = new int[numStudents];
		int[] subjects = new int[numSubjects];

		int[] scoresForStudent1 =  new int[4];
		int[] scoresForStudent2 =  new int[4];
		int[] scoresForStudent3 =  new int[4];
		int[] scoresForStudent4 =  new int[4];

		int student1 = 0;
		int student2 = 0;
		int student3 = 0;
		int student4 = 0;
		int sumScoresStud1 = 0;
		int sumScoresStud2 = 0;
		int sumScoresStud3 = 0;
		int sumScoresStud4 = 0;
		double averageScoreStud1 = 0;
		double averageScoreStud2 = 0;
		double averageScoreStud3 = 0;
		double averageScoreStud4 = 0;

		int positionForStudent1 = 0;
		int positionForStudent2 = 0;
		int positionForStudent3 = 0;
		int positionForStudent4 = 0;


			int index = 0;

			for(index = 0; index < numStudents; index++){
				for(int count = 0; count < numSubjects; count++){
				
					System.out.println("Entering score for student " +(index+1));
					System.out.print("Enter score for subject " +(count+1)+ ": ");
					int scores = input.nextInt();
					
					if(scores < 0 || scores > 100){
					System.out.println("Please enter a valid number between 0 and 100");
					System.out.println("Entering score for student " +(index+1));
					System.out.print("Enter score for subject " +(count+1)+ ": ");
					scores = input.nextInt();
					}

					if(index == 0 && count == 0){
					student1 = index + 1;
					scoresForStudent1[0] = scores;
					}
					if(index == 0 && count == 1){
					scoresForStudent1[1] = scores;
					}
					if(index == 0 && count == 2){
					scoresForStudent1[2] = scores;
					}
					double countSubjects = (double) numSubjects;
					if(index == 0){
					sumScoresStud1 = sumScoresStud1 + scores;
					scoresForStudent1[3] = sumScoresStud1;
					averageScoreStud1 =  sumScoresStud1 / countSubjects;
					averageScoreStud1 = Math.round(averageScoreStud1 * 100.0) / 100.0;
					}
				
					if(index == 1 && count == 0){
					student2 = index + 1;
					scoresForStudent2[0] = scores;
					}
					if(index == 1 && count == 1){
					scoresForStudent2[1] = scores;
					}
					if(index == 1 && count == 2){
					scoresForStudent2[2] = scores;
					}
					if(index == 1){
					sumScoresStud2 = sumScoresStud2 + scores;
					scoresForStudent2[3] = sumScoresStud2;
					averageScoreStud2 =  sumScoresStud2 / countSubjects;
					averageScoreStud2 = Math.round(averageScoreStud2 * 100.0) / 100.0;
					}
				
					if(index == 2 && count == 0){
					student3 = index + 1;
					scoresForStudent3[0] = scores;
					}
					if(index == 2 && count == 1){
					scoresForStudent3[1] = scores;
					}
					if(index == 2 && count == 2){
					scoresForStudent3[2] = scores;
					}
					if(index == 2){
					sumScoresStud3 = sumScoresStud3 + scores;
					scoresForStudent3[3] = sumScoresStud3;
					averageScoreStud3 =  sumScoresStud3/ countSubjects;
					averageScoreStud3 = Math.round(averageScoreStud3 * 100.0) / 100.0;
					}
				
					if(index == 3 && count == 0){
					student4 = index + 1;
					scoresForStudent4[0] = scores;
					}
					if(index == 3 && count == 1){
					scoresForStudent4[1] = scores;
					}
					if(index == 3 && count == 2){
					scoresForStudent4[2] = scores;
					}
					if(index == 3){
					sumScoresStud4 = sumScoresStud4 + scores;
					scoresForStudent4[3] = sumScoresStud4;
					averageScoreStud4 =  sumScoresStud4 / countSubjects;
					averageScoreStud4 = Math.round(averageScoreStud4 * 100.0) / 100.0;
					}

				}
			}
				

				int[] sumOfScores = {sumScoresStud1, sumScoresStud2, sumScoresStud3, sumScoresStud4};
				int[] descendNum = descend(sumOfScores);

			 	int[] scoresForStud1 = scoresForStudent1;
        			int[] scoresForStud2 = scoresForStudent2;
        			int[] scoresForStud3 = scoresForStudent3;
        			int[] scoresForStud4 = scoresForStudent4;

				int[] getPosition1 = isScoreAvailable(descendNum[0], scoresForStud1, scoresForStud2, scoresForStud3, scoresForStud4);
				int[] getPosition2 = isScoreAvailable(descendNum[1], scoresForStud1, scoresForStud2, scoresForStud3, scoresForStud4);
				int[] getPosition3 = isScoreAvailable(descendNum[2], scoresForStud1, scoresForStud2, scoresForStud3, scoresForStud4);
				int[] getPosition4 = isScoreAvailable(descendNum[3], scoresForStud1, scoresForStud2, scoresForStud3, scoresForStud4);

				if(getPosition1 == scoresForStudent1){
				positionForStudent1 = 1;
				}
				if(getPosition1 == scoresForStudent2){
				positionForStudent2 = 1;
				}
				if(getPosition1 == scoresForStudent3){
				positionForStudent3 = 1;
				}
				if(getPosition1 == scoresForStudent4){
				positionForStudent4 = 1;
				}

				if(getPosition2 == scoresForStudent1){
				positionForStudent1 = 2;
				}
				if(getPosition2 == scoresForStudent2){
				positionForStudent2 = 2;
				}
				if(getPosition2 == scoresForStudent3){
				positionForStudent3 = 2;
				}
				if(getPosition2 == scoresForStudent4){
				positionForStudent4 = 2;
				}

				if(getPosition3 == scoresForStudent1){
				positionForStudent1 = 3;
				}
				if(getPosition3 == scoresForStudent2){
				positionForStudent2 = 3;
				}
				if(getPosition3 == scoresForStudent3){
				positionForStudent3 = 3;
				}
				if(getPosition3 == scoresForStudent4){
				positionForStudent4 = 3;
				}

				if(getPosition4 == scoresForStudent1){
				positionForStudent1 = 4;
				}
				if(getPosition4 == scoresForStudent2){
				positionForStudent2 = 4;
				}
				if(getPosition4 == scoresForStudent3){
				positionForStudent3 = 4;
				}
				if(getPosition4 == scoresForStudent4){
				positionForStudent4 = 4;
				}



System.out.println("==========================================================");
System.out.println("  STUDENT    SUB1   SUB2   SUB3    TOT     AVE    POS");
System.out.println("==========================================================");
	
System.out.printf(" Student %d    %s    %s    %s  %n ", student1, arrayToString(scoresForStudent1), averageScoreStud1, positionForStudent1);
System.out.printf("Student %d    %s    %s     %s  %n ", student2, arrayToString(scoresForStudent2), averageScoreStud2, positionForStudent2);
System.out.printf("Student %d    %s    %s    %s  %n ", student3, arrayToString(scoresForStudent3), averageScoreStud3, positionForStudent3);
System.out.printf("Student %d    %s    %s    %s  %n ", student4, arrayToString(scoresForStudent4), averageScoreStud4, positionForStudent4);
			
System.out.println("=========================================================");
System.out.println("==========================================================");

}



public static int[] descend(int[] numbers){

		int highest = 0;

		for(int index = 0; index < numbers.length; index++){
			for(int count = index; count < numbers.length; count++){
				if(numbers[index] < numbers [count]){

				highest = numbers[index];
				numbers[index] = numbers[count];
				numbers[count] = highest;
		}
	    }
	}
	return numbers;
	
  }



public static int[] isScoreAvailable(int getScore, int[] arrayOfScoresStud1, int[] arrayOfScoresStud2, int[] arrayOfScoresStud3,int[] arrayOfScoresStud4) {
        for (int index = 0; index < arrayOfScoresStud1.length; index++) {
            if (arrayOfScoresStud1[index] == getScore) {
                return arrayOfScoresStud1;
            }
        }
       for (int index = 0; index < arrayOfScoresStud2.length; index++) {
            if (arrayOfScoresStud2[index] == getScore) {
                return arrayOfScoresStud2;
            }
        }
       for (int index = 0; index < arrayOfScoresStud3.length; index++) {
            if (arrayOfScoresStud3[index] == getScore) {
                return arrayOfScoresStud3;
            }
        }
       for (int index = 0; index < arrayOfScoresStud4.length; index++) {
            if (arrayOfScoresStud4[index] == getScore) {
                return arrayOfScoresStud4;
            }
        }
        return null;
    
}



public static String arrayToString(int[] arrayResult){
 		StringBuilder display = new StringBuilder(); 
			for (int index = 0; index < arrayResult.length; index++){
			display.append(arrayResult[index]);
			
			if (index < arrayResult.length - 1){
			display.append("     ");
			}
		}
		return display.toString();
	}




}





