package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPrime(10));
        System.out.println(getLargestPrime(217));
    }
    public static int getLargestPrime(int number){

        if(number<2){
            return -1;
        }
        int divisor=number/2;
        while (divisor>1){
            if(number % divisor == 0){

                break;
            } else{
                divisor++;}
        int largestPrimeFactor = 0;
        for(int i=number/2; i>0; i--){
            if(number % i == 0 && isPrime(i)){
                    largestPrimeFactor = i;
             break;
            }
        }
        return largestPrimeFactor;
        }

    public static boolean isPrime(int number){

        boolean isItPrime = true;
        if(number<2){
            isItPrime = false;
            return isItPrime;
        } else {
            int divisor=2;
            while (divisor<=number/2){
                if(number % divisor == 0){
                    isItPrime = false;
                    break;
                } else
                    divisor++;
            }
            return isItPrime ;
        }
    }
}

