/**
 *
 * Reverses each word in the given string and returns a new string where the words
 * are reversed, but their original order is maintained.
 * <p>
 * Input: "Santosh Kumawat"
 * Output: "hsotnaS tawamuK"
 * <p>
 * With time and space complexity
 *
 */

public class ReverseWord {
    public static void main(String[] args) {
        String originalString = "Santosh Kumawat", reversedWord = "";

        String[] arrString = originalString.split(" ");
        char c;

        for(String str: arrString){
            String tempStr = "";
            for(int i=0; i<str.length(); i++){
                c = str.charAt(i);
                tempStr = c + tempStr;
            }
            tempStr = tempStr + " ";
            reversedWord = reversedWord + tempStr;
        }

        System.out.println(reversedWord);
    }
}

// Time Complexity: O(n^2) (because of string concatenation).
// Space Complexity: O(n)

class ReverseWordUsingStringBuilder {
    public static void main(String[] args) {
        String originalString = "Santosh Kumawat";

        String[] arrString = originalString.split(" ");

        StringBuilder reversedWord = new StringBuilder();
        for (String str : arrString) {
            StringBuilder tempStr = new StringBuilder(str);
            reversedWord.append(tempStr.reverse()).append(" ");
        }

        System.out.println(reversedWord.toString().trim());
    }
}

// Time Complexity: O(n).
// Space Complexity: O(n)
