/**
 * Reverses the given string and returns the reversed string.
 * <p>
 * Input: "Santosh Kumawat"
 * Output: "tawamuK hsotnaS"
 * <p>
 * With time and space complexity
 */

public class ReverseString {

    public static void main(String[] args) {
        String s = "Santosh Kumawat", newString = "";
        char c;

        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            newString = c + newString;
        }
        System.out.println(newString);
    }
}

// Time Complexity: O(n^2) (because of string concatenation).
// Space Complexity: O(n)

class ReverseStringUsingStringBuilder {

    public static void main(String[] args) {
        String s = "Santosh Kumawat";

        StringBuilder newString = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            newString.append(s.charAt(i));
        }
        System.out.println(newString);
    }
}

// Time Complexity: O(n)
// Space Complexity: O(n)