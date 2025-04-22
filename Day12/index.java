import java.util.Scanner;

public class index {
    // 46. Prime Check using for loop
    private static void checkPrime(int num) {
        if (num <= 1) {
            System.out.println(num + " is not a prime number.");
            return;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                System.out.println(num + " is not a prime number.");
                return;
            }
        }
        System.out.println(num + " is a prime number.");
    }

    // 47. Find maximum value using for-each loop
    private static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // 48. Find occurrences of a specific element in the array using for-each loop
    private static int countOccurrences(int[] arr, int element) {
        int count = 0;
        for (int num : arr) {
            if (num == element) {
                count++;
            }
        }
        return count;
    }

    // 49. Read input from user and break loop if "exit" is entered
    private static void readInputAndExit() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the loop.");
                break;
            } else {
                System.out.println("You entered: " + input);
            }
        }
    }

    // 50. Sum positive numbers, skip negative numbers using continue
    private static void sumPositiveNumbers() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int num = sc.nextInt();
            if (num < 0) {
                continue;  // Skip negative numbers
            }
            sum += num;
            System.out.println("Current sum of positive numbers: " + sum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 46. Prime Check using for loop
        System.out.print("Enter a number to check if it's prime: ");
        int primeNum = sc.nextInt();
        checkPrime(primeNum);

        // 47. Maximum value in array using for-each
        int[] arr = {1, 3, 5, 7, 9, 2};
        System.out.println("Maximum value in array: " + findMax(arr));

        // 48. Occurrences of a specific element in array using for-each
        System.out.print("Enter the element to find occurrences in the array: ");
        int element = sc.nextInt();
        System.out.println("Occurrences of " + element + ": " + countOccurrences(arr, element));

        // 49. Read inputs from user and break the loop if "exit" is entered
        System.out.println("Enter inputs (type 'exit' to stop):");
        readInputAndExit();

        // 50. Sum all positive numbers, skip negative numbers
        System.out.println("Enter numbers to sum (negative numbers will be skipped):");
        sumPositiveNumbers();
    }

    
}
// Q46: checkPrime(int num) checks if the number is prime by testing divisibility up to the square root of the number. If it’s divisible by any number other than 1 and itself, it is not a prime number.

// Q47: findMax(int[] arr) finds the maximum value in the array using a for-each loop to iterate over all elements and keep track of the largest value.

// Q48: countOccurrences(int[] arr, int element) counts how many times a specific element appears in the array using a for-each loop to check each element.

// Q49: readInputAndExit() reads inputs from the user inside an infinite while loop, and breaks the loop if the user types "exit" (case-insensitive). This is controlled by a break statement.

// Q50: sumPositiveNumbers() reads integers from the user, skips negative numbers using continue, and keeps a running sum of all positive numbers entered.