package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(10));
    }
    public static int sumFirstAndLastDigit(int number){

        if (number<0){
        return -1;
    }
        int firstDigit = number % 10;
        int lastDigit = 0;
    while (number>0){
               number = number / 10;
        if(number<10){
            lastDigit = number;
            break;
        }
    }
        System.out.println(number);
    if(number<10){
        lastDigit = firstDigit;
    }
    return lastDigit + firstDigit;
}
}
