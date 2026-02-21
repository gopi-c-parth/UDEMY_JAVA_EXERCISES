public class Java04_BarkingDog {
     public static boolean shouldWakeUp (boolean barking,int hourOfDay){
        return  ( barking == true ? ((hourOfDay<8 && hourOfDay>=0) || hourOfDay == 23  ? true : false) : false );
         
     }

     public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
     }
}