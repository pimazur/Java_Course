package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDurationString(324,43));
        System.out.println(getDurationString(657));
    }
public static String getDurationString(int minutes, int seconds){

        if(minutes < 0 || seconds < 0 || seconds > 59){
            return "Invalid value";

        }
        int hours = minutes / 60;
        int restOfMinutes = minutes % 60;
        if(hours < 10)
        return hours + "h " + restOfMinutes + "m " + seconds + "s ";
    }
    public static String getDurationString(int seconds){

        if(seconds < 0){
            return "Invalid value";
        }
        int minutes = seconds / 60;
        int restOfSeconds = seconds % 60;
        return getDurationString(minutes,restOfSeconds);

    }
}
