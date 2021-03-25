package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while (counter < 10) {
            System.out.println("Enter number #" + counter + ":");
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                int newNumber = scanner.nextInt();
                sum += newNumber;
                counter++;
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine();
            }  System.out.println("The sum of your numbers equals" + sum);
        scanner.close();
        }

    }
