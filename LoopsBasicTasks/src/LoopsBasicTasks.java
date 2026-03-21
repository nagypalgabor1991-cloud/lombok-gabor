import java.util.Scanner;

public class LoopsBasicTasks {
    public static void main(String[] args) {
        // Write a loop that...
        //Writes “Paper Dragon” to the console 5 times
        for (int i = 0; i < 5; i++) {
            System.out.println("Paper Dragon");
        }
        //Writes every integer from 1 to 30 to the console
        for (int i = 1; i <= 30; i++) {
            System.out.println(i);
        }
        //Writes every even (divisible by two) value from 1 to 500 to the console.
        for (int i = 2; i <= 500; i += 2) {
            System.out.println(i);
        }
        //Writes every odd (not divisible by two) value from 1 to 500 to the console.
        for (int i = 1; i <= 500; i += 2) {
            System.out.println(i);
        }
        //Writes the first 10 powers of two to the console (starting with 2^0 = 1).
        int powersOfTwo = 1;
        for (int i = 0; i < 10; i++) {
            System.out.println(powersOfTwo);
            powersOfTwo *= 2;
        }
        //Writes all the numbers to the console from 565.5 to 678.5 with an increment of 0.25.
        for (double i = 565.5; i <= 678.5; i += 0.25) {
            System.out.println(i);
        }
        //Writes all the multiples of 30 to the console between 600 and 750.
        for (int i = 600; i <= 750; i += 30) {
            System.out.println(i);
        }
        //Calculates the sum of the first 10 natural numbers and writes it to the console (1+2+…+9+10).
        int number = 0;
        for (int i = 1; i <= 10; i++) {
            number += i;
        }
        System.out.println(number);
        //Calculates the average of the first 20 natural numbers and writes it to the console.
        double naturalNumber = 0;
        int firstXNumber = 20;
        for (int i = 1; i <= firstXNumber; i++) {
            naturalNumber += i;
        }
        double result = naturalNumber / firstXNumber;
        System.out.println(result);
        //Writes all the square numbers to the console between 1 and 1000.
        for (int i = 1; i <= 1000; i++) {
            double squareNumbers = Math.sqrt(i);
            if (squareNumbers % 1 == 0) {
                System.out.println(squareNumbers * squareNumbers);
            }
        }
        //Writes all the cube numbers to the console between 1 and 1250.
        for (int i = 1; i <= 1250; i++) {
            double cubeNumbers = Math.cbrt(i);
            if (cubeNumbers % 1 == 0) {
                System.out.println(cubeNumbers * cubeNumbers * cubeNumbers);
            }
        }
        //Asks a number from the user and determines if that number is prime
        System.out.println("Please enter a number:");
        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < userInput; i++) {
            if (userInput % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime == false) {
            System.out.println("Your number is not prime.");
        } else {
            System.out.println("Your number is prime");
        }
    }
}