public class FeetInchesCentimeters {

    public static double calcFeetAndInchesToCentimeters(double feet1, double inches1){

        //double centimeters = (1 / 2.54)*inches + (1 / (12*2.54))*feet;
        if(feet1 < 0 || (inches1 < 0 || inches1 > 12)){
            return -1;
        } else {
            return (1 / 2.54)*inches1 + (1 / (12*2.54))*feet1;
        }
    }
    public static double calcFeetAndInchesToCentimeters(double inches2){

        if(inches2 < 0) {
            return -1;
        }
            double feet2 = 12 * inches2;
        return  calcFeetAndInchesToCentimeters(inches2, feet2);

    }
}


