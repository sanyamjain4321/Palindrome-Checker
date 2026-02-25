

import java.util.Scanner;


interface PalindromeStrategy {
    boolean check(String input);
}


class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}


class ReverseStrategy implements PalindromeStrategy {

    public boolean check(String input) {

        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }
}


public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Select strategy (you can change to ReverseStrategy if needed)
        PalindromeStrategy strategy = new StackStrategy();
        // PalindromeStrategy strategy = new ReverseStrategy();

        boolean result = strategy.check(input);

        System.out.println("Is  Palindrome? : " + result);

        scanner.close();
    }
}