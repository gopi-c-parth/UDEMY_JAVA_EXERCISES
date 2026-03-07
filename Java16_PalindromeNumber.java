public class Java16_PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome (int num){
        int reverse = 0;
        int original = num;
        while(num != 0){
        reverse = reverse*10 + num%10 ;
        num /=10;
        }
        return reverse == original ;
        
    }
    
}