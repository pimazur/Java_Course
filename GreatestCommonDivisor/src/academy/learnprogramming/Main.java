package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(30,12));
    }
    public static int getGreatestCommonDivisor(int first, int second){

        if(first<10 || second<10){
            return -1;
        }
        int firstDivisor = 0;
        int secondDivisor = 0;

        if(first>second){
            for(int i=second; i>0; i--){
                if(second % i == 0){
                    secondDivisor = i;
                }
                for(int j=second; j>=i; j--){
                    if(first % j == 0){
                        firstDivisor = j;
                    }
                }
                if(firstDivisor == secondDivisor){
                    break;
                }
            }
        } else {
            for(int i=first; i>0; i--){
                if(first % i == 0){
                    firstDivisor = i;
                }
                for(int j=first; j>=i; j--){
                    if(second % j == 0){
                        secondDivisor = j;
                    }
                }
                if(firstDivisor == secondDivisor) {
                    break;
                }
            }
        }
        return firstDivisor;
    }
}
