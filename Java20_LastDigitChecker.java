public class Java20_LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }
    
      public static boolean isValid (int a){
        return ( a>9 && a<1001 );
    }
    
    public static boolean hasSameLastDigit(int a, int b, int c){
        if (!isValid(a) || !isValid(b) || !isValid(c)){
            return false;
        }
        
        int digit_1 = a%10;
        int digit_2 = b%10;
        int digit_3 = c%10;
        return (digit_1 == digit_2 || digit_2 == digit_3 || digit_1 == digit_3);
    }
  
}