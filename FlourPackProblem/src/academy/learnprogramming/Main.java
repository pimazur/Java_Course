package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        System.out.println(getLargestPrime(7));
    }
    public static int getLargestPrime(int number){

        class Local {
             boolean isPrime(int number){

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

        if(number<2){
            return -1;
        }
        int largestPrimeFactor = 0;
        for(int i=number; i>0; i--){
            if(number % i == 0 && new Local().isPrime(i)){
                largestPrimeFactor = i;
                break;
            }
        }
        return largestPrimeFactor;
    }


}
