import java.util.Scanner;

public class PalindromeCheckerApp {

    // Method 1: Using reverse string
    public static boolean isPalindromeReverse(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return str.equals(reversed);
    }

    // Method 2: Using two-pointer technique
    public static boolean isPalindromeTwoPointer(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method 3: Using StringBuilder
    public static boolean isPalindromeStringBuilder(String str) {
        StringBuilder sb = new StringBuilder(str);
        return str.equals(sb.reverse().toString());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println("\n--- Performance Comparison ---");

        // Method 1 timing
        long start1 = System.nanoTime();
        boolean result1 = isPalindromeReverse(input);
        long end1 = System.nanoTime();
        long time1 = end1 - start1;

        // Method 2 timing
        long start2 = System.nanoTime();
        boolean result2 = isPalindromeTwoPointer(input);
        long end2 = System.nanoTime();
        long time2 = end2 - start2;

        // Method 3 timing
        long start3 = System.nanoTime();
        boolean result3 = isPalindromeStringBuilder(input);
        long end3 = System.nanoTime();
        long time3 = end3 - start3;

        // Display Results
        System.out.println("Method 1 (Reverse String) Result: " + result1);
        System.out.println("Execution Time: " + time1 + " ns\n");

        System.out.println("Method 2 (Two Pointer) Result: " + result2);
        System.out.println("Execution Time: " + time2 + " ns\n");

        System.out.println("Method 3 (StringBuilder) Result: " + result3);
        System.out.println("Execution Time: " + time3 + " ns");
    }
}