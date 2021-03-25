package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(43));
    }
    public static boolean isPalindrome(int number){

        int reverse = 0;
        int lastDigit = 0;
        int numberInLoop = number;

        if(number>=0){
            while (numberInLoop>0){

                lastDigit = numberInLoop % 10;
                numberInLoop /= 10;
                reverse = reverse * 10 + lastDigit;
            }
        } else {
            while (numberInLoop<0){

                lastDigit = numberInLoop % 10;
                numberInLoop /= 10;
                reverse = reverse * 10 + lastDigit;
            }
        }

        if (reverse == number){
            return true;
        }
        return false;
    }
}
