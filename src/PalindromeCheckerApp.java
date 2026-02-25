public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Hardcoded input
        String text = "madam";

        // Reverse the string
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        // Check palindrome
        boolean isPalindrome = text.equals(reversed);

        // Required Output Format
        System.out.println("Input text: " + text);
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}

