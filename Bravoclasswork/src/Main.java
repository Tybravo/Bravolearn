


/*
import java.util.Scanner;

public class GeopoliticalZones {
    static Scanner input = new Scanner(System.in);
    private static Zones zones;

    public static void showMAinMenu() {
        String menu = """
                 Select your choice
                 1 => Geopolitical Zones
                 2 => Exit
                """;
        print(menu);

        print("What is your choice?: ");
        char choice = input.next().charAt(0);

        switch (choice) {
            case '1':
                geopoliticalZone(choice);
                showMAinMenu();


            case '2':
                print("Exiting Application");
                System.exit(0);
            default:
                print("Invalid choice, enter a correct option");
                showMAinMenu();
        }
    }

    public static void geopoliticalZone(char choice) {
        print("Enter state: ");
        String state = input.next().replaceAll("[-_,@# ']", "");
        zones = Zones.getZoneName(state);
        print("This state is a part of the " + zones.toString() + " zone");
        showMAinMenu();
    }

    private static void print(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        showMAinMenu();
    }
}





/////////////////////////////////////////////////////////////////////////////////////////////////



import java.util.Arrays;

public enum Zones {
    NORTH_CENTRAL("Benue", "Niger", "Kogi", "Kwara", "Plateau", "Nassarawa", "FCT"),
    NORTH_EAST("Gombe", "Bauchi", "Yobe", "Benue", "Adamawa", "Taraba"),
    SOUTH_EAST("Abia", "Imo", "Ebonyi", "Anambra", "Enugu"),
    SOUTH_WEST("Ekiti", "Ondo", "Osun", "Oyo", "Ogun", "Lagos"),
    NORTH_WEST("Jigawa", "Kano", "Katsina", "Kaduna", "Kebbi", "Zamfara", "Sokoto"),
    SOUTH_SOUTH("Akwa-Ibom", "Cross Rivers", "Bayelsa", "Rivers", "Delta", "Edo");

    private final String [] states;


    Zones(String... states) {
        this.states = states;

    }

    public String[] getStates() {
        return states;
    }

    public Zones getZone(String state) {
        return Zones.values()[ordinal()];
    }

    public String[] toString(String states) {
        return Zones.valueOf(states).getStates();
    }

    public static Zones getZoneName(String states) {
        Zones value = null;
        for (Zones zone : Zones.values()) {
            if(Arrays.asList(zone.getStates()).contains(states)) {
                value = zone;
                break;
            }
        }
        return value;
}
}

 */




/////////////////////////////////////////////////////////////////////////////////////////////////




/*
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = getRows(scan);
        int columns = getColumns(scan);
        int[][] multidimensionalArray = createMultidimensionalArray(rows, columns);
        populateMultidimensionalArray(multidimensionalArray);
        printMultidimensionalArray(multidimensionalArray);
        scan.close();
    }

    private static int getRows(Scanner scan) {
        System.out.print("Enter number of rows: ");
        return scan.nextInt();
    }

    private static int getColumns(Scanner scan) {
        System.out.print("Enter number of columns: ");
        return scan.nextInt();
    }

    private static int[][] createMultidimensionalArray(int rows, int columns) {
        return new int[rows][columns];
    }

    private static void populateMultidimensionalArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = (i + 1) * (j + 1);
            }
        }
    }

    private static void printMultidimensionalArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

*/

////////////////////////////////////////////////////////////////////////////////////


/*
import java.util.Scanner;

public class Array3by3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = getRows(input);
        int columns = getColumns(input);
        int[][] numOfArray = addArray(rows, columns);
        getThreeByThreeArray(numOfArray);
        DisplayThreeByThreeArray(numOfArray);
        input.close();
    }


    private static int getRows(Scanner input) {
        System.out.print("Enter number of rows: ");
        return input.nextInt();
    }

    private static int getColumns(Scanner input) {
        System.out.print("Enter number of columns: ");
        return input.nextInt();
    }

    public static int[][] addArray(int rows, int columns) {
        return new int[rows][columns];
    }


    private static void getThreeByThreeArray(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[0].length; column++) {
                array[row][column] = (row + 1) * (column + 1);
            }
        }
    }

    private static void DisplayThreeByThreeArray(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[0].length; column++) {
                System.out.print(array[row][column] + " ");
            }
            System.out.println();
        }
    }
}

*/