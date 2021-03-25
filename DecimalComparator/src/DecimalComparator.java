public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){

     double a = firstNumber * 1000;
     double b = secondNumber * 1000;

     int a1 = (int) a;
     int b1 = (int) b;

     if(a1 == b1){
         return true;
     }
     return false;
    }
}
