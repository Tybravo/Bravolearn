package bank;

public class Time {

    private static int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = validateHour(hour);
        this.minute =  validateMinute(minute);
        this.second = validateSecond(second);
    }

    private int validateHour(int hour) {
        if (hour < 0 || hour > 24) {
            throw new IllegalArgumentException("Hour must be between 0 and 24");
        }
        return hour;
    }

    private int validateMinute(int minute){
            if(minute < 0 || minute > 59){
                throw new IllegalArgumentException("Minute must be between 0 and 59");
            }
            return minute;
        }

        private int validateSecond(int second){
        if(second < 0 || second > 59){
            throw new IllegalArgumentException("Second must be between 0 and 59");
        }
        return second;
        }

public static int compare(Time anotherTime) {
    if (Time.hour == anotherTime.hour) {
        return hour;
    }
    return anotherTime.hour;
}


    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
