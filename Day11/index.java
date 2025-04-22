import java.util.Scanner;

public class index {
     // 41. Absolute Value
     private static int absoluteValue(int num) {
        return (num < 0) ? -num : num;  // If num is negative, make it positive
    }

    // 42. Month of the Year
    private static void printMonth(int monthNumber) {
        switch (monthNumber) {
            case 1: System.out.println("January"); break;
            case 2: System.out.println("February"); break;
            case 3: System.out.println("March"); break;
            case 4: System.out.println("April"); break;
            case 5: System.out.println("May"); break;
            case 6: System.out.println("June"); break;
            case 7: System.out.println("July"); break;
            case 8: System.out.println("August"); break;
            case 9: System.out.println("September"); break;
            case 10: System.out.println("October"); break;
            case 11: System.out.println("November"); break;
            case 12: System.out.println("December"); break;
            default: System.out.println("Invalid month number.");
        }
    }

    // 43. Simple Calculator Using Switch
    private static void calculator(double num1, double num2, char operation) {
        double result;
        switch (operation) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': result = num1 / num2; break;
            default: 
                System.out.println("Invalid operator!");
                return;
        }
        System.out.println("Result: " + result);
    }

    // 44. Number Guessing Game using do-while
    private static void numberGuessingGame() {
        Scanner sc = new Scanner(System.in);
        int numberToGuess = 25;  // You can randomly generate this too
        int guess;
        do {
            System.out.print("Guess the number (between 1 and 50): ");
            guess = sc.nextInt();
            if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else if (guess > numberToGuess) {
                System.out.println("Too high!");
            }
        } while (guess != numberToGuess);
        System.out.println("Congratulations! You guessed the right number.");
    }

    // 45. Multiplication Table using for loop
    private static void multiplicationTable(int num) {
        System.out.println("Multiplication Table for " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 41. Absolute Value
        System.out.print("Enter a number to find its absolute value: ");
        int num = sc.nextInt();
        System.out.println("Absolute value: " + absoluteValue(num));

        // 42. Month Name
        System.out.print("Enter a number (1-12) to get the month: ");
        int monthNumber = sc.nextInt();
        printMonth(monthNumber);

        // 43. Simple Calculator
        System.out.println("Enter two numbers for calculation:");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        System.out.println("Enter operation (+, -, *, /):");
        char operation = sc.next().charAt(0);
        calculator(num1, num2, operation);

        // 44. Number Guessing Game
        numberGuessingGame();

        // 45. Multiplication Table
        System.out.print("Enter a number for multiplication table: ");
        int tableNum = sc.nextInt();
        multiplicationTable(tableNum);
    }

   
}
//Q41: absoluteValue(int num) computes the absolute value by checking if the number is negative and then returning the positive equivalent using a ternary operator.

//Q42: printMonth(int monthNumber) prints the month name using a switch statement based on the number entered (1-12).

//Q43: calculator(double num1, double num2, char operation) performs arithmetic operations (+, -, *, /) based on the operator input. It uses a switch statement.

//Q44: numberGuessingGame() implements a do-while loop where the user tries to guess a fixed number (25). The loop continues until the correct number is guessed.

//Q45: multiplicationTable(int num) prints the multiplication table for a given number using a for loop.