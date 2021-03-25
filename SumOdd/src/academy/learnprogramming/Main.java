package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumOdd(4,16));
        System.out.println(isOdd(10));
    }
    public static boolean isOdd(int number){
        if(number<=0){
            return false;
        }
        if((number + 1) % 2 == 0){
            return true;
        }
        return false;
    }
    public static int sumOdd(int start, int end){
        if(end<start || end<=0 || start<=0){
            return -1;
        }
        int sum=0;
        for(int i=start; i<=end; i++){
            if(isOdd(i)){
                sum+=i;
            }
        }
        return sum;
    }
}
