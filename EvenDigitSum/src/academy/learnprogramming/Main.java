package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456));
    }
    public static int getEvenDigitSum(int number){
         if(number<0){
             return -1;
         }
         int firstDigit = 0;
         int sum = 0;
         while (number>0){
             firstDigit = number % 10;
             number = number / 10;
             if (firstDigit % 2 == 0){
                 sum += firstDigit;
             }
         }
                 return sum;
    }
}
