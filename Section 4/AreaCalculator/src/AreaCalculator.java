public class AreaCalculator {
    public static double area(double radius){
        if (radius < 0){
            return -1;
        }
        double pie = Math.PI;
        double circleArea = radius * radius * pie;
        return circleArea;
    }
    public static double area (double x, double y){
        if (x < 0 || y < 0){
            return -1;
        }
        double measuredArea = x * y;
        return measuredArea;
    }
}
