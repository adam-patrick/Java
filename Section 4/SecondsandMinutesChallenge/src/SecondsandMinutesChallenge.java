public class SecondsandMinutesChallenge {
    public static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0 || seconds > 59)) {
            String error = "Invalid Value";
            return error;
        }

        int hours = minutes / 60;
        int remainingminutes = minutes % 60;
        String hours_String = hours + "h";
        String minutes_String = remainingminutes + "m";
        String seconds_String = seconds + "s";


        if (hours < 10) {
            hours_String = "0" + hours_String;
        }
        if (remainingminutes < 10) {
            minutes_String = "0" + minutes_String;
        }
        if (seconds < 10) {
            seconds_String = "0" + seconds_String;
        }

        return (hours_String + " " + minutes_String + " " + seconds_String);
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            String error = "Invalid Value";
            return error;
        }

        int minutes = seconds / 60;
        int seconds2 = seconds % 60;
        return getDurationString(minutes, seconds2);

    }

    public static void main (String[] args) {
        System.out.println(getDurationString(3750));
    }
}