public class Index {

    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 50, 30, 10};
        int num = 10;

        sumAndAverage(arr);
        countOccurrences(arr, num);
        findMinMax(arr);
        findMinOfTwo(12, 7);
        checkEvenOdd(15);
    }

    // 36. Sum and Average of Array
    private static void sumAndAverage(int[] arr) {
        int sum = 0;
        for(int n : arr) {
            sum += n;
        }
        double avg = (double) sum / arr.length;
        System.out.println("Sum: " + sum + ", Average: " + avg);
    }

    // 37. Number of Occurrences of an Element
    private static void countOccurrences(int[] arr, int key) {
        int count = 0;
        for(int n : arr) {
            if(n == key) count++;
        }
        System.out.println("Element " + key + " occurred " + count + " times.");
    }

    // 38. Maximum and Minimum in Array
    private static void findMinMax(int[] arr) {
        int min = arr[0], max = arr[0];
        for(int n : arr) {
            if(n < min) min = n;
            if(n > max) max = n;
        }
        System.out.println("Minimum: " + min + ", Maximum: " + max);
    }

    // 39. Minimum of Two Numbers
    private static void findMinOfTwo(int a, int b) {
        int min = (a < b) ? a : b;
        System.out.println("Minimum of " + a + " and " + b + " is: " + min);
    }

    // 40. Check Even or Odd
    private static void checkEvenOdd(int num) {
        String result = (num & 1) == 0 ? "Even" : "Odd";  // Bitwise check
        System.out.println(num + " is " + result);
    }
}

// ****small notes for reference
// sumAndAverage: Adds up array elements and divides by length for average.

// countOccurrences: Loops and counts how many times a specific number appears.

// findMinMax: Scans the array to find smallest and largest value.

// findMinOfTwo: Uses ternary operator to find the smaller between two.

// checkEvenOdd: Uses bitwise AND to check if the last bit is 0 (even) or 1 (odd).