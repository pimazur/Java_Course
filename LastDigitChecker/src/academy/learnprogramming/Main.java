package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    public static boolean hasSameLastDigit(int first, int second, int third){

        if(first<10 || first>1000 || second<10 || second>1000 || third<10 || third>1000){
            return false;
        }

        int firstDigit = first % 10;
        int secondDigit = second % 10;
        int thirdDigit = third % 10;
        if(firstDigit == secondDigit || firstDigit == thirdDigit || secondDigit == thirdDigit){
            return true;
        } else
            return false;
    }
    public static boolean isValid(int number){
        if(number<10 || number>1000){
            return false;
    } else
        return true;
    }
}
