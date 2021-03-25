package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        char switchChar = 'G';

        switch (switchChar){
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
                break;
            case 'C':
                System.out.println("C");
                break;
            case 'D':
                System.out.println("D");
                break;
            case  'E' :
                System.out.println("E");
                break;
            default:
                System.out.println("Other letter");
                break;

        }
    }
   public static boolean isCatPlaying(boolean summer, int temperature){

         if(temperature >= 25 && temperature < 36){
            return true;
        } else if(temperature >= 25 && temperature < 46 && summer){
            return true;
        } else return false;
   }
}
