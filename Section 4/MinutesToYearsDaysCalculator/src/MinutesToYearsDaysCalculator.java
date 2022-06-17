public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if (minutes < 0) {
            System.out.println("Invalid Value");
        }
        else{
            long days = minutes / 1440;
            long remainingMinutes = minutes % 1440;
            long years = days / 365;
            long remainingDays = days % 365;
            String years_String = years + " y";
            String days_String = remainingDays + " d";
            String minutes_String = minutes + " min";
            System.out.println(minutes_String + " = " + years_String + " and " + days_String);
        }
    }
}
