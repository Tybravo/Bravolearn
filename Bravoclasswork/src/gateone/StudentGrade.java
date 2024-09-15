package gateone;

import java.util.Arrays;
import java.util.Scanner;

public class StudentGrade {

        public static void main(String... args) {

            Scanner input = new Scanner(System.in);

            System.out.print("How many students do you have? ");
            int numStudents = input.nextInt();
            System.out.print("How many subjects do they offer? ");
            int numSubjects = input.nextInt();

            int[][] scores = new int[numStudents][numSubjects + 1]; // +1 for total score
            double[] averages = new double[numStudents];
            int[] positions = new int[numStudents];

            for (int index = 0; index < numStudents; index++) {
                System.out.println("Entering scores for student " + (index + 1));

                int sumScores = 0;
                for (int count = 0; count < numSubjects; count++) {
                    System.out.print("Enter score for subject " + (count + 1) + ": ");
                    int score = input.nextInt();

                    while (score < 0 || score > 100) {
                        System.out.println("Please enter a valid number between 0 and 100");
                        System.out.print("Enter score for subject " + (count + 1) + ": ");
                        score = input.nextInt();
                    }
                    scores[index][count] = score;
                    sumScores += score;
                }

                scores[index][numSubjects] = sumScores;
                averages[index] = Math.round((double) sumScores / numSubjects * 100.0) / 100.0;
            }


            int[] totalScores = new int[numStudents];
            for (int index = 0; index < numStudents; index++) {
                totalScores[index] = scores[index][numSubjects];
            }
            int[] sortedScores = totalScores.clone();
            Arrays.sort(sortedScores);
            for (int index = numStudents - 1, position = 1; index >= 0; index--, position++) {
                for (int count = 0; count < numStudents; count++) {
                    if (sortedScores[index] == scores[count][numSubjects] && positions[count] == 0) {
                        positions[count] = position;
                        break;
                    }
                }
            }

            System.out.println("==========================================================");
            System.out.println("  STUDENT    SUB1   SUB2   TOT     AVE    POS");
            System.out.println("==========================================================");
            for (int index = 0; index < numStudents; index++) {
                System.out.printf("Student  %d   %s    %.2f     %d%n",
                        index + 1,
                        arrayToString(scores[index], numSubjects),
                        averages[index],
                        positions[index]
                );
            }
            System.out.println("==========================================================");
        }



        public static String arrayToString(int[] arrayResult, int numSubjects) {
            StringBuilder display = new StringBuilder();
            for (int index = 0; index < numSubjects; index++) {
                display.append(arrayResult[index]);
                if (index < numSubjects - 1) {
                    display.append("   ");
                }
            }
            display.append("   ").append(arrayResult[numSubjects]); // Total score
            return display.toString();
        }

    }


