public class Java10_MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(-50);
    }
    public static void printYearsAndDays ( long minutes ){
        if (minutes<0){
        System.out.println("Invalid Value");
        return;
        }
        int days = (int)minutes / (24*60);
        int years = days / 365 ;
        System.out.println(minutes + " min = " + years + " y and " + days%365 +" d") ;
    }
}