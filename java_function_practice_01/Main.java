import java.util.Scanner;

public class Main{

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        
        CreateFunction createFunction = new CreateFunction();
        int getResult = createFunction.isSum(firstNumber, secondNumber);
        
        System.out.println("The sum is: " + getResult);
        
        

    }
}

