package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(5));
    }
    public static int sumDigits(int number){

        if(number<11){
            return -1;
        }
        int sum = 0;
        while(number>0){
            sum = sum + number % 10;
            number = number / 10;
        }
        return sum;
    }
}
