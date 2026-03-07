public class Java17_FirstLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-10));
    }
    public static int sumFirstAndLastDigit (int number){
        if (number <0){
            return -1;
        }
        int LastDigit = number%10;
        int FirstDigit = 0;
        while (number != 0){
            FirstDigit =number%10;
            number = number/10;
        }
        return LastDigit+FirstDigit;
    }
}