package academy.learnprogramming;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	/*for(int i=0; i<9; i++){
        System.out.println(calculateInterest(10000, i));
        }
        for(int i=8; i>1; i--){
            System.out.println(calculateInterest(10000, i));
        }*/
	int count=0;
        for(int i=4; i<17; i++){
            if(isPrime(i)){
                count++;
                    System.out.println(i);
                    if(count == 3){
                        break;
                }
            }
        }

    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount *(interestRate/100));
    }
    public static boolean isPrime(int n){

        if(n == 1){
            return false;
        }
        for(int i=2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
