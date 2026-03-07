public class Java26_LargestPrimeFactor {

public static void main(String[] args) {
    System.out.println(getLargestPrime(21));
    System.out.println(getLargestPrime(217));
    System.out.println(getLargestPrime(0));
    System.out.println(getLargestPrime(45));
    System.out.println(getLargestPrime(-1));
}

    public static int getLargestPrime(int num){
        if (num < 2) {
            return -1;
        }
        int largestPrime = -1;
        for (int i =2; i<=num;i++){
            if(num%i ==0){
                boolean prime = true;
                for(int j=2; j<=i/2;j++){
                    if(i%j == 0){
                        prime = false;
                        break;
                    }
                }
                if(prime){
                largestPrime = i;
            }
        }    
    }
    return largestPrime;
    }
}