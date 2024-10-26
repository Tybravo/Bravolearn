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
					String personTrait = "";
					String introMbti = "";
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
					}

							if(introverted > extroverted && intuitive > sensing && thinking > feeling && judging > perspective){
							personTrait = "INTJ";
							introMbti = """
								INTJ (Architect) is a personality type with the Introverted, Intuitive, Thinking, and Judging traits. These thoughtful tacticians
								love perfecting the details of life, applying creativity and rationality to everything they  do. Their inner world is often
								a private, complex one. For more info, visit https://www.16personalities.com/intj-personality
								""";
							}
							if(introverted > extroverted && intuitive > sensing && thinking > feeling && perspective > judging){
							personTrait = "INTP";
							introMbti = """
								INTP (Logician) is a personality type with the Introverted, Intuitive, Thinking, and Prospecting traits. These flexible thinkers
								enjoy taking an unconventional approach to many aspects of life. They often seek out unlikely paths, mixing willingness
								to experiment with personal creativity. For more info, visit https://www.16personalities.com/intp-personality
								""";
							}
							if(extroverted > introverted && intuitive > sensing && thinking > feeling && judging > perspective){
							personTrait = "ENTJ";
							introMbti = """
								ENTJ (Commander) is a personality type with the Extraverted, Intuitive, Thinking, and Judging traits. They are decisive
								people who love momentum and accomplishment. They gather information to construct their creative visions but rarely
								hesitate for long before acting on them. For more info, visit https://www.16personalities.com/entj-personality
								""";
							}
							if(extroverted > introverted && intuitive > sensing && thinking > feeling && perspective > judging){
							personTrait = "ENTP";
							introMbti = """
								ENTP (Debater) is a personality type with the Extraverted, Intuitive, Thinking, and Prospecting traits. They tend to be
								bold and creative, deconstructing and rebuilding ideas with great mental agility. They pursue their goals vigorously
								despite any resistance they might encounter. For more info, visit https://www.16personalities.com/entp-personality
								""";
							}


							if(introverted > extroverted && intuitive > sensing && feeling > thinking && judging > perspective){
							personTrait = "INFJ";
							introMbti = """
								INFJ (Advocate) is a personality type with the Introverted, Intuitive, Feeling, and Judging traits. They tend to approach
								life with deep thoughtfulness and imagination. Their inner vision, personal values, and a quiet, principled version of
								humanism guide them in all things. For more info, visit https://www.16personalities.com/infj-personality
								""";
							}
							if(introverted > extroverted && intuitive > sensing && feeling > thinking && perspective > judging){
							personTrait = "INFP";
							introMbti = """
								INFP (Mediator) is a personality type with the Introverted, Intuitive, Feeling, and Prospecting traits. These rare
								personality types tend to be quiet, open-minded, and imaginative, and they apply a caring and creative
								approach to everything they do.  For more info, visit https://www.16personalities.com/infp-personality
								""";
							}
							if(extroverted > introverted  && intuitive > sensing && feeling > thinking && judging > perspective){
							personTrait = "ENFJ";
							introMbti = """
								ENFJ (Protagonist) is a personality type with the Extraverted, Intuitive, Feeling, and Judging traits. These warm, forthright
								types love helping others, and they tend to have strong ideas and values. They back their perspective with the creative
								energy to achieve their goals.  For more info, visit https://www.16personalities.com/enfj-personality
								""";
							}
							if(extroverted > introverted  && intuitive > sensing && feeling > thinking && perspective > judging){
							personTrait = "ENFP";
							introMbti = """
								ENFP (Campaigner) is a personality type with the Extraverted, Intuitive, Feeling, and Prospecting traits. These people
								tend to embrace big ideas and actions that reflect their sense of hope and goodwill toward others. Their vibrant
								energy can flow in many directions. For more info, visit https://www.16personalities.com/enfp-personality
								""";
							}


							if(introverted > extroverted  && sensing > intuitive && thinking > feeling && judging > perspective){
							personTrait = "ISTJ";
							introMbti = """
								ISTJ (Logistician) is a personality type with the Introverted, Observant, Thinking, and Judging traits. These people tend
								to be reserved yet willful, with a rational outlook on life. They compose their actions carefully and carry them out with 
								methodical purpose. For more info, visit https://www.16personalities.com/istj-personality"
								""";
							}
							if(introverted > extroverted  && sensing > intuitive && feeling > thinking && judging > perspective){
							personTrait = "ISFJ";
							introMbti = """
								ISFJ (Defender) is a personality type with the Introverted, Observant, Feeling, and Judging traits. These people tend to be
								warm and unassuming in their own steady way. They’re efficient and responsible, giving careful attention to practical
								details in their daily lives. For more info, visit https://www.16personalities.com/isfj-personality
								""";
							}
							if(extroverted > introverted  && sensing > intuitive && thinking > feeling && judging > perspective){
							personTrait = "ESTJ";
							introMbti = """
								ESTJ (Executive) is a personality type with the Extraverted, Observant, Thinking, and Judging traits. They possess great
								fortitude, emphatically following their own sensible judgment. They often serve as a stabilizing force among others,
								able to offer solid direction amid adversity. For more info, visit https://www.16personalities.com/estj-personality
								""";
							}
							if(extroverted > introverted  && sensing > intuitive && feeling > thinking && judging > perspective){
							personTrait = "ESFJ";
							introMbti = """
								ESFJ (Consul) is a personality type with the Extraverted, Observant, Feeling, and Judging traits. They are attentive and
								people-focused, and they enjoy taking part in their social community. Their achievements are guided by decisive
								values, and they willingly offer guidance to others. For more info, visit https://www.16personalities.com/esfj-personality
								""";
							}


							if(introverted > extroverted  && sensing > intuitive && thinking > feeling && perspective > judging){
							personTrait = "ISTP";
							introMbti = """
								ISTP (Virtuoso) is a personality type with the Introverted, Observant, Thinking, and Prospecting traits. They tend to have
								an individualistic mindset, pursuing goals without needing much external connection. They engage in life with inquisitiveness
								and personal skill, varying their approach as needed. For more info, visit https://www.16personalities.com/istp-personality
								""";
							}
							if(introverted > extroverted  && sensing > intuitive && feeling > thinking && perspective > judging){
							personTrait = "ISFP";
							introMbti = """
								ISFP (Adventurer) is a personality type with the Introverted, Observant, Feeling, and Prospecting traits. They tend to have
								open minds, approaching life, new experiences, and people with grounded warmth. Their ability to stay in the moment
								helps them uncover exciting potentials. For more info, visit https://www.16personalities.com/isfp-personality
								""";
							}
							if(extroverted > introverted  && sensing > intuitive && thinking > feeling && perspective > judging){
							personTrait = "ESTP";
							introMbti = """
								ESTP (Entrepreneur) is a personality type with the Extraverted, Observant, Thinking, and Prospecting traits. They tend to be
								energetic and action-oriented, deftly navigating whatever is in front of them. They love uncovering life’s opportunities, whether
								socializing with others or in more personal pursuits.For more info, visit https://www.16personalities.com/estp-personality
								""";
							}
							if(extroverted > introverted  && sensing > intuitive && feeling > thinking && perspective > judging){
							personTrait = "ESFP";
							introMbti = """
								ESFP (Entertainer) is a personality type with the Extraverted, Observant, Feeling, and Prospecting traits. These people
								love vibrant experiences, engaging in life eagerly and taking pleasure in discovering the unknown. They can be very social,
								often encouraging others into shared activities. For more info, visit https://www.16personalities.com/esfp-personality
								""";
							}




							System.out.printf("Extrovert %d %n",extroverted);
							System.out.printf("Introvert %d %n",introverted);
							System.out.printf("Sensing %d %n",sensing);
							System.out.printf("Intuitive %d %n",intuitive);
							System.out.printf("Thinking %d %n",thinking);
							System.out.printf("Feeling %d %n",feeling);
							System.out.printf("Judging %d %n",judging);
							System.out.printf("Perspective %d %n%n",perspective);

							

			

							System.out.printf("Your personality type is: %s %n %s",personTrait, introMbti);



     }

}
