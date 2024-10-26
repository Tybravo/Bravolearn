package bank;

import java.util.Scanner;

public class Array3by3 {
    static Scanner input = new Scanner(System.in);
    private static int rows;
    private static int columns;

    public Array3by3(int rows, int columns) {
        Array3by3.rows = rows;
        Array3by3.columns = columns;
    }

    public static void main(String[] args) {
        System.out.println("Enter number of rows?");
        rows = Integer.parseInt(input.next());
        System.out.println("Enter number of columns?");
        columns = Integer.parseInt(input.next());

        String[][] mockInput = new String[0][];
        System.out.println(display(rows, columns, mockInput));
    }

    public static String display(int rows, int cols, String[][] mockInput) {
        String [][] newArray = new String[rows][cols];
        String pattern = "";

        for(int row = 0; row < newArray.length; row++) {
            System.out.println("Enter '1' for '*' or '0' for spaces to create pattern ");
            for(int column = 0; column < newArray[row].length; column++) {
                newArray[row][column] = input.next();

                if(newArray[row][column].equals("1")) {
                    pattern = pattern + "*";
                }

                else if(newArray[row][column].equals("0")) {
                    pattern = pattern + " ";
                }
            }
            pattern += "\n";
        }

        return pattern;
    }

}
