
import java.util.Scanner;


interface PalindromeStrategy {
    boolean check(String input);
}
class StackStrategy implements PalindromeStrategy {


    public boolean check(String input) {

        // Create a stack to store characters
        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push each character onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters by popping from stack
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}


public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Inject strategy
        PalindromeStrategy strategy = new StackStrategy();

        // Execute selected algorithm
        boolean result = strategy.check(input);

        System.out.println("Is  Palindrome? : " + result);

        scanner.close();
    }
}