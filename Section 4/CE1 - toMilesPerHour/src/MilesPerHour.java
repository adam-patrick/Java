public class MilesPerHour {
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1; // indicates invalid input
        }
        else {
            double milesPerHour = 0.621371D;
            double conversion = (kilometersPerHour * milesPerHour);
            long round = Math.round(conversion);
            return round;
        }
    }
    public static void printConversion (double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        }
        else {
            double milesPerHour = 0.621371D;
            double conversion = (kilometersPerHour * milesPerHour);
            long round = Math.round(conversion);
            System.out.println(kilometersPerHour + " km/h = " + round + " mi/h.");
        }
    }

    public static void main (String[] args) {
        System.out.println(toMilesPerHour(75.114));
        printConversion(-5.6);
    }
}
