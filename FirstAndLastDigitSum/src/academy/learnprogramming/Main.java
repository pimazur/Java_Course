package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(7556));
    }
    public static int sumFirstAndLastDigit(int number){

        if(number<0){
            return -1;
        }

        int firstDigit = 0;
        int lastDigit = number % 10;

        while (number>0){
            firstDigit = number;
            number /= 10;

        }
        return firstDigit + lastDigit;
    }
}
