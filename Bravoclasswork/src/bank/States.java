package bank;

public class States {
    GeoZones geoZones;

    public States(GeoZones geoZones) {
        this.geoZones = geoZones;
    }

    public void getState(){
        switch (geoZones){
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
