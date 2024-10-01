package bank;

import java.util.Scanner;

public class GeopoliticalZones {
    static Scanner input = new Scanner(System.in);
    private static GeoZones geoZones;

    public static void showMAinMenu(){
        String menu = """
                Select your choice
                1 => Geopolitical Zones
                2 => Exit
               """;
        print(menu);

        print("What is your choice?: ");
        char choice = input.next().charAt(0);

        switch(choice){
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

    public static void geopoliticalZone(char choice){
        print("Enter state: ");
        String state = input.next().replaceAll("[-_,@# ']", "");
        geoZones = GeoZones.getZoneName(state);
        print("This state is a part of the "+ geoZones.toString()+" zone");
        showMAinMenu();
    }

    private static void print(String message){
        System.out.println(message);
    }

    public static void main(String[] args) {
        showMAinMenu();

}

}