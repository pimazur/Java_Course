package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	printNumberInWord(5);
    }
    public static void printNumberInWord(int number){

        switch (number){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
        }
        if(day == 0){
            System.out.println("Sunday");
        } else if(day == 1){
            System.out.println("Monday");
        } else if(day == 2){
            System.out.println("Tuesday");
        } else if(day == 3){
            System.out.println("Wednesday");
        } else if(day == 4){
            System.out.println("Thursday");
        } else if(day == 5){
            System.out.println("Friday");
        } else if(day == 6){
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid day");
        }
    }
}
