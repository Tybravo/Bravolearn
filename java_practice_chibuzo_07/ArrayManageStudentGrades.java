
import java.util.Arrays;
import java.util.Scanner;

public class ArrayManageStudentGrades{

	public static void main(String...args){


		Scanner input = new Scanner(System.in);

		System.out.print("How many students do you have? ");
		int numStudents = input.nextInt();
		System.out.print("How many subjects do they offer have? ");
		int numSubjects = input.nextInt();
		
		int[] students = new int[numStudents];
		int[] subjects = new int[numSubjects];

			for(int index = 0; index < numStudents; index++){
				for(int count = 0; count < numSubjects; count++){
				
					System.out.println("Entering score for student ", index+ +1);
					System.out.print("Enter score for subject ", +count+ +1);
					int scores = input.nextInt();
					
					if(scores < 0 && scores > 100){
					System.out.println("Please enter a valid number between 0 and 100");
					System.out.println("Entering score for student ", +index+ +1);
					System.out.print("Enter score for subject ", +scores+ +1);
					int scores = input.nextInt();
					}

					if(index == 0 && count == 0){
					int student1 = index + 1;
					int subject1 = count + 1;
					int score1stud1 = scores;
					}
					if(index == 0 && count == 1){
					int subject2 = count + 1;
					int score2stud1 = scores;
					}
					if(index == 0 && count == 2){
					int subject3 = count + 1;
					int score3stud1 = scores;
					}
					



				}
			}
				System.out.printf("The scores for Student %d %d %d %d ", student1, "are", score1stud1, score2stud1, score3stud1);

   }

}













