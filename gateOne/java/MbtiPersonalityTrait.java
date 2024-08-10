import java.util.Arrays;
import java.util.Scanner;

public class MbtiPersonalityTrait{

	public static void main(String...args){

	Scanner input = new Scanner(System.in);
	int[] ans= new int[20];

	int[] questionEI = {1, 5, 9, 13, 17};
	int[] questionSN= {2, 6, 10, 14, 18};
	int[] questionTF = {3, 7, 11, 15, 19};
	int[] questionJP = {4, 8, 12, 16, 20};
	
	String[] serveQuestions = {
				"1.   A. expend energy, enjoy groups,    B. conserve energy, enjoy one-on-one",
				"2.   A. interpret literally,    B. look for meaning and possibilities",
				"3.   A. logical, thinking, questioning,    B. empathetic, feeling, accomodating",
				"4.   A. organized, orderly,    B. flexible, adaptable",
				"5.   A. more out going, thinking outloud,    B. more reserved, think to yourself",
				"6.   A. practical, realistic, experiential,    B. imaginative, innovative, theoretical",
				"7.   A. candid, straightforward, frank,    B. tactful, kind, encouraging",
				"8.   A. plan, schedule,    B. unplanned, sponteneous",
				"9.   A. seekmany tasks, public activities, interaction with others,    B. seek private, solitary activities with quiet to concentrate",
				"10. A. standard, usual, conventional,    B. different, novel, unique",
				"11. A. firm, tend to criticize, hold the line,    B. gentle, tend to appreciate, conciliate",
				"12. A. regulated, structured,    B. easy-going, live and let live",
				"13. A. external, communicative, express yourself,    B. internal, reticent, keep to yourself",
				"14. A. focus on here-and-now,    B. look to the future, global perspective, big picture",
				"15. A. tough minded, just,    B. tender-hearted, merciful",
				"16. A. preparation, plan ahead,    B. go with the flow, adapt as you go",
				"17. A. active, initiate,    B. reflective, deliberate",
				"18. A. facts, things, what is,    B. ideas, dreams, what could be, philosophical",
				"19. A. matter of fact, issue-oriented,    B. sensitive, people-oriented, compassionate",
				"20. A. control, govern,    B. lattitude, freedom"};
			

					System.out.println("SELECT ONLY 'A' OR 'B' TO GET PERSONALITY TRAIT");
					int extroverted = 0;
					int introverted = 0;
					int sensing = 0;
					int intuitive = 0;
					int thinking = 0;
					int feeling = 0;
					int judging = 0;
					int perspective = 0;
					int countNum = 0;
					int index = 0;

					for(index = 0; index < serveQuestions.length; index++){
					
					System.out.println(serveQuestions[index]);
					String answer = input.nextLine().toUpperCase();
					
					if(!answer.equals("A") && !answer.equals("B")){
						if(index == 0){
					index = 0;
						}
						if(index != 0){
					index = index - 1;
					System.out.println("Invalid input, please select A or B");
					System.out.println();
					}
					}
					//break;

						switch(index){
							case 0:
							if(answer.equals("A") && questionEI[0] == 1){
							extroverted = extroverted + 1;
							}
							if(answer.equals("B") && questionEI[0] == 1){
							introverted = introverted + 1;
							}
							break;

							case 1:
							if(answer.equals("A") && questionSN[0] == 2){
							sensing = sensing + 1;
							}
							if(answer.equals("B") && questionSN[0] == 2){
							intuitive = intuitive + 1;
							}
							break;

							case 2:
							if(answer.equals("A") && questionTF[0] == 3){
							thinking = thinking + 1;
							}
							if(answer.equals("B") && questionTF[0] == 3){
							feeling = feeling + 1;
							}
							break;

							case 3:
							if(answer.equals("A") && questionJP[0] == 4){
							judging = judging + 1;
							}
							if(answer.equals("B") && questionJP[0] == 4){
							perspective = perspective + 1;
							}
							break;

							case 4:
							if(answer.equals("A") && questionEI[1] == 5){
							extroverted = extroverted + 1;
							}
							if(answer.equals("B") && questionEI[1] == 5){
							introverted = introverted + 1;
							}
							break;

							case 5:
							if(answer.equals("A") && questionSN[1] == 6){
							sensing = sensing + 1;
							}
							if(answer.equals("B") && questionSN[1] == 6){
							intuitive = intuitive + 1;
							}
							break;

							case 6:
							if(answer.equals("A") && questionTF[1] == 7){
							thinking = thinking + 1;
							}
							if(answer.equals("B") && questionTF[1] == 7){
							feeling = feeling + 1;
							}
							break;

							case 7:
							if(answer.equals("A") && questionJP[1] == 8){
							judging = judging + 1;
							}
							if(answer.equals("B") && questionJP[1] == 8){
							perspective = perspective + 1;
							}
							break;

							case 8:
							if(answer.equals("A") && questionEI[2] == 9){
							extroverted = extroverted + 1;
							}
							if(answer.equals("B") && questionEI[2] == 9){
							introverted = introverted + 1;
							}
							break;

							case 9:
							if(answer.equals("A") && questionSN[2] == 10){
							sensing = sensing + 1;
							}
							if(answer.equals("B") && questionSN[2] == 10){
							intuitive = intuitive + 1;
							}
							break;

							case 10:
							if(answer.equals("A") && questionTF[2] == 11){
							thinking = thinking + 1;
							}
							if(answer.equals("B") && questionTF[2] == 11){
							feeling = feeling + 1;
							}
							break;

							case 11:
							if(answer.equals("A") && questionJP[2] == 12){
							judging = judging + 1;
							}
							if(answer.equals("B") && questionJP[2] == 12){
							perspective = perspective + 1;
							}
							break;

							case 12:
							if(answer.equals("A") && questionEI[3] == 13){
							extroverted = extroverted + 1;
							}
							if(answer.equals("B") && questionEI[3] == 13){
							introverted = introverted + 1;
							}
							break;

							case 13:
							if(answer.equals("A") && questionSN[3] == 14){
							sensing = sensing + 1;
							}
							if(answer.equals("B") && questionSN[3] == 14){
							intuitive = intuitive + 1;
							}
							break;

							case 14:
							if(answer.equals("A") && questionTF[3] == 15){
							thinking = thinking + 1;
							}
							if(answer.equals("B") && questionTF[3] == 15){
							feeling = feeling + 1;
							}
							break;

							case 15:
							if(answer.equals("A") && questionJP[3] == 16){
							judging = judging + 1;
							}
							if(answer.equals("B") && questionJP[3] == 16){
							perspective = perspective + 1;
							}
							break;

							case 16:
							if(answer.equals("A") && questionEI[4] == 17){
							extroverted = extroverted + 1;
							}
							if(answer.equals("B") && questionEI[4] == 17){
							introverted = introverted + 1;
							}
							break;

							case 17:
							if(answer.equals("A") && questionSN[4] == 18){
							sensing = sensing + 1;
							}
							if(answer.equals("B") && questionSN[4] == 18){
							intuitive = intuitive + 1;
							}
							break;

							case 18:
							if(answer.equals("A") && questionTF[4] == 19){
							thinking = thinking + 1;
							}
							if(answer.equals("B") && questionTF[4] == 19){
							feeling = feeling + 1;
							}
							break;

							case 19:
							if(answer.equals("A") && questionJP[4] == 20){
							judging = judging + 1;
							}
							if(answer.equals("B") && questionJP[4] == 20){
							perspective = perspective + 1;
							}
							break;


						
					
						}
							System.out.printf("The index %d %n",index);
							System.out.printf("Extrovert %d %n",extroverted);
							System.out.printf("Introvert %d %n",introverted);
							System.out.printf("Sensing %d %n",sensing);
							System.out.printf("Intuitive %d %n",intuitive);
							System.out.printf("Thinking %d %n",thinking);
							System.out.printf("Feeling %d %n",feeling);
							System.out.printf("Judging %d %n",judging);
							System.out.printf("Perspective %d %n",perspective);
						
			}

     }


}