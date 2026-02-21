public class Java02_SpeedConverter {
    
    public static long toMilesPerHour (double kilometersPerHour){
        return kilometersPerHour<0 ? -1 : Math.round (kilometersPerHour/1.609);
    }
    
    public static void printConversion(double kilometersPerHour){
        System.out.println(kilometersPerHour<0 ? "Invalid Value" : kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
    }

    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);
    }
}