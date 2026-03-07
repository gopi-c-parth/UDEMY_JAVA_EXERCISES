public class Java19_SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }
    
    public static boolean hasSharedDigit(int num_1, int num_2){
        if(num_1<10 || num_1>99 || num_2<10 || num_2>99){
            return false;
        }
       
        for(int i = num_1; i>0; i/=10){
            int digit_1 = i%10;
            for(int j = num_2; j>0; j/=10){
                int digit_2 = j%10;
                if(digit_2 == digit_1){
                    return true;
                }
            }
        }
        return false;
    }
}