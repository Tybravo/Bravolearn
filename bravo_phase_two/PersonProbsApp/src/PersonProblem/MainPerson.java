package PersonProblem;

import java.lang.reflect.Type;
import java.util.Scanner;

public class MainPerson {
    
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            
            System.out.print("Enter the name of the problem: ");
            String name = input.nextLine();
            System.out.println("Enter number of type of problem: ");
            System.out.print("""
                    1 -> FINANCIAL PROBLEM
                    2 -> SPIRITUAL PROBLEM
                    3 -> EDUCATION PROBLEM
                    4 -> BUSINESS PROBLEM
                    5 -> TECHNICAL PROBLEM
                 """);
            int typeOfProb = input.nextInt();

            if(typeOfProb == 1){
                String typeOfProblem = "FINANCIAL";
            }
            if(typeOfProb == 2){
                String typeOfProblem = "SPIRITUAL";
            }
            if(typeOfProb == 3){
                String typeOfProblem = "EDUCATION";
            }
            if(typeOfProb == 4){
                String typeOfProblem = "BUSINESS";
            }
            if(typeOfProb == 5){
                String typeOfProblem = "TECHNICAL";
            }


            TYPE Type = null;
            Person person = new Person(name, Type);


            Problems ListOfProblems = null;
            person.addProblem(ListOfProblems);


            int unsolvedCount = person.countUnsolvedProblems();
            System.out.println("Unsolved Problems: " + unsolvedCount);
        }
    }


