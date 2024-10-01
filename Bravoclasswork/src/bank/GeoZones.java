package bank;

import java.util.Arrays;

public enum GeoZones {
    NORTH_CENTRAL("Benue", "Niger", "Kogi", "Kwara", "Plateau", "Nassarawa", "FCT"),
    NORTH_EAST("Gombe", "Bauchi", "Yobe", "Benue", "Adamawa", "Taraba"),
    SOUTH_EAST("Abia", "Imo", "Ebonyi", "Anambra", "Enugu"),
    SOUTH_WEST("Ekiti", "Ondo", "Osun", "Oyo", "Ogun", "Lagos"),
    NORTH_WEST("Jigawa", "Kano", "Katsina", "Kaduna", "Kebbi", "Zamfara", "Sokoto"),
    SOUTH_SOUTH("Akwa-Ibom", "Cross Rivers", "Bayelsa", "Rivers", "Delta", "Edo");

    private final String [] states;


    GeoZones(String... states) {
        this.states = states;

    }

    public String[] getStates() {
        return states;
    }

    public GeoZones getZone(String state) {
        return GeoZones.values()[ordinal()];
    }

    public String[] toString(String states) {
        return GeoZones.valueOf(states).getStates();
    }

    public static GeoZones getZoneName(String states) {
        GeoZones value = null;
        for (GeoZones zone : GeoZones.values()) {
            if(Arrays.asList(zone.getStates()).contains(states)) {
                value = zone;
                break;
            }
        }
        return value;
    }
}
