package bank;

import static bank.GeoPolitical.NORTH_WEST;
import static bank.GeoPolitical.NORTH_EAST;

public class States {
    GeoPolitical geoPolitical;

    public States(GeoPolitical geoPolitical) {
        this.geoPolitical = geoPolitical;
    }

    public void getState(){
        switch (geoPolitical){
            case NORTH_EAST:
                System.out.println("BORNU");
                System.out.println("YOBE");
                System.out.println("ADAMAWA");
                System.out.println("TARABA");
                System.out.println("GONBE");
                System.out.println("BAUCHI");
                break;
            case NORTH_WEST:



        }

    }
}
