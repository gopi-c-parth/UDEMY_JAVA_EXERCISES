public class Java24_NumberToWordsExtended {
    
    public static void main(String[] args) {
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }
    
    public static int reverse (int number){
        int reverse = 0;
        while (number != 0){
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }
        return reverse;
    }
    
    
    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }
        else if(number == 0){
            return 1;
        }
        else{
            int count = 0;
            for(int i = 1; i <= number ; i *= 10){
                count++ ;
            }
            return count;
        }
        
    }
    
    
    public static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
            return;
        } 
        int reverse = reverse(number);
        int leadingZeros = getDigitCount(number) - getDigitCount(reverse);
        if(number == 0){
            System.out.println("Zero");
            return;
        }
        while (reverse != 0){
            int lastdigit = reverse % 10;
            switch(lastdigit){
                case 0 -> System.out.print("Zero ");
                case 1 -> System.out.print("One ");
                case 2 -> System.out.print("Two ");
                case 3 -> System.out.print("Three ");
                case 4 -> System.out.print("Four ");
                case 5 -> System.out.print("Five ");
                case 6 -> System.out.print("Six ");
                case 7 -> System.out.print("Seven ");
                case 8 -> System.out.print("Eight ");
                case 9 -> System.out.print("Nine ");
            }
            reverse /= 10;
        }
        for (int i = 0;i <leadingZeros; i++){
            System.out.print("Zero ");
        }
        System.out.println();
    }
}
