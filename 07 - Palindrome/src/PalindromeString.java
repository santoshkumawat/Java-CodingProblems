/**
 * A program to check whether a given number is a palindrome.
 * <p>
 * Input: "santosh"
 * Output: String is not a palindrome
 * Input: "madam"
 * Output: String is palindrome
 * <p>
 * With time and space complexity
 */

public class PalindromeString {
    public static void main(String[] args) {
        String str = "madam";
        String revString = "";
        int n = str.length(); //5

        for (int i = n; i <= n; i--) {
            if (i > 0) {
                revString = revString + str.charAt(i - 1);
            } else {
                break;
            }
        }

        if (str.equalsIgnoreCase(revString)) {
            System.out.println("String is palindrome");
        } else {
            System.err.println("String is not palindrome");
        }
    }
}

// Time Complexity: O(n), where n is the length of the string.
// Each character is processed once during the reversal and comparison.
// Space Complexity: O(n), as a new string (revString) is created to store the reversed version of the original string.