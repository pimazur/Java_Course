package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(isEvenNumber(3));

        int firstNumber = 4;
        int finishNumber = 20;
        int totalEvenNumbers = 0;

        while (firstNumber <= finishNumber) {
            firstNumber++;
            if (!isEvenNumber(firstNumber)) {
                continue;
            } else {
                totalEvenNumbers++;
                System.out.println("Even number: " + firstNumber);
                if (totalEvenNumbers == 5) {
                    break;
                }
            }
        }
        System.out.println(totalEvenNumbers);
    }
    public static boolean isEvenNumber(int number){
        if(number % 2 == 0){
            return true;
        }
        return false;
    }
}
