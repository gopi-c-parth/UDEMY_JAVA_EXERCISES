public class Java08_TeenNumberChecker {
    public static void  main(String[] args) {
        System.out.println( isTeen(13) || isTeen(56) || isTeen(36)) ;
        System.out.println( isTeen(56) || isTeen(56) || isTeen(36)) ;
        
    }
    public static boolean isTeen (int num){
        return num>12 && num<20;
        
    }

}