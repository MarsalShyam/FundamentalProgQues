public class Index {

    public static void main(String[] args) {
        int num = 153;
        int limit = 50;

        reverseNumber(num);
        fibonacciSeries(limit);
        checkArmstrong(num);
        checkPalindrome(num);
        int rows = 5;

        System.out.println("Right Half Pyramid:");
        rightHalfPyramid(rows);

        System.out.println("\nReverse Right Half Pyramid:");
        reverseRightHalfPyramid(rows);

        System.out.println("\nLeft Half Pyramid:");
        leftHalfPyramid(rows);
    }

    // 31. Reverse Digits
    // Taking last digit using %, builds reversed using * 10.
    private static void reverseNumber(int num) {
        int rev = 0, temp = num;
        while(temp != 0){
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        System.out.println("Reversed Number: " + rev);
    }

    // 32. Fibonacci Series up to limit
    // Each number is the sum of previous two. Continues until limit.
    private static void fibonacciSeries(int limit) {
        System.out.print("Fibonacci Series up to " + limit + ": ");
        int a = 0, b = 1;
        while (a <= limit) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    // 33. Check Armstrong
    // (Example: 153 → 1³ + 5³ + 3³ = 153)
    // Cube each digit and sum them. Checking if equal to original.
    private static void checkArmstrong(int num) {
        int sum = 0, temp = num;
        while (temp != 0) {
            int d = temp % 10;
            sum += d * d * d;
            temp /= 10;
        }
        System.out.println(num + (sum == num ? " is an Armstrong number." : " is not an Armstrong number."));
    }

    // 34. Check Palindrome
    // (Example: 121 → same when reversed)
    // Reverse the number and compare it with original.
    private static void checkPalindrome(int num) {
        int rev = 0, temp = num;
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        System.out.println(num + (rev == num ? " is a Palindrome." : " is not a Palindrome."));
    }
    //36. Create a program that print patterns:
    // Right Half Pyramid
    private static void rightHalfPyramid(int rows) {
        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Reverse Right Half Pyramid
    private static void reverseRightHalfPyramid(int rows) {
        for(int i = rows; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Left Half Pyramid
    private static void leftHalfPyramid(int rows) {
        for(int i = 1; i <= rows; i++) {
            // Print spaces
            for(int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            // Print stars
            for(int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
