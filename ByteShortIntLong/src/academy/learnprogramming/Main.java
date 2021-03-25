package academy.learnprogramming;

public class Main {



    public static void main(String[] args) {
	int MyValue = 10000;
	int MyMinIntValue = Integer.MIN_VALUE;
	int MyMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value:" + MyMinIntValue);
        System.out.println("Integer Maximum Value:" + MyMaxIntValue);

        byte MaXByteValue = Byte.MAX_VALUE;
        System.out.println("Byte maximum value: " + MaXByteValue);

        short MaXshortValue = Short.MAX_VALUE;
        System.out.println("short maximum value: " + MaXshortValue);

        byte newByte =(byte) (MaXByteValue / 2);
        System.out.println(newByte);

        byte challengeByte = 100;
        short challengeShort = 1000;
        int challengeInt = 100000;
        long challengeLong = (50000 + 10*(challengeByte + challengeInt + challengeShort));
        System.out.println(challengeLong);

        float newFloat = 5.25f / 6.00f;
        System.out.println(newFloat);

        double pound = 5.0;
        double kilogram = pound * 0.45359237;
        System.out.println(kilogram);

        String newString = "\u0044\u0099";
        System.out.println(newString);

/*
        boolean isAlien = false;
if(isAlien == true)
System.out.printf("It's not an Alien! ");
    else
System.out.printf("It is an Alien!");
*/

    int highestScore = 100;
    int secondScore = 50;
    if((highestScore != 20 || highestScore > secondScore)){
        System.out.println("True");}

    boolean isCar = true;
    boolean  wasCar = isCar ? true : false;
    if(wasCar){
        System.out.println("Car");}

    int Eighteen = 18;
    boolean isovereighteen = Eighteen == 20 ? true : false;
        System.out.println(isovereighteen);

        double FirstVariable = 20.00d;
        double SecondVariable = 80.00d;
        double ResultVariable = (FirstVariable + SecondVariable)*100.00d;
        System.out.println(ResultVariable);
        double ResultRemainder = ResultVariable % 40.00d;
        System.out.println(ResultRemainder);
        boolean IfZero = (ResultRemainder == 0) ? true : false;
        System.out.println(IfZero);
        if(!IfZero)
            System.out.println("Got some remainder");



calculateScore(true, 10000, 8, 200);

//
//        if(gameOver){
//            int FinalScore = SecondScore + (levelCompleted * bonus);
//            System.out.println("Final score:" + FinalScore);



            }









    public static int calculateScore(boolean gameOver, int SecondScore, int levelCompleted, int bonus) {


        if (gameOver) {
            int FinalScore = SecondScore + (levelCompleted * bonus);
            System.out.println("Final score:" + FinalScore);
            return FinalScore;
        }else
            return -1;
    }
}