/**
 * Capitalizes the first character of each word in the given string.
 *
 * <p>
 * Input: "my name is santosh kumawat"
 * Output: "My Name Is Santosh Kumawat"
 * </p>
 *
 * With time and space complexity
 */

public class CapitalizeEachWord {
    public static void main(String[] args){
        String originalString = "my name is santosh kumawat", newString = "";
        char c;

        c = Character.toUpperCase(originalString.charAt(0));
        newString = newString + c;

        for(int i = 1; i < originalString.length(); i++){

            if (originalString.charAt(i) == ' ') {
                newString = newString + " ";
                c = Character.toUpperCase(originalString.charAt(i + 1));
                newString = newString + c;
                i++;
            } else {
                newString = newString + originalString.charAt(i);
            }
        }

        System.out.println(newString);
    }
}

// Time Complexity: O(n²) (because of string concatenation).
// Space Complexity: O(n)

class CapitalizeEachWordUsingStringBuilder {
    public static void main(String[] args) {
        String originalString = "my name is santosh kumawat";
        StringBuilder newString = new StringBuilder();

        // Capitalize the first character
        char c = Character.toUpperCase(originalString.charAt(0));
        newString.append(c);

        // Loop through the rest of the string
        for (int i = 1; i < originalString.length(); i++) {
            if (originalString.charAt(i) == ' ') {
                newString.append(' '); // Add the space
                c = Character.toUpperCase(originalString.charAt(i + 1)); // Capitalize next char
                newString.append(c);
                i++; // Skip the already capitalized character
            } else {
                newString.append(originalString.charAt(i)); // Append current character
            }
        }

        System.out.println(newString.toString());
    }
}

// Time Complexity: O(n).
// Space Complexity: O(n)