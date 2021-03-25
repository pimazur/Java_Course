package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        System.out.println(calcFeetAndInchesToCentimeters(6,0));
        System.out.println(calcFeetAndInchesToCentimeters(100));
    }

    public static double calcFeetAndInchesToCentimeters(double feet1, double inches1){


        if(feet1 < 0 || (inches1 < 0 || inches1 > 12)){
            return -1;
        } else {
            return 2.54*inches1 + 12*2.54*feet1;
        }
    }
    public static double calcFeetAndInchesToCentimeters(double inches2){

        if(inches2 < 0) {
            return -1;
        }
        double feet2 = inches2 / 12;
        double restOfInches = inches2 % 12;
        return  calcFeetAndInchesToCentimeters(restOfInches, feet2);

    }
}



